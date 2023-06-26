/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package jdbc02.service;

import java.util.List;
import jdbc02.entite.Utilisateur;

/**
 *
 * @author akouv
 */
public interface UtilisateurService {
    
    // Une méthode ajouter
    public void ajouter(Utilisateur utilisateur);
    
    // Méthode modifier
    public Utilisateur modifier(Utilisateur utilisateur);
    // Faire une persistance dans la base de données
    
    public Utilisateur trouver(int id);
    
    public Utilisateur trouver(String identifiant);
    
    public List<Utilisateur> lister();
    
    public void supprimer(int id);
    
    // Surcharge de supprimer
    public void supprimer(Utilisateur utilisateur);
}
