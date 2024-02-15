package exercices.exo2;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Exo2HearWindow extends JFrame implements MouseListener {

   // Constructor
   public Exo2HearWindow(int numberOfWindows) {
      if (numberOfWindows < 3) {
         System.out.println(new StringBuilder()
               .append("You cannot create less than three windows"));
      } else {
         this.setTitle("Window " + numberOfWindows);
         
      }
   }
   @Override
   public void mouseClicked(MouseEvent e) {

   }

   @Override
   public void mousePressed(MouseEvent e) {

   }

   @Override
   public void mouseReleased(MouseEvent e) {

   }

   @Override
   public void mouseEntered(MouseEvent e) {

   }

   @Override
   public void mouseExited(MouseEvent e) {

   }
}
