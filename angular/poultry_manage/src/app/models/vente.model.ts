enum Produit{
    oeuf = 'oeuf',
    poule = 'poule'
}

// export interface Client{
//     id : number,
//     nom : string,
//     prenom : string,
//     email : string,
//     sexe : string,
//     adresse : string
// }
export interface Vente{
    id : number,
    produit : Produit,
    prix_U : number,
    quantite : number,
    remise : number,
    date : string,
    // client : Client
}

export interface PageVente{
    ventes : Vente[];
    page : number;
    size : number;
    totalPages : number;
}