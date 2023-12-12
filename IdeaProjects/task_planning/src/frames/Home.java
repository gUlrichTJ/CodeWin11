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
      // add(new JLabel("Jesus-Christ is Great").setForeground(Color.);
      setVisible(true);
   }

   // TODO: We create the border layout for the north
   JPanel northHome() {
      JPanel northHome2 = new JPanel(new BorderLayout());

      // We create another panel that will have a flowlayout like
      // default layout
      JPanel northHome3 = new JPanel(new FlowLayout(FlowLayout.RIGHT));

      // We add the labels to the panel
      northHome3.add(new JLabel("Home"));
      northHome3.add(new JLabel("About"));
      northHome3.add(new JLabel("Contact"));
      northHome3.add(new JLabel("About"));
      northHome3.add(new JLabel("About"));

      return northHome2;
   };
}
