/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import entites.Etudiant;
import java.util.List;

/**
 *
 * @author Time Store
 */
public interface EtudiantDao {
    
    // Une méthode ajouter
    public void ajouter(Etudiant etudiant);
    
    // Méthode modifier
    public Etudiant modifier(Etudiant etudiant);
    // Faire une persistance dans la base de données
    
    public Etudiant trouver(int id);
    
    public Etudiant trouver(String identifiant);
    
    public List<Etudiant> lister();
    
    public void supprimer(int id);
    
    // Surcharge de supprimer
    public void supprimer(Etudiant etudiant);
}
