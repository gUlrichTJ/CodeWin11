import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    static class Window extends JFrame implements WindowStateListener, WindowListener {

        JTextField areaTyping;
        public Window() {
            this.setTitle("First window on linux deb11");
            this.setSize(400, 300);
            this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            this.setLocationRelativeTo(null);

            this.add(panelOfTextField(), BorderLayout.NORTH);

            this.add(validateButton(), BorderLayout.SOUTH);

            this.setVisible(true);
        }

        // The method that will return the textField
        public JPanel panelOfTextField() {
            JPanel panel = new JPanel();
            panel.setBorder(new LineBorder(new Color(20, 20, 20)));
            panel.setLayout(new BorderLayout());

            areaTyping = new JTextField();
            areaTyping.setBackground(Color.lightGray);
            areaTyping.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
            areaTyping.setForeground(new Color(23, 100, 89));
            areaTyping.setSize(new Dimension(30, 30));

            panel.add(areaTyping);

            return panel;
        }

        public JPanel validateButton() {
            JPanel panel = new JPanel();
            panel.setLayout(new FlowLayout());

            JButton button = jButton("Apply", "Verdana", 15, 250, 121, 50);

            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    String typedText = areaTyping.getText();
                    System.out.println(typedText);
                    JOptionPane.showMessageDialog(panel, "You've clicked the button apply");
                }
            });

            panel.add(button);

            return panel;
        }

        public JButton jButton(String nameButton, String fontFamily, int textSize, int r, int g, int b) {
            JButton button = new JButton();

            JLabel label = new JLabel(nameButton);
            label.setFont(new Font(fontFamily, Font.BOLD, textSize));

            button.add(label);
            // button.setFont(new Font(fontFamily, Font.BOLD, textSize));
            button.setBackground(new Color(r, g, b));

            return button;
        }

        /**
         * @param windowEvent
         */
        @Override
        public void windowStateChanged(WindowEvent windowEvent) {

        }

        @Override
        public void windowOpened(WindowEvent windowEvent) {
            JOptionPane.showInputDialog("Window opened");
            JOptionPane.showMessageDialog(this, "Window opened");
        }

        @Override
        public void windowClosing(WindowEvent windowEvent) {

        }

        @Override
        public void windowClosed(WindowEvent windowEvent) {

        }

        @Override
        public void windowIconified(WindowEvent windowEvent) {

        }

        @Override
        public void windowDeiconified(WindowEvent windowEvent) {

        }

        @Override
        public void windowActivated(WindowEvent windowEvent) {

        }

        @Override
        public void windowDeactivated(WindowEvent windowEvent) {

        }
    }

    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        Window window = new Window();

        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                System.out.printf("%7d", i * j);
            }
            System.out.println();
        }
    }
}