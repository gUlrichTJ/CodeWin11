package exercices.exo1;

import javax.swing.*;
import java.awt.event.*;
public class Exo1HearWindow extends JFrame implements MouseListener {

   // Default constructor
   public Exo1HearWindow() {}
   public Exo1HearWindow() {
      super("Exo1HearWindow");
      this.setSize(400, 400);
      this.setLocationRelativeTo(null);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      this.setVisible(true);
   }
}
