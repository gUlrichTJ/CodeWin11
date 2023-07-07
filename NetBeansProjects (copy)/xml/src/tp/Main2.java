package tp;

import org.w3c.dom.Document;

/**
 *
 * @author time
 */
public class Main2 {

    public static void main(String[] args) throws Exception {
// instance à sérialiser
        Film br2049 = new Film(2, "Blade Runner 2049", 2017, 2.733f);
// créer le document XML et sa racine
        Document document = UtilXML.creerDocumentDOM();
// sérialiser le film directement au niveau du document
        br2049.toXML(document, document);
// écrire le document dans un fichier
        UtilXML.ecrireDocumentDOM(document, "film.xml");
    }
}
