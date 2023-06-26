/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc02.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author Time Store
 */
public class AjouterSupprimerModifier extends JFrame {
    
    JButton annuler, ajouter;
    
    JTable tabUtilisateurs;
    
    JScrollPane scrollPane;
    Utilisateurs utilisateurs;
    
    // Nous mettons le constructeur pour ajouter un utilisateur
    public AjouterSupprimerModifier(int id, String nom, String prenom, String adresse, String profession, int age, String sexe, Utilisateurs utilisateurs) {
        this.utilisateurs = utilisateurs;
        
        // Nous créons une fenetre pour afficher les éléments à saisir
        setTitle("Ajouter Utilisateur");
        setSize(800, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(2, 1));
        
        // Nous définissons l'entete
        String[] enteteDuTableau = {"Nom", "Prénom", "Adresse",
            "Profession", "Âge", "Sexe"};
        // Nous définissons les données du tableau
        Object[][] donnees = {
            {"551079", "22/01/23", "10", "1500", "Eric", "Kouma"}
                
        };
        
        // Nous mettons les donnees dans un JTable
        tabUtilisateurs = new JTable(donnees, enteteDuTableau);
        
        // Le scrollpane
        scrollPane = new JScrollPane(tabUtilisateurs);
        
        // Le panel
        JPanel panelUtilisateur = new JPanel();
        panelUtilisateur.setLayout(new BorderLayout());
        panelUtilisateur.setBorder(new LineBorder(Color.BLUE, 1));
        panelUtilisateur.add(scrollPane, BorderLayout.CENTER);
        
        // Nous ajoutons la zone de saisie
        panelUtilisateur.add(panneauTextField(utilisateurs), BorderLayout.SOUTH);
        // Nous créons les textFields pour l'ajout
        
        add(panelUtilisateur);
        
        // Nous ajoutons le panel des boutons supprimer et annuler en bas
        add(ajouterOuAnnuler("Ajouter"), BorderLayout.SOUTH);
       // add(panneauTextField());
        setVisible(true);
    }
    
    // Nous créons le constructeur pour modifier l'utilisateur
    public AjouterSupprimerModifier (String modifier, Utilisateurs utilisateurs) {
        this.utilisateurs = utilisateurs;
        
        // Nous créons une fenetre pour afficher les éléments à saisir
        setTitle("Modifier Utilisateur");
        setSize(800, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(2, 1));
        
        // Nous définissons l'entete
        String[] enteteDuTableau = {"Nom", "Prénom", "Adresse",
            "Profession", "Âge", "Sexe"};
        // Nous définissons les données du tableau
        Object[][] donnees = {
            {"551079", "22/01/23", "10", "1500", "Eric", "Kouma"}
                
        };
        
        // Nous mettons les donnees dans un JTable
        tabUtilisateurs = new JTable(donnees, enteteDuTableau);
        
        // Le scrollpane
        scrollPane = new JScrollPane(tabUtilisateurs);
        
        // Le panel
        JPanel panelUtilisateur = new JPanel();
        panelUtilisateur.setLayout(new BorderLayout());
        panelUtilisateur.setBorder(new LineBorder(Color.BLUE, 1));
        panelUtilisateur.add(scrollPane, BorderLayout.CENTER);
        
        // Nous ajoutons la zone de saisie
        panelUtilisateur.add(panneauTextField(utilisateurs), BorderLayout.SOUTH);
        // Nous créons les textFields pour l'ajout
        
        add(panelUtilisateur);
        
        // Nous ajoutons le panel des boutons supprimer et annuler en bas
        add(ajouterOuAnnuler("Modifier"), BorderLayout.SOUTH);
       // add(panneauTextField());
        setVisible(true);

    }
    
