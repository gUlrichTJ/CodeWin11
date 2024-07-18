import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JuliaSet extends JPanel {

    private final int MAX_ITER = 300;
    private final double ZOOM = 1;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawJuliaSet(g);
    }

    private void drawJuliaSet(Graphics g) {
        double zx, zy, cX, cY, tmp;
        cX = -0.7;
        cY = 0.27015;

        for (int y = 0; y < getHeight(); y++) {
            for (int x = 0; x < getWidth(); x++) {
                zx = 1.5 * (x - getWidth() / 2) / (0.5 * ZOOM * getWidth());
                zy = (y - getHeight() / 2) / (0.5 * ZOOM * getHeight());
                int i = MAX_ITER;
                while (zx * zx + zy * zy < 4 && i > 0) {
                    tmp = zx * zx - zy * zy + cX;
                    zy = 2.0 * zx * zy + cY;
                    zx = tmp;
                    i--;
                }
                int c = Color.HSBtoRGB((MAX_ITER / i) % 1, 1, i > 0 ? 1 : 0);
                g.setColor(new Color(c));
                g.drawLine(x, y, x, y);
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Julia Set");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.add(new JuliaSet());
        frame.setVisible(true);
    }
}

