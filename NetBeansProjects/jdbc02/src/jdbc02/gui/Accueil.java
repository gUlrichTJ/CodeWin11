/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc02.gui;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author mgraciano
 */
public class Accueil extends JPanel {
    
    // Constructeur
    public Accueil() {
        
        add(photoAccueil(), BorderLayout.CENTER);
    }
    
    // Méthode pour la photo
    public JPanel photoAccueil() {
        JPanel panel = new JPanel();
        setLayout(new BorderLayout());
        
        ImageIcon icon = new ImageIcon("C:\\NetbeansProjectsWin\\NetbeansProjects\\images\\schoolbus1.png");
        JLabel label = new JLabel(icon);
        label.setLayout(new BorderLayout());
        panel.add(label);
        
        return panel;
    }
}
