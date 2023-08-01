package ad.univlome.tg.chat.verticalMenuBar;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;

public class VerticalMenuBar3 extends JFrame {

    // Constructor
    public VerticalMenuBar3() {
        super("Vertical Menu Bar");
        setSize(new Dimension(200, 400));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JMenuBar menuBar = new JMenuBar();

        // Créer un JMenu avec une lettre penchée pour chaque JMenuItem
        String[] letters = {"A", "n", "d", "r", "o", "i", "d", " ", "S", "t", "u", "d", "i", "o"};
        for (String letter : letters) {
            VerticalMenuItem menuItem = new VerticalMenuItem(letter);
            menuBar.add(menuItem);
        }

        setJMenuBar(menuBar);
        setVisible(true);
    }

    // Classe personnalisée pour le JMenuItem vertical
    class VerticalMenuItem extends JMenuItem {

        public VerticalMenuItem(String text) {
            super(text);
            setPreferredSize(new Dimension(30, 80)); // Ajustez la taille du JMenuItem vertical
            setHorizontalAlignment(SwingConstants.CENTER);
            setVerticalAlignment(SwingConstants.CENTER);
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

    // Main method
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new VerticalMenuBar3();
        });
    }
}

