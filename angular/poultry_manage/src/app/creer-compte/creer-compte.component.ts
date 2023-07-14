import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { AuthentificationService } from '../services/authentification.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-creer-compte',
  templateUrl: './creer-compte.component.html',
  styleUrls: ['./creer-compte.component.css']
})
export class CreerCompteComponent implements OnInit {

  newFormGroup!: FormGroup;
  errorMessage!: string;

  constructor(private fb: FormBuilder, public authService: AuthentificationService, private router: Router) { }

  ngOnInit(): void {
    this.newFormGroup = this.fb.group({
      email : this.fb.control(null, [Validators.required, Validators.minLength(5), Validators.maxLength(20)]),
      username: this.fb.control(null, [Validators.required, Validators.minLength(5), Validators.maxLength(20)]),
      password: this.fb.control(null, [Validators.required, Validators.minLength(5), Validators.maxLength(20)]),
      passwordConf: this.fb.control(null, [Validators.required, Validators.minLength(5), Validators.maxLength(20)])
    })
  }

  public handleAddNewUser() {
    let conf = confirm('Voulez-vous enregistrer ces informations ! ')
    if (conf) {
      if (this.passwordIsCorrect()) {
        this.authService.addNewUser(this.newFormGroup).subscribe({
          next: (value) => {
            alert('Vous avez maintenat un compte');
            this.router.navigateByUrl("/login")
          }
        })
      }

    }

  }
  public passwordIsCorrect(): boolean {
    return this.newFormGroup.value.passwordConf == this.newFormGroup.value.password;
  }
}
