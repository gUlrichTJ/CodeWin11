
package dao;

import entites.Etudiant;
import entites.Parcours;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.jms.Connection;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import utils.Connexion;

/**
 *
 * @author Time Store
 */
public class EtudiantDaoImpl implements EtudiantDao, Serializable {

    EntityManager em = Connexion.getEntityManager();
    
    private List<Etudiant> list = new ArrayList<Etudiant>();
    public EtudiantDaoImpl() {
        
    }
    
    @Override
    public void ajouter(Etudiant etudiant) {
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
    public Etudiant trouver(String identifiant) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Etudiant> lister() {
        for (Etudiant object : list) {
            System.out.println(object);
        }
        return null;
    }
    
    public List<Etudiant> lister(Parcours parcours) {
        Query query = em.createQuery(
                "SELECT e "
                + " FROM Etudiant "
                + " WHERE e.parcours =:parcours"
        );
        
        query.setParameter("parcours", parcours);
        
        return query.getResultList();
    }

    @Override
    public void supprimer(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void supprimer(Etudiant etudiant) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
