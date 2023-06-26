/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.univlome.org.boutons;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author mgraciano
 */
public class BoutonImage extends JButton {
    
    // Constructor
    public BoutonImage(String cheminImage, String texte) {
        
        ImageIcon icon = new ImageIcon(cheminImage);
        
        // Nous créons un JLabel pour recevoir les deux
        
        setIcon(icon);
        setText(texte);
        setFont(new Font("Arial", Font.BOLD, 15));
        setForeground(Color.black);
        setBackground(Color.white);
        setVisible(true);
    }
}
