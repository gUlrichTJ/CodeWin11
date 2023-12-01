package frames;

import javax.swing.*;
import java.awt.*;

public class Authentication extends JFrame {

   JPanel mainPanel = new JPanel();
   // Constructor
   public Authentication() {
      super("Authentication");
      setSize(600, 400);
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      setLocationRelativeTo(null);

      mainPanel.add(login(), BorderLayout.CENTER);

      add(mainPanel);

      setVisible(true);
   }

   /// Method to send the login
   JPanel login() {
      JPanel panel = new JPanel();
      panel.setLayout(new GridLayout(1, 2, 10, 0));

      /// TODO: the username
      JLabel usernameLabel = new JLabel("Username");
      // We add the label username to the panel
      panel.add(usernameLabel);

      JTextField usernameField = new JTextField();

      // We add the textField to the panel
      panel.add(usernameField);
      return panel;
   }
}
