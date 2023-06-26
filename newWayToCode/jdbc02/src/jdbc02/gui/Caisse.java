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
public class Caisse extends JPanel {
    
    
    AddUpdateDelete addUpdateDelete = new AddUpdateDelete(0, 1);
    
    // Constructor
    public Caisse() {
        
        setLayout(new BorderLayout());
        // Nous définissons l'entete
        String[] enteteDuTableau = {"ID", "Numéro de carte", "Date d'achat", "Nombre",
            "Montant", "Caissier"};
        // Nous définissons les données du tableau
        Object[][] donnees = {
            {"1", "551079", "22/01/23", "10", "1500", "Eric"},
            {"2", "541096", "22/01/23", "2", "300", "Emrich"},
            {"3", "502366", "22/01/23", "5", "750", "Ella"},
            {"4", "102289", "22/01/23", "8", "1200", "Emefa"},
            {"5", "458796", "22/01/23", "20", "3000", "Enrica"},
            {"6", "785412", "22/01/23", "6", "900", "Eriéta"},
            {"7", "632541", "22/01/23", "4", "600", "Etiène"},
            {"8", "258963", "22/01/23", "12", "1800", "Enselme"},
            {"9", "995522", "22/01/23", "7", "1050", "Etonam"},
            {"10", "551070", "22/01/23", "10", "1500", "Enkou"},
            {"11", "451245", "22/01/23", "10", "1500", "Elodie"},
            {"12", "654123", "22/01/23", "20", "3000", "Epiphane"},
            {"13", "489870", "22/01/23", "6", "900", "Emérantiène"},
            {"14", "475590", "22/01/23", "7", "1050", "Epiphanie"},
            {"15", "316179", "22/01/23", "3", "450", "Eklou"},
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
