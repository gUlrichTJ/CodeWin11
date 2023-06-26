/*
 * 
 */
package jdbc02.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author akouv
 */
public class SingletonConnexion {
    
    // private static Connection instance;
    
    /**static {
        System.out.println("Bonjour");
        
        Properties p = new Properties();
        FileInputStream f = null;
        try {
            //
            f = new FileInputStream("conf.properties");
            p.load(f);
            System.out.println(p.getProperty("jdbc.url"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SingletonConnexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SingletonConnexion.class.getName()).log(Level.SEVERE, null, ex);
        } 
    
        try {
            Class.forName(p.getProperty("jdbc.driver.class"));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SingletonConnexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // Nous récupérons le mot de passe et l'url
        String url = p.getProperty("jdbc.url");
        String login = p.getProperty("jdbc.login");
        String password = p.getProperty("jdbc.password");
        
        System.out.println(login + " " + url + " " + password);
        System.out.println("OK");
        
        try {
           instance = DriverManager.getConnection(url, login, password);
        } catch (SQLException ex) {
            Logger.getLogger(SingletonConnexion.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                f.close();
            } catch (IOException ex) {
                Logger.getLogger(SingletonConnexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }*/
    
    private SingletonConnexion() {
        
    }
    
    public static Connection getInstance() {
        try {
            
            Class.forName("org.mariadb.jdbc.Driver");
            System.out.println("Verification");
            
            Connection instance = DriverManager.getConnection("jdbc:mariadb://localhost:3306/jdbc01","root", "");
            System.out.println("Vérification establishment of connection");
            
            return instance;
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
