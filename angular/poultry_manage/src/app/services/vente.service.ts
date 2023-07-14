import { Injectable } from '@angular/core';
import { ValidationErrors } from '@angular/forms';
import { Observable, of, throwError } from 'rxjs';
import {Vente, PageVente } from '../models/vente.model';


enum Produit {
  oeuf = 'oeuf',
  poule = 'poule'
}
@Injectable({
  providedIn: 'root'
})
export class VenteService {

  ventes!: Vente[];
  // cl!: Client;
  v!: Vente;

  constructor() {
    this.ventes = [
      {
        id: 1, produit: Produit.poule, prix_U: 400, quantite: 4, remise: 0.5, date: '15/15/2003',
        // client: {
        //   id: 1,
        //   nom: 'AWOUNO',
        //   prenom: 'Kossi winner',
        //   email: 'kossiwinnerawouno@gmail.com',
        //   sexe: 'Masculin',
        //   adresse: 'Klémé Agokpanou'
        // }
      },
      { id: 2, produit: Produit.oeuf, prix_U: 400, quantite: 4, remise: 0.5, date: '15/15/2003' },
      { id: 4, produit: Produit.oeuf, prix_U: 400, quantite: 4, remise: 0.5, date: '15/15/2003' },
      { id: 5, produit: Produit.oeuf, prix_U: 400, quantite: 4, remise: 0.5, date: '15/15/2003' },
      { id: 16, produit: Produit.poule, prix_U: 400, quantite: 4, remise: 0.5, date: '2003-05-15' }
    ]
  }

  public deleteVente(id: number): Observable<boolean> {
    this.ventes = this.ventes.filter(v => v.id != id)
    return of(true)
  }

  public getAllVentes(): Observable<Array<Vente>> {
    return of(this.ventes);
  }

  public getErrorMessage(champ: string, error: ValidationErrors) {
    if (error['required']) {
      return champ + " est obligatoire ! ";
    } else if (error['maxlength']) {
      return champ + " doit contenir au maximum " + error['maxlength']['requiredLength'] + " caractères!";
    } else if (error['minlength']) {
      return champ + " doit contenir au minimum " + error['minlength']['requiredLength'] + " caractères!";
    } else { return ""; }
  }
  // public addNewClient(idClient: number): Observable<Client> {

  //   // this.cl = client;
  //   return of(this.cl);
  // }
  public addNewVente(vente: Vente, id: number): Observable<Vente> {
    vente.id = id;
    // vente.client = this.cl;
    this.ventes.push(vente);
    return of(vente)
  }

  public searchVente(motCle: string): Observable<Array<Vente>> {
    return of(this.ventes.filter(v =>
      v.produit.includes(motCle)
      // v.client.nom.includes(motCle)
      // v.client.prenom.includes(motCle) ||
      // v.client.adresse.includes(motCle) ||
      // v.client.email.includes(motCle) ||
      // v.date.includes(motCle)
    ))
  }

  public getVente(id: number): Observable<Vente> {
    let vente = this.ventes.find(p => p.id == id);
    if (vente != undefined) {
      return of(vente)
    }
    return throwError(() => new Error("Vente non trouvée"))
  }

  public UpdateVente(vente: Vente): Observable<Vente> {
    this.ventes = this.ventes.map(p => (p.id == vente.id) ? vente : p)
    return of(vente);
  }

  public getPageVentes(page: number, size: number): Observable<PageVente> {

    let index = page * size;
    let totalPages = ~~(this.ventes.length / size);

    if (this.ventes.length % size != 0) {
      totalPages++;
    }
    let pagesVentes = this.ventes.slice(index, index + size);
    return of({ page: page, size: size, totalPages: totalPages, ventes: pagesVentes });
  }
}
