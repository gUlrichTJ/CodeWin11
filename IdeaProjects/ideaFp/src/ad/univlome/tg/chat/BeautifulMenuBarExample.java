package ad.univlome.tg.chat;


import javax.swing.*;
        import java.awt.*;

public class BeautifulMenuBarExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Beautiful Menu Bar Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 200);

            JMenuBar menuBar = new JMenuBar() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);

                    Graphics2D g2d = (Graphics2D) g.create();

                    // Draw custom background gradient
                    GradientPaint gradient = new GradientPaint(0, 0, new Color(100, 149, 237),
                            getWidth(), getHeight(), new Color(30, 144, 255));
                    g2d.setPaint(gradient);
                    g2d.fillRect(0, 0, getWidth(), getHeight());

                    // Draw custom text for JMenuItems
                    g2d.setFont(new Font("Arial", Font.BOLD, 14));
                    g2d.setColor(Color.WHITE);

                    for (Component comp : getComponents()) {
                        if (comp instanceof JMenu) {
                            JMenu menu = (JMenu) comp;
                            g2d.drawString(menu.getText(), menu.getX() + 10, menu.getY() + menu.getHeight() - 10);

                            for (MenuElement item : menu.getSubElements()) {
                                if (item instanceof JMenuItem) {
                                    JMenuItem menuItem = (JMenuItem) item.getComponent();
                                    g2d.drawString(menuItem.getText(), menuItem.getX() + 10, menuItem.getY() + menuItem.getHeight() - 10);
                                }
                            }
                        }
                    }

                    g2d.dispose();
                }
            };

            // Create menus and menu items (same as before)
            // ...
            // Create menus
            JMenu extractIntroduce = new JMenu("Extract/Introduce");
            JMenu migratePackages = new JMenu("Migrate Packages and Classes");
            JMenu flutterBuild = new JMenu("Flutter");

            // Create menu items for Extract/Introduce
            JMenuItem variableRefactor = new JMenuItem("Variable...             Ctrl+Alt+V");
            JMenuItem methodRefactor = new JMenuItem("Method...             Ctrl+Alt+M");
            JMenuItem extractFlutterWidget = new JMenuItem("Extract Flutter Widget...       Ctrl+Alt+W");

            // Create menu items for Migrate Packages and Classes
            JMenuItem jUnit4 = new JMenuItem("JUnit(4.x -> 5.0)");
            JMenuItem createNewMigration = new JMenuItem("Create New Migration...");

            // Create menu items for Flutter
            JMenuItem buildAAR = new JMenuItem("Build AAR");
            JMenuItem buildAPK = new JMenuItem("Build APK");
            JMenuItem buildAppBundle = new JMenuItem("Build App Bundle");
            JMenuItem buildIOS = new JMenuItem("Build iOS");
            JMenuItem buildWeb = new JMenuItem("Build Web");

            // Add menu items to menus
            extractIntroduce.add(variableRefactor);
            extractIntroduce.add(methodRefactor);
            extractIntroduce.add(extractFlutterWidget);

            migratePackages.add(jUnit4);
            migratePackages.add(createNewMigration);

            flutterBuild.add(buildAAR);
            flutterBuild.add(buildAPK);
            flutterBuild.add(buildAppBundle);
            flutterBuild.add(buildIOS);
            flutterBuild.add(buildWeb);

            // Add menus to menu bar
            menuBar.add(extractIntroduce);
            menuBar.add(migratePackages);
            menuBar.add(flutterBuild);

            // Set the menu bar to the frame
            frame.setJMenuBar(menuBar);

            frame.setVisible(true);
        });
    }
}
