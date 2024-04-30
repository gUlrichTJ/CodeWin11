/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.univlome.org.jmenubars;

import com.univlome.org.fenetres.Fenetre;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

/**
 *
 * @author time
 */
public class Panneau1Droit extends JMenuBar {
    
    Fenetre fenetre;
    
    JMenu deviceManager = new JMenu("Device Manager");
    JMenu flutterInspector = new JMenu("Flutter Inspector");
    JMenu flutterPerformance = new JMenu("Flutter Performance");
    JMenu flutterOutline = new JMenu("Flutter Outline");
    JMenu notifications = new JMenu("Notifications");
    JMenu runningDebug = new JMenu("Running Debug");

    // Constructor
    public Panneau1Droit(Fenetre fenetre) {
        this.fenetre = fenetre;
        
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setPreferredSize(new Dimension(50, 0));
        
        add(deviceManager);
        add(flutterInspector);
        add(flutterPerformance);
        add(flutterOutline);
        add(notifications);
        add(runningDebug);
        
    }
}
