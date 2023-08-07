package ad.univlome.tg.myself;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SplitPane extends JFrame {

    private JSplitPane splitPane;
    // Constructor
    public SplitPane() {
        super("The splitpanes");
        setSize(new Dimension(400, 400));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        //setLayout(new FlowLayout());

        JPanel panel = new JPanel();
        panel.setBackground(new Color(200, 100, 50));

        JPanel panel2 = new JPanel();
        panel2.setBackground(new Color(100, 0, 120));

        splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, panel, panel2);

        JButton button = new JButton("SplitPane");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                new JSplitPane();
            }
        });

        add(splitPane, BorderLayout.CENTER);

        setVisible(true);
    }
    public static void main(String[] args) {
        new SplitPane();
    }
}
