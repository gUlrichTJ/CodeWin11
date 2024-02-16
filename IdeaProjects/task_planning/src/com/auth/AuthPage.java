package com.auth;

import javax.swing.*;
import javax.swing.border.LineBorder;
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

      this.add(welcomeCenter(), BorderLayout.CENTER);
      this.add(highPanel(), BorderLayout.NORTH);
      this.setVisible(true);
   }

   // the high panel
   public JButton highPanel() {
      JButton button = new JButton();
      button.setLayout(new FlowLayout(FlowLayout.RIGHT));
      button.setSize(1, 1);
      button.setBackground(Color.white);

      JLabel label = new JLabel("?");
      label.setFont(new Font("Arial", Font.BOLD, 30));

      button.add(label, new FlowLayout(FlowLayout.RIGHT));

      return button;
   }

   // The label to welcome
   public JPanel welcome() {
      JPanel panel = new JPanel();
      panel.setLayout(new GridLayout(3, 1));

      JLabel label = new JLabel("Welcome back");
      label.setFont(new Font("Arial", Font.BOLD, 50));
      label.setBackground(Color.black);

      JPanel panel1 = new JPanel();
      panel1.setSize(400, 100);

      JPanel panel2 = new JPanel();
      panel2.setLayout(new FlowLayout(FlowLayout.CENTER));
      panel2.add(label);

      panel.add(panel1);
      panel.add(panel2);
      panel.add(panel1);

      return panel;
   }

   public JPanel welcomeCenter() {
      JPanel panel = new JPanel();
      panel.setLayout(new BorderLayout());
      panel.add(welcome(), BorderLayout.NORTH);

      return panel;
   }
}


