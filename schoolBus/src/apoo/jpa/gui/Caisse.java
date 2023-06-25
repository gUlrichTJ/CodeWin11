
package apoo.jpa.gui;

/**
 *
 * @author Time Store
*/

import java.awt.BorderLayout;
import java.awt.Color;
import java.time.LocalDate;
import java.util.Objects;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;

public class Caisse extends JPanel {
    
    private Integer id;
    private String numeroDeCarte;
    private LocalDate dateDAchat;
    private Integer nombre;
    private Long montant;
    private String caissier;
           
    AddUpdateDelete addUpdateDelete = new AddUpdateDelete(0, 1);
    
    // Constructor
    public Caisse() {
        
        setLayout(new BorderLayout());
        // Nous définissons l'entete
        String[] enteteDuTableau = {"ID", "Numéro de carte", "Date d'achat", "Nombre",
            "Montant", "Caissier"};
        // Nous définissons les données du tableau
        Object[][] donnees = {
            {"1", "551079", "22/01/23", "10", "1500", "Eric"},
            {"2", "541096", "22/01/23", "2", "300", "Emrich"},
            {"3", "502366", "22/01/23", "5", "750", "Ella"},
            {"4", "102289", "22/01/23", "8", "1200", "Emefa"},
            {"5", "458796", "22/01/23", "20", "3000", "Enrica"},
            {"6", "785412", "22/01/23", "6", "900", "Eriéta"},
            {"7", "632541", "22/01/23", "4", "600", "Etiène"},
            {"8", "258963", "22/01/23", "12", "1800", "Enselme"},
            {"9", "995522", "22/01/23", "7", "1050", "Etonam"},
            {"10", "551070", "22/01/23", "10", "1500", "Enkou"},
            {"11", "451245", "22/01/23", "10", "1500", "Elodie"},
            {"12", "654123", "22/01/23", "20", "3000", "Epiphane"},
            {"13", "489870", "22/01/23", "6", "900", "Emérantiène"},
            {"14", "475590", "22/01/23", "7", "1050", "Epiphanie"},
            {"15", "316179", "22/01/23", "3", "450", "Eklou"},
        };
        
        // Nous créons un JTable dans lequel nous mettons les données
        JTable tabUtilisateurs = new JTable(donnees, enteteDuTableau);
        
        // Nous mettons le tableau dans un JScrollPane
        JScrollPane scrollPane = new JScrollPane(tabUtilisateurs);
        JPanel tabPanel = new JPanel();
        tabPanel.setLayout(new BorderLayout());
        tabPanel.setBorder(new LineBorder(Color.blue, 1));
        tabPanel.add(scrollPane, BorderLayout.CENTER);
        
        // Nous ajoutons les boutons ajouter, modifier et supprimer
        tabPanel.add(addUpdateDelete, BorderLayout.SOUTH);
        
        add(tabPanel);
    }
    
    // Second constructor
    public Caisse(Integer id, String numeroDeCarte, LocalDate dateDAchat, Integer nombre, Long montant, String caissier) {
        this.id = id;
        this.numeroDeCarte = numeroDeCarte;
        this.dateDAchat = dateDAchat;
        this.nombre = nombre;
        this.montant = montant;
        this.caissier = caissier;
    }
    
    // Getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumeroDeCarte() {
        return numeroDeCarte;
    }

    public void setNumeroDeCarte(String numeroDeCarte) {
        this.numeroDeCarte = numeroDeCarte;
    }

    public LocalDate getDateDAchat() {
        return dateDAchat;
    }

    public void setDateDAchat(LocalDate dateDAchat) {
        this.dateDAchat = dateDAchat;
    }

    public Integer getNombre() {
        return nombre;
    }

    public void setNombre(Integer nombre) {
        this.nombre = nombre;
    }

    public Long getMontant() {
        return montant;
    }

    public void setMontant(Long montant) {
        this.montant = montant;
    }

    public String getCaissier() {
        return caissier;
    }

    public void setCaissier(String caissier) {
        this.caissier = caissier;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.id);
        hash = 59 * hash + Objects.hashCode(this.numeroDeCarte);
        hash = 59 * hash + Objects.hashCode(this.dateDAchat);
        hash = 59 * hash + Objects.hashCode(this.nombre);
        hash = 59 * hash + Objects.hashCode(this.montant);
        hash = 59 * hash + Objects.hashCode(this.caissier);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Caisse other = (Caisse) obj;
        if (!Objects.equals(this.numeroDeCarte, other.numeroDeCarte)) {
            return false;
        }
        if (!Objects.equals(this.caissier, other.caissier)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.dateDAchat, other.dateDAchat)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.montant, other.montant);
    }

    @Override
    public String toString() {
        return "Caisse{" + "id=" + id + ", numeroDeCarte=" + numeroDeCarte +
                ", dateDAchat=" + dateDAchat + ", nombre=" + nombre + ", montant="
                + montant + ", caissier=" + caissier + '}';
    }
}
