import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, ValidationErrors, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Poule } from '../models/poule.model';
import { PouleService } from '../services/poule.service';

@Component({
  selector: 'app-edit-poule',
  templateUrl: './edit-poule.component.html',
  styleUrls: ['./edit-poule.component.css']
})
export class EditPouleComponent implements OnInit {

  private pouleId!: number;
  public poule!: Poule;
  pouleFormGroup!: FormGroup;

  constructor(private router: Router, private Activaterouter: ActivatedRoute, public pouleService: PouleService, private fb: FormBuilder) {
    this.pouleId = this.Activaterouter.snapshot.params['id'];
  }

  ngOnInit(): void {
    this.pouleService.getPoule(this.pouleId).subscribe({
      next: (value) => {
        this.poule = value;
      }, error(err) {
        console.error(err)
      },
    })

    this.pouleFormGroup = this.fb.group({
      date: this.fb.control(this.poule.date, [Validators.required, Validators.minLength(10)]),
      race: this.fb.control(this.poule.race, [Validators.required, Validators.maxLength(10)]),
      sexe: this.fb.control(this.poule.sexe, [Validators.required, Validators.maxLength(2)]),
      poids: this.fb.control(this.poule.poids, [Validators.required]),
      quantite: this.fb.control(this.poule.quantite, [Validators.required])
    });
  }

  public handleUpdatePoule() {
    let conf = confirm('voulez-vous vraiment enregistrer ces modifications?')
    if (conf) {
      let p = this.pouleFormGroup.value;
      p.id = this.poule.id;

      this.pouleService.UpdatePoule(p).subscribe({

        next: (value) => {
          alert('Modification en registrée avec succès !');
          this.router.navigateByUrl('poule');
        }, error: (err) => {
          console.log(err);
        }
      });
    }
  }

}
