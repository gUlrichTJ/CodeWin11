package ad.univlome.tg.chat.verticalMenuBar;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;

public class VerticalMenuBar6 extends JFrame {

    // Constructor
    public VerticalMenuBar6() {
        super("Vertical Menu Bar");
        setSize(new Dimension(200, 400));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JMenuBar menuBar = new JMenuBar();
        //menuBar.setLayout(new GridLayout(0, 1, 0, 0)); // Utiliser un GridLayout pour empiler les JMenu verticalement

        // Créer et ajouter les JMenu au JMenuBar
        addVerticalMenu(menuBar, "File");
        addVerticalMenu(menuBar, "Edit");
        addVerticalMenu(menuBar, "View");
        addVerticalMenu(menuBar, "Help");

        add(menuBar, BorderLayout.WEST);

        setVisible(true);
    }

    // Méthode pour créer et ajouter un JMenu vertical au JMenuBar
    private void addVerticalMenu(JMenuBar menuBar, String text) {
        VerticalMenu menu = new VerticalMenu(text);
        menuBar.add(menu);
    }

    // Classe personnalisée pour le JMenu vertical
    class VerticalMenu extends JMenu {

        public VerticalMenu(String text) {
            super(text);
            setPreferredSize(new Dimension(60, 80)); // Ajustez la taille du JMenu vertical
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
            new VerticalMenuBar6();
        });
    }
}

