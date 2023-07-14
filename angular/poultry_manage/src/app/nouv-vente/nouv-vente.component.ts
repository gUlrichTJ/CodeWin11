import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { VenteService } from '../services/vente.service';
import { Vente } from '../models/vente.model';

@Component({
  selector: 'app-nouv-vente',
  templateUrl: './nouv-vente.component.html',
  styleUrls: ['./nouv-vente.component.css']
})
export class NouvVenteComponent implements OnInit {

  venteFormGroup!: FormGroup;
  clientFormGroup!: FormGroup;
  // client!: Client;
  idClient!: number;
  id!: number;
  vente!: Vente;

  constructor(private fb: FormBuilder, public venteService: VenteService) { }

  ngOnInit(): void {
    // this.fb = new FormBuilder();
    this.venteFormGroup = this.fb.group({
      produit: this.fb.control(null, [Validators.required]),
      prix_U: this.fb.control(null, [Validators.required]),
      quantite: this.fb.control(null, [Validators.required]),
      remise: this.fb.control(null, [Validators.required, Validators.min(0)]),
      date: this.fb.control(null, [Validators.required, Validators.minLength(10)]),
    });
    // this.clientFormGroup = this.fb2.group({
    //   nom: this.fb2.control(null, [Validators.required]),
    //   prenom: this.fb2.control(null, [Validators.required]),
    //   sexe: this.fb2.control(null, [Validators.required]),
    //   email: this.fb2.control(null, [Validators.required]),
    //   adresse: this.fb2.control(null, [Validators.required])
    // })
    this.id = 1;
    // this.idClient = 7;
  }

  // public handleClientSubmit() {
  //   // this.idClient = this.idClient + 1;
  //   this.venteService.addNewClient(this.id).subscribe({
  //     next: (value) => {
  //       this.clientFormGroup.reset();
  //     }, error: (err) => {
  //       alert('error ==>' + err)
  //     }
  //   })
  // }
  public handleAddSubmit() {
    let conf = confirm('Voulez-vous vraiment enregistrer cette vente?')
    if (conf) {
      this.id = this.id + 1;
      // this.handleClientSubmit();
      this.venteService.addNewVente(this.venteFormGroup.value, this.id).subscribe({
        next: (value) => {
          console.log(this.venteFormGroup.value)
          alert('Nouvelle vente ajoutée avec succès!');
          this.venteFormGroup.reset();
        }, error: (err) => {
          alert('error ==>' + err)
        }
      })
    }

  }

}
