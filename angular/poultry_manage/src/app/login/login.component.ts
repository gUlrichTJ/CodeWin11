import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { AuthentificationService } from '../services/authentification.service';
import { Router } from '@angular/router';

@Component({
  selector: 'login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  formGroup!: FormGroup;
  errorMessage!: string;

  constructor(public authService: AuthentificationService, private fb: FormBuilder, private router: Router) { }


  ngOnInit(): void {
    this.formGroup = this.fb.group({
      identifiant: this.fb.control(null, [Validators.required, Validators.minLength(5), Validators.maxLength(20)]),
      motDePasse: this.fb.control(null, [Validators.required, Validators.minLength(5), Validators.maxLength(20)])
    })
  }

  public handleLogin() {
    let username = this.formGroup.value.identifiant;
    let password = this.formGroup.value.motDePasse;

    this.authService.login(username, password).subscribe({

      next: (value) => {
        this.authService.authenticateUser(value).subscribe({
          next: (value) => {
            this.router.navigateByUrl('/login/accueil');
          }, error: (err) => {
            this.errorMessage = err;
          }
        })
      }, error: (err) => {
        alert(err);
      },
    })
  }
}
