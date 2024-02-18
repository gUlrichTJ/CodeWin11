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

      this.add(welcomeCenter(), BorderLayout.CENTER);
      this.add(highPanel(), BorderLayout.NORTH);
      this.setVisible(true);
   }

   // the high panel
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

      JLabel label = new JLabel("Welcome back");
      label.setFont(new Font("Arial", Font.BOLD, 50));
      label.setBackground(Color.black);

      JPanel panel1 = new JPanel();
      panel1.setSize(400, 100);
      panel1.setBorder(new RoundedBorder(50));

      JPanel panel2 = new JPanel();
      panel2.setLayout(new FlowLayout(FlowLayout.CENTER));
      panel2.add(label);

      panel.add(panel1);
      panel.add(panel1);
      panel.add(panel2);

      return panel;
   }

   public JPanel welcomeCenter() {
      JPanel panel = new JPanel();
      panel.setLayout(new BorderLayout());
      panel.add(welcome(), BorderLayout.NORTH);

      return panel;
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
