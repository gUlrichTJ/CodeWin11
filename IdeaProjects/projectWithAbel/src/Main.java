import userInterface.FirstWindow;

import javax.swing.*;

public class Main {

   public static void main(String[] args) {
      SwingUtilities.invokeLater(FirstWindow::new);
   }
}