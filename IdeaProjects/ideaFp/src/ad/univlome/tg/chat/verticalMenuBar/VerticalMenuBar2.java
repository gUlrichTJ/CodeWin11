package ad.univlome.tg.chat.verticalMenuBar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VerticalMenuBar2 extends JFrame {

    // Constructor
    public VerticalMenuBar2() {
        super("Vertical Menu Bar");
        setSize(new Dimension(100, 300));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JToolBar verticalToolBar = new JToolBar(JToolBar.VERTICAL);
        verticalToolBar.setFloatable(false);

        // Lettres penchées
        String[] letters = {"A", "n", "d", "r", "o", "i", "d", " ", "S", "t", "u", "d", "i", "o"};
        for (String letter : letters) {
            JButton letterButton = createVerticalButton(letter);
            verticalToolBar.add(letterButton);
        }

        add(verticalToolBar, BorderLayout.WEST);
        setVisible(true);
    }

    // Crée un bouton avec une lettre penchée
    private JButton createVerticalButton(String text) {
        JButton button = new JButton() {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.rotate(-Math.PI / 2); // Rotation de -90 degrés (lettre penchée)
                super.paintComponent(g2);
                g2.dispose();
            }

            @Override
            public Dimension getPreferredSize() {
                Dimension size = super.getPreferredSize();
                return new Dimension(size.height, size.width); // Inverser la taille pour que le bouton soit carré
            }
        };

        button.setText(text);
        button.setFocusPainted(false); // Enlever le focus visuel sur le bouton
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mettez votre code d'action ici
                System.out.println("Bouton " + text + " cliqué !");
            }
        });

        return button;
    }

    // Main method
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new VerticalMenuBar2();
        });
    }
}

