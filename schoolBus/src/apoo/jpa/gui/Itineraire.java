/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apoo.jpa.gui;

/**
 *
 * @author Time Store
 */

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Objects;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;

/**
 *
 * @author mgraciano
 */
public class Itineraire extends JPanel {
    
    private String lignesL;
    private String noms;
    private String depart;
    private String arrivee;
    private String chauffeurs;
    private String nombreDEtudiants;
    private String delegue;
    
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

    // Second constructeur
    public Itineraire(String lignesL, String noms, String depart, String arrivee, String chauffeurs, String nombreDEtudiants, String delegue) {
        this.lignesL = lignesL;
        this.noms = noms;
        this.depart = depart;
        this.arrivee = arrivee;
        this.chauffeurs = chauffeurs;
        this.nombreDEtudiants = nombreDEtudiants;
        this.delegue = delegue;
    }
    
    // Getters et setters
    public String getLignesL() {
        return lignesL;
    }

    public void setLignesL(String lignesL) {
        this.lignesL = lignesL;
    }

    public String getNoms() {
        return noms;
    }

    public void setNoms(String noms) {
        this.noms = noms;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public String getArrivee() {
        return arrivee;
    }

    public void setArrivee(String arrivee) {
        this.arrivee = arrivee;
    }

    public String getChauffeurs() {
        return chauffeurs;
    }

    public void setChauffeurs(String chauffeurs) {
        this.chauffeurs = chauffeurs;
    }

    public String getNombreDEtudiants() {
        return nombreDEtudiants;
    }

    public void setNombreDEtudiants(String nombreDEtudiants) {
        this.nombreDEtudiants = nombreDEtudiants;
    }

    public String getDelegue() {
        return delegue;
    }

    public void setDelegue(String delegue) {
        this.delegue = delegue;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.lignesL);
        hash = 29 * hash + Objects.hashCode(this.noms);
        hash = 29 * hash + Objects.hashCode(this.depart);
        hash = 29 * hash + Objects.hashCode(this.arrivee);
        hash = 29 * hash + Objects.hashCode(this.chauffeurs);
        hash = 29 * hash + Objects.hashCode(this.nombreDEtudiants);
        hash = 29 * hash + Objects.hashCode(this.delegue);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Itineraire other = (Itineraire) obj;
        if (!Objects.equals(this.lignesL, other.lignesL)) {
            return false;
        }
        if (!Objects.equals(this.noms, other.noms)) {
            return false;
        }
        if (!Objects.equals(this.depart, other.depart)) {
            return false;
        }
        if (!Objects.equals(this.arrivee, other.arrivee)) {
            return false;
        }
        if (!Objects.equals(this.chauffeurs, other.chauffeurs)) {
            return false;
        }
        if (!Objects.equals(this.nombreDEtudiants, other.nombreDEtudiants)) {
            return false;
        }
        return Objects.equals(this.delegue, other.delegue);
    }

    @Override
    public String toString() {
        return "Itineraire{" + "lignesL=" + lignesL + ", noms=" + noms + ", depart=" 
                + depart + ", arrivee=" + arrivee + ", chauffeurs=" + chauffeurs +
                ", nombreDEtudiants=" + nombreDEtudiants + ", delegue=" + delegue +
                '}';
    }

}
