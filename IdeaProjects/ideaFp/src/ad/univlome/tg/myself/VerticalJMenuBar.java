package ad.univlome.tg.myself;

import javax.swing.*;
import java.awt.*;

public class VerticalJMenuBar extends JFrame {

    JMenuBar menuBar = new JMenuBar();

    JMenu file = new JMenu("File");
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem openItem = new JMenuItem("Open        Ctrl+O");

    JMenu edit = new JMenu("Edit");
        JMenuItem closeItem = new JMenuItem("Close Item");
        JMenuItem itemOpen = new JMenuItem("OpenItem        Ctrl+O");

    JMenu run = new JMenu("Run");
        JMenuItem item2 = new JMenuItem("New");
        JMenuItem item3 = new JMenuItem("Open        Ctrl+O");

    // Constructor
    public VerticalJMenuBar() {
        setTitle("The vertical JMenuBar");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        menuBar.setLayout(new BoxLayout(menuBar, BoxLayout.Y_AXIS));

            file.add(newItem);
            file.add(openItem);

        menuBar.add(file);

            edit.add(closeItem);
            edit.add(itemOpen);

        menuBar.add(edit);

            run.add(item2);
            run.add(item3);

        menuBar.add(run);

        // We add space under the bolayout
//        menuBar.add(Box.createVerticalStrut(20));
        menuBar.add(Box.createVerticalGlue());

        add(menuBar, BorderLayout.WEST);

        setVisible(true);
    }

    // Main method
    public static void main(String[] args) {
        new VerticalJMenuBar();
    }
}
