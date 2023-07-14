import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { DepenseService } from '../services/depense.service';

@Component({
  selector: 'app-nouv-depense',
  templateUrl: './nouv-depense.component.html',
  styleUrls: ['./nouv-depense.component.css']
})
export class NouvDepenseComponent implements OnInit {

  depensesFormGroup!: FormGroup;

  constructor(private fb: FormBuilder, public depenseService : DepenseService, private route: Router) { }

  ngOnInit(): void {
    this.depensesFormGroup = this.fb.group({
      libelle: this.fb.control(null, [Validators.required]),
      montant: this.fb.control(null, [Validators.required]),
      date: this.fb.control(null, [Validators.required]),
      auteur : this.fb.control(null, [Validators.required])
    })
  }

  public handleAddDepense(){
    // console.log(this.depensesFormGroup.value)

    this.depenseService.addNewDepense(this.depensesFormGroup.value).subscribe({
      next : (value)=>{
        alert('Depense ajouté avec succès!');
        // this.route.navigateByUrl('depense');
        this.depensesFormGroup.reset()
      }, error : (err)=>console.log('Erreur d\'ajout')
    })
  }

}
