package exercices.exo2;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Exo2HearWindow extends JFrame implements MouseListener {

   public int numberOfWindows = 0;
   // Constructor
   public Exo2HearWindow(int numberOfWindows) {
      if (numberOfWindows < 3) {
         System.out.println(new StringBuilder()
               .append("You cannot create less than three windows"));
      } else {
            this.setTitle("Window " + numberOfWindows);
            this.setSize(400, 300);
            this.setLocationRelativeTo(null);
            this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            this.setVisible(true);
         }
      this.numberOfWindows = numberOfWindows;
   }

   public Exo2HearWindow() {

   }

   @Override
   public void mouseClicked(MouseEvent e) {
      System.out.println(new StringBuilder()
            .append("Window ").append(numberOfWindows).append(" clicked ").append(getX()).append(" and ").append(getY()));
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
