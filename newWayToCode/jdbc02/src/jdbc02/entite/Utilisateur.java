/*
 *
 */
package jdbc02.entite;

/**
 *
 * @author akouv
 */
public class Utilisateur {
    
    private int id;
    private String identifiant;
    private String nom;
    private String prenom;
    private int age;
    private String motDePasse;
    private int nombreConnexion;

    public Utilisateur() {
        this.id = 0;
        this.identifiant = "";
        this.nom = "";
        this.prenom = "";
        this.age = 0;
        this.motDePasse = "";
        this.nombreConnexion = 0;
    }
    
    public Utilisateur(int id, String identifiant, String nom, String prenom, int age, String motDePasse, int nombreConnexion) {
        this.id = id;
        this.identifiant = identifiant;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.motDePasse = motDePasse;
        this.nombreConnexion = nombreConnexion;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public int getNombreConnexion() {
        return nombreConnexion;
    }

    public void setNombreConnexion(int nombreConnexion) {
        this.nombreConnexion = nombreConnexion;
    }

    @Override
    public String toString() {
        return "Utilisateur{" + "id=" + id + ", identifiant=" + identifiant + ", motDePasse=" + motDePasse + ", nombreConnexion=" + nombreConnexion + '}';
    }
    
}
