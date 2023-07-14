import { Component, inject, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { throwError } from 'rxjs';
import { Poule } from '../models/poule.model';
import { PouleService } from '../services/poule.service';

enum Poids {
  moyen = 'moyen',
  grande = 'grande',
  petite = 'petite'
}

@Component({
  selector: 'app-poule',
  templateUrl: './poule.component.html',
  styleUrls: ['./poule.component.css']
})


export class PouleComponent implements OnInit {

  poules!: Array<Poule>; //liste des poules
  errorMessage!: String;
  searchFormGroup!: FormGroup;
  currentPage: number = 0;
  pageSize: number = 6;
  totalPages: number = 0;

  constructor(private pouleService: PouleService, private fb: FormBuilder, private router: Router) { };

  ngOnInit(): void {

    // this.handleGetAllPoules()
    this.handlePagesPoules()
    this.searchFormGroup = this.fb.group({
      motCle: this.fb.control(null)
    })
  }

  handlePagesPoules() {
    this.pouleService.getPagePoules(this.currentPage, this.pageSize).subscribe({
      next: (value) => {
        this.poules = value.poules;
        this.currentPage = value.page;
        this.totalPages = value.totalPages;
      },
      error: (err) => {
        this.errorMessage = err // recuperation de l'erreur
      },
    })
  }
  handleGetAllPoules() {
    this.pouleService.getAllPoules().subscribe({
      next: (value) => {
        this.poules = value;
      },
      error: (err) => {
        this.errorMessage = err // recuperation de l'erreur
      },
    })
  }

  handleDeletePoule(p: Poule) {
    let conf = confirm("Etes-vous certain de vouloir supprimer?");
    if (conf == true) {
      this.pouleService.deletePoule(p.id).subscribe({
        next: (value) => {
          // this.handleGetAllPoules(); // raffraichir la vue
          let index = this.poules.indexOf(p);
          this.poules.splice(index, 1);
        },
      })
    }
  }

  public handleSetEnVendre(p: Poule) {
    let vendre = p.poids;

    this.pouleService.setEnVendre(p.id).subscribe({ // mise en vente dans le backend
      next: (value) => {
        if (vendre != Poids.grande) {
          p.poids = Poids.grande;
        } else {
          let Petite = confirm('Petite ?')
          if (Petite) { p.poids = Poids.petite }
          else {
            let Moyen = confirm('Moyen ?')
            if (Moyen) { p.poids = Poids.moyen; }
          }
        }
      },
      error: (err) => {
        this.errorMessage = err;
      },
    })
  }

  public handleSearchPoule() {
    let motCle = this.searchFormGroup.value.motCle;
    this.pouleService.searchPoule(motCle).subscribe({
      next: (value) => {
        this.poules = value;
      },
      error: (err) => {
        this.errorMessage = err;
      },
    });
  }

  public goToPage(i: number) {
    this.currentPage = i;
    this.handlePagesPoules();
  }

  public handleNewPoule() {
    this.router.navigateByUrl('login/accueil/poule/ajouterPoule');
  }

  public handleEditPoule(p: Poule){
    this.router.navigateByUrl('/login/accueil/poule/editPoule/'+p.id);
  }
}
