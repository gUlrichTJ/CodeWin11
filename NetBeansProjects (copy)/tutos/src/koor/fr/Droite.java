
package koor.fr;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;


public class Droite extends JPanel {
    
    public Droite() {

        this.setLayout(new GridLayout(4, 1));
        this.setBorder(new LineBorder(Color.yellow, 3));
        
        
        JButton button = new JButton("Bouton 1");
        JButton button1 = new JButton("Bouton 2");
        JButton button2 = new JButton("Bouton 3");
        JButton button3 = new JButton("Bouton 4");
        
        // Nous ajoutons le label au JPanel
        this.add(button);
        this.add(button1);
        this.add(button2);
        this.add(button3);

    }
}
