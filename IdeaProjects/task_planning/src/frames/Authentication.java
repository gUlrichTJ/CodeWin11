package frames;

import interfaces.JTotal;
import labels.CustomLabel;

import javax.swing.*;
import java.awt.*;

public class Authentication extends JFrame implements JTotal {

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


      // TODO the layout of the panel
      mainPanel.setLayout(new BorderLayout());

      mainPanel.setBackground(new Color(163, 159, 159));

      /// We add the panel of the north (borderLayout)
      mainPanel.add(highAuthentication(), BorderLayout.NORTH);

      mainPanel.add(lefAuthentication(), BorderLayout.WEST);

      mainPanel.add(login(), BorderLayout.CENTER);

      mainPanel.add(connect(), BorderLayout.SOUTH);

      add(mainPanel, BorderLayout.CENTER);

      setVisible(true);
   }

   /// Method to send the login
   JPanel login() {
      JPanel panel = new JPanel();
      panel.setLayout(new FlowLayout(FlowLayout.CENTER));
      ////////////////////////////////////////////////////
      panel.setBackground(new Color(163, 159, 159));

      // TODO : The panel of the username and it's textfield
      JPanel usernameAndField = new JPanel(
            new GridLayout(1, 2, totalSize / 2, totalSize / 2)
      );
      usernameAndField.setBackground(new Color(163, 159, 159));

      /// TODO: ********* THE USERNAME *********
      // TODO: The label of the username
      JLabel usernameLabel = new JLabel();
      CustomLabel.setLabel(
            usernameLabel,
            "Username",
            "Comic Sans MS",
            totalSize + 5,
            Color.black
      );

      // We add the label of the username to their panel
      // TODO : After, we will set it to left or right
      usernameAndField.add(usernameLabel);

      usernameField = new JTextField();

      // TODO : The size of the text in the textfield
      usernameField.setFont(new Font("Arial", Font.PLAIN, totalSize));

      // We add the textField to the panel
      usernameAndField.add(usernameField);

      // TODO : The panel of the username and it's textfield
      JPanel passwordAndField = new JPanel(
            new GridLayout(1, 2, totalSize / 2, totalSize / 2)
      );
      passwordAndField.setBackground(new Color(163, 159, 159));

      /// TODO: the password
      JLabel passwordLabel = new JLabel();
      CustomLabel.setLabel(
            passwordLabel,
            "Password",
            "Comic Sans MS",
            totalSize + 5,
            Color.black
            );
      passwordAndField.add(passwordLabel);

      passwordField = new JPasswordField();
      // TODO : Size of the password field
      passwordField.setFont(new Font("Arial", Font.PLAIN, totalSize));

      passwordField.setBorder(BorderFactory.createLineBorder(Color.blue));
      passwordAndField.setPreferredSize(new Dimension((int) (getWidth() * 0.7), 30));

      passwordAndField.add(passwordField);

      // TODO: The panel for the username and the password
      JPanel usernameAndPassword = new JPanel(
            new GridLayout(2, 1, totalSize * 2, totalSize * 2)
      );
      usernameAndPassword.setBackground(new Color(163, 159, 159));

      usernameAndPassword.add(usernameAndField);
      usernameAndPassword.add(passwordAndField);

      // TODO: We add the username and password to the principal panel
      panel.add(usernameAndPassword);
      return panel;
   }

   JPanel connect() {
      JPanel panel = new JPanel();
      panel.setBackground(new Color(163, 159, 159));

      // The button login
      JButton login = new JButton("login".toUpperCase());
      login.setBackground(new Color(40, 170, 220));
      login.setFont(new Font("Comic Sans MS", Font.BOLD, totalSize + 3));
      login.setForeground(Color.WHITE);

      // The button login
      JButton cancel = new JButton("cancel".toUpperCase());
      cancel.setBackground(new Color(201, 14, 14, 253));
      cancel.setFont(new Font("Comic Sans MS", Font.BOLD, totalSize + 3));
      cancel.setForeground(Color.WHITE);

      // TODO: Action to the login button
      login.addActionListener(e -> {
         if (usernameField.getText().equals("admin")
               &&
               passwordField.getText().equals("admin123")) {
            Authentication.this.dispose();
            home = new Home();
            System.out.println("lol");
         } else {
            JOptionPane.showMessageDialog(this,"Oh, Please, something is wrong.");
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
      System.out.println();

      panel.setPreferredSize(new Dimension(100, 100));
      return panel;
   }
   /// TODO: Le border layout de haut
   JPanel highAuthentication() {
      JPanel panel = new JPanel();
      /// Characteristics of the panel of North
      panel.setLayout(new BorderLayout());
      panel.setPreferredSize(new Dimension(100, 40));
      panel.setBackground(new Color(30, 100, 200));

      /// The label of the auth
      JLabel labelAuthentication = new JLabel("Authentication".toUpperCase());
      labelAuthentication.setFont(new Font("Arial", Font.BOLD, totalSize + 6));
      labelAuthentication.setForeground(Color.white);

      /// We add the label to the panel
      panel.add(labelAuthentication, BorderLayout.WEST);
      return panel;
   }
}
