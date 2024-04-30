
package apoo.jpa.gui;

/**
 *
 * @author Time Store
 */

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class BoutonImage extends JButton {
    
    // Constructor
    public BoutonImage(String texte, String pathIcon) {
        super();
        ImageIcon icon = new ImageIcon(getClass().getResource(pathIcon));
        this.setIcon(icon);
        this.setText(texte);
        this.setFont(new Font("Serif", Font.PLAIN, 13));
        this.setForeground(Color.black);
        this.setVisible(true);
        this.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));    // Elève la bordure
        this.setBackground(Color.white);
  }
}

