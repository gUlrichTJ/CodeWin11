package main;

import exo3.EcouteurFenetre;
import javax.swing.SwingUtilities;

/**
 *
 * @author Time_Tempest
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world !");
        SwingUtilities.invokeLater(EcouteurFenetre::new);       
        SwingUtilities.invokeLater(EcouteurFenetre::new);
        SwingUtilities.invokeLater(EcouteurFenetre::new);

    }
}
