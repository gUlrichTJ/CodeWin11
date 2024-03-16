package com.univlome.org.jmenubars;

import com.univlome.org.fenetres.Fenetre;
import java.awt.GridLayout;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

/**
 * @author time
 */

public class Panneau1Bas extends JMenuBar {
    
    Fenetre fenetre;
    
    String style = "sytle='size:1.3em; color:blue;'";
    
    JMenu versionControl = new JMenu("<html><span style='size:2em; color:blue; "
            + "font-weight:bold; font-family: verdana'>Version Control</span></html>");    
    JMenu run = new JMenu("<html><span style='size:2em; color:blue; "
            + "font-weight:bold; font-family: verdana'>Run</span></html>");
    JMenu debug = new JMenu("Debug");
    JMenu todo = new JMenu("TODO");
    JMenu profiler = new JMenu("Profiler");
    JMenu problems = new JMenu("Problems");
    JMenu terminal = new JMenu("Terminal");
    JMenu logcat = new JMenu("Logcat");
    JMenu services = new JMenu("Services");
    JMenu appQualityIn = new JMenu("App Quality In");
    
    // Constructor
    public Panneau1Bas(Fenetre fenetre) {
        this.fenetre = fenetre;
        
        setLayout(new GridLayout());
        
        add(versionControl);
        add(run);
        add(debug);
        add(todo);
        add(profiler);
        add(problems);
        add(terminal);
        add(logcat);
        add(services);
        add(appQualityIn);
    }
}
