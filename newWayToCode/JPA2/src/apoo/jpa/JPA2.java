/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apoo.jpa;

import apoo.jpa.entites.Enseignant;
import apoo.jpa.entites.Etudiant;
import apoo.jpa.entites.Parcours;
import apoo.jpa.entites.Personne;
import apoo.jpa.service.EtudiantService;
import apoo.jpa.service.EtudiantServiceImpl;
import apoo.jpa.service.ParcoursService;
import apoo.jpa.service.ParcoursServiceImpl;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author benjamin
 */
public class JPA2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*EntityManagerFactory emf = null;
        EntityManager em = null;
        
            emf = Persistence.createEntityManagerFactory("jpaPU");
            em = emf.createEntityManager();
            EntityTransaction et = em.getTransaction();
            et.begin();
            /*Etudiant etudiant = new Etudiant();
            etudiant.setNom("SIJDH");
            etudiant.setPrenom("Jdlsn");
            etudiant.setNumeroCarte("6565677");
            etudiant.setDateNaissance(LocalDate.now());
            em.persist(etudiant);*/
            
            //Parcours parcours2 = new Parcours("Physiques");
            //em.persist(parcours2);
            
            /* Etudiant etudian = new Etudiant();
            etudian.setNom("JUBA");
            etudian.setPrenom("Salou");
            etudian.setNumeroCarte("6565680");
            etudian.setDateNaissance(LocalDate.now());
            etudian.setParcours(parcours1);
            em.persist(etudian);
           
            Etudiant etudia = new Etudiant();
            etudia.setNom("HDNZ");
            etudia.setPrenom("Jizb");
            etudia.setNumeroCarte("6565675");
            etudia.setDateNaissance(LocalDate.now());
            em.persist(etudia);
            
            Etudiant etudi = new Etudiant();
            etudi.setNom("SIJZN");
            etudi.setPrenom("Koelz");
            etudi.setNumeroCarte("6565674");
            etudi.setDateNaissance(LocalDate.now());
            etudi.setParcours(parcours2);
            em.persist(etudi);
            parcours2.getEtudiants().add(etudi);
            
            
            List<Etudiant> ets = em.createQuery("FROM Etudiant", Etudiant.class).getResultList();*/
            
           /* Parcours p1 = new Parcours("GL");
            Parcours p2 = new Parcours("MRI");
            
            Etudiant et1 = new Etudiant("567899", "GHIKN", "TYFV", LocalDate.now());
            et1.setParcours(p2);
            Etudiant et2 = new Etudiant("567899", "GHIKN", "TYFV", LocalDate.now());
            et2.setParcours(p1);
            em.persist(p1);
            em.persist(p2);
            em.persist(et1);
            em.persist(et2);
            et.commit();
            //System.out.println(ets);
            
            */
           Parcours p2 = new Parcours("MRI");
           EtudiantService etuSer = new EtudiantServiceImpl();
           System.out.println(etuSer.lister(p2));
           
           ParcoursService parcours = new ParcoursServiceImpl();
           System.out.println(parcours.trouver(2));
        
    }
    
}
