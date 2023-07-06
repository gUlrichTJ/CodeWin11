
/**
 *
 * @author time
 */
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Main3 {

    public static void main(final String[] args) {
        try {

            // ouvrir et traiter le fichier
            UtilXML.lireDocumentSAX("factbook.xml", new FactbookContentHandler3());

        } catch (Exception e) {
            // afficher où ça s'est planté
            e.printStackTrace();
        }
    }
}
