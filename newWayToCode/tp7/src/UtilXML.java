import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


/** si on utilise xstream, décommenter ce bloc, ainsi que createXStream à la fin de ce fichier

import java.io.FileWriter;
import java.io.FileReader;
import java.io.Writer;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import com.thoughtworks.xstream.converters.reflection.ReflectionConverter;
import com.thoughtworks.xstream.converters.basic.*;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.xml.PrettyPrintWriter;
import com.thoughtworks.xstream.converters.collections.CollectionConverter;
import com.thoughtworks.xstream.security.NoTypePermission;
//import com.thoughtworks.xstream.security.WildcardTypePermission;
*/


/**
 * Cette classe fournit des méthodes statiques pratiques pour gérer les fichiers XML
 */
public abstract class UtilXML
{
    /**
     * Cette méthode crée un document XML et sa racine. Elle est à appeler en premier.
     * @see ecrireXML pour terminer la création du fichier;
     * @return Document représentant le document
     * @throws ParserConfigurationException
     */
    public static Document creerDocumentDOM()
            throws ParserConfigurationException
    {
        // création du document
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.newDocument();
        return document;
    }

    /**
     * Cette méthode crée un document XML et sa racine. Elle est à appeler en premier.
     * On fournit le nom de la racine du document XML.
     * @see ecrireXML pour terminer la création du fichier;
     * @note Utiliser racine.getOwnerDocument(); pour récupérer le Document la contenant.
     * @param nomracine nom de la racine <racine> du document
     * @return Element représentant la racine, utiliser racine.getOwnerDocument() pour avoir le document
     * @throws ParserConfigurationException
     */
    public static Element creerDocumentDOM(String nomracine)
            throws ParserConfigurationException
    {
        // création du document
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.newDocument();

        // création de la racine du document
        Element racine = document.createElement(nomracine);
        document.appendChild(racine);
        return racine;
    }


    /**
     * Cette méthode enregistre un Document XML dans une chaîne. Elle est à appeler après
     * avoir créé un document avec creerDocumentDOM
     * @param racine Element contenant la racine
     * @throws TransformerException
     */
    public static String ecrireDocumentDOM(Element racine)
            throws TransformerException
    {
        // écrivain
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();

        // écriture du document dans le fichier
        Document document = racine.getOwnerDocument();
        DOMSource source = new DOMSource(document);
        StringWriter writer = new StringWriter();
        StreamResult sortie = new StreamResult(writer);
        transformer.transform(source, sortie);
        return writer.toString();
    }


    /**
     * Cette méthode enregistre un Document XML dans un fichier. Elle est à appeler après
     * avoir créé un document avec creerDocumentDOM et l'avoir rempli
     * @param document Document à écrire dans le fichier
     * @param nomfichier nom du fichier à créer
     * @throws TransformerException
     */
    public static void ecrireDocumentDOM(Document document, String nomfichier)
            throws TransformerException
    {
        // écrivain
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();

        // écriture du document dans le fichier
        DOMSource source = new DOMSource(document);
        StreamResult sortie = new StreamResult(new File(nomfichier));
        transformer.transform(source, sortie);
    }


    /**
     * Cette méthode construit un Document en lisant un fichier XML
     * Le document n'est pas validé à la lecture, voir lireDocumentDOMvalide
     * @param nomfichier le fichier à lire
     * @return Document entier, utiliser document.getDocumentElement() pour avoir la racine
     */
    public static Document lireDocumentDOM(String nomfichier)
            throws ParserConfigurationException, SAXException, IOException
    {
        return lireDocumentDOM(nomfichier, false);
    }


    /**
     * Cette méthode construit un Document en lisant un fichier XML. Ce fichier XML
     * doit contenir ou mentionner une DTD qui sert à le valider.
     * @param nomfichier le fichier à lire
     * @return Document entier, utiliser document.getDocumentElement() pour avoir la racine
     */
    public static Document lireDocumentDOMavecDTD(String nomfichier)
            throws ParserConfigurationException, SAXException, IOException
    {
        return lireDocumentDOM(nomfichier, true);
    }


    /**
     * Cette méthode construit un Document en lisant un fichier XML
     * @param nomfichier le fichier à lire
     * @param validerDTD mettre true seulement si le document contient ou mentionne
     * une DTD et qu'on veut le valider (exception si invalide)
     * @return Document entier, utiliser document.getDocumentElement() pour avoir la racine
     */
    public static Document lireDocumentDOM(String nomfichier, boolean validerDTD)
            throws ParserConfigurationException, SAXException, IOException
    {
        // créer un Document builder
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setValidating(validerDTD);
        DocumentBuilder builder = factory.newDocumentBuilder();

        // lire le fichier pour obtenir le document
        return builder.parse(new File(nomfichier));
    }


    /**
     * Cette méthode construit un Document en lisant une chaine (et non pas un fichier)
     * @param contenu xml à lire
     * @param validerDTD mettre true seulement si le document contient ou mentionne
     * une DTD et qu'on veut le valider (exception si invalide)
     * @return Element racine du document, utiliser racine.getOwnerDocument() pour avoir le document
     */
    public static Element lireChaineDOM(String contenu, boolean validerDTD)
            throws ParserConfigurationException, SAXException, IOException
    {
        // créer un Document
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setValidating(validerDTD);
        DocumentBuilder builder = factory.newDocumentBuilder();

        // lire le fichier pour remplir le document
        InputSource is = new InputSource(new StringReader(contenu));
        Document document = builder.parse(is);

        return document.getDocumentElement();
    }



