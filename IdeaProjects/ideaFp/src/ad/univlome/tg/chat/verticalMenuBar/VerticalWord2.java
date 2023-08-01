package ad.univlome.tg.chat.verticalMenuBar;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;

public class VerticalWord2 extends JFrame {

    // Constructor
    public VerticalWord2() {
        super("Title");
        setSize(new Dimension(100, 400)); // Réduisez la largeur pour s'adapter au mot
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel verticalPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2 = (Graphics2D) g.create();
                AffineTransform at = new AffineTransform();
                at.setToRotation(Math.toRadians(90), getWidth() / 2.0, getHeight() / 2.0);
                g2.setTransform(at);

                // Dessiner le texte au centre du JPanel
                FontMetrics fm = g2.getFontMetrics();
                int x = (getHeight() - fm.stringWidth("Android Studio")) / 2;
                int y = getWidth() / 2;
                g2.drawString("Android Studio", x, y);

                g2.dispose();
            }
        };

        verticalPanel.setPreferredSize(new Dimension(100, 200)); // Ajustez la taille du JPanel pour contenir le mot

        add(verticalPanel);

        setVisible(true);
    }

    // Main method
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new VerticalWord2();
        });
    }
}
