
package utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
/**
 *
 * @author Time Store
 */
public class Connexion {

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
