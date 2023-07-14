import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, ValidationErrors, Validators } from '@angular/forms';
import { PouleService } from '../services/poule.service';

@Component({
  selector: 'app-nouv-poule',
  templateUrl: './nouv-poule.component.html',
  styleUrls: ['./nouv-poule.component.css']
})
export class NouvPouleComponent implements OnInit {

  pouleFormGroup!: FormGroup;

  constructor(private fb: FormBuilder, public pouleService: PouleService) { }

  ngOnInit(): void {
    this.pouleFormGroup = this.fb.group({
      date: this.fb.control(null, [Validators.required, Validators.minLength(10)]),
      race: this.fb.control(null, [Validators.required, Validators.maxLength(10)]),
      sexe: this.fb.control(null, [Validators.required, Validators.maxLength(2)]),
      poids: this.fb.control(null, [Validators.required]),
      quantite: this.fb.control(null, [Validators.required])
    });
  }

  handleAddSubmit() {
    let conf = confirm('Etes-vous certain de vouloir ajouter ce groupe de poulets?')
    // console.log(this.pouleFormGroup.value)
    if (conf) {
      this.pouleService.addNewPoule(this.pouleFormGroup.value).subscribe({
        next: (value) => {
          alert('Poule ajouté avec succès !')
          this.pouleFormGroup.reset()
        }, error: (err) => {
          console.log(err)
        }
      })
    }

  }


}
