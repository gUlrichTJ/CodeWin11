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

      // We create the panel for the message of mail
      JPanel enterMail = new JPanel();
      JLabel enterMail2 = new JLabel("Enter your mail");

      // We add the label to the panel
      enterMail.add(enterMail2);

      JPanel panelMail = new JPanel();
      panelMail.setSize(new Dimension(200, 100));
      panelMail.setBorder(new LineBorder(Color.white));
      // We add the text areas
      JTextField mail = new JTextField(20);
      mail.setSize(new Dimension(200, 100));

      panelMail.add(mail);

      // We add the label of mail to the panel here
      panel.add(enterMail);
      // We add the textArea to the panel here
      panel.add(panelMail);

      return panel;
   }
}
