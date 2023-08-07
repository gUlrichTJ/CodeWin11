
package com.univlome.org.panneaux;

import com.univlome.org.jmenubars.Panneau2Haut;
import com.univlome.org.fenetres.Fenetre;
import com.univlome.org.jmenubars.Panneau1Droit;
import com.univlome.org.jmenubars.Panneau1Gauche;
import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author mgraciano
 */
public class Center extends JPanel {
    
    Fenetre fenetre;
    // We create an instance of Panneau2Haut
    // Constructor
    public Center(Fenetre fenetre) {
        Panneau2Haut panneau2Haut = new Panneau2Haut(fenetre);
        
        // We create an instance of the Panneau1Gauche
        Panneau1Gauche panneau1Gauche = new Panneau1Gauche(fenetre);
        
        // We create the instance of the Panneau1Droit
        Panneau1Droit panneau1Droit = new Panneau1Droit(fenetre);
           
        this.setLayout(new BorderLayout());
        this.add(panneau2Haut, BorderLayout.NORTH);
        
        // We add the JMenuBar of left
        this.add(panneau1Gauche, BorderLayout.WEST);
        
        // We add the JMenuBar of right
        this.add(panneau1Droit, BorderLayout.EAST);
    }
}
