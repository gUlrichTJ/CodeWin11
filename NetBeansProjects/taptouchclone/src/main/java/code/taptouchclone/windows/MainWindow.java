/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code.taptouchclone.windows;

import java.awt.*;
import javax.swing.*;

/**
 * This class is the principal window this, for graciano, etsiam, marie and déo
 * @author Jakarta-EE
 */

public class MainWindow extends JFrame {
    
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    
    int width = (int) (screenSize.width * 0.9);
    int height = (int) (screenSize.height * 0.9);
    
    // TODO: the constructor (here, we're gonna do like everytime)
    public MainWindow() {
        /// The title
        super("Tap'Touche5");
        /// The size
        this.setSize(width, height);
        /// The location
        this.setLocationRelativeTo(null);
        /// On close
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        // Visibility
        this.setVisible(true);
    }
}
