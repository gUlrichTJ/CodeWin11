/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import entites.Etudiant;
import entites.Parcours;
import java.util.List;

/**
 *
 * @author Time Store
 */
public interface EtudiantService {
    
    // Une méthode ajouter
    public void ajouter(Etudiant etudiant);
    
    // Méthode modifier
    public Etudiant modifier(Etudiant etudiant);
    // Faire une persistance dans la base de données
    
    public Etudiant trouver(int id);
    
    public Etudiant trouver(String identifiant);
    
    public List<Etudiant> lister();

    // Une méthode lister
    List<Etudiant> lister(Parcours p);
    
    public void supprimer(int id);
    
    // Surcharge de supprimer
    public void supprimer(Etudiant etudiant);
    
}
