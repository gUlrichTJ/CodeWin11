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

public class Main4 {

    public static void main(String[] args) throws Exception {
        // une collection
        Collection collection = new Collection("Fantastique");

        // quelques films
        collection.add(new Film(1, "Blade Runner", 1982, 1.95f));
        collection.add(new Film(2, "Blade Runner 2049", 2017, 2.733f));
        collection.add(new Film(3, "Alien", 1979, 1.933f));

        // créer le document XML et sa racine
        Document document = UtilXML.creerDocumentDOM();

        // sérialiser la collection
        collection.toXML(document, document);

        // écriture du document dans un fichier
        UtilXML.ecrireDocumentDOM(document, "collection.xml");
    }
}
