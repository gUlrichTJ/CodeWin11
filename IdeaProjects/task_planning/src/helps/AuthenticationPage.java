package helps;

import javax.swing.*;
import java.awt.*;

public class AuthenticationPage extends JFrame {

   private final JTextField usernameField;
   private final JPasswordField passwordField;

   public AuthenticationPage() {
      setTitle("Login Page");
      setSize(300, 200);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      JPanel panel = new JPanel();
      panel.setLayout(new GridLayout(3, 2));

      JLabel usernameLabel = new JLabel("Username:");
      JLabel passwordLabel = new JLabel("Password:");

      usernameField = new JTextField();
      passwordField = new JPasswordField();

      JButton loginButton = getLoginButton();

      panel.add(usernameLabel);
      panel.add(usernameField);
      panel.add(passwordLabel);
      panel.add(passwordField);
      panel.add(new JLabel()); // Empty label for spacing
      panel.add(loginButton);

      add(panel);
      setVisible(true);    /// Let's set the panel visible
   }

   private JButton getLoginButton() {
      JButton loginButton = new JButton("Login");
      loginButton.addActionListener(e -> {
         String username = usernameField.getText();
         char[] password = passwordField.getPassword();

         // Perform authentication logic here
         if (authenticate(username, password)) {
            JOptionPane.showMessageDialog(AuthenticationPage.this, "Authentication successful!");
         } else {
            JOptionPane.showMessageDialog(AuthenticationPage.this, "Authentication failed. Try again.");
         }

         // Clear the password field for security
         passwordField.setText("");
      });
      return loginButton;
   }

   private boolean authenticate(String username, char[] password) {
      // Replace this with your actual authentication logic
      String validUsername = "admin";
      String validPassword = "admin123";

      return username.equals(validUsername) && new String(password).equals(validPassword);
   }

   public static void main(String[] args) {
      SwingUtilities.invokeLater(AuthenticationPage::new);
   }
}
