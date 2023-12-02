package frames;

import javax.swing.*;
import java.awt.*;

public class Home extends JFrame {

   // We take the size of the screen
   Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

   // TODO: Constructor
   public Home() {
      super("Task planning");
      setSize(Window.WIDTH, Window.HEIGHT);
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      setLocationRelativeTo(null);

      setVisible(true);
   }
}
