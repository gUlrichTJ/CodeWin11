/*
 *
 */
package jdbc02.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdbc02.entite.Utilisateur;
import jdbc02.util.SingletonConnexion;

/**
 *
 * @author akouv
 */
public class UtilisateurDaoImpl implements UtilisateurDao {

    Connection connexion = null;
    Statement statement = null;
    PreparedStatement preparedStatement;
    String sql;
    
    @Override
    public void ajouter(Utilisateur utilisateur) {
        try {
            connexion = SingletonConnexion.getInstance();
            sql = "insert into utilisateurs(id, identifiant, mot_de_passe, nombre_connexion) "
                    + "values(, 'hello', 'hello', 5);";
            preparedStatement = connexion.prepareStatement(sql);
            
            preparedStatement.setInt(1, 0);
            preparedStatement.setString(2, utilisateur.getIdentifiant());
            preparedStatement.setString(3, utilisateur.getMotDePasse());
            
            preparedStatement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(UtilisateurDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Utilisateur modifier(Utilisateur utilisateur) {
        try {
            connexion = SingletonConnexion.getInstance();
            sql = "update utilisateurs set identifiant = "+utilisateur.getIdentifiant()+", mot_de_passe = "+utilisateur.getMotDePasse()+" where id = "+utilisateur.getId()+";";
            preparedStatement = connexion.prepareStatement(sql);
            
            preparedStatement.setString(1, utilisateur.getIdentifiant());
            preparedStatement.setString(2, utilisateur.getMotDePasse());
            preparedStatement.setInt(3, utilisateur.getId());
            
            preparedStatement.executeUpdate();
            
            // Get the updated Utilisateur object from the database.
            Utilisateur updatedUtilisateur = new Utilisateur();
            preparedStatement = connexion.prepareStatement("select * from utilisateurs where id = ?");
            preparedStatement.setInt(1, utilisateur.getId());
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                updatedUtilisateur.setId(resultSet.getInt("id"));
                updatedUtilisateur.setIdentifiant(resultSet.getString("identifiant"));
                updatedUtilisateur.setMotDePasse(resultSet.getString("mot_de_passe"));
            }
            
            return updatedUtilisateur;
        } catch (SQLException ex) {
            Logger.getLogger(UtilisateurDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }


    @Override
    public Utilisateur trouver(int id) {
        try {
            connexion = SingletonConnexion.getInstance();
            sql = "select * from utilisateurs where id = "+id+";";
            preparedStatement = connexion.prepareStatement(sql);
            
            preparedStatement.setInt(1, id);
            
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                Utilisateur foundUtilisateur = new Utilisateur();
                foundUtilisateur.setId(resultSet.getInt("id"));
                foundUtilisateur.setIdentifiant(resultSet.getString("identifiant"));
                foundUtilisateur.setMotDePasse(resultSet.getString("mot_de_passe"));
                return foundUtilisateur;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UtilisateurDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }


    @Override
    public Utilisateur trouver(String identifiant) {
        try {
            connexion = SingletonConnexion.getInstance();
            sql = "select * from utilisateurs where identifiant = "+identifiant+";";
            preparedStatement = connexion.prepareStatement(sql);
            
            preparedStatement.setString(1, identifiant);
            
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                Utilisateur foundUtilisateur = new Utilisateur();
                foundUtilisateur.setId(resultSet.getInt("id"));
                foundUtilisateur.setIdentifiant(resultSet.getString("identifiant"));
                foundUtilisateur.setMotDePasse(resultSet.getString("mot_de_passe"));
                return foundUtilisateur;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UtilisateurDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }


    @Override
    public List<Utilisateur> lister() {
        try {
            connexion = SingletonConnexion.getInstance();
            sql = "select * from utilisateurs;";
            preparedStatement = connexion.prepareStatement(sql);
            
            ResultSet resultSet = preparedStatement.executeQuery();
            List<Utilisateur> utilisateurs = new ArrayList<>();
            while (resultSet.next()) {
                Utilisateur utilisateur = new Utilisateur();
                utilisateur.setId(resultSet.getInt("id"));
                utilisateur.setIdentifiant(resultSet.getString("identifiant"));
                utilisateur.setMotDePasse(resultSet.getString("mot_de_passe"));
                utilisateurs.add(utilisateur);
            }
            return utilisateurs;
        } catch (SQLException ex) {
            Logger.getLogger(UtilisateurDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }


    @Override
    public void supprimer(int id) {
        try {
            connexion = SingletonConnexion.getInstance();
            sql = "delete from utilisateurs where id = "+id+";";
            preparedStatement = connexion.prepareStatement(sql);
            
            preparedStatement.setInt(1, id);
            
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UtilisateurDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    @Override
    public void supprimer(Utilisateur utilisateur) {
        this.supprimer(utilisateur.getId());
    }

}
