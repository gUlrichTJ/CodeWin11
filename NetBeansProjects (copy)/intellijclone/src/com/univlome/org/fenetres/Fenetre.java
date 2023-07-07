/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.univlome.org.fenetres;

import com.univlome.org.panneaux.Center;
import com.univlome.org.panneaux.Panneau1Haut;
import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author mgraciano
 */
public class Fenetre extends JFrame {
    
    // We create an instance of Panneau1Haut
    Panneau1Haut panneau1Haut = new Panneau1Haut(this);
    
    // We create an instance of Center
    Center center = new Center(this);
    
    // Constructor
    public Fenetre() {
        this.setTitle("AndroidStudio clone");
        this.setSize(1000, 650);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        // We add the menu bar to the frame
        this.add(panneau1Haut, BorderLayout.NORTH);
        
        // We add the center
        this.add(center);
        // Visibility of the window
        this.setVisible(true);
    }
}
