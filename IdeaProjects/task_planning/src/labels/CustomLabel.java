package labels;

import javax.swing.*;
import java.awt.*;

public class CustomLabel extends JLabel {
   JLabel label = new JLabel();

   // Default constructor
   // public CustomLabel() {}

   // Custom constructor
   public CustomLabel() {
      super();
      label.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
   }

   public static void setLabel(JLabel label, String text, int labelSize) {
      label.setFont(new Font("Comic Sans MS", Font.BOLD, labelSize));
   }
}
