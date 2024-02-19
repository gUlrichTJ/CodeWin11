package com.auth;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class AuthPage extends JFrame {

   // Constructor
   public AuthPage() {
      super("Pretty window");
      this.setSize(600, 800);
      this.setLocationRelativeTo(null);
      this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      this.setBackground(Color.white);
      this.setLayout(new BorderLayout());

      this.add(welcomeUsernamePassword(), BorderLayout.CENTER);
      this.add(highPanel(), BorderLayout.NORTH);
      //this.add(usernamePassword(), BorderLayout.SOUTH);
      this.setVisible(true);
   }

   // the high panel
   // God has always protected us.
   // Really.
   public JPanel highPanel() {
      JPanel panel = new JPanel();
      panel.setLayout(new FlowLayout(FlowLayout.RIGHT));

      JButton button = new JButton();
      button.setLayout(new FlowLayout(FlowLayout.RIGHT));
      button.setSize(1, 1);
      button.setBackground(Color.white);

      JLabel label = new JLabel("?");
      label.setFont(new Font("Arial", Font.BOLD, 30));

      button.add(label, new FlowLayout(FlowLayout.RIGHT));

      panel.add(button);

      return panel;
   }

   // The label to welcome
   public JPanel welcome() {
      // God knows us all
      JPanel panel = new JPanel();
      panel.setLayout(new GridLayout(3, 1));
      panel.setBorder(new RoundedBorder(50));

      JLabel label = new JLabel(
            "<html>" +
               "<u style=color:'rgb(0,0,139);'>Welcome back</u>" +
            "</html>"
      );
      label.setFont(new Font("Arial", Font.BOLD, 50));
      label.setBackground(Color.black);

      JPanel panel1 = new JPanel();
      panel1.setSize(400, 100);
      panel1.setBorder(new RoundedBorder(50));

      JPanel panel2 = new JPanel();
      panel2.setLayout(new FlowLayout(FlowLayout.CENTER));
      panel2.add(label);

      // panel.add(panel1); \
      // panel.add(panel1);
      panel.add(panel2);

      return panel;
   }

   public JPanel welcomeCenter() {
      JPanel panel = new JPanel();
      panel.setLayout(new BorderLayout());
      panel.add(welcome(), BorderLayout.NORTH);

      return panel;
   }

   // the method for the username and the password
   public JPanel usernamePassword() {
      JPanel greatPanel = new JPanel();
      greatPanel.setLayout(new BorderLayout());

      JPanel panel = new JPanel();
      // We set the layout of the panel of both password and username
      panel.setLayout(new GridLayout(2, 1, 5, 8));

      // Géovanie phys
      // The username
      JTextField usernameField = new JTextField();
      usernameField.setFont(new Font("Roboto", Font.BOLD, 30));
      // The panel of the username
      JPanel panelUsername = new JPanel();
      panelUsername.add(usernameField);

      JPasswordField passwordField = new JPasswordField();
      passwordField.setFont(new Font("Roboto", Font.PLAIN, 30));
      // The panel of the password
      JPanel panelPassword = new JPanel();
      panelPassword.add(passwordField);

      // We add the password and the username to the final panel
      panel.add(usernameField);
      panel.add(passwordField);

      greatPanel.add(panel, BorderLayout.CENTER);
      return panel;
   }

   // panel for forgot password and login

   public JPanel forgotPassoword() {
      JPanel forgotPassword = new JPanel();
      forgotPassword.setLayout(new FlowLayout(FlowLayout.LEFT));

      JLabel label = new JLabel(
            "<html>" +
                     "<u style='font-style:italic;'>" +
                        "Forgot password?" +
                     "</u>" +
                  "</html>");
      label.setFont(new Font("Arial", Font.PLAIN, 30));
      forgotPassword.add(label);
      return forgotPassword;
   }

   // The panel for login
   public JPanel login() {
      JPanel panel = new JPanel();
      panel.setBackground(new Color(7, 99, 230, 93));
      // panel.setBorder(new RoundedBorder(40));
      panel.setLayout(new BorderLayout());

      JLabel label = new JLabel("" +
            "<html>" +
               "<span style='color:white; text-align:center; font-size:4em;'>Log in</span>" +
            "</html>"
      );

      label.setLayout(new BorderLayout());

      // The login button
      JButton loginButton = new JButton();
      loginButton.setBackground(new Color(0, 0, 119));
      loginButton.setLayout(new FlowLayout(FlowLayout.CENTER));
      loginButton.add(label);

      panel.add(loginButton, BorderLayout.CENTER);

      return panel;
   }

   // Panel of the usernamepassword and welcome
   public JPanel welcomeUsernamePassword() {
      JPanel panelwup = new JPanel();
      panelwup.setLayout(new GridLayout(4, 1, 30, 50));
      panelwup.setBorder(new RoundedBorder(40));

      panelwup.add(welcomeCenter());
      panelwup.add(usernamePassword());
      panelwup.add(forgotPassoword());
      panelwup.add(login());
      return panelwup;
   }
}

class RoundedBorder implements Border {

   private final int radius;

   RoundedBorder(int radius) {
      this.radius = radius;
   }
   @Override
   public Insets getBorderInsets(Component c) {
      return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);
   }

   @Override
   public boolean isBorderOpaque() {
      return true;
   }

   @Override
   public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
      g.drawRoundRect(x,y,width-1,height-1,radius,radius);
   }
}
