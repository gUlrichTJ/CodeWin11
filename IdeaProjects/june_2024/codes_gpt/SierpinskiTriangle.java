import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SierpinskiTriangle extends JPanel {

    private final int MAX_ITER = 7;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        drawSierpinskiTriangle(g, 400, 50, 50, 700, 750, 700, MAX_ITER);
    }

    private void drawSierpinskiTriangle(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3, int iter) {
        if (iter == 0) {
            int[] xPoints = {x1, x2, x3};
            int[] yPoints = {y1, y2, y3};
            g.drawPolygon(xPoints, yPoints, 3);
        } else {
            int x12 = (x1 + x2) / 2;
            int y12 = (y1 + y2) / 2;
            int x23 = (x2 + x3) / 2;
            int y23 = (y2 + y3) / 2;
            int x31 = (x3 + x1) / 2;
            int y31 = (y3 + y1) / 2;

            drawSierpinskiTriangle(g, x1, y1, x12, y12, x31, y31, iter - 1);
            drawSierpinskiTriangle(g, x12, y12, x2, y2, x23, y23, iter - 1);
            drawSierpinskiTriangle(g, x31, y31, x23, y23, x3, y3, iter - 1);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Sierpinski Triangle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.add(new SierpinskiTriangle());
        frame.setVisible(true);
    }
}

