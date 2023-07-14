export interface Depense{
    id : number;
    libelle : string;
    montant : number;
    date : string;
    auteur : String;
}

export interface PageDepense{
    size : number,
    currentPage : number,
    totalPage : number,
    depenseTotalParPage : Depense[]
}