import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { Oeuf } from '../models/oeuf.model';
import { OeufService } from '../services/oeuf.service';

enum Qualite {
  'bon' = 'bon',
  'mauvais' = 'mauvais'
}
@Component({
  selector: 'app-oeuf',
  templateUrl: './oeuf.component.html',
  styleUrls: ['./oeuf.component.css']
})
export class OeufComponent implements OnInit {

  oeufs!: Array<Oeuf>;
  errorMessage!: String;
  oeufFormGroup!: FormGroup;
  currentPage: number = 0;
  totalPages: number = 0;
  Pagesize: number = 6;
  searchFormGroup!: FormGroup;



  constructor(private oeufService: OeufService, private route: Router, private fb: FormBuilder) {

  }
  ngOnInit(): void {

    // this.handleGetAllOeufs();
    this.handlePagesOeufs();
    this.searchFormGroup = this.fb.group({
      motCle: this.fb.control(null)
    });
    // this.handleSearchOeufs();
  }

  public handleGetAllOeufs() {
    this.oeufService.getAllOeufs().subscribe({
      next: (value) => {
        this.oeufs = value;
      }, error: (err) => {
        this.errorMessage = err;
      }
    })
  }

  public handleSetEnVente(o: Oeuf) {
    this.oeufService.SetEnVente(o.id).subscribe({
      next: (value) => {

      }
    })
  }

  public handleDeleteOeuf(o: Oeuf) {
    let conf = confirm('Etes-vous certain de vouloir supprimer cet oeuf?')
    if (conf == true) {
      this.oeufService.deleteOeuf(o.id).subscribe({
        next: (value) => {
          // let index = this.oeufs.indexOf(o)
          // this.oeufs = this.oeufs.splice(index, 1)
          this.handlePagesOeufs()
        }, error: (err) => {
          this.errorMessage = err
        }
      })
    }

  }

  public handleEditOeuf(o: Oeuf) {
    this.route.navigateByUrl('login/accueil/oeuf/editOeuf/' + o.id)
  }

  public handleNewOeuf() {
    this.route.navigateByUrl('login/accueil/oeuf/ajouterOeuf');
  }

  handlePagesOeufs() {
    this.oeufService.getPagesOeufs(this.currentPage, this.Pagesize).subscribe({
      next: (value) => {
        this.oeufs = value.oeufs;
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
    this.handlePagesOeufs();
  }



  public handleSearchOeufs() {
    let motCle = this.searchFormGroup.value.motCle;
    this.oeufService.searchOeuf(motCle).subscribe({
      next: (value) => {
        this.oeufs = value;
        // this.handlePagesOeufs()
      },
      error: (err) => {
        this.errorMessage = err;
      },
    });
  }
}
