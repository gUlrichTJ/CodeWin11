package com.univlome.org.jmenubars;

import com.univlome.org.fenetres.Fenetre;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

/**
 *
 * @author time
 */
public class Panneau1Gauche extends JMenuBar {
    
    Fenetre fenetre;
    
    JMenu project = new JMenu("Project");
    JMenu resourceManager = new JMenu("Resource Manager");
    JMenu bookmarks = new JMenu("Bookmarks");
    JMenu buildVariants = new JMenu("Build Variants");
    
    // Constructor
    public Panneau1Gauche(Fenetre fenetre) {
        this.fenetre = fenetre;
        
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setPreferredSize(new Dimension(50, 0));

        add(project);
        add(resourceManager);
        add(bookmarks);
        
            buildVariants.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("We build");
                }
            });
        
        add(buildVariants);
        
        add(Box.createVerticalGlue());
    }
    
    private void addVerticalMenu(JMenuBar menuBar, String text) {
        VerticalMenu menu = new VerticalMenu(text);
        menuBar.add(menu);
    }
    
    class VerticalMenu extends JMenu {

        public VerticalMenu(String text) {
            super(text);
            setPreferredSize(new Dimension(60, 80)); // Ajustez la taille du JMenu vertical
        }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            AffineTransform at = new AffineTransform();
            at.setToRotation(Math.toRadians(90), getWidth() / 2.0, getHeight() / 2.0);
            g2.setTransform(at);
            super.paintComponent(g2);
            g2.dispose();
        }
    }


}
