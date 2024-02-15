import exercices.exo1.Exo1HearWindow;

import javax.swing.*;

public class Main {
   public static void main(String[] args) {
      System.out.println("Hello world!");
      SwingUtilities.invokeLater(Exo1HearWindow::new);
   }
}