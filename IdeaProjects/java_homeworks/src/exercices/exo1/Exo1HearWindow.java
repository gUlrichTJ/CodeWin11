package exercices.exo1;

import javax.swing.*;
import java.awt.event.*;
import java.text.MessageFormat;

public class Exo1HearWindow extends JFrame implements MouseListener {

   public Exo1HearWindow() {
      super("Exo1HearWindow");
      this.setSize(400, 400);
      this.setLocationRelativeTo(null);
      this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

      // The window will hear
      this.addMouseListener(this);
      this.setVisible(true);
   }

   /**
    * @param e the event to be processed
    */
   @Override
   public void mouseClicked(MouseEvent e) {
      System.out.println(new StringBuilder()
            .append("You clicked ").append(e.getX()).append(" and ").append(e.getY()));
   }

   /**
    * @param e the event to be processed
    */
   @Override
   public void mousePressed(MouseEvent e) {
      System.out.println(MessageFormat.format("You pressed in {0} and {1}", e.getX(), e.getY()));
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
