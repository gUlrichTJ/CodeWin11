/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import entites.Parcours;
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
         Parcours p2 = new Parcours("MRI");
           EtudiantService etuSer = new EtudiantServiceImpl();
           System.out.println(etuSer.lister(p2));
           
           ParcoursService parcours = new ParcoursServiceImpl();
           System.out.println(parcours.trouver(2));
        
    }
}
