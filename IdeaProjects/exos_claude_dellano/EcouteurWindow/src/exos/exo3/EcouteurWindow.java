package exos.exo3;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

public class EcouteurWindow extends JFrame {

    /// An instance of window that will take the size
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    double screenWidth = screenSize.getWidth();
    double screenHeight = screenSize.getHeight();

    /// We put width and height to int so because of setSize in the constructor
    int width = (int)screenWidth;
    int height = (int) Math.floor(screenHeight);    /// It the same thing as what is before this.
    /// Here, we're going to code windows that will have each one a mouselistener for itself
    public EcouteurWindow() {
        // the title
        this.setTitle("Window 1");
        // the size
        this.setSize(width, height);
        // location
        this.setLocationRelativeTo(null);
        // on close
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // We add the listener
        addMouseListener(new OurMouseListener());
        // visibility
        this.setVisible(true);
    }

    /// The class that will implement the mouseadapter
    public static class OurMouseListener extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {
            System.out.println("Mouse pressed on " + e.getComponent());
        }
    }
}
