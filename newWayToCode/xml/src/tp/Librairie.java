
package tp;

/**
 *
 * @author time
 */


import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;


class Librairie {

    private String genre;
    private List<Livre> livres = new ArrayList<>();

    public Librairie() {
    }

    public Librairie(String genre) {
        this.genre = genre;
    }

    public Librairie(String genre, List<Livre> livre2) {
        this.genre = genre;
        this.livres.addAll(livre2);
    }

    public void add(Livre livre) {
        if (livre != null) {
            livres.add(livre);
        }
    }
    
    public void toXML(String filename) throws Exception {
        Serializer serializer = new Persister();
        File output = new File(filename);
        serializer.write(this, output);
    }

    public static Librairie fromXML(String filename) throws Exception {
        Serializer serializer = new Persister();
        File input = new File(filename);
        return serializer.read(Librairie.class, input);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Collection[genre=");
        sb.append(genre);
        for (Livre livre : livres) {
            sb.append(", ");
            sb.append(livre.toString());
        }
        sb.append("]");
        return sb.toString();
    }
}

