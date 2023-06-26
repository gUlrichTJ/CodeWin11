/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.univlome.org.panneaux;

import com.univlome.org.fenetres.Fenetre;
import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author mgraciano
 */
public class Center extends JPanel {
    
    Fenetre fenetre;
    // We create an instance of Panneau2Haut
    // Constructor
    public Center(Fenetre fenetre) {
        Panneau2Haut panneau2Haut = new Panneau2Haut(fenetre);
           
        this.setLayout(new BorderLayout());
        this.add(panneau2Haut, BorderLayout.NORTH);
    }
}
