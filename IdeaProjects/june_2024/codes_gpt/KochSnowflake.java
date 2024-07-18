import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class KochSnowflake extends JPanel {

    private final int MAX_ITER = 4;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        drawKochSnowflake(g, 200, 300, 600, 300, MAX_ITER);
        drawKochSnowflake(g, 600, 300, 400, 100, MAX_ITER);
        drawKochSnowflake(g, 400, 100, 200, 300, MAX_ITER);
    }

    private void drawKochSnowflake(Graphics g, int x1, int y1, int x2, int y2, int iter) {
        if (iter == 0) {
            g.drawLine(x1, y1, x2, y2);
        } else {
            int deltaX = x2 - x1;
            int deltaY = y2 - y1;

            int x3 = x1 + deltaX / 3;
            int y3 = y1 + deltaY / 3;

            int x5 = x1 + 2 * deltaX / 3;
            int y5 = y1 + 2 * deltaY / 3;

            int x4 = (int) ((x1 + x2) / 2 + Math.sqrt(3) * (y1 - y2) / 6);
            int y4 = (int) ((y1 + y2) / 2 + Math.sqrt(3) * (x2 - x1) / 6);

            drawKochSnowflake(g, x1, y1, x3, y3, iter - 1);
            drawKochSnowflake(g, x3, y3, x4, y4, iter - 1);
            drawKochSnowflake(g, x4, y4, x5, y5, iter - 1);
            drawKochSnowflake(g, x5, y5, x2, y2, iter - 1);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Koch Snowflake");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.add(new KochSnowflake());
        frame.setVisible(true);
    }
}