    // Nous créons le constructeur pour supprimer l'utilisateur
    public AjouterSupprimerModifier (String supprimer, String suppression, Utilisateurs utilisateurs) {
        this.utilisateurs = utilisateurs;
        
        // Nous créons une fenetre pour afficher les éléments à saisir
        setTitle("Supprimer Utilisateur");
        setSize(800, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(2, 1));
        
        // Nous définissons l'entete
        String[] enteteDuTableau = {"Nom", "Prénom", "Adresse",
            "Profession", "Âge", "Sexe"};
        // Nous définissons les données du tableau
        Object[][] donnees = {
            {"551079", "22/01/23", "10", "1500", "Eric", "Kouma"}
                
        };
        
        // Nous mettons les donnees dans un JTable
        tabUtilisateurs = new JTable(donnees, enteteDuTableau);
        
        // Le scrollpane
        scrollPane = new JScrollPane(tabUtilisateurs);
        
        // Le panel
        JPanel panelUtilisateur = new JPanel();
        panelUtilisateur.setLayout(new BorderLayout());
        panelUtilisateur.setBorder(new LineBorder(Color.BLUE, 1));
        panelUtilisateur.add(scrollPane, BorderLayout.CENTER);
        
        // Nous ajoutons la zone de saisie
        panelUtilisateur.add(panneauTextField(utilisateurs), BorderLayout.SOUTH);
        // Nous créons les textFields pour l'ajout
        
        add(panelUtilisateur);
        
        // Nous ajoutons le panel des boutons supprimer et annuler en bas
        add(ajouterOuAnnuler("Supprimer"), BorderLayout.SOUTH);
       // add(panneauTextField());
        setVisible(true);

    }
    
    
    public JPanel panneauTextField(Utilisateurs utilisateurs) {
        
        JPanel panelTextField = new JPanel();
        panelTextField.setLayout(new GridLayout());
                      
        JTextField nomTextField = new JTextField();
        nomTextField.setSize(20, 20);
        
            // Nous ajoutons les actions sur le textField du nom
            // L'utilisateur est modifié chaque fois qu'on entre les informations
            nomTextField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                utilisateurs.setNom(nomTextField.getText());
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                utilisateurs.setNom(nomTextField.getText());
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                utilisateurs.setNom(nomTextField.getText());
            }
        });
        
        panelTextField.add(nomTextField);
        
        JTextField prenomTextField = new JTextField();
        prenomTextField.setSize(20, 20);
        
        // Nous ajoutons les actions sur la zone de texte du prenom
            prenomTextField.getDocument().addDocumentListener(new DocumentListener() {
                @Override
                public void insertUpdate(DocumentEvent e) {
                    utilisateurs.setPrenom(prenomTextField.getText());
                }

                @Override
                public void removeUpdate(DocumentEvent e) {
                    utilisateurs.setPrenom(prenomTextField.getText());
                }

                @Override
                public void changedUpdate(DocumentEvent e) {
                    utilisateurs.setPrenom(prenomTextField.getText());
                }
            });
        
        panelTextField.add(prenomTextField);
        
        JTextField adresseTextField = new JTextField();
        adresseTextField.setSize(20, 20);

            // Nous ajoutons tout ce qu'il faut sur la zone de saisie de l'adresse
            adresseTextField.getDocument().addDocumentListener(new DocumentListener() {
                @Override
                public void insertUpdate(DocumentEvent e) {
                    utilisateurs.setAdresse(adresseTextField.getText());
                }

                @Override
                public void removeUpdate(DocumentEvent e) {
                    utilisateurs.setAdresse(adresseTextField.getText());
                }

                @Override
                public void changedUpdate(DocumentEvent e) {
                    utilisateurs.setAdresse(adresseTextField.getText());
                }
            });
        
        panelTextField.add(adresseTextField);
        
        JTextField professionTextField = new JTextField();
        professionTextField.setSize(20, 20);
        
            // Nous ajoutons tout ce qu'il faut sur la zone de saisie de la profession
            professionTextField.getDocument().addDocumentListener(new DocumentListener() {
                @Override
                public void insertUpdate(DocumentEvent e) {
                    utilisateurs.setProfession(professionTextField.getText());
                }

                @Override
                public void removeUpdate(DocumentEvent e) {
                    utilisateurs.setProfession(professionTextField.getText());
                }

                @Override
                public void changedUpdate(DocumentEvent e) {
                    utilisateurs.setProfession(professionTextField.getText());
                }
            });
        
        panelTextField.add(professionTextField);
        
        JTextField ageTextField = new JTextField();
        ageTextField.setSize(20, 20);
        
            // Nous récupérons ce qui est saisi dans la zone de saisie de l'âge
            ageTextField.getDocument().addDocumentListener(new DocumentListener() {
                @Override
                public void insertUpdate(DocumentEvent e) {
                    utilisateurs.setAge(Integer.parseInt(ageTextField.getText()));
                }

                @Override
                public void removeUpdate(DocumentEvent e) {
                    utilisateurs.setAge(Integer.parseInt(ageTextField.getText()));
                }

                @Override
                public void changedUpdate(DocumentEvent e) {
                    utilisateurs.setAge(Integer.parseInt(ageTextField.getText()));
                }
            });
        
        panelTextField.add(ageTextField);
        
        JTextField sexeTextField = new JTextField();
        sexeTextField.setSize(20, 20);
        
            // Nous ajoutons les actions sur la zone de saisie du sexe
            sexeTextField.getDocument().addDocumentListener(new DocumentListener() {
                @Override
                public void insertUpdate(DocumentEvent e) {
                    utilisateurs.setSexe(sexeTextField.getText());
                }

                @Override
                public void removeUpdate(DocumentEvent e) {
                    utilisateurs.setSexe(sexeTextField.getText());
                }

                @Override
                public void changedUpdate(DocumentEvent e) {
                    utilisateurs.setSexe(sexeTextField.getText());
                }
            });
        panelTextField.add(sexeTextField);
        
        return panelTextField;
    }
    
    // Nous allons mettre un String en parametre pour que le nom du bouton change
    // en fonction de la fenetre ouverte
    // Nous allons utiliser un if (nomBouton.equals("Ajouter") {} nous appelerons 
    // la méthode ajouter. Sinon, nous appelons par exemple la méthode supprimer
    // Nous ajouterons les actions sur les boutons en fonction de ce qui se trouve 
    // dans le texte
    public JPanel ajouterOuAnnuler(String nomBouton) {
        JPanel ajouterEtAnnuler = new JPanel();
        
        // Nous créons le bouton annuler
        annuler = new JButton();
        annuler.setBackground(new Color(250, 5, 5));
        
        JLabel annulerLabel = new JLabel("Annuler");
        annulerLabel.setFont(new Font("Comforta", Font.BOLD, 16));
        annulerLabel.setForeground(Color.WHITE);
        
        annuler.add(annulerLabel);
        
        // Nous ajoutons une action sur le bouton annuler
        annuler.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AjouterSupprimerModifier.this.dispose();
            }
        });
        
        // Nous traitons avec le bouton ajouter
        ajouter = new JButton();
        ajouter.setBackground(new Color(1, 0, 250));
        
        JLabel ajouterLabel = new JLabel(nomBouton);
        ajouterLabel.setFont(new Font("Comforta", Font.BOLD, 15));
        ajouterLabel.setForeground(Color.WHITE);
        
        ajouter.add(ajouterLabel);
        
        JPanel ajouterAnnulerPanel = new JPanel();
        ajouterAnnulerPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        
        // Ajout du bouton annuler
        ajouterAnnulerPanel.add(ajouter);
        
        ajouterAnnulerPanel.add(annuler);
        
        
        ajouterEtAnnuler.add(ajouterAnnulerPanel);
        
        return ajouterEtAnnuler;
    }
}
