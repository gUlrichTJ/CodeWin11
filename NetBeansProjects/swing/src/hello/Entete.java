
package hello;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;


public class Entete extends JPanel {
    
    public Entete() {

        this.setLayout(new BorderLayout());
        this.setBorder(new LineBorder(Color.yellow, 3));
        
        JLabel label = new JLabel("User");
        label.setBackground(Color.red);
        label.setLayout(new FlowLayout(FlowLayout.RIGHT));
        
        // Nous ajoutons le label au JPanel
        this.add(label, BorderLayout.EAST);
        
    }
}
