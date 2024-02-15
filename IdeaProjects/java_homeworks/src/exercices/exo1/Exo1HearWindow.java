package exercices.exo1;

import javax.swing.*;
import java.awt.event.*;
public class Exo1HearWindow extends JFrame implements MouseListener {

   public Exo1HearWindow() {
      super("Exo1HearWindow");
      this.setSize(400, 400);
      this.setLocationRelativeTo(null);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // The window will hear
      this.addMouseListener(this);
      this.setVisible(true);
   }

   /**
    * @param e the event to be processed
    */
   @Override
   public void mouseClicked(MouseEvent e) {

   }

   /**
    * @param e the event to be processed
    */
   @Override
   public void mousePressed(MouseEvent e) {

   }

   /**
    * @param e the event to be processed
    */
   @Override
   public void mouseReleased(MouseEvent e) {

   }

   /**
    * @param e the event to be processed
    */
   @Override
   public void mouseEntered(MouseEvent e) {

   }

   /**
    * @param e the event to be processed
    */
   @Override
   public void mouseExited(MouseEvent e) {

   }
}
