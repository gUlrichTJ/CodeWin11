package com.ul.tg.a1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ClavierExercice extends JFrame implements KeyListener {
    private JTextArea textArea;

    public ClavierExercice() {
        setTitle("Exercice de clavier");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textArea = new JTextArea();
        textArea.addKeyListener(this);
        textArea.setFont(new Font("Arial", Font.PLAIN, 18));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        add(textArea);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Ignorer cet événement
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // Ignorer cet événement
    }

    @Override
    public void keyReleased(KeyEvent e) {
        char expectedChar = 'A';  // Caractère attendu pour la saisie

        if (e.getKeyChar() == expectedChar) {
            // Caractère correct
            textArea.append(String.valueOf(expectedChar));
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ClavierExercice::new);
    }
}

