package windows.home;

import javax.swing.*;
import java.awt.*;

public class Home extends JFrame {

    private String nameSchool = "ADETIKOPE";

    public String getNameSchool() {
        return nameSchool;
    }

    public void setNameSchool(String nameSchool) {
        this.nameSchool = nameSchool;
    }

    Dimension real = Toolkit.getDefaultToolkit().getScreenSize();

    double width = real.getWidth();
    double height = real.getHeight();

    // Constructor
    public Home() {
        // The title
        setTitle("Bulletins");

        /// The location
        setSize((int) Math.floor(width), (int) Math.floor(height));

        // The location
        setLocationRelativeTo(null);

        /// Default close operation
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        add(flowlayoutHigh(), BorderLayout.NORTH);
        // Visibility
        setVisible(true);
    }

    /// Method for the height
    JPanel ministere() {

        JPanel panel = new JPanel();

        panel.setLayout(new FlowLayout(FlowLayout.LEFT));

        JLabel text =  new JLabel("""
            <html>\
                <div style='font-weight:bold;font-family:"Comic Sans MS";'>\
                    MINISTERE DES ENSEIGNEMENTS <br />
                    PRIMAIRE, SECONDAIRE ET DE LA <br />
                    FORMATION PROFESSIONNELLE <br /> <br />
                    <span style='text-align:center;'>&emsp;&emsp;DRE/MARITIME</span> <br /> <br />
                    INSPECTION DE L'ENSEIGNEMENT <br />
                    SECONDAIRE GENERAL - TSEVIE
                </div>\
            </html>""");

        panel.add(text, FlowLayout.LEFT);

        return panel;
    }

    /// Method for the height
    JPanel lyceee() {   ///

        JPanel panel = new JPanel();

        panel.setLayout(new FlowLayout(FlowLayout.LEFT));

        String texteString =
                String.format("<html>   " +
                                 " <div style='font-weight:bold;font-family:\"Comic Sans MS\";'>  " +
                                           "      LYCEE %s <br /> <br />\n" +
                                           "        Devise: Discipline-Travail-Succès <br />\n" +
                                           "        Adétikopé, Agouté Tel: - Cel: 90 89 52 98 <br /> <br />\n" +
                                           "        <span style='text-align:center;'>&emsp;&emsp;BULLETIN DU 1ER SEMESTRE" +
                                           "       </span> <br /> <br />\n" +
                                           "    </div>" +
                              "</html>", this.getNameSchool());

        JLabel text = new JLabel(texteString);

        panel.add(text, FlowLayout.LEFT);

        return panel;
    }

    // Le logo, après, nous allons mettre l'image du logo ici
    JPanel logo() {
        JPanel panel = new JPanel();

        JLabel label = new JLabel(
                "<html>" +
                    "<div style='font-family:\"Comic Sans MS\";'>" +
                        "LOGO LYCEE "+ nameSchool +
                    "</div>" +
                "</html>"
        );

        panel.add(label);

        return panel;
    }

    /// Nous mettons la dernière pqrtie et le tableau
    JPanel deviseTableau() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 1));

        // Le label qui va contenir le texte
        JLabel label = new JLabel(
            "<html>" +
                "<div style='font-family:\"Comic Sans MS\";'>" +
                    "REPUBLIQUE TOGOLAISE <br />" +
                    "&emsp;Travail-Liberté-Patrie <br /> <br />" +
                "</div>" +
            "</html>"
        );

        JPanel panelTableau = new JPanel();
        panelTableau.setLayout(new BorderLayout());

        JLabel labelTableau = new JLabel(
                "<html>" +
                    "<div style='font-family:\"Comic Sans MS\";'>" +
                        "<div>" +
                            "<table style='border-width:1px;border-collapse:collapse;'>" +
                                "<tr>" +
                                    "<td style='border-width:1px;border-collapse:collapse;border-color:red;'>M</td>" +
                                    "<td style='border-width:1px;border-collapse:collapse;'>F</td>" +
                                    "<td style='border-width:1px;border-collapse:collapse;'>N</td>" +
                                    "<td style='border-width:1px;border-collapse:collapse;'>R</td>" +
                                "</tr>" +
                                "<tr style='border-width:1px;border-collapse:collapse;'>" +
                                    "<td style='border-width:1px;border-collapse:collapse;'>.</td>" +
                                    "<td style='border-width:1px;border-collapse:collapse;'>.</td>" +
                                    "<td style='border-width:1px;border-collapse:collapse;'>.</td>" +
                                    "<td style='border-width:1px;border-collapse:collapse;'>.</td>" +
                                "</tr>" +
                            "</table>" +
                        "</div>" +
                    "</div>" +
                "</html>"
        );

        labelTableau.setLayout(new BorderLayout());

        /// Nous mettons le labelTableau dans le panelTableau
        panelTableau.add(labelTableau);

        panel.add(label);

        panel.add(panelTableau);

        return panel;
    }

    /// Nous allons créer un Jpanel où nous allons mettre les quatre paneaux. Ce JPanel va être un
    // Flowlayout et nous allons l'ajouter au borderlayout en haut de la fenêtre principale.
    JPanel flowlayoutHigh() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 4));

        /// Nous ajoutons le ministère
        panel.add(ministere(), FlowLayout.LEFT);

        // Nous ajoutons le lycée
        panel.add(lyceee());

        // Nous ajoutons le logo
        panel.add(logo());

        // ajout du dernier element
        panel.add(deviseTableau());

        return panel;
    }

}
