package panels;

import javax.swing.*;

public class Authentification extends JFrame {

   // We create a panel
   JPanel panel = new JPanel();
   // Constructor
   public Authentification() {
      super("Authentification");
      this.setSize(700, 500);
      this.setLocationRelativeTo(null);
      this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      this.setResizable(false);

      // Visibility of the window
      this.setVisible(true);
   }
}
