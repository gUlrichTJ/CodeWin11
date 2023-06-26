package hello;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class Principale extends JFrame {
    
    // Nous créons un objet de type Entete
    Entete entete = new Entete();
    Menu menu = new Menu();
    
    public Principale() {
        
        super("Principal");
        this.setSize(500, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(new BorderLayout());
        
        // Nous ajoutons l'entete au panel principal
        this.add(entete, BorderLayout.NORTH);
        
        // Nous ajoutons le menu
        this.add(menu, BorderLayout.WEST);
        // Visibility
        this.setVisible(true);
    }
}
