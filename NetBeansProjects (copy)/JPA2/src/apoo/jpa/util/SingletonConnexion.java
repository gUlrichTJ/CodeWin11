/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apoo.jpa.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author benjamin
 */
public class SingletonConnexion {
    private static EntityManagerFactory emf = null;
    private static EntityManager em = null;
    
    static{
        emf = Persistence.createEntityManagerFactory("jpaPU");
        em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
    }


    public static EntityManager getEntityManager() {
        return em;
    }
    
    
}
