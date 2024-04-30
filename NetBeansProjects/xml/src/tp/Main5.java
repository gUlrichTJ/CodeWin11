/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp;

/**
 *
 * @author time
 */
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class Main5 {

    public static void main(String[] args) throws Exception {
        // ouverture du fichier XML
        Document document = UtilXML.lireDocumentDOM("collection.xml", false);

        // lire et afficher la racine
        Node racine = document.getDocumentElement();
        Collection collection = Collection.fromXML(racine);
        if (collection != null) {
            System.out.println(collection);
        } else {
            System.err.println("collection.xml n'a pas pu être lu");
        }
    }
}
