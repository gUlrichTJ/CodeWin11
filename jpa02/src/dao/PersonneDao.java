/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import entites.Personne;
import java.util.List;

/**
 *
 * @author Time Store
 */
public interface PersonneDao {
    
    // Une méthode ajouter
    public void ajouter(Personne personne);
    
    // Méthode modifier
    public Personne modifier(Personne personne);
    // Faire une persistance dans la base de données
    
    public Personne trouver(int id);
    
    public Personne trouver(String identifiant);
    
    public List<Personne> lister();
    
    public void supprimer(int id);
    
    // Surcharge de supprimer
    public void supprimer(Personne personne);
}
