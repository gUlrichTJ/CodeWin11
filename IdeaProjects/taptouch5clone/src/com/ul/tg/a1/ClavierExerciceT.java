package com.ul.tg.a1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ClavierExerciceT extends JFrame implements KeyListener {
    private JTextArea textArea;
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

    public ClavierExerciceT() {
        setTitle("Exercice de clavier 2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        textArea = new JTextArea();
        textArea.setText(texteASaisir);
        textArea.setEditable(false);
        textArea.setFont(new Font("Arial", Font.PLAIN, 18));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        JScrollPane textScrollPane = new JScrollPane(textArea);

        inputArea = new JTextArea();
        inputArea.setFont(new Font("Arial", Font.PLAIN, 18));
        inputArea.setLineWrap(true);
        inputArea.setWrapStyleWord(true);
        inputArea.addKeyListener(this);
        JScrollPane inputScrollPane = new JScrollPane(inputArea);

        add(textScrollPane, BorderLayout.CENTER);
        add(inputScrollPane, BorderLayout.SOUTH);

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
        String enteredText = inputArea.getText();

        if (texteASaisir.startsWith(enteredText)) {
            // Mettre en surbrillance le texte déjà saisi
            textArea.setSelectionStart(0);
            textArea.setSelectionEnd(enteredText.length());
            textArea.setSelectionColor(Color.GREEN);
        } else {
            // Réinitialiser la surbrillance
            textArea.setSelectionStart(0);
            textArea.setSelectionEnd(0);
            textArea.setSelectionColor(Color.BLACK);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ClavierExerciceT::new);
    }
}

