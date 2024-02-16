package com.auth;

import javax.swing.*;
import java.awt.*;

public class AuthPage extends JFrame {

   HighPanel panel = new HighPanel();
   // Constructor
   public AuthPage() {
      super("Pretty window");
      this.setSize(600, 400);
      this.setLocationRelativeTo(null);
      this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

      this.add(panel, BorderLayout.NORTH);
      this.setVisible(true);
   }
}

class HighPanel extends JPanel {
   public HighPanel() {
      JLabel label = new JLabel("?");
      JPanel panel = new JPanel();
      panel.setLayout(new FlowLayout(FlowLayout.RIGHT));
      panel.add(label);
   }
}
