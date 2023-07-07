/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp;

/**
 *
 * @author time
 */
public class Main7 {

    public static void main(final String[] args) throws Exception {
// désérialisation
        Livre livre = Livre.fromXML("livre.xml");
// utilisation des données
        System.out.println(livre.toString());
    }
}
