package ad.univlome.tg.chat;

import javax.swing.*;
import java.awt.*;

public class CustomMenuBar extends JMenuBar {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g.create();

        // Set custom background color or gradient
        // g2d.setPaint(new GradientPaint(0, 0, Color.BLUE, getWidth(), getHeight(), Color.GREEN));
        g2d.setColor(Color.BLUE);
        g2d.fillRect(0, 0, getWidth(), getHeight());

        // Draw custom shapes or images
        g2d.setColor(Color.WHITE);
        g2d.setStroke(new BasicStroke(2));
        g2d.drawLine(0, getHeight() / 2, getWidth(), getHeight() / 2);

        // Draw custom text or icons
        g2d.setFont(new Font("Arial", Font.BOLD, 14));
        g2d.drawString("My Custom Menu Bar", 10, getHeight() / 2 + g2d.getFontMetrics().getHeight() / 2);

        g2d.dispose();
    }

    // Add your JMenu and JMenuItem creation here
    // ...

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Custom Menu Bar Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 200);

            CustomMenuBar customMenuBar = new CustomMenuBar();
            frame.setJMenuBar(customMenuBar);

            frame.setVisible(true);
        });
    }
}

