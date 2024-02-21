package userInterface;

import javax.swing.*;

public class FirstWindow extends JFrame {

   /** Constructor */
   public FirstWindow() {
      /**Le titre de la fenêtre*/
      this.setTitle("Fenetre de Abel");
      /**La taille de la fenêtre*/
      this.setSize(400, 500);
      this.setLocationRelativeTo(null);
      /**Faire en sorte que le programme s'arrêtre lorsqu'on clique le bouton fermer.*/
      this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

      /**Les gestionnaires de placement.*/
      /**Les gestionnaires de placement les plus utilisés */
      /**Flowlayout, le Borderlayout et le Gridlayout.*/
      /**le Boxlayout, le Gridbadlayout...*/

      this.setVisible(true);
   }
}
