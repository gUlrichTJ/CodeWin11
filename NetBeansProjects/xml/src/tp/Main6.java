/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp;

/**
 *
 * @author time
 */
public class Main6 {

    public static void main(String[] args) throws Exception {
// un livre
        Livre livre = new Livre(1, "Le Vagabond des étoiles", 1915, 7.50f);
// sérialisation
        livre.toXML("livre.xml");
    }
}