    /**
     * Cette méthode déclenche la lecture d'un document XML avec SAX.
     * Il faut indiquer le nom du fichier XML et fournir un DefaultHandler, c'est à dire
     * une instance de classe qui implémente les méthodes : startElement, endElement, character...
     * Cette méthode ne valide pas le document XML.
     * @param nomfichier le fichier à lire
     * @param handler, implémente ContentHandler, par exemple dérive de DefaultHandler
     */
    public static void lireDocumentSAX(String nomfichier, DefaultHandler handler)
            throws ParserConfigurationException, SAXException, IOException
    {
        lireDocumentSAX(nomfichier, handler, false);
    }


    /**
     * Cette méthode déclenche la lecture d'un document XML avec SAX. Ce fichier XML
     * doit contenir ou mentionner une DTD qui sert à le valider.
     * Il faut indiquer le nom du fichier XML et fournir un DefaultHandler, c'est à dire
     * une instance de classe qui implémente les méthodes : startElement, endElement, character...
     * @param nomfichier le fichier à lire
     * @param handler, implémente ContentHandler, par exemple dérive de DefaultHandler
     */
    public static void lireDocumentSAXavecDTD(String nomfichier, DefaultHandler handler)
            throws ParserConfigurationException, SAXException, IOException
    {
        lireDocumentSAX(nomfichier, handler, true);
    }


    /**
     * Cette méthode déclenche la lecture d'un document XML avec SAX.
     * Il faut indiquer le nom du fichier XML et fournir un DefaultHandler, c'est à dire
     * une instance de classe qui implémente les méthodes : startElement, endElement, character...
     * @param nomfichier le fichier à lire
     * @param handler, implémente ContentHandler, par exemple dérive de DefaultHandler
     * @param validerDTD mettre true seulement si le document contient ou mentionne
     * une DTD et qu'on veut le valider (exception si invalide)
     */
    public static void lireDocumentSAX(String nomfichier, DefaultHandler handler, boolean validerDTD)
            throws ParserConfigurationException, SAXException, IOException
    {
        // créer un générateur d'analyseur
        SAXParserFactory factory = SAXParserFactory.newInstance();
        factory.setNamespaceAware(true);
        factory.setValidating(validerDTD);

        // créer un analyseur
        SAXParser parser = factory.newSAXParser();

        // lancer l'analyse sur l'URI : fichier ou http://...
        parser.parse(nomfichier, handler);
    }


    /**
     * vérifie si node est un élément <nom>
     * @param node qu'on veut tester : est-ce un élément et est-ce <nom> ?
     * @param nom qu'on veut pour l'élément représenté par node
     * @return true si node=<nom>, false dans tout autre cas (null ou node pas élément)
     */
    public static boolean isElement(Node node, String nom)
    {
        if (node == null || nom == null) return false;
        if (node.getNodeType() != Node.ELEMENT_NODE) return false;
        return nom.equals(node.getNodeName());
    }


/** si on utilise xstream, décommenter ce bloc

    public static XStream createXStream()
    {
        // n'est pas suffisant avec Java 9+
        //XStream xstream = new XStream(new StaxDriver());

        XStream xstream = new XStream(new StaxDriver() {
            @Override
            public HierarchicalStreamWriter createWriter(Writer out) {
                return new PrettyPrintWriter(out, "    ");
            }
        }) {
            //pour corriger un problème avec Java 8+ et XStream
            //(java 8 interdit l'introspection de classes non déclarées comme réflexives)
            // voir https://github.com/x-stream/xstream/issues/101
            // only register the converters we need; other converters generate a private access warning in the console on Java9+...
            @Override
            protected void setupConverters() {
                registerConverter(new NullConverter(), PRIORITY_VERY_HIGH);
                registerConverter(new IntConverter(), PRIORITY_NORMAL);
                registerConverter(new FloatConverter(), PRIORITY_NORMAL);
                registerConverter(new DoubleConverter(), PRIORITY_NORMAL);
                registerConverter(new LongConverter(), PRIORITY_NORMAL);
                registerConverter(new ShortConverter(), PRIORITY_NORMAL);
                registerConverter(new BooleanConverter(), PRIORITY_NORMAL);
                registerConverter(new ByteConverter(), PRIORITY_NORMAL);
                registerConverter(new StringConverter(), PRIORITY_NORMAL);
                registerConverter(new DateConverter(), PRIORITY_NORMAL);
                registerConverter(new CollectionConverter(getMapper()), PRIORITY_NORMAL);
                registerConverter(new ReflectionConverter(getMapper(), getReflectionProvider()), PRIORITY_VERY_LOW);
            }
        };
        xstream.autodetectAnnotations(true);

        // setup proper security by limiting which classes can be loaded by XStream
        xstream.addPermission(NoTypePermission.NONE);
        //xstream.addPermission(new WildcardTypePermission(new String[] {"mon.package.**"}));
        return xstream;
    }
*/
}
