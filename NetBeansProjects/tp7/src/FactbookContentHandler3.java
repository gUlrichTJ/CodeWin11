
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


/**
 *
 * @author time
 */
public class FactbookContentHandler3 extends DefaultHandler {
    
    // gestion des états de l'automate
    private enum Etat {
        INIT, PAYS, LANG
    };
    private Etat EtatCourant;

    // texte en cours de lecture, utiliser texte.toString() pour sa valeur
    private StringBuilder texte = new StringBuilder();

    // nom du pays courant, null s'il a déjà été affiché
    private String pays = null;

    /**
     * Actions à réaliser lors de la détection d'une balise ouvrante
     */
    @Override
    public void startElement(String nameSpace, String localName, String qName,
            Attributes attrs) throws SAXException {
        // selon l'état courant
        switch (EtatCourant) {

            case INIT:
                if ("country".equals(qName)) {
                    // mémoriser le nom du pays
                    pays = attrs.getValue("name");
                    // état suivant
                    EtatCourant = Etat.PAYS;
                }
                break;

            case PAYS:
                if ("languages".equals(qName)) {
                    // état suivant
                    EtatCourant = Etat.LANG;
                }
                break;

            default:
            // on ne fait rien, on ignore cette balise
        }

        // vider le StringBuilder à chaque balise
        texte.setLength(0);
    }

    /**
     * Actions à réaliser lors de la détection de la fin d'un élément
     */
    @Override
    public void endElement(String nameSpace, String localName, String qName)
            throws SAXException {
        switch (EtatCourant) {

            case LANG:
                if ("languages".equals(qName)) {
                    // si le pays n'a pas déjà été affiché, le faire maintenant
                    if (pays != null) {
                        System.out.print(pays + " : ");
                        // noter qu'il a été affiché, voir le else
                        pays = null;
                    } else {
                        // le pays a déjà été affiché, donc n'afficher qu'une virgule
                        System.out.print(", ");
                    }
                    // afficher la langue
                    System.out.print(texte.toString());
                    // remonter
                    EtatCourant = Etat.PAYS;
                }
                break;

            case PAYS:
                if ("country".equals(qName)) {
                    // sauter à la ligne si le pays a été affiché
                    if (pays == null) {
                        System.out.println();
                    }
                    EtatCourant = Etat.INIT;
                }
                break;

            default:
            // on ne fait rien, on ignore cette balise
        }

        // effacer le texte à chaque balise
        texte.setLength(0);
    }

    /**
     * Actions à réaliser sur les textes
     */
    @Override
    public void characters(char[] text, int debut, int lng) {
        // si on est entre <languages> et </languages>, on stocke le texte
        if (EtatCourant == Etat.LANG) {
            texte.append(new String(text, debut, lng));
        }
    }
}
