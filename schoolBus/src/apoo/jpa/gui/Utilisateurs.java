package apoo.jpa.gui;

/**
 * @author Time Store
 */

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Objects;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;

public class Utilisateurs extends JPanel {

    // Nous mettons les attributs de l'utilisateur
    private Integer id;
    private String nom;
    private String prenom;
    private String adresse;
    private String profession;
    private Integer age;
    private String sexe;

    Utilisateurs utilisateurs;
    
    AddUpdateDelete addUpdateDelete = new AddUpdateDelete(utilisateurs);

    // Constructor
    public Utilisateurs() {

        setLayout(new BorderLayout());
        // Nous définissons l'entete
        String[] enteteDuTableau = {"ID", "Noms", "Prenoms", "Adresse",
            "Profession", "Âge", "Sexe"};
        // Nous définissons les données du tableau
        Object[][] donnees = {
            {"1", "MATHEY-APOSSAN", "Ulrich G", "grm@gmail.com", "Développeur", "20", "M"},
            {"2", "MATHEY-APOSSAN", "Urielle G", "grum@gmail.com", "Avocate", "22", "F"},
            {"3", "Moko", "Eunice G", "Adétikopé", "Juriste", "18", "F"},
            {"4", "GOMADO", "Akouto Yayra", "El-Shaddaï", "Enseignante", "21", "F"},
            {"5", "MOUSSA", "Abibou", "abmo01@gmail.com", "Biochimiste", "21", "M"},
            {"6", "PEKETI", "K. Rébecca", "Gblenkomé", "Économiste", "21", "F"},
            {"7", "HOUNGO", "K. Felix", "Gbossimé", "Chauffeur", "34", "M"},
            {"8", "SOKEL", "Roland", "Zanguéra", "Développeur", "19", "M"},
            {"9", "AKPABLA", "K. Gildas", "Gblenkomé", "Chauffeur", "44", "M"},
            {"10", "AYOKI", "E. Ella", "Doumassesse", "Infirmière", "17", "F"},
            {"11", "KOUMA", "Kokou. Felix", "Adétikopé", "Mécanicien", "24", "M"},
            {"12", "DÉKADJÈVI", "Solange", "USA", "Boxeuse", "30", "F"},
            {"13", "HOUNGO", "K. Felix", "Gbossimé", "Chauffeur", "34", "M"},
            {"14", "HOUNGO", "K. Felix", "Gbossimé", "Chauffeur", "34", "M"},
            {"15", "HOUNGO", "K. Felix", "Gbossimé", "Chauffeur", "34", "M"},};

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

    // Le constructeur qui reçoit les informations de l'étudiant
    public Utilisateurs(String nom, String prenom, String adresse, String profession, 
            Integer age, String sexe) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.profession = profession;
        this.age = age;
        this.sexe = sexe;
    }

    // Les getters et les setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.id);
        hash = 59 * hash + Objects.hashCode(this.nom);
        hash = 59 * hash + Objects.hashCode(this.prenom);
        hash = 59 * hash + Objects.hashCode(this.adresse);
        hash = 59 * hash + Objects.hashCode(this.profession);
        hash = 59 * hash + Objects.hashCode(this.age);
        hash = 59 * hash + Objects.hashCode(this.sexe);
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
        final Utilisateurs other = (Utilisateurs) obj;
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        if (!Objects.equals(this.prenom, other.prenom)) {
            return false;
        }
        if (!Objects.equals(this.adresse, other.adresse)) {
            return false;
        }
        if (!Objects.equals(this.profession, other.profession)) {
            return false;
        }
        if (!Objects.equals(this.sexe, other.sexe)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return Objects.equals(this.age, other.age);
    }

    @Override
    public String toString() {
        return "Utilisateurs{" + "id=" + id + ", nom=" + nom + ", prenom=" 
                + prenom + ", adresse=" + adresse + ", profession=" + profession
                 + ", age=" + age + ", sexe=" + sexe + '}';
    }

}

