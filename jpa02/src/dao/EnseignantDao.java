
package dao;

import entites.Enseignant;
import java.util.List;

/**
 *
 * @author Time Store
 */
public interface EnseignantDao {
    
    // Une méthode ajouter
    public void ajouter(Enseignant enseignant);
    
    // Méthode modifier
    public Enseignant modifier(Enseignant enseignant);
    // Faire une persistance dans la base de données
    
    public Enseignant trouver(int id);
    
    public Enseignant trouver(String identifiant);
    
    public List<Enseignant> lister();
    
    public void supprimer(int id);
    
    // Surcharge de supprimer
    public void supprimer(Enseignant enseignant);
}
