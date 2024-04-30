package ad.univlome.tg.chat.verticalMenuBar;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;

public class VerticalLabel extends JLabel {

    public VerticalLabel(String text) {
        super(text);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        AffineTransform at = new AffineTransform();
        at.setToRotation(Math.PI / 2.0, getWidth() / 2.0, getHeight() / 2.0);
        g2.setTransform(at);
        super.paintComponent(g2);
        g2.dispose();
    }
}
