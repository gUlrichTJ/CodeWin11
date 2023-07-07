/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apoo.jpa.entites;

import java.io.Serializable;

/**
 *
 * @author mgraciano
 */
public class Parcours implements Serializable {
    
    private int id;
    private String libelle;
    
    // Default constructor
    public Parcours() {
    }
    
    // Constructor with parameters
    public Parcours(int id, String libelle) {
        this.id = id;
        this.libelle = libelle;
    }
    
    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    
}
