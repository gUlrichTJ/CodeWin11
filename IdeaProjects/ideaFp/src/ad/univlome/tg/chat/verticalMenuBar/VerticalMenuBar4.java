package ad.univlome.tg.chat.verticalMenuBar;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;

public class VerticalMenuBar4 extends JFrame {

    // Constructor
    public VerticalMenuBar4() {
        super("Vertical Menu Bar");
        setSize(new Dimension(200, 400));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JMenuBar menuBar = new JMenuBar();
        menuBar.setLayout(new FlowLayout());

        // Créer un JMenu avec un mot penché (vertical) pour chaque JMenuItem
        String[] words = {"File", "Edit", "View", "Help"};
        for (String word : words) {
            VerticalMenuItem menuItem = new VerticalMenuItem(word);
            JMenu menu = new JMenu();
            menu.add(menuItem);
            menuBar.add(menu);
        }

        //setJMenuBar(menuBar);
        add(menuBar, BorderLayout.WEST);
        setVisible(true);
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
            new VerticalMenuBar4();
        });
    }
}

