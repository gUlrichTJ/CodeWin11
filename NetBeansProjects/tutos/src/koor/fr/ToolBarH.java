/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koor.fr;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;

/**
 *
 * @author mgraciano
 */
public class ToolBarH extends JFrame {
    
    // Nous apportons le toolbar
    ToolBarE tbe = new ToolBarE();
    
    // Nous mettons le composant de droite
    Droite droite = new Droite();
    
    // Nous mettons le bas au bas de la fenetre
    Bas bas = new Bas();
    
    // Constructor
    public ToolBarH() {
        super("Title");
        this.setSize(400, 450);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        // Nous allons avec le JScrollPane
        JScrollPane scrollPane = new JScrollPane(new JTree());
        scrollPane.setPreferredSize(new Dimension(100, 100));
        this.add(scrollPane, BorderLayout.WEST);
        
        this.add(tbe, BorderLayout.NORTH);
        this.add(droite, BorderLayout.EAST);
        this.add(bas, BorderLayout.SOUTH);
        // Visibility
        this.setVisible(true);
    }
    
}
