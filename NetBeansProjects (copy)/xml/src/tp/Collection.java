/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp;

/**
 *
 * @author time
 */
import java.util.List;
import java.util.ArrayList;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

class Collection {

    private String genre;
    private List<Film> films = new ArrayList<>();

    public Collection() {
    }

    public Collection(String genre) {
        this.genre = genre;
    }

    public Collection(String genre, List<Film> films2) {
        this.genre = genre;
        this.films.addAll(films2);
    }

    public void add(Film film) {
        if (film != null) {
            films.add(film);
        }
    }
    
    public static Collection fromXML(Node node) throws Exception {
        // TODO vérifier que node est un élément <film>, sinon retourner null

        // conversion en Element
        Element collElement = (Element) node;

        /// Nous vérifions
        if (UtilXML.isElement(collElement, "collection")) {
            System.out.println("Yes");
        }
        // valeurs du film à initialiser et retourner
        String genre = null;

        // lire le genre
        Node elGenre = collElement.getFirstChild();
        genre = elGenre.getTextContent();

        // TODO vérifier que toutes les informations sont présentes
        // créer et retourner l'instance
        return new Collection(genre);
    }
    
    public void toXML(Document document, Node parent) {
// élément <film>
        Element collElement = document.createElement("collection");
        parent.appendChild(collElement);
        collElement.setAttribute("genre", genre);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Collection[genre=");
        sb.append(genre);
        for (Film film : films) {
            sb.append(", ");
            sb.append(film.toString());
        }
        sb.append("]");
        return sb.toString();
    }
}
