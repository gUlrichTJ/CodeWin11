/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apoo.jpa.entites;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author mgraciano
 */

@Entity
@Table(name = "etudiants")
public class Etudiant implements Serializable {
    
    @Id     // Ceci est la clé primaire
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "numero_carte", length=20)
    private String numeroDeCarte;
    
    @Column(name = "nom", length = 20, nullable = false)
    private String nom;
    
    @Column(name = "prenom", length = 20, nullable = false)
    private String prenom;
    
    @Column(name = "date_naissance", length = 20)
    private LocalDate dateDaissance;
    
    @Transient
    private List<Parcours> parcourses;
    
    // Default constructor
    public Etudiant() {
        this.parcourses = new ArrayList<>();
    }
    
    // Constructor without id and parcours

    public Etudiant(String numeroDeCarte, String nom, String prenom, LocalDate dateDaissance) {
        this.numeroDeCarte = numeroDeCarte;
        this.nom = nom;
        this.prenom = prenom;
        this.dateDaissance = dateDaissance;
    }
    
    
    // Constructor with parameters

    public Etudiant(Integer id, String numeroDeCarte, String nom, String prenom, LocalDate dateDaissance, List<Parcours> parcourses) {
        this.id = id;
        this.numeroDeCarte = numeroDeCarte;
        this.nom = nom;
        this.prenom = prenom;
        this.dateDaissance = dateDaissance;
        this.parcourses = parcourses;
    }
   

    public Integer getId() {
        return id;
    }

    // Getters et setters
    public void setId(Integer id) {   
        this.id = id;
    }

    public String getNumeroDeCarte() {
        return numeroDeCarte;
    }

    public void setNumeroDeCarte(String numeroDeCarte) {
        this.numeroDeCarte = numeroDeCarte;
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

    public LocalDate getDateDaissance() {
        return dateDaissance;
    }

    public void setDateDaissance(LocalDate dateDaissance) {
        this.dateDaissance = dateDaissance;
    }

    public List<Parcours> getParcourses() {
        return parcourses;
    }

    public void setParcourses(List<Parcours> parcourses) {
        this.parcourses = parcourses;
    }
    
    // Méthode equals et hashcode

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.id;
        hash = 97 * hash + Objects.hashCode(this.numeroDeCarte);
        hash = 97 * hash + Objects.hashCode(this.nom);
        hash = 97 * hash + Objects.hashCode(this.prenom);
        hash = 97 * hash + Objects.hashCode(this.dateDaissance);
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
        final Etudiant other = (Etudiant) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.numeroDeCarte, other.numeroDeCarte)) {
            return false;
        }
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        if (!Objects.equals(this.prenom, other.prenom)) {
            return false;
        }
        return Objects.equals(this.dateDaissance, other.dateDaissance);
    }

    @Override
    public String toString() {
        return "Etudiant{" + "id=" + id + ", numeroDeCarte=" + numeroDeCarte + 
                ", nom=" + nom + ", prenom=" + prenom + ", dateDaissance=" 
                + dateDaissance + ", parcourses=" + parcourses + '}';
    }
    
    
    
}
