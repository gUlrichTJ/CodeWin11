package tp;

/**
 *
 * @author time
 */
import java.io.File;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

@Root
class Livre {

    @Attribute
    private int id;
    @org.simpleframework.xml.Element
    private String titre;
    @org.simpleframework.xml.Element
    private int annee;
    @org.simpleframework.xml.Element
    private float duree; // en nombre d'heures

    @SuppressWarnings("unused")
    private Livre() {
    }

    public Livre(int id, String titre, int annee, float duree) {
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

    public void toXML(String filename) throws Exception {
        Serializer serializer = new Persister();
        File output = new File(filename);
        serializer.write(this, output);
    }

    public static Livre fromXML(String filename) throws Exception {
        Serializer serializer = new Persister();
        File input = new File(filename);
        return serializer.read(Livre.class, input);
    }

}
