package code.taptouchclone;

import code.taptouchclone.windows.MainWindow;
import javax.swing.SwingUtilities;

/**
 *
 * @author Jakarta-EE
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        SwingUtilities.invokeLater(MainWindow::new);
    }
}
