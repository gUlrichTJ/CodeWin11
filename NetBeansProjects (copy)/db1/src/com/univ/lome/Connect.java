/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.univ.lome;

import java.beans.Statement;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 *
 * @author mgraciano
 */
public class Connect {
    
    public static void main(String[] args) {
        
        Properties p = new Properties();
        FileInputStream f = null;
        Connection connexion = null;
        Statement s = null;
        String sql;
        
        try {
            
            f = new FileInputStream("conf.properties");
            p.load(f);
            System.out.println(p.getProperty("jdbc.url"));
            
            Class.forName("jdbc.driver.class");
            System.out.println("Driver ok!");
            
            // Nous récupérons le mot de passe et l'url
            String url = p.getProperty("jdbc.url");
            String login = p.getProperty("jdbc.login");
            String password = p.getProperty("jdbc.password");
            
            connexion = DriverManager.getConnection("org.mariadb.jdbc.Driver", "root", "");
            System.out.println("Connection ok!!");
            
            s = (Statement) connexion.createStatement();
            
            sql = "insert into utilisateurs values (1, 'jack', '2563', 0);";
            
            s.execute();
            
            // Nous fermons les fichiers
            f.close();
            connexion.close();
             
        } catch (Exception e) {
        }
    }
}
/**
 * public OptionButton(String str, String pathIcon) {
 *  super();
 *  ImageIcon icon = new ImageIcon(pathIcon);
 *  this.setIcon(icon);
 *  this.setText(str);
 *  this.setFont(new Font("Arial", Font.BOLD, 14));
 *  this.setForeground(Color.black);
 *  this.setVisible(true);
 *  this.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));    // Elève la bordure
 *  this.setBackground(Color.black);
 * }
 */
