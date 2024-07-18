import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CantorSet extends JPanel {

    private final int MAX_ITER = 5;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        drawCantorSet(g, 50, 100, 700, MAX_ITER);
    }

    private void drawCantorSet(Graphics g, int x1, int y, int length, int iter) {
        if (iter == 0) {
            g.drawLine(x1, y, x1 + length, y);
        } else {
            drawCantorSet(g, x1, y, length / 3, iter - 1);
            drawCantorSet(g, x1 + 2 * length / 3, y, length / 3, iter - 1);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Cantor Set");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.add(new CantorSet());
        frame.setVisible(true);
    }
}

