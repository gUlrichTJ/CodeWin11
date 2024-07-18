import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PythagorasTree extends JPanel {

    private final int MAX_ITER = 10;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        drawPythagorasTree(g, 400, 600, -Math.PI / 2, 100, MAX_ITER);
    }

    private void drawPythagorasTree(Graphics g, int x1, int y1, double angle, double length, int iter) {
        if (iter == 0) return;

        int x2 = x1 + (int) (Math.cos(angle) * length);
        int y2 = y1 + (int) (Math.sin(angle) * length);

        g.drawLine(x1, y1, x2, y2);

        drawPythagorasTree(g, x2, y2, angle - Math.PI / 4, length * 0.7, iter - 1);
        drawPythagorasTree(g, x2, y2, angle + Math.PI / 4, length * 0.7, iter - 1);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Pythagoras Tree");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.add(new PythagorasTree());
        frame.setVisible(true);
    }
}

