enum Poids {
    moyen = 'moyen',
    grande = 'grande',
    petite = 'petite'
}

export interface Poule {
    id: number;
    date: String;
    race: String;
    sexe: String;
    poids: Poids;
    quantite : number;
}

export interface PagePoule{
    poules : Poule[];
    page : number;
    size : number;
    totalPages : number;
}