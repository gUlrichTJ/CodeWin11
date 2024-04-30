
package koor.fr;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JToolBar;

/**
 *
 * @author mgraciano
 */
public class ToolBarE extends JToolBar {
    
    // Constructor
    public ToolBarE() {
        // Nous créons les boutons
        JButton files = new JButton("Files");
        files.setBackground(Color.CYAN);
        
        // Nous créons un checkbox
        JCheckBox cocher = new JCheckBox("Cocher");
        cocher.setBackground(Color.LIGHT_GRAY);
        
        // Nous créons le textArea
        JTextPane pane = new JTextPane();
        pane.setBackground(Color.blue);
        pane.setPreferredSize(new Dimension(30, 30));
        
        // Nous créons un textField
        JTextField field = new JTextField();
        field.setBackground(Color.GRAY);
        
        // Nous les ajoutons au toolbar
        this.add(files);    this.add(cocher);
        this.add(pane);     this.add(field);
    }
}
