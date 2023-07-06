
package tp;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

/**
 *
 * @author time
 */

public class Main3 {

    public static void main(String[] args) throws Exception {
// ouverture du fichier XML
        Document document = UtilXML.lireDocumentDOM("film.xml", false);
// lire et afficher la racine
        Node racine = document.getDocumentElement();
        Film film = Film.fromXML(racine);
        if (film != null) {
            System.out.println(film);
        } else {
            System.err.println("film.xml n'a pas pu être lu");
        }
    }
}
