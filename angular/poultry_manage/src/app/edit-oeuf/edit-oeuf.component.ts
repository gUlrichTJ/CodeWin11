import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Route, Router } from '@angular/router';
import { Oeuf } from '../models/oeuf.model';
import { OeufService } from '../services/oeuf.service';

@Component({
  selector: 'app-edit-oeuf',
  templateUrl: './edit-oeuf.component.html',
  styleUrls: ['./edit-oeuf.component.css']
})
export class EditOeufComponent implements OnInit {

  oeufId!: number;
  oeuf!: Oeuf;
  oeufFormGroup!: FormGroup;

  constructor(private fb: FormBuilder, private activateRouter: ActivatedRoute, public oeufService: OeufService, private route: Router) {
    this.oeufId = this.activateRouter.snapshot.params['id']
  }
  public handleGetOeuf() {
    this.oeufService.getOeuf(this.oeufId).subscribe({
      next: (value) => {
        this.oeuf = value;
      }
    })
  }

  ngOnInit(): void {
    this.handleGetOeuf()
    this.oeufFormGroup = this.fb.group({
      date: this.fb.control(this.oeuf.date, [Validators.required, Validators.minLength(10)]),
      qualite: this.fb.control(this.oeuf.qualite, [Validators.required]),
      quantite : this.fb.control(this.oeuf.quantite, [Validators.required])
    })
  }

  public handleUpdateOeuf() {
    let p = this.oeufFormGroup.value;
    let conf = confirm('Voulez-vous vraiment enrégistrer les modifications?')
    if (conf) {
      p.id = this.oeuf.id
      this.oeufService.updateOeuf(p).subscribe({
        next: (value) => {
          this.oeuf = value;
          alert('Modification effectué avec succès !');
          this.route.navigateByUrl('oeuf')
        }
      })
    }

  }
}
