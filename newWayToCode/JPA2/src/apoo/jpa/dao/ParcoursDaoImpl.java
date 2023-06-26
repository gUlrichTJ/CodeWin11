/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apoo.jpa.dao;

import apoo.jpa.entites.Parcours;
import apoo.jpa.util.SingletonConnexion;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author benjamin
 */
public class ParcoursDaoImpl implements ParcoursDao{
    EntityManager em = SingletonConnexion.getEntityManager();

    @Override
    public Parcours trouver(int id) {
        Query query = this.em.createQuery("SELECT p FROM Parcours p WHERE p.id=:id");
        query.setParameter("id", id);
        return (Parcours) query.getSingleResult();
    }
    
}
