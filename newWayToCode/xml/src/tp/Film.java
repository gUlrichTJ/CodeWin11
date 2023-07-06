package tp;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/**
 *
 * @author time
 */
class Film {

    private int id;
    private String titre;
    private int annee;
    private float duree; // en nombre d'heures

    @SuppressWarnings("unused")
    private Film() {
    }

    public Film(int id, String titre, int annee, float duree) {
        this.id = id;
        this.titre = titre;
        this.annee = annee;
        this.duree = duree;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Film[id=");
        sb.append(id);
        sb.append(", titre=\"");
        sb.append(titre);
        sb.append("\", annee=");
        sb.append(annee);
        sb.append(", duree=");
        sb.append(duree);
        sb.append("]");
        return sb.toString();
    }

    public void toXML(Document document, Node parent) {
// élément <film>
        Element elFilm = document.createElement("film");
        parent.appendChild(elFilm);
// attribut <film id="n°">
        elFilm.setAttribute("id", Integer.toString(id));
// à vous de rajouter ce qu'il faut pour créer les
// sous-éléments <titre>, <annee> et <duree>
    }

    public static Film fromXML(Node node) throws Exception {
        // TODO vérifier que node est un élément <film>, sinon retourner null

        // conversion en Element
        Element elFilm = (Element) node;

        /// Nous vérifions
        if (UtilXML.isElement(elFilm, "film")) {
            System.out.println("Yes");
        }
        // valeurs du film à initialiser et retourner
        Integer id = null;
        String titre = null;
        Integer annee = null;
        Float duree = null;

        // lire l'attribut id
        id = Integer.parseInt(elFilm.getAttribute("id"));

        // lire le titre
        Node elTitre = elFilm.getFirstChild();
        titre = elTitre.getTextContent();

        // FIXME lire l'année
        Node elAnnee = elFilm.getNextSibling();     // <- FIXME
        annee = 0;

        // TODO lire la durée
        duree = 0.0f;

        // TODO vérifier que toutes les informations sont présentes
        // créer et retourner l'instance
        return new Film(id, titre, annee, duree);
    }

}
