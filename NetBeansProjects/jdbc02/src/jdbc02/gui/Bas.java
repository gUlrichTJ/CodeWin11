/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc02.gui;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author mgraciano
 */
public class Bas extends JMenuBar {
    
    public Bas() {
        JMenuItem output = new JMenuItem("Output");
        JMenuItem copyRight = new JMenuItem("Copyright edition 2023");
        JMenuItem git = new JMenuItem("Git");
        JMenuItem run = new JMenuItem("Run");
        JMenuItem pPackages = new JMenuItem("Python Packages");
        JMenuItem todo = new JMenuItem("TODO");
        JMenuItem terminal = new JMenuItem("Terminal");
        JMenuItem problemes = new JMenuItem("Problèmes");
        
        add(output);
        add(git);
        add(run);
        add(pPackages);
        add(todo);
        add(terminal);
        add(problemes);
        add(copyRight);
    }
}
