import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Depense } from '../models/depenses';
import { DepenseService } from '../services/depense.service';

@Component({
  selector: 'app-depenses',
  templateUrl: './depenses.component.html',
  styleUrls: ['./depenses.component.css']
})
export class DepensesComponent implements OnInit {

  depenses!: Depense[];
  searchFormGroup!: FormGroup;
  totalPages: number = 0;
  currentPage: number = 0;
  size: number = 6;
  errorMessage!: string;

  constructor(private route: Router, private depenseService: DepenseService, private fb: FormBuilder) { }
  ngOnInit(): void {

    this.searchFormGroup = this.fb.group({
      motCle: this.fb.control(null, [Validators.required])
    })
    // this.handleGetAllDepenses();
    this.handlePagesDepenses()
  }

  public handleGetAllDepenses() {
    this.depenseService.getAllDepenses().subscribe({
      next: (value) => {
        this.depenses = value;
      }, error: (err) => {
        this.errorMessage = err;
      }
    })
  }

  public handleSearchDepense() {
    this.depenseService.searchDepenses(this.searchFormGroup.value.motCle).subscribe({
      next: (value) => {
        this.depenses = value;
      }
    })
  }

  public handleEditDepense(depense: Depense) {
    this.route.navigateByUrl('login/accueil/depense/editDepense/' + depense.id);

  }

  public handleDeleteDepense(depense: Depense) {
    let conf = confirm('Etes-vous certain de vouloir supprimer cette dépense?');
    if (conf) {
      this.depenseService.deleteDepense(depense.id).subscribe({
        next: (value) => {
          this.depenses = this.depenses.filter(d => d.id != depense.id);
        }, error: (err) => {
          this.errorMessage = err;
        }
      })
    }
  }


  public handleNewDepense() {
    this.route.navigateByUrl('login/accueil/depense/ajouterDepense')
  }

  public handlePagesDepenses() {
    this.depenseService.getPageDepenses(this.currentPage, this.size).subscribe({
      next: (value) => {
        this.currentPage = value.currentPage,
          this.size = value.size,
          this.depenses = value.depenseTotalParPage,
          this.totalPages = value.totalPage
      }, error: (err) => {
        this.errorMessage = err;
      }

    })
  }
  public goToPage(i: number) {
    this.currentPage = i;
    this.handlePagesDepenses();
  }


}
