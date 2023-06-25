/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apoo.jpa.gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

public class AddUpdateDelete extends JPanel {
    
    // Nous créons les boutons ajouter, supprimer et modifier
    BoutonImage ajouterU = new BoutonImage("Ajouter utilisateur", "C:\\NetbeansProjectsWin\\NetbeansProjects\\images\\add1.png");
    BoutonImage modifierU = new BoutonImage("Modifier utilisateur", "C:\\NetbeansProjectsWin\\NetbeansProjects\\images\\update1.png");
    BoutonImage supprimerU = new BoutonImage("Supprimer utilisateur", "C:\\NetbeansProjectsWin\\NetbeansProjects\\images\\delete1.png");
    
    // Nous créons les boutons ajouter, supprimer et modifier
    BoutonImage ajouterI = new BoutonImage("Ajouter itinéraire", "C:\\NetbeansProjectsWin\\NetbeansProjects\\images\\add1.png");
    BoutonImage modifierI = new BoutonImage("Modifier itinéraire", "C:\\NetbeansProjectsWin\\NetbeansProjects\\images\\update1.png");
    BoutonImage supprimerI = new BoutonImage("Supprimer itinéraire", "C:\\NetbeansProjectsWin\\NetbeansProjects\\images\\delete1.png");
    
    // Nous créons les boutons ajouter, supprimer et modifier
    BoutonImage ajouterC = new BoutonImage("Ajouter caisse", "C:\\NetbeansProjectsWin\\NetbeansProjects\\images\\add1.png");
    BoutonImage modifierC = new BoutonImage("Modifier caisse", "C:\\NetbeansProjectsWin\\NetbeansProjects\\images\\update1.png");
    BoutonImage supprimerC = new BoutonImage("Supprimer caisse", "C:\\NetbeansProjectsWin\\NetbeansProjects\\images\\delete1.png");
    
    Utilisateurs utilisateurs;
    
    // Constructor pour l'utilisateur
    public AddUpdateDelete(Utilisateurs utilisateurs) {
        this.utilisateurs = utilisateurs;
        
        setLayout(new FlowLayout());
        
        // Nous ajoutons une action sur le bouton ajouterU
        // La fenetre s'affiche pour que nous puissions ajouter un utilisateur
        ajouterU.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /* Nous allons mettre la fenetre ici */
                AjouterModifierSupprimer ajouterUser = new AjouterModifierSupprimer(16, "Kodjo", "Kouma", "grh@gmail.com", "Etudiant", 17, "M", utilisateurs);
            }
        });
        
        add(ajouterU);
        
        // Nous allons metter l'action ouvrir la fenetre sur le bouton modifierU afin 
        // de pouvoir le modifier dès le clic sur ce bouton
        modifierU.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AjouterModifierSupprimer modifierUser = new AjouterModifierSupprimer("Modification", utilisateurs); 
            }
        });
        
        add(modifierU);

        // Nous ajoutons l'action sur le bouton supprimer
        supprimerU.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AjouterModifierSupprimer modifierUser = new AjouterModifierSupprimer("Supprimer", "Supprimer", utilisateurs); 
            }
        });
        
        add(supprimerU);
    }
    
    // Constructeur pour l'itinéraire
    public AddUpdateDelete(int itineraire) {
        setLayout(new FlowLayout());
        
        // Nous ajoutons une action sur le bouton ajouterU
        // La fenetre s'affiche pour que nous puissions ajouter un utilisateur
        ajouterI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /* Nous allons mettre la fenetre ici */
                AjouterModifierSupprimer ajouterItineraire = new AjouterModifierSupprimer(16, "Kodjo", "Kouma", "grh@gmail.com", "Etudiant", 17, "M", utilisateurs);
            }
        });
        
        add(ajouterI);
        add(modifierI);
        add(supprimerI);
    }
    
    // Constructeur pour la caisse
    public AddUpdateDelete(int caisse, int addUpdateDel) {
        setLayout(new FlowLayout());
        
        add(ajouterC);
        add(modifierC);
        add(supprimerC);
    }
    
}

