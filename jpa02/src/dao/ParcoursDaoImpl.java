/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entites.Parcours;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import utils.Connexion;

/**
 *
 * @author Time Store
 */
public class ParcoursDaoImpl implements ParcoursDao {

    EntityManager em = Connexion.getEntityManager();
    @Override
    public Parcours trouver(Long id) {
        Query query = em.createQuery(
                "SELECT p "
                        + "FROM Parcours p"
                        + "WHERE p.id =: id"
        );
        query.setParameter("id", id);
        
        return (Parcours)query.getSingleResult();
    }
    
}
