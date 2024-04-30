import frames.Authentication;

import javax.swing.*;

public class Main {
   public static void main(String[] args) {
      System.out.println("Hello world!");
      /// We run the main file
      SwingUtilities.invokeLater(Authentication::new);
   }
}