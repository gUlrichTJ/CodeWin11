import { Component, OnInit } from '@angular/core';
import { Form, FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Vente } from '../models/vente.model';
import { VenteService } from '../services/vente.service';

@Component({
  selector: 'app-edit-vente',
  templateUrl: './edit-vente.component.html',
  styleUrls: ['./edit-vente.component.css']
})
export class EditVenteComponent implements OnInit {

  venteFormGroup!: FormGroup;
  clientFormGroup!: FormGroup;
  venteId!: number;
  vente!: Vente;
  // client!: Client;
  idClient!: number;


  constructor(public venteService: VenteService, activeRoute: ActivatedRoute, private fb2: FormBuilder, private fb: FormBuilder, private route: Router) {
    this.venteId = activeRoute.snapshot.params['id']
    // this.idClient = activeRoute.snapshot.params['client.id']
  }
  ngOnInit(): void {
    this.handleGetVente();
    this.venteFormGroup = this.fb.group({
      produit: this.fb.control(this.vente.produit, [Validators.required]),
      prix_U: this.fb.control(this.vente.prix_U, [Validators.required]),
      quantite: this.fb.control(this.vente.quantite, [Validators.required]),
      remise: this.fb.control(this.vente.remise, [Validators.required, Validators.min(0)]),
      date: this.fb.control(this.vente.date, [Validators.required, Validators.minLength(10)]),
    });

    // this.clientFormGroup = this.fb2.group({
    //   nom: this.fb2.control(this.vente.client.nom, [Validators.required]),
    //   prenom: this.fb2.control(this.vente.client.prenom, [Validators.required]),
    //   sexe: this.fb2.control(this.vente.client.sexe, [Validators.required]),
    //   email: this.fb2.control(this.vente.client.email, [Validators.required]),
    //   adresse: this.fb2.control(this.vente.client.adresse, [Validators.required])
    // })

  }
  public handleGetVente() {
    this.venteService.getVente(this.venteId).subscribe({
      next: (value) => {
        this.vente = value;
      }, error: (err) => {
        console.log(err)
      }
    })
  }

  // public handleUpdateClient() {
  //   this.client = this.clientFormGroup.value;
  //   this.client.id = this.vente.client.id;
  //   this.clientFormGroup.reset()
  // }

  public handleUpdateVente() {
    let v = this.venteFormGroup.value;
    let conf = confirm('Voulez-vous vraiment enregistrer les modifications?');
    if (conf) {
      v.id = this.vente.id;
      // v.client = this.client;

      this.venteService.UpdateVente(v).subscribe({
        next: (value) => {
          alert('Modification en registrée avec succès !');
          this.venteFormGroup.reset()
          this.route.navigateByUrl('vente');
        }, error: (err) => {
          console.log(err);
        }
      });
    }

  }

}