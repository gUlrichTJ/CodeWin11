/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import entites.Parcours;

/**
 *
 * @author Time Store
 */
public abstract interface ParcoursDao {
    
    // Méthode trouver
    Parcours trouver(Long id);
}
