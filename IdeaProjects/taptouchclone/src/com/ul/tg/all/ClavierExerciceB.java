package com.ul.tg.all;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ClavierExerciceB extends JFrame implements KeyListener {
    private JTextArea displayArea;
    private JTextArea inputArea;
    private String texteASaisir = "Maître Corbeau, sur un arbre perché,\n" +
            "Tenait en son bec un fromage.\n" +
            "Maître Renard, par l'odeur alléché,\n" +
            "Lui tint à peu près ce langage :\n" +
            "\"Hé ! bonjour, Monsieur du Corbeau.\n" +
            "Que vous êtes joli ! que vous me semblez beau !\n" +
            "Sans mentir, si votre ramage\n" +
            "Se rapporte à votre plumage,\n" +
            "Vous êtes le Phénix des hôtes de ces bois.\"";

    private int cursorPosition = 0;

/*    @Override
    public void keyReleased(KeyEvent e) {
        char expectedChar = texteASaisir.charAt(cursorPosition);

        if (e.getKeyChar() == expectedChar) {
            // Caractère correct, avancer le curseur
            cursorPosition++;

            // Mettre à jour la couleur du texte saisi
            displayArea.setSelectionStart(0);
            displayArea.setSelectionEnd(cursorPosition);
            displayArea.setSelectionColor(Color.GREEN);

            if (cursorPosition >= texteASaisir.length()) {
                // Réinitialiser la saisie après avoir terminé la fable
                cursorPosition = 0;
                inputArea.setText("");

                // Réinitialiser la couleur du texte affiché
                displayArea.setSelectionStart(0);
                displayArea.setSelectionEnd(0);
                displayArea.setSelectionColor(Color.BLACK);
            }
        } else {
            // Caractère incorrect, mettre en surbrillance en rouge
            displayArea.setSelectionStart(cursorPosition);
            displayArea.setSelectionEnd(cursorPosition + 1);
            displayArea.setSelectionColor(Color.RED);
        }

        // Réactiver la zone de saisie
        inputArea.setEnabled(true);
    }*/

    public ClavierExerciceB() {
        setTitle("Exercice de clavier B");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        displayArea = new JTextArea();
        displayArea.setText(texteASaisir);
        displayArea.setEditable(false);
        displayArea.setFont(new Font("Arial", Font.PLAIN, 18));
        displayArea.setLineWrap(true);
        displayArea.setWrapStyleWord(true);
        JScrollPane displayScrollPane = new JScrollPane(displayArea);

        inputArea = new JTextArea();
        inputArea.setFont(new Font("Arial", Font.PLAIN, 18));
        inputArea.setLineWrap(true);
        inputArea.setWrapStyleWord(true);
        inputArea.addKeyListener(this);
        JScrollPane inputScrollPane = new JScrollPane(inputArea);

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(displayScrollPane, BorderLayout.CENTER);
        panel.add(inputScrollPane, BorderLayout.SOUTH);

        add(panel, BorderLayout.CENTER);
        add(validerSaisie(), BorderLayout.SOUTH);
//        add(displayScrollPane, BorderLayout.CENTER);
//        add(inputScrollPane, BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    // Méthode pour valider la saisie
    public JPanel validerSaisie() {
        JPanel panel = new JPanel(new BorderLayout());

        // Le bouton valider
        JButton buttonValider = new JButton();
        buttonValider.setBackground(Color.BLUE);

        JLabel labelValider = new JLabel("Valider");
        labelValider.setFont(new Font("Comic Sans Ms", Font.BOLD, 16));
        labelValider.setForeground(Color.WHITE);

        buttonValider.add(labelValider);

        // Action sur le bouton valider
        buttonValider.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (texteASaisir.equals(inputArea.getText())) {
                    new ValidationText(ClavierExerciceB.this, "Text Correct");
                } else {
                    // new ValidationText(ClavierExerciceB.this, "Text incorrect");
                    JOptionPane.showMessageDialog(ClavierExerciceB.this, "Text correct");
                }
            }
        });
        panel.add(buttonValider);
        return panel;
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
        char expectedChar = texteASaisir.charAt(cursorPosition);

        if (e.getKeyChar() == expectedChar) {
            // Caractère correct, avancer le curseur
            cursorPosition++;

            // Mettre à jour la couleur du texte saisi
            displayArea.setSelectionStart(0);
            displayArea.setSelectionEnd(cursorPosition);
            displayArea.setForeground(Color.GREEN);

            if (cursorPosition >= texteASaisir.length()) {
                // Réinitialiser la saisie après avoir terminé la fable
                cursorPosition = 0;
                inputArea.setText("");

                // Réinitialiser la couleur du texte affiché
                displayArea.setSelectionStart(0);
                displayArea.setSelectionEnd(0);
                displayArea.setForeground(Color.BLACK);
            }
        } else {
            // Caractère incorrect, mettre en surbrillance en rouge
            displayArea.setForeground(Color.RED);
        }
    }

    class ValidationText extends JDialog {

        public ValidationText(Frame parent, String message) {
            super(parent, "Validation", true);
            setSize(300, 200);
            setLocationRelativeTo(parent);

            JLabel label = new JLabel(message);
                    label.setFont(new Font("Arial", Font.BOLD, 17));
                    label.setForeground(Color.BLUE);
            add(label);

            setVisible(true);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ClavierExerciceB::new);
    }
}
