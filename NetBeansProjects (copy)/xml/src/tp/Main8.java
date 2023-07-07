/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp;

/**
 *
 * @author time
 */
public class Main8 {

    public static void main(String[] args) throws Exception {
// données
        Librairie librairie = new Librairie("classiques américains");
        librairie.add(new Livre(1, "Le Vagabond des étoiles", 1915, 7.50f));
        librairie.add(new Livre(2, "Les Aventures de Tom Sawyer", 1876, 6.90f));
        librairie.add(new Livre(3, "Histoires extraordinaires", 1856, 7.20f));
// sérialisation
        librairie.toXML("librairie.xml");
    }
}
