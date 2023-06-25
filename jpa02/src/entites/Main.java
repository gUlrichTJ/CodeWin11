/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entites;

import java.util.List;
import service.EtudiantService;
import service.EtudiantServiceImpl;
import service.ParcoursService;
import service.ParcoursServiceImpl;

/**
 *
 * @author Time Store
 */
public class Main {
    
    public static void main(String[] args) {
        
        EtudiantService etudiantService = new EtudiantServiceImpl();
        
        ParcoursService parcoursService = new ParcoursServiceImpl();
        
        Parcours parcours = parcoursService.trouver(1);
        
        List<Etudiant> etudiants = etudiantService.lister(parcours);
        
        
    }
}
