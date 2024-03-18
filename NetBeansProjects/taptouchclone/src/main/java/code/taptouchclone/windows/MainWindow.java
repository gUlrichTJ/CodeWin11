/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code.taptouchclone.windows;

import javax.swing.*;

/**
 * This class is the principal window this, for graciano, etsiam, marie and déo
 * @author Jakarta-EE
 */

public class MainWindow extends JFrame {
    
    // TODO: the constructor (here, we're gonna do like everytime)
    public MainWindow() {
        /// The title
        super("Tap'Touche5");
        /// The size
        this.setSize(this.WIDTH, this.HEIGHT);
        /// The location
        this.setLocationRelativeTo(null);
        /// On close
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        // Visibility
        this.setVisible(true);
    }
}
