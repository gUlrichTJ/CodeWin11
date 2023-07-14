import { Injectable } from '@angular/core';
import { ValidationErrors } from '@angular/forms';
import { Observable, map, of, throwError } from 'rxjs';
import { PagePoule, Poule } from '../models/poule.model';
enum Poids {
  moyen = 'moyen',
  grande = 'grande',
  petite = 'petite'
}

@Injectable({
  providedIn: 'root'
})


export class PouleService {

  private poules!: Array<Poule>;
  id: number = 8;

  constructor() {
    this.poules = [

      { id: 3, date: '12/01/2020', race: 'noir', sexe: 'M', poids: Poids.petite, quantite: 400 },
      { id: 4, date: '12/02/2020', race: 'vert', sexe: 'M', poids: Poids.grande, quantite: 400 },
      { id: 6, date: '12/03/2020', race: 'blanc', sexe: 'M', poids: Poids.grande, quantite: 400 },
      { id: 7, date: '12/01/2020', race: 'blanc', sexe: 'M', poids: Poids.petite, quantite: 400 },
      { id: 8, date: '12/02/2020', race: 'noir', sexe: 'M', poids: Poids.grande, quantite: 400 },
      { id: 6, date: '12/01/2020', race: 'blanc', sexe: 'M', poids: Poids.grande, quantite: 400 },
      { id: 8, date: '12/05/2020', race: 'noir', sexe: 'M', poids: Poids.grande, quantite: 400 },
      { id: 5, date: '12/01/2020', race: 'noir', sexe: 'M', poids: Poids.moyen, quantite: 400 },
      { id: 7, date: '12/06/2020', race: 'blanc', sexe: 'M', poids: Poids.petite, quantite: 400 },
      { id: 8, date: '12/07/2020', race: 'noir', sexe: 'M', poids: Poids.grande, quantite: 400 },
      { id: 5, date: '12/08/2020', race: 'noir', sexe: 'M', poids: Poids.moyen, quantite: 400 },
      { id: 7, date: '12/04/2020', race: 'blanc', sexe: 'M', poids: Poids.petite, quantite: 400 },
      { id: 8, date: '12/04/2020', race: 'noir', sexe: 'M', poids: Poids.grande, quantite: 400 },
      { id: 5, date: '12/04/2020', race: 'noir', sexe: 'M', poids: Poids.moyen, quantite: 400 },
      { id: 7, date: '12/04/2020', race: 'blanc', sexe: 'M', poids: Poids.petite, quantite: 400 },
      { id: 8, date: '12/01/2020', race: 'noir', sexe: 'M', poids: Poids.grande, quantite: 400 },
      { id: 7, date: '12/06/2020', race: 'blanc', sexe: 'M', poids: Poids.petite, quantite: 400 },
      { id: 8, date: '12/10/2020', race: 'noir', sexe: 'M', poids: Poids.grande, quantite: 400 },
      { id: 5, date: '12/09/2020', race: 'noir', sexe: 'M', poids: Poids.moyen, quantite: 400 },
      { id: 7, date: '12/11/2020', race: 'blanc', sexe: 'M', poids: Poids.petite, quantite: 400 },
      { id: 8, date: '12/12/2020', race: 'noir', sexe: 'M', poids: Poids.grande, quantite: 400 },
    ];
  }

  public getAllPoules(): Observable<Array<Poule>> {
    // let rnd = Math.random();
    // if(rnd <0.5)
    //   return throwError(()=>new Error("veullez vérifier votre connexion !"));
    return of(this.poules);
  }

  public getPagePoules(page: number, size: number): Observable<PagePoule> {

    let index = page * size;
    let totalPages = ~~(this.poules.length / size);

    if (this.poules.length % size != 0) {
      totalPages++;
    }
    let pagesPoules = this.poules.slice(index, index + size);
    return of({ page: page, size: size, totalPages: totalPages, poules: pagesPoules });
  }

  public deletePoule(id: number): Observable<boolean> {
    this.poules = this.poules.filter(p => p.id != id);
    return of(true);
  }

  public setEnVendre(id: number): Observable<Boolean> {
    let poule = this.poules.find(p => p.id == id);

    if (poule != undefined) {
      poule.poids = Poids.grande;
      return of(true)
    } else {
      return throwError(() => new Error("Poule non trouvée"))
    }
  }

  public searchPoule(motCle: string): Observable<Poule[]> {
    let poulesTrouvees = this.poules.filter(p => p.race.includes(motCle))
    return of(poulesTrouvees)
  }

  public addNewPoule(poule: Poule): Observable<Poule> {
    this.id++;
    poule.id = this.id;
    this.poules.push(poule);
    return of(poule);
  }

  public getPoule(id: number): Observable<Poule> {

    let poule = this.poules.find(p => p.id == id);
    if (poule != undefined) { return of(poule); } else {
      return throwError(() => new Error("Poule non trouvée"))
    }
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

  public UpdatePoule(poule: Poule): Observable<Poule> {
    this.poules = this.poules.map(p => (p.id == poule.id) ? poule : p)
    return of(poule);
  }

  public convertToDate(poule: Poule): Date {
    const dateString = poule.date;
    const [day, month, year] = dateString.split('/');
    const date = new Date(parseInt(year), parseInt(month) - 1, parseInt(day));
    return date;
  }

  public stockParMois(mois: number): number[] {

    let poulesPourMois: number[] = []
    this.poules.forEach(element => {
      if (this.convertToDate(element).getMonth() == mois) {
        poulesPourMois.push(element.quantite);
      }
    });
    return poulesPourMois;
  }

  public sum(data: number[]) {
    let sum: number = data.reduce((accumulator, currentValue) => accumulator + currentValue, 0);
    return sum
  }

  public stockTotalAnnuel(): Observable<number[]> {
    let datas: number[] = [12].fill(0)
    for (let i = 1; i <= 12; i++) {
      datas.push(this.sum(this.stockParMois(i)))
    }
    return of(datas)
  }
}
