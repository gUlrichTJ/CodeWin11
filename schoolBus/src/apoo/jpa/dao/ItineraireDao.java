
package apoo.jpa.dao;

import apoo.jpa.gui.Itineraire;
import java.util.List;

/**
 *
 * @author Time Store
 */
public interface ItineraireDao {
    
    // Une méthode ajouter
    public void ajouter(Itineraire itineraire);
    
    // Méthode modifier
    public Itineraire modifier(Itineraire itineraire);
    // Faire une persistance dans la base de données
    
    public Itineraire trouver(int id);
    
    public Itineraire trouver(String identifiant);
    
    public List<Itineraire> lister();
    
    public void supprimer(int id);
    
    // Surcharge de supprimer
    public void supprimer(Itineraire itineraire);
}
