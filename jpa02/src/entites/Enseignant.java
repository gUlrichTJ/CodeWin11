
package entites;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author Time Store
 */
@Entity
@DiscriminatorValue("ENS")
public class Enseignant extends Personne {
    
}
