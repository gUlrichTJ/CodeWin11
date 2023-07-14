import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Depense } from '../models/depenses';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { DepenseService } from '../services/depense.service';

@Component({
  selector: 'app-edit-depense',
  templateUrl: './edit-depense.component.html',
  styleUrls: ['./edit-depense.component.css']
})
export class EditDepenseComponent implements OnInit {

  depense!: Depense;
  depenseId!: number;
  depensesFormGroup!: FormGroup;
  errorMessage!: string;

  constructor(private activatedRoute: ActivatedRoute, private fb: FormBuilder, public depenseService: DepenseService, private route: Router) {
    this.depenseId = this.activatedRoute.snapshot.params['id'];
  }

  ngOnInit(): void {
    this.getDepense();

    this.depensesFormGroup = this.fb.group({
      libelle: this.fb.control(this.depense.libelle, [Validators.required]),
      date: this.fb.control(this.depense.date, [Validators.required]),
      montant: this.fb.control(this.depense.montant, [Validators.required]),
      auteur: this.fb.control(this.depense.auteur, [Validators.required]),
    })
  }

  public handleUpdateDepense() {
    let conf = confirm('Voulez-vous vraiment enregistrer les modifications?')
    if (conf) {
      this.depenseService.updateDepense(this.depensesFormGroup.value, this.depenseId).subscribe({
        next: (value) => {
          alert('Modification enregistrée avec succès !');
          this.route.navigateByUrl('depense');
        }, error: (err) => {
          this.errorMessage = err;
        }
      })
    }

  }

  public getDepense() {
    
    this.depenseService.getDepenses(this.depenseId).subscribe({
      next: (value) => {
        this.depense = value;
      }, error: (err) => {
        this.errorMessage = err;
      }
    })
  }
}
