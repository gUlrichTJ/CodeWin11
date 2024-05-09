package exo3;

import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;

public class EcouteurFenetre extends JFrame {
    
    /// An instance of window that will take the size
    int width = Window.WIDTH;
    int height = Window.HEIGHT;
    
    /// Here, we're going to code windosws that will have each one a mouselister for itself
    public EcouteurFenetre() {
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
    public class OurMouseListener extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {
            System.out.println("Mouse pressed on " + e.getComponent());
        }
    }
}
