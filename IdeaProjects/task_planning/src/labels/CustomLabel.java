package labels;

import javax.swing.*;
import java.awt.*;

public class CustomLabel extends JLabel {
   JLabel label = new JLabel();

   // Default constructor
   // public CustomLabel() {}

   // Custom constructor
   public CustomLabel() {
      label.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
   }
}
