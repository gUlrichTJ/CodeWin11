package ad.univlome.tg.chat.verticalMenuBar;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;

public class VerticalMenuBar7 extends JFrame {

    // Constructor
    public VerticalMenuBar7() {
        super("Vertical Menu Bar");
        setSize(new Dimension(400, 200));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JMenuBar menuBar = new JMenuBar();
        menuBar.setLayout(new BoxLayout(menuBar, BoxLayout.Y_AXIS));

        // Créer et ajouter les JMenu au JMenuBar
        addVerticalMenu(menuBar, "File");
        addVerticalMenu(menuBar, "Edit");
        addVerticalMenu(menuBar, "View");
        addVerticalMenu(menuBar, "Help");

        add(menuBar, BorderLayout.WEST);

        setVisible(true);
    }

    // Méthode pour créer et ajouter un JMenu horizontal avec mots penchés (JMenuItem) au JMenuBar
    private void addVerticalMenu(JMenuBar menuBar, String text) {
        JMenu menu = new VerticalMenu(text);
        menuBar.add(menu);
    }

    // Classe personnalisée pour le JMenu horizontal avec mots penchés (JMenuItem)
    class VerticalMenu extends JMenu {

        public VerticalMenu(String text) {
            super(text);
        }

        @Override
        public Dimension getPreferredSize() {
            Dimension size = super.getPreferredSize();
            return new Dimension(size.height, size.width); // Echanger les dimensions pour obtenir un JMenu horizontal
        }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            AffineTransform at = new AffineTransform();
            at.setToRotation(Math.toRadians(90), 0, 0); // Tourner le texte à 90 degrés
            g2.setTransform(at);
            super.paintComponent(g2);
            g2.dispose();
        }
    }

    // Main method
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new VerticalMenuBar7();
        });
    }
}

