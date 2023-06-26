/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc02.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;

/**
 *
 * @author mgraciano
 */
public class Itineraire extends JPanel {
    
    AddUpdateDelete addUpdateDelete = new AddUpdateDelete(0);
    
    // Constructor
    public Itineraire() {
        
        setLayout(new BorderLayout());
        // Nous définissons l'entete
        String[] enteteDuTableau = {"Lignes", "Noms", "Départ", "Arrivée",
            "Chauffeurs", "Nombre d'étudiants", "Délégué"};
        // Nous définissons les données du tableau
        Object[][] donnees = {
            {"L1", "Agoè-Assiyéyé", "UL", "Agoè", "Kouma", "20", "Marcel"},
            {"L2", "Attigangomé", "UL", "Attigangomé", "Kodjo", "22", "MIranda"},
            {"L3", "Zanguéra", "UL", "Zanguéra", "Kokou", "18", "Morice"},
            {"L4", "Entreprise", "UL", "Entreprise", "Koumako", "21", "Morija"},
            {"L5", "BIA", "UL", "BIA", "Kpatcha", "21", "Marie"},
            {"L6", "Légbassito", "UL", "Légbassito", "Kao", "21", "Matthieu"},
            {"L7", "Adétikopé", "UL", "Adétikopé", "Kankou", "34", "Marc"},
            {"L8", "Kpogan", "UL", "Kpogan", "Kliko", "19", "Menssah"},
            {"L9", "Kodjoviakopé", "UL", "Kodjoviakopé", "Koffi", "44", "Moubarak"},
            {"L10", "Tsévié", "UL", "Tsévié", "Kévin", "17", "Mélinda"},
            {"L11", "Colombe", "UL", "Colombe", "Kaleb", "24", "Mélissa"},
            {"L12", "Adjololo", "UL", "Adjololo", "Kodjovi", "30", "Mélina"},
            {"L13", "Avépozo", "UL", "Avépozo", "Koffigo", "34", "Mombo"},
            {"L14", "Davié", "UL", "Davié", "Komla", "34", "Massama"},
            {"L15", "Koumassi", "UL", "Koumassi", "Kossi", "34", "Magnouwè"},
        };
        
        // Nous créons un JTable dans lequel nous mettons les données
        JTable tabUtilisateurs = new JTable(donnees, enteteDuTableau);
        
        // Nous mettons le tableau dans un JScrollPane
        JScrollPane scrollPane = new JScrollPane(tabUtilisateurs);
        JPanel tabPanel = new JPanel();
        tabPanel.setLayout(new BorderLayout());
        tabPanel.setBorder(new LineBorder(Color.blue, 1));
        tabPanel.add(scrollPane, BorderLayout.CENTER);
        
        // Nous ajoutons les boutons ajouter, modifier et supprimer
        tabPanel.add(addUpdateDelete, BorderLayout.SOUTH);
        
        add(tabPanel);
    }
}
