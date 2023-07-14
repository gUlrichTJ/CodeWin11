import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { Vente } from '../models/vente.model';
import { VenteService } from '../services/vente.service';

enum Qualite {
  'bon' = 'bon',
  'mauvais' = 'mauvais'
}
enum Produit {
  oeuf = 'oeuf',
  poule = 'poule'
}
@Component({
  selector: 'app-vente',
  templateUrl: './vente.component.html',
  styleUrls: ['./vente.component.css']
})
export class VenteComponent implements OnInit {
  ventes!: Array<Vente>;
  errorMessage!: String;
  searchFormGroup!: FormGroup;
  totalPages: number = 0;
  currentPage: number = 0;
  pageSize : number = 6;

  constructor(private venteService: VenteService, private route: Router, private fb: FormBuilder) { }

  ngOnInit(): void {
    // this.handleGetAllVentes();
    this.handlePagesVentes()
    this.searchFormGroup = this.fb.group({
      motCle: this.fb.control(null)
    })
  }


  handleSearchVente() {
    this.venteService.searchVente(this.searchFormGroup.value.motCle).subscribe({
      next: (value) => {
        this.ventes = value
      }, error: (err) => {
        this.errorMessage = err;
        console.log(err)
      }
    })

  }

  public handleEditVente(v: Vente) {
    this.route.navigateByUrl('login/accueil/vente/editVente/'+v.id)
  }

  public handleDeleteVente(vente: Vente) {
    let conf = confirm('Etes-vous vraiment certain de vouloir supprimer?');
    if (conf) {
      this.venteService.deleteVente(vente.id).subscribe({
        next: (value) => {
          this.ventes = this.ventes.filter(v => v.id != vente.id)
        }, error: (err) => {
          this.errorMessage = err;
        },
      })
    }
  }

  public handleGetAllVentes() {
    this.venteService.getAllVentes().subscribe({
      next: (value) => {
        this.ventes = value;
      }, error: (err) => {
        this.errorMessage = err;
      }
    })
  }

  handlePagesVentes() {
    this.venteService.getPageVentes(this.currentPage, this.pageSize).subscribe({
      next: (value) => {
        this.ventes = value.ventes;
        this.currentPage = value.page;
        this.totalPages = value.totalPages;
      },
      error: (err) => {
        this.errorMessage = err // recuperation de l'erreur
      },
    })
  }

  public goToPage(i: number) {
    this.currentPage = i;
    this.handlePagesVentes();
  }


  public handleNewVente() {
    this.route.navigateByUrl("login/accueil/vente/ajouterVente")
  }


}
