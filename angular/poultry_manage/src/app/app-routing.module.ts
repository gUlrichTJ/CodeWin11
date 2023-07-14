import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { EditOeufComponent } from './edit-oeuf/edit-oeuf.component';
import { EditPouleComponent } from './edit-poule/edit-poule.component';
import { LoginComponent } from './login/login.component';
import { NouvPouleComponent } from './nouv-poule/nouv-poule.component';
import { OeufComponent } from './oeuf/oeuf.component';
import { PouleComponent } from './poule/poule.component';
import { RapportComponent } from './rapport/rapport.component';
import { NouvOeufComponent } from './nouv-oeuf/nouv-oeuf.component';
import { VenteComponent } from './vente/vente.component';
import { NouvVenteComponent } from './nouv-vente/nouv-vente.component';
import { EditVenteComponent } from './edit-vente/edit-vente.component';
import { NouvDepenseComponent } from './nouv-depense/nouv-depense.component';
import { DepensesComponent } from './depenses/depenses.component';
import { EditDepenseComponent } from './edit-depense/edit-depense.component';
import { AuthentificationGuard } from './guards/authentification.guard';
import { CreerCompteComponent } from './creer-compte/creer-compte.component';


const routes: Routes = [
  {
    path: "login", component: LoginComponent,

    children: [
      {
        path: "accueil", component: AppComponent, canActivate: [AuthentificationGuard],
        children: [
          {
            path: "poule", component: PouleComponent, children: [
              { path: "ajouterPoule", component: NouvPouleComponent },
              { path: "editPoule/:id", component: EditPouleComponent },
            ]
          },
          {
            path: "oeuf", component: OeufComponent, children: [
              { path: "editOeuf/:id", component: EditOeufComponent },
              { path: "ajouterOeuf", component: NouvOeufComponent },
            ]
          },
          {
            path: "vente", component: VenteComponent, children: [
              { path: "editVente/:id", component: EditVenteComponent },
              { path: "ajouterVente", component: NouvVenteComponent },
            ]
          },
          {
            path: "depense", component: DepensesComponent, children: [
              { path: "editDepense/:id", component: EditDepenseComponent },
              { path: "ajouterDepense", component: NouvDepenseComponent },
            ]
          },
          { path: "rapport", component: RapportComponent },
        ]
      },
      {path : "creer-compte", component : CreerCompteComponent},
    ]
  },

  { path: "", component: LoginComponent,  canActivate : [AuthentificationGuard]}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
