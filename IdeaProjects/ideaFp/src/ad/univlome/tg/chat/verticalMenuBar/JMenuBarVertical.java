package ad.univlome.tg.chat.verticalMenuBar;

import javax.swing.*;
import java.awt.*;

public class JMenuBarVertical extends JFrame {

    // Constructor
    public JMenuBarVertical() {
        super("Title");
        setSize(new Dimension(400, 400));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // We add the jtoolbar
        JToolBar verticalToolBar = new JToolBar(JToolBar.VERTICAL);

        VerticalLabel2 verticalLabel2 = new VerticalLabel2("Android Studio");

        verticalToolBar.add(verticalLabel2);

        // We create a jpanel to who we add the toolbar
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel.add(verticalToolBar);

        add(panel, BorderLayout.WEST);

        setVisible(true);
    }

    // Main method
    public static void main(String[] args) {
        JMenuBarVertical jMenuBarVertical = new JMenuBarVertical();
    }
}
