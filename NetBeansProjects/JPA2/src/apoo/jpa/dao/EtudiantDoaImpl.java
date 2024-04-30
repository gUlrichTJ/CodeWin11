/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apoo.jpa.dao;

import apoo.jpa.entites.Etudiant;
import apoo.jpa.entites.Parcours;
import apoo.jpa.util.SingletonConnexion;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author benjamin
 */
public class EtudiantDoaImpl implements EtudiantDao{
    
    EntityManager em = SingletonConnexion.getEntityManager();
    
    public EtudiantDoaImpl(){
        
    }

    @Override
    public boolean ajouter(Etudiant etudiant) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Etudiant modifier(Etudiant etudiant) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Etudiant trouver(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Etudiant> lister() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    @Override
    public List<Etudiant> lister(Parcours parcours) {
        Query query = this.em.createQuery("SELECT e FROM Etudiant e WHERE e.parcours=:parcours");
        query.setParameter("parcours", parcours);
        return query.getResultList();
        
    }

    @Override
    public boolean supprimer(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void supprimer(Etudiant etudiant) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
}
