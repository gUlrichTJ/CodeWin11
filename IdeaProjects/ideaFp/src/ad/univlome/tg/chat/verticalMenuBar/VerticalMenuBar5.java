package ad.univlome.tg.chat.verticalMenuBar;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;

public class VerticalMenuBar5 extends JFrame {

    // Constructor
    public VerticalMenuBar5() {
        super("Vertical Menu Bar");
        setSize(new Dimension(200, 400));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JMenuBar menuBar = new JMenuBar();
        menuBar.setLayout(new BoxLayout(menuBar, BoxLayout.Y_AXIS));

        // Créer et ajouter les JMenuItems au JMenuBar
        addVerticalMenuItem(menuBar, "File");
        addVerticalMenuItem(menuBar, "Edit");
        addVerticalMenuItem(menuBar, "View");
        addVerticalMenuItem(menuBar, "Help");

        setJMenuBar(menuBar);
        setVisible(true);
    }

    // Méthode pour créer et ajouter un JMenuItem vertical au JMenuBar
    private void addVerticalMenuItem(JMenuBar menuBar, String text) {
        VerticalMenuItem menuItem = new VerticalMenuItem(text);
        JMenu menu = new JMenu();
        menu.add(menuItem); // Ajouter le JMenuItem au JMenu
        menuBar.add(menuItem); // Ajouter le JMenu au JMenuBar
    }

    // Classe personnalisée pour le JMenuItem vertical
    class VerticalMenuItem extends JMenuItem {

        public VerticalMenuItem(String text) {
            super(text);
            setPreferredSize(new Dimension(60, 80)); // Ajustez la taille du JMenuItem vertical
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
            new VerticalMenuBar5();
        });
    }
}
