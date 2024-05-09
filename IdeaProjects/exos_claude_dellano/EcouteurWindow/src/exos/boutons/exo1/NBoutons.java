package exos.boutons.exo1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class NBoutons {

    /*Écrire	 un	 programme	 qui	 crée	 une	 fenêtre	 (JFrame)	 et	 qui	 y	 affiche	 n	 boutons
    portant	les	étiquettes	BOUTON1,	BOUTON2…	disposés	comme	dans	cet	exemple	:*/
    private final int numberOfButtons;

    /// Constructor
    public NBoutons() {
        numberOfButtons = getNumberOfButtons();

        createTheWindowNTimes();
    }

    /// Receive the number of buttons
    private int getNumberOfButtons() {
        final int numberOfButtons;
        System.out.print("Give the number of buttons that will be displayed : ");
        Scanner sc = new Scanner(System.in);
        numberOfButtons = sc.nextInt();
        return numberOfButtons;
    }

    /// Method that will call the constructor many times
    public void createTheWindowNTimes() {
        SwingUtilities.invokeLater(() -> {
            for (int i = 0; i < numberOfButtons; i++) {
                new Fenetre(i);
            }
        });
    }

    class Fenetre extends JFrame {

        public Fenetre(int index) {
            /// Things for the window
            setTitle("Button" + index);

            /// the size
            setSize(400, 400);

            /// Lecation
            setLocationRelativeTo(null);

            // operation
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            /// The layout
            setLayout(new FlowLayout());

            /// adding the buttons
            for (int i = 0; i < numberOfButtons; i++) {
                JButton button = new JButton("Button" + i);
                int finalI = i;
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        for (int j = -1; j < finalI; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                });
                getContentPane().add(button);
            }

            /// The visibility of the window
            setVisible(true);
        }
    }
}
