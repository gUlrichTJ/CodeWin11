/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author time
 */
import java.util.ArrayList;
import java.util.List;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

public class FactbookContentHandler1 extends DefaultHandler {

    /**
     * Actions à réaliser lors de la détection d'une balise ouvrante
     */
    private String bretagnePopulation;
    private List<String> fleuvesLongs = new ArrayList<>();
    private int maxSize = 0;
    private String largestIslandName = "";
    private int oldestDate = Integer.MAX_VALUE;
    private String oldestOrganizationName = "";

    @Override
    public void startElement(String nameSpace, String localName, String qName,
            Attributes attrs) throws SAXException {
        if (qName.equals("province") && attrs.getValue("name").equals("Bretagne")) {
            bretagnePopulation = attrs.getValue("population");
        }

        // Rivières 
        if (qName.equals("river")) {
            String lengthStr = attrs.getValue("length");
            if (lengthStr != null) {
                int length = Integer.parseInt(lengthStr);
                if (length >= 6000) {
                    String riverName = attrs.getValue("name");
                    fleuvesLongs.add(riverName);
                }
            }
        }

        // Island name
        if (qName.equalsIgnoreCase("island")) {
            String area = attrs.getValue("area");
            if (area != null) {
                int islandSize = Integer.parseInt(area);
                if (islandSize > maxSize) {
                    maxSize = islandSize;
                    largestIslandName = attrs.getValue("name");
                }
            }
        }

        // Organisation
        if (qName.equalsIgnoreCase("organization")) {
            String established = attrs.getValue("established");
            if (established != null) {
                String[] mots = established.split(" ");
                if (mots.length == 3) {
                    try {
                        int jj = Integer.parseInt(mots[0]);
                        int mm = Integer.parseInt(mots[1]);
                        int aaaa = Integer.parseInt(mots[2]);
                        int date = (aaaa * 12 + mm) * 31 + jj;
                        if (date < oldestDate) {
                            oldestDate = date;
                            oldestOrganizationName = attrs.getValue("name");
                        }
                    } catch (NumberFormatException ignored) {
                    }
                }
            }
        }

    }

    /**
     * Actions à réaliser lors de la détection de la fin d'un élément
     */
    @Override
    public void endElement(String nameSpace, String localName, String qName)
            throws SAXException {
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("La plus grande île est : " + largestIslandName);
        System.out.println("La plus ancienne organisation est : " + oldestOrganizationName);
    }

    /**
     * gestionnaire d'erreur *
     */
    @Override
    public void error(SAXParseException e) {
        System.err.println("Erreur ligne " + e.getLineNumber()
                + " colonne " + e.getColumnNumber());
        System.err.println(e.getMessage());
    }

    /**
     * gestionnaire d'erreur fatale *
     */
    @Override
    public void fatalError(SAXParseException e) {
        System.err.println("Erreur fatale ligne " + e.getLineNumber()
                + " colonne " + e.getColumnNumber());
        System.err.println(e.getMessage());
    }

    public String getBretagnePopulation() {
        return bretagnePopulation;
    }

    public List<String> getFleuvesLongs() {
        return fleuvesLongs;
    }

}
