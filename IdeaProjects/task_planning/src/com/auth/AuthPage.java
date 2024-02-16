package com.auth;

import javax.swing.*;
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
   public JLabel welcome() {
      JLabel label = new JLabel("Welcome back");
      label.setFont(new Font("Arial", Font.BOLD, 50));
      label.setBackground(Color.black);

      return label;
   }
}


