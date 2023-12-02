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
      panel.setLayout(new GridLayout(2, 4, 10, 10));
      /// TODO: We did so that the panel has a preferred size
      panel.setPreferredSize(new Dimension(350, 50));

      /// TODO: the username
      JLabel usernameLabel = new JLabel("Username");
      // We add the labels to the panel
      panel.add(usernameLabel);

      JTextField usernameField = new JTextField();

      // We add the textField to the panel
      panel.add(usernameField);

      /// TODO: the password
      JLabel passwordLabel = new JLabel("Password");
      panel.add(passwordLabel);

      JPasswordField passwordField = new JPasswordField();
      panel.add(passwordField);
      return panel;
   }

   JPanel connect() {
      JPanel panel = 
   }
}
