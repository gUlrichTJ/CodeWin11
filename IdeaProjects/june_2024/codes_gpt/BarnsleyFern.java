import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.Random;

public class BarnsleyFern extends JPanel {

    private final int MAX_ITER = 50000;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.GREEN);
        drawBarnsleyFern(g);
    }

    private void drawBarnsleyFern(Graphics g) {
        double x = 0, y = 0;
        Random rand = new Random();

        for (int i = 0; i < MAX_ITER; i++) {
            double nextX, nextY;
            int r = rand.nextInt(100);

            if (r < 1) {
                nextX = 0;
                nextY = 0.16 * y;
            } else if (r < 86) {
                nextX = 0.85 * x + 0.04 * y;
                nextY = -0.04 * x + 0.85 * y + 1.6;
            } else if (r < 93) {
                nextX = 0.2 * x - 0.26 * y;
                nextY = 0.23 * x + 0.22 * y + 1.6;
            } else {
                nextX = -0.15 * x + 0.28 * y;
                nextY = 0.26 * x + 0.24 * y + 0.44;
            }

            x = nextX;
            y = nextY;

            int plotX = (int) (getWidth() / 2 + x * getWidth() / 11);
            int plotY = (int) (getHeight() - y * getHeight() / 11);

            g.drawLine(plotX, plotY, plotX, plotY);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Barnsley Fern");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.add(new BarnsleyFern());
        frame.setVisible(true);
    }
}

