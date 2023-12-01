package frames;

import javax.swing.*;

public class MainWindow extends JFrame {

   // Constructor
   public MainWindow() {
      super("Authentification");
      setSize(400, 400);
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      setLocationRelativeTo(null);

      setVisible(true);
   }
}
