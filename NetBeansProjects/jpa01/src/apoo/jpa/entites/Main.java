/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apoo.jpa.entites;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author mgraciano
 */
public class Main {
    
    public static void main(String[] args) {
        EntityManagerFactory emf = null;
        EntityManager em = null;
        EntityTransaction et = null;
        Etudiant etudiant = new Etudiant("551078", "MATHEY-APOSSAN", "Graciano", LocalDate.now());
        
        // Unité de persistance
        emf = Persistence.createEntityManagerFactory("jpaPU");
        em = emf.createEntityManager();     // Nous avons fait tout ce parcours pour obtenir le entityManager
        et = em.getTransaction();
        
        // Nous démarons la transaction
        et.begin();
            // Nous enrégistrons l'étudiant
            em.persist(etudiant);
            List<Etudiant> etudiants = em.createQuery("FROM Etudiant", Etudiant.class).getResultList();
            for (Etudiant etudiant1 : etudiants) {
                System.out.println(etudiant1);
            }
        et.commit();
    }
}
