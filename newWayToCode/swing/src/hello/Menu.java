
package hello;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.util.Objects;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;

/**/
public class Menu extends JPanel {
    
    // Nous créons un JScrollPane pour le tableau
    JScrollPane scrollPane;
    
    // Constructor
    public Menu() {
        
        this.setLayout(new GridLayout(4, 1));
        this.setBorder(new LineBorder(Color.red, 2));
        
        JLabel accueil = new JLabel("Accueil");
        JLabel itineraire = new JLabel("Itinéraire");
        JLabel caisse = new JLabel("Caisse");
        JLabel utilisateurs = new JLabel("Utilisateurs");
        
        //ImageIcon icon = new ImageIcon(Objects.requireNonNull(this.getClass()).getResource("images.home.png"));
        
        // 
        //accueil.setIcon(icon);
        
        accueil.setHorizontalTextPosition(JLabel.LEFT);
        accueil.setVerticalTextPosition(JLabel.CENTER);
    
        // Nous ajoutons les lables au panel
        this.add(accueil);
        this.add(itineraire);
        this.add(caisse);
        this.add(utilisateurs);
        
    }
}
