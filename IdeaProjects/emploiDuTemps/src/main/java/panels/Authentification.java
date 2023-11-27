package panels;

import javax.swing.*;
import javax.swing.border.LineBorder;
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

      // The color of the great panel
      panel.setBackground(Color.lightGray);

      JPanel panelMail = new JPanel();
      panelMail.setSize(new Dimension(200, 100));
      panelMail.setBorder(new LineBorder(Color.white));
      // We add the text areas
      JTextField mail = new JTextField(20);
      mail.setSize(new Dimension(200, 100));

      panelMail.add(mail);

      // We add the textArea to the panel
      panel.add(panelMail);

      return panel;
   }
}
