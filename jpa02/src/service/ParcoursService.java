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
public interface ParcoursService {
    
    // Une méthode ajouter
    public void ajouter(Parcours parcours);
    
    // Méthode modifier
    public Parcours modifier(Parcours parcours);
    // Faire une persistance dans la base de données
    
    public Parcours trouver(int id);
    
    public Parcours trouver(String identifiant);
    
    public List<Parcours> lister();

    // Une méthode lister
    List<Parcours> lister(Parcours p);
    
    public void supprimer(int id);
    
    // Surcharge de supprimer
    public void supprimer(Parcours parcours);
}
