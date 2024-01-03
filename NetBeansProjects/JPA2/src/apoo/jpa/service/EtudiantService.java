/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package apoo.jpa.service;

import apoo.jpa.entites.Etudiant;
import apoo.jpa.entites.Parcours;
import java.util.List;

/**
 *
 * @author benjamin
 */
public interface EtudiantService {
    boolean ajouter(Etudiant etudiant);
    Etudiant modifier(Etudiant etudiant);
    Etudiant trouver(int id);
    //Etudiant trouver(String identifiant);
    List<Etudiant> lister();
    List<Etudiant> lister(Parcours parcours);
    boolean supprimer(int id);
    void supprimer(Etudiant etudiant);
}
