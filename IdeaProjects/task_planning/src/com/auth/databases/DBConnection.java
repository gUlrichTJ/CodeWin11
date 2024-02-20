package com.auth.databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

   public static Connection getConnection() throws SQLException {
      String url = "jdbc:sqlite:authdatabase.db";
      Connection connection = DriverManager.getConnection(url);
      return connection;
   }
}