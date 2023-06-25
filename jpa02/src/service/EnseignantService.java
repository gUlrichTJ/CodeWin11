/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import entites.Enseignant;
import java.util.List;


/**
 *
 * @author Time Store
 */
public interface EnseignantService {
    
    // Une méthode ajouter
    public void ajouter(Enseignant enseignant);
    
    // Méthode modifier
    public Enseignant modifier(Enseignant enseignant);
    // Faire une persistance dans la base de données
    
    public Enseignant trouver(Integer id);
    
    public Enseignant trouver(String identifiant);
    
    public List<Enseignant> lister();

    // Une méthode lister
    List<Enseignant> lister(Enseignant enseignant);
    
    public void supprimer(int id);
    
    // Surcharge de supprimer
    public void supprimer(Enseignant enseignant);
}
