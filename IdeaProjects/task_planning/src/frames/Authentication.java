package frames;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Authentication extends JFrame {

   // TODO: We create a Home's object
   Home home;
   JPanel mainPanel = new JPanel();

   // TODO: our global textFiled and passwordField
   JTextField usernameField;
   JPasswordField passwordField;
   // Constructor
   public Authentication() {
      super("Authentication");
      setSize(600, 400);
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      setLocationRelativeTo(null);
      setResizable(false);
      setLayout(new BorderLayout());
      this.home = home;


      // TODO the layout of the panel
      mainPanel.setLayout(new BorderLayout());

      mainPanel.add(lefAuthentication(), BorderLayout.WEST);

      mainPanel.add(login(), BorderLayout.CENTER);

      mainPanel.add(connect(), BorderLayout.SOUTH);

      add(mainPanel, BorderLayout.CENTER);

      setVisible(true);
   }

   /// Method to send the login
   JPanel login() {
      JPanel panel = new JPanel();
      panel.setLayout(new GridLayout(4, 1, 10, 10));
      /// TODO: We did so that the panel has a preferred size
      //panel.setPreferredSize(new Dimension(350, 50));

      /// TODO: the username
      JLabel usernameLabel = new JLabel("Username");
      // We add the labels to the panel
      panel.add(usernameLabel);

      usernameField = new JTextField();

      // We add the textField to the panel
      panel.add(usernameField);

      /// TODO: the password
      JLabel passwordLabel = new JLabel("Password");
      panel.add(passwordLabel);

      passwordField = new JPasswordField();

      panel.add(passwordField);
      return panel;
   }

   JPanel connect() {
      JPanel panel = new JPanel();

      // The button login
      JButton login = new JButton("login".toUpperCase());
      login.setBackground(Color.cyan);
      login.setFont(new Font("Serif", Font.BOLD, 13));

      // The button login
      JButton cancel = new JButton("cancel".toUpperCase());
      cancel.setBackground(Color.red);
      cancel.setFont(new Font("Serif", Font.BOLD, 13));
      cancel.setForeground(Color.WHITE);

      // TODO: Action to the login button
      login.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            if (usernameField.equals("admin") && passwordField.equals("admin123")) {
               Authentication.this.dispose();
               home = new Home();
            }
         }
      });

      // TODO: Action on the cancel button
      cancel.addActionListener(
            e -> Authentication.this.dispose()
      );

      // TODO: We add the login button to the panel
      panel.add(cancel, new FlowLayout(FlowLayout.RIGHT));
      panel.add(login, new FlowLayout(FlowLayout.LEFT));
      return panel;
   }

   // TODO: We'll try to put something at left to see its behaviour
   private JPanel lefAuthentication() {
      JPanel panel = new JPanel();
      panel.setLayout(new BorderLayout());
      panel.setBackground(Color.darkGray);

      panel.setPreferredSize(new Dimension(100, 100));
      return panel;
   }
}
