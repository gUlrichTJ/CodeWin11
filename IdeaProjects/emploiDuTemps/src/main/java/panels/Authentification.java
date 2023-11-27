package panels;

import javax.swing.*;
import java.awt.*;

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

      // The color of the frame

      this.setBackground(Color.BLACK);
      this.add(panelAuth());
      // Visibility of the window
      this.setVisible(true);
   }

   // We create a panel for the authentification
   JPanel panelAuth() {
      JPanel panel = new JPanel();

      // The color of the panel
      panel.setBackground(Color.BLACK);

      // We add the text areas
      JTextArea mail = new JTextArea();

      // We add the textArea to the panel
      panel.add(mail);

      return panel;
   }
}
