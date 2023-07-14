import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { AuthentificationService } from '../services/authentification.service';

@Component({
  selector: 'app-modif-mot-de-passe',
  templateUrl: './modif-mot-de-passe.component.html',
  styleUrls: ['./modif-mot-de-passe.component.css']
})
export class ModifMotDePasseComponent implements OnInit {

  setFormGroup!: FormGroup;
  errorMessage! : string;

  constructor(public authService: AuthentificationService, private fb: FormBuilder) {

  }

  ngOnInit(): void {
    this.setFormGroup = this.fb.group({
      email: this.fb.control(null, [Validators.required, Validators.minLength(5), Validators.maxLength(20)]),
      username: this.fb.control(null, [Validators.required, Validators.minLength(5), Validators.maxLength(20)]),
      password: this.fb.control(null, [Validators.required, Validators.minLength(5), Validators.maxLength(20)]),
      passwordConf: this.fb.control(null, [Validators.required, Validators.minLength(5), Validators.maxLength(20)])
    })
  }

  public handleSetPassword() {

  }

  public passwordIsCorrect(): boolean {
    return this.setFormGroup.value.password == this.setFormGroup.value.passwordConf;
  }
}
