/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apoo.jpa.entites;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author benjamin
 */
@Entity
@DiscriminatorValue("ENS")
public class Enseignant extends Personne{
    //@Column(name = "specialite")
    //private String specialite;
    
    public Enseignant(){
        
    }

    public Enseignant(String nom, String prenom, LocalDate dateNaissance) {
        super(nom, prenom, dateNaissance);
        //this.specialite = specialite;
    }
    
    
}
