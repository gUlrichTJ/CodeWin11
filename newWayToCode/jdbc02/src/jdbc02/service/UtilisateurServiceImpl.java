/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc02.service;

import java.util.List;
import jdbc02.dao.UtilisateurDao;
import jdbc02.dao.UtilisateurDaoImpl;
import jdbc02.entite.Utilisateur;

/**
 *
 * @author akouv
 */
public class UtilisateurServiceImpl implements UtilisateurService {

    private UtilisateurDao dao = new UtilisateurDaoImpl();  // Mauvaise façcon de faire
    
    // Constructor
    
    
    @Override
    public void ajouter(Utilisateur utilisateur) {
        this.dao.ajouter(utilisateur);
    }

    @Override
    public Utilisateur modifier(Utilisateur utilisateur) {
        return this.dao.modifier(utilisateur);
    }

    @Override
    public Utilisateur trouver(int id) {
        return this.dao.trouver(id);
    }

    @Override
    public Utilisateur trouver(String identifiant) {
        return this.dao.trouver(identifiant);
    }

    @Override
    public List<Utilisateur> lister() {
        return this.dao.lister();
    }

    @Override
    public void supprimer(int id) {
        this.dao.supprimer(id);
    }

    @Override
    public void supprimer(Utilisateur utilisateur) {
        this.dao.supprimer(utilisateur);
    }
    
}
