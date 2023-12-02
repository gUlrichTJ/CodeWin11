package frames;

import javax.swing.*;
import java.awt.*;

public class Home extends JFrame {

   // We take the size of the screen
   Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

   // TODO: Constructor
   public Home() {
      super("Task planning");

      // TODO: We take the height and the width of the screen
      int screenHeight = (int) screenSize.getHeight();
      int screenWidth = (int) screenSize.getWidth();

      setSize(screenWidth, screenHeight);

      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      setLocationRelativeTo(null);

      setVisible(true);
   }
}
