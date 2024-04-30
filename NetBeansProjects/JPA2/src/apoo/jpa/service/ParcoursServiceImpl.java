/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apoo.jpa.service;

import apoo.jpa.dao.ParcoursDaoImpl;
import apoo.jpa.entites.Parcours;

/**
 *
 * @author benjamin
 */
public class ParcoursServiceImpl implements ParcoursService{
    private ParcoursDaoImpl dao = new ParcoursDaoImpl();

    @Override
    public Parcours trouver(int id) {
        return this.dao.trouver(id);
    }
    
}
