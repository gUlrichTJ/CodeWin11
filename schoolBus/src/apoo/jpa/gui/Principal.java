package apoo.jpa.gui;

/**
 *
 * @author Time Store
 */


import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Principal extends JFrame {
    
    // Nous déclarons le haut
    Haut haut;
    JPanel panelDeGauche;
    // Nous déclarons gauche
    Gauche gauche;
    // Nous ajoutons le bas
    Bas bas;
    
    // Constructor
    public Principal() {
        
        super("Fenetre Principale");
        this.setSize(1000, 600);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        //this.setLayout(new BorderLayout());
        // Nous instancions haut et nous l'ajoutons au panel princiapal
        haut = new Haut();
        this.add(haut, BorderLayout.NORTH);
        
        gauche = new Gauche(this);  // Après nous allons mettre gauche et centre dans un JSplitPane
        
        //this.add(panelDeGauche, BorderLayout.WEST);
        this.add(gauche, BorderLayout.WEST);
        
        // Nous instancions bas
        bas = new Bas();
        this.add(bas, BorderLayout.SOUTH);
        
        // Visibility
        this.setVisible(true);
    }
}
