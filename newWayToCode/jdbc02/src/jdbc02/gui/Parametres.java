/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc02.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 *
 * @author mgraciano
 */
public class Parametres extends JFrame {
    
    // Constructor
    public Parametres() {
        super("Pramètres");
        setSize(850, 550);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JMenuBar menuBarGauche = gauche();
        setJMenuBar(menuBarGauche);
        
        add(menuBarGauche, BorderLayout.NORTH);
        
        JPanel troisBtn = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        troisBtn = troisBoutons();
        add(troisBtn, BorderLayout.SOUTH);
        
        setVisible(true);
    }
    
    // Le JMenuBar gauche de paramètre
    public JMenuBar gauche() {
            JMenuBar menuBar = new JMenuBar();
            
            JMenu apparenceEtComportement = new JMenu("Apparence et Comportement");
                JMenuItem apparence = new JMenuItem("Apparence");
                JMenuItem newUi = new JMenuItem("New UI");
                JMenuItem menuEtToolbars = new JMenuItem("Menu et Toolbars");
                JMenuItem systemSettings = new JMenuItem("Paramètres systeme");
                JMenuItem couleurs = new JMenuItem("Couleurs");
                    // Nous ajoutons
                    apparenceEtComportement.add(apparence);
                    apparenceEtComportement.add(newUi);
                    apparenceEtComportement.add(menuEtToolbars);
                    apparenceEtComportement.add(systemSettings);
                    apparenceEtComportement.add(couleurs);
                    
            menuBar.add(apparenceEtComportement);
            
            JMenu keyMap = new JMenu("Key Map");
            menuBar.add(keyMap);
            
                JMenu editeur = new JMenu("Editeur");
                    JMenuItem general = new JMenuItem("Général");
                    JMenuItem codeEditing = new JMenuItem("Code Editing");
                    JMenuItem font = new JMenuItem("Font");
                    JMenuItem colorScheme = new JMenuItem("Color Scheme");
                    JMenuItem colorStyle = new JMenuItem("Color Sytle");
                    
                // Nous ajoutons
                editeur.add(general);
                editeur.add(codeEditing);
                editeur.add(font);
                editeur.add(colorScheme);
                editeur.add(colorStyle);
                // Nous ajoutons menuBar à l'éditeur
            menuBar.add(editeur);
            
                JMenu plugin = new JMenu("Plugin");
            menuBar.add(plugin);
                
                JMenu versionControl = new JMenu("Version Control");
                    JMenuItem changeList = new JMenuItem("Change List");
                    JMenuItem commit = new JMenuItem("Commit");
                    JMenuItem confirmation = new JMenuItem("Confirmation");
                    JMenuItem directoryMapping = new JMenuItem("Directory Mapping");
                    JMenuItem fileStatusColor = new JMenuItem("File Status Color");
                    JMenuItem issueNavigation = new JMenuItem("Issue Navigation");
                    JMenuItem shelf = new JMenuItem("Shelf");
                    JMenuItem git = new JMenuItem("Git");
                    
                // Nous ajoutons
                versionControl.add(changeList);
                versionControl.add(commit);
                versionControl.add(confirmation);
                versionControl.add(directoryMapping);
                versionControl.add(fileStatusColor);
                versionControl.add(issueNavigation);
                versionControl.add(shelf);
                versionControl.add(git);
                
            menuBar.add(versionControl);
                
                JMenu buildExecutionDep = new JMenu("Build, Execution, Deployement");
            menuBar.add(buildExecutionDep);
            
                JMenu langagesFramework = new JMenu("Langages et Frameworks");
            menuBar.add(langagesFramework);
            
            JMenu profilMenuBar = new JMenu("Profile");
            
            menuBar.add(profilMenuBar);
            
            JMenu preferencesDeNotification = new JMenu("Preferences de notification");
            
            menuBar.add(preferencesDeNotification);
            
            JMenu parametreDeLangueEtLocalisation = new JMenu("Paramètre de langues et de localisation");
            
            menuBar.add(parametreDeLangueEtLocalisation);
            
            JMenu parametreDeRechercheEtFiltrage = new JMenu("Paramètre de recherche et de filtrage");
            
            menuBar.add(parametreDeRechercheEtFiltrage);
            
            JMenu accessibilite = new JMenu("Accessibilité");
            
            menuBar.add(accessibilite);
                
        return menuBar;
    }
    
    // Les trois boutons ok, cancel, apply
    public JPanel troisBoutons() {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        
        // Les trois boutons
        
        JButton ok = new JButton("Ok");
        ok.setBackground(Color.CYAN);
        // Nous ajoutons une action sur le boutons ok
        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Parametres.this.dispose();
            }
        });
        
        panel.add(ok);
        
        JButton cancel = new JButton("Anuler");
        cancel.setBackground(Color.red);
        // Nous ajoutons une action sur le boutons ok
        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Parametres.this.dispose();
            }
        });
        panel.add(cancel);
        
        JButton apply = new JButton("Appliquer");
        apply.setBackground(Color.LIGHT_GRAY);
        // Nous ajoutons une action sur le boutons ok
        apply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.out.println("Correct");
            }
        });
        panel.add(apply);
        
        return panel;
    }
}
