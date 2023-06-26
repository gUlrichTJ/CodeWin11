/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc02.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author mgraciano
 */
public class Authentification extends JFrame {
    
    JPanel panelGauche, panelCentre, panelBas;
    JTextField emailCentreAuth;
    JPasswordField passwordCentreAuth;
    
    // Construcutor
    public Authentification() {
        
        super("Authentification");
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        // Nous ajoutons le panel de gauche
        panelGauche = gaucheAuth();
        this.add(panelGauche, BorderLayout.WEST);
        
        // Nous ajoutons le centre
        panelCentre = centreAuth();
        this.add(panelCentre, BorderLayout.CENTER);
        
        this.setVisible(true);
    }
    
    // Nous créons un constructeur pour quelque chose de plus joli
    public Authentification(int joli) {
        setTitle("Authentification page");
        setSize(new Dimension(500, 300));
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        
        setLayout(new BorderLayout());
        
        // Nous allons mettre l'image comme font de background
        ImageIcon iconDeDerriere = new ImageIcon("C:\\NetbeansProjectsWin\\NetbeansProjects\\images\\busAuth.jpg");
        JLabel label = new JLabel(iconDeDerriere);
        label.setIcon(iconDeDerriere);
        
        // Nous ajoutons l'image au contentPane
        getContentPane().add(label);
        
        JPanel panelCentre = centreAuth();
        add(panelCentre);
        
        setVisible(true);
    }
    
    // Nous créons une méthode qui sera à gauche et qui contiendra l'image
    public JPanel gaucheAuth() {
        JPanel panelAuth = new JPanel();
        panelAuth.setPreferredSize(new Dimension(150, 40));
        // Nous créons l'image qui sera à gauche
        ImageIcon authBus = new ImageIcon("C:\\NetbeansProjectsWin\\NetbeansProjects\\images\\busAuth.jpg");
        
        JLabel labelAuth = new JLabel(authBus);
        
        // Nous ajoutons le label au panel
        panelAuth.add(labelAuth);
        return panelAuth;
    }
    
    // Méthode pour le centre
    public JPanel centreAuth() {
        
        JPanel panelCentreAuth = new JPanel();
        panelCentreAuth.setBackground(Color.lightGray);
        
        // Pour le email
        JLabel labelEmail = new JLabel("Entrez votre mail");
        labelEmail.setForeground(Color.BLACK);
        
        // Nous ajoutons le label à un panel
        JPanel panelTextEmail = new JPanel();
        panelTextEmail.setBackground(Color.lightGray);
        panelTextEmail.add(labelEmail);
        
        // La zone de saisie de l'email
        emailCentreAuth = new JTextField(20);
        JPanel panelEmail = new JPanel();
        panelEmail.setLayout(new GridLayout(2, 1));
        
        panelEmail.add(panelTextEmail);
        panelEmail.add(emailCentreAuth);
        
        // Pour le password
        
        // La zone de texte du password
        JLabel labelZonePassword = new JLabel("Entrez votre mot de passe");
        labelZonePassword.setForeground(Color.BLACK);
        
        JPanel passwordZone = new JPanel();

        passwordZone.add(labelZonePassword);
        passwordZone.setBackground(Color.lightGray);
        
        passwordCentreAuth = new JPasswordField(20);
        passwordCentreAuth.setPreferredSize(new Dimension(30, 30));
            
        // Nous créons un panel pour la zone de saisie de mot de passe
        JPanel zoneDeSaisiePassword = new JPanel();
        zoneDeSaisiePassword.setBackground(Color.lightGray);
        zoneDeSaisiePassword.add(passwordCentreAuth);
        
        JPanel panelPassword = new JPanel();
        //panelPassword.setBackground(Color.lightGray);
        panelPassword.setLayout(new GridLayout(2, 1));
        
        // Nous ajoutons la zone de saisie et le label au panelPasswor
        panelPassword.add(passwordZone);
        panelPassword.add(zoneDeSaisiePassword);
        
        panelCentreAuth.add(panelEmail);
        panelCentreAuth.add(panelPassword);
        
        // Nous ajoutons le bas du centre
        // Nous ajoutons le bas
        panelBas =  boutonsDuBas();
        panelCentreAuth.add(panelBas, BorderLayout.SOUTH);
        
        return panelCentreAuth;
    }
    
    // Méthode pour les boutons d'en bas
    public JPanel boutonsDuBas() {
        JPanel deuxBoutons = new JPanel();
        deuxBoutons.setLayout(new FlowLayout());
        
        // Nous créons le premier bouton
        JButton seConnecter = new JButton("Se connecter");
        
            // Nous ajoutons une action sur le bouton se connecter
            seConnecter.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    String recupererEmail = emailCentreAuth.getText();
                    String recupererPassword = passwordCentreAuth.getText();
                    
                    // Nous verifions 
                    if (recupererEmail.equals("gracianomathey@gmail.com") && recupererPassword.equals("1234")) {
                        System.out.println("Connexion reussie");
                        Authentification.this.dispose();
                        Principal principal = new Principal();
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Email ou mot de passe invalide");
                    }

                }
            });
        
        JButton quitter = new JButton("Quitter");
        
        // Nous ajoutons l'action sur le bouton quitter
        quitter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Authentification.this.dispose();
            }
        });
        
        
        // Nous ajoutons les deux boutons au panel deuxBoutons
        deuxBoutons.add(quitter, new FlowLayout(FlowLayout.LEFT));
        deuxBoutons.add(seConnecter, new FlowLayout(FlowLayout.RIGHT));
        
        
        return deuxBoutons;
    }
    
}
