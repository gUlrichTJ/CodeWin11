package panels;

import javax.swing.*;

public class Authentification extends JFrame {

   // We create a panel
   JPanel panel = new JPanel();
   // Constructor
   public Authentification() {
      this.setTitle("Authentification");
      this.setSize(500, 500);
      this.setLocationRelativeTo(null);
      this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

      // Visibility of the window
      this.setVisible(true);
   }
}
