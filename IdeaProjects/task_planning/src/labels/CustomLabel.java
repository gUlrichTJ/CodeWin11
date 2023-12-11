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

   public static void setLabel(JLabel label, String text, String fontFamily, int labelSize) {
      label.setText(text);
      label.setFont(new Font(fontFamily, Font.BOLD, labelSize));
   }
}
