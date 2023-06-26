
package jdbc01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author akouv
 */
public class Jdbc01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
        Properties p = new Properties();
        FileInputStream f = null;
        try {
            //
            f = new FileInputStream("conf.properties");
            p.load(f);
            System.out.println(p.getProperty("jdbc.url"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Jdbc01.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Jdbc01.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                f.close();
            } catch (IOException ex) {
                Logger.getLogger(Jdbc01.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
        try {
            Class.forName(p.getProperty("jdbc.driver.class"));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Jdbc01.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // Nous récupérons le mot de passe et l'url
        String url = p.getProperty("jdbc.url");
        String login = p.getProperty("jdbc.login");
        String password = p.getProperty("jdbc.password");
        
        System.out.println(login + " " + url + " " + password);
        
        Connection connexion = null;

        try {
           connexion = DriverManager.getConnection(url, login, password);
        } catch (SQLException ex) {
            Logger.getLogger(Jdbc01.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        Statement s = null;
        String sql;
        try {
             s = connexion.createStatement();
        
             sql = "insert into utilisateurs values (5, 'jack', '2563', 0);";
             s.execute(sql);
             
        } catch (SQLException ex) {
            Logger.getLogger(Jdbc01.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String sql1 = "select * from utilisateurs where id=1;";
        try {
            s = connexion.createStatement();
            ResultSet r = s.executeQuery(sql1);
            
            while (r.next()) {                
                System.out.println(r.getString(login) + " " + r.getString(password) + ".\n");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Jdbc01.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            connexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(Jdbc01.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
