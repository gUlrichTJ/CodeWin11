/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apoo.jpa.service;

import apoo.jpa.dao.EtudiantDoaImpl;
import apoo.jpa.entites.Etudiant;
import apoo.jpa.entites.Parcours;
import java.util.List;


/**
 *
 * @author benjamin
 */
public class EtudiantServiceImpl implements EtudiantService{
    private EtudiantDoaImpl dao = new EtudiantDoaImpl();

    @Override
    public boolean ajouter(Etudiant etudiant) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Etudiant modifier(Etudiant etudiant) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Etudiant trouver(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Etudiant> lister() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Etudiant> lister(Parcours parcours) {
        return this.dao.lister(parcours);
    }

    @Override
    public boolean supprimer(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void supprimer(Etudiant etudiant) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}
