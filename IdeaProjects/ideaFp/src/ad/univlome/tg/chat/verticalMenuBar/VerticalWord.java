package ad.univlome.tg.chat.verticalMenuBar;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;

public class VerticalWord extends JFrame {

    // Constructor
    public VerticalWord() {
        super("Title");
        setSize(new Dimension(200, 400));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel verticalPanel = new JPanel();
        verticalPanel.setLayout(new BoxLayout(verticalPanel, BoxLayout.Y_AXIS));
        verticalPanel.setBackground(Color.WHITE); // Optional: To make the background white

        VerticalLabel2 verticalLabel2 = new VerticalLabel2("Android Studio");
        verticalPanel.add(verticalLabel2);

        add(verticalPanel);

        setVisible(true);
    }

    // Main method
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new VerticalWord();
        });
    }
}

class VerticalLabel2 extends JLabel {

    public VerticalLabel2(String text) {
        super(text);
        setFont(new Font("Arial", Font.PLAIN, 20)); // Optional: To set the font size
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

