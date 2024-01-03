/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koor.fr;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 *
 * @author mgraciano
 */
public class Bas extends JPanel {
    
    // Constructor
    public Bas() {
        this.setLayout(new FlowLayout(FlowLayout.LEFT)); 
        
        // We create the labels
        JLabel message = new JLabel("Messages");
        message.setBackground(Color.LIGHT_GRAY);
        JLabel image = new JLabel("Image");
        image.setBorder(new LineBorder(Color.GREEN, 2));
        JLabel contact = new JLabel("Contact");
        JLabel about = new JLabel("About as");
        
        // Nous ajoutons les labels
        this.add(message);  
        this.add(image);
        this.add(contact);  
        this.add(about);
    }
}
