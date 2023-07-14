import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { MatSidenavModule } from '@angular/material/sidenav';
import { MatIconModule } from '@angular/material/icon';
import { MatListModule } from '@angular/material/list';
import { MatToolbarModule } from '@angular/material/toolbar';
import { CarouselModule } from 'ngx-bootstrap/carousel';




import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { PouleComponent } from './poule/poule.component';
import { OeufComponent } from './oeuf/oeuf.component';
import { VenteComponent } from './vente/vente.component';
import { RapportComponent } from './rapport/rapport.component';
import { ReactiveFormsModule } from '@angular/forms';
import { NouvPouleComponent } from './nouv-poule/nouv-poule.component';
import { EditPouleComponent } from './edit-poule/edit-poule.component';
import { EditOeufComponent } from './edit-oeuf/edit-oeuf.component';
import { NouvOeufComponent } from './nouv-oeuf/nouv-oeuf.component';
import { NouvVenteComponent } from './nouv-vente/nouv-vente.component';
import { EditVenteComponent } from './edit-vente/edit-vente.component';
import { DepensesComponent } from './depenses/depenses.component';
import { NouvDepenseComponent } from './nouv-depense/nouv-depense.component';
import { EditDepenseComponent } from './edit-depense/edit-depense.component';
import { NgChartsModule } from 'ng2-charts';
import { CreerCompteComponent } from './creer-compte/creer-compte.component';
import { ModifMotDePasseComponent } from './modif-mot-de-passe/modif-mot-de-passe.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    PouleComponent,
    OeufComponent,
    VenteComponent,
    RapportComponent,
    NouvPouleComponent,
    EditPouleComponent,
    EditOeufComponent,
    NouvOeufComponent,
    NouvVenteComponent,
    EditVenteComponent,
    DepensesComponent,
    NouvDepenseComponent,
    EditDepenseComponent,
    CreerCompteComponent,
    ModifMotDePasseComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    MatSidenavModule,
    BrowserAnimationsModule,
    MatIconModule,
    MatListModule,
    MatToolbarModule,
    CarouselModule.forRoot(),
    ReactiveFormsModule,
    NgChartsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
