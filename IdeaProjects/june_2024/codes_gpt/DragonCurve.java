import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DragonCurve extends JPanel {

    private final int MAX_ITER = 16;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        drawDragonCurve(g, 100, 300, 700, 300, MAX_ITER, true);
    }

    private void drawDragonCurve(Graphics g, int x1, int y1, int x2, int y2, int iter, boolean left) {
        if (iter == 0) {
            g.drawLine(x1, y1, x2, y2);
        } else {
            int midX = (x1 + x2) / 2 + (left ? (y2 - y1) / 2 : -(y2 - y1) / 2);
            int midY = (y1 + y2) / 2 + (left ? -(x2 - x1) / 2 : (x2 - x1) / 2);
            drawDragonCurve(g, x1, y1, midX, midY, iter - 1, true);
            drawDragonCurve(g, midX, midY, x2, y2, iter - 1, false);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Dragon Curve");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.add(new DragonCurve());
        frame.setVisible(true);
    }
}

