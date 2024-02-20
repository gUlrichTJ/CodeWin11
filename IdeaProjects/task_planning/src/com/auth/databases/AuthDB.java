package com.auth.databases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class AuthDB {

   public static boolean authenticate(
         String username, String password
   ) throws SQLException {
      Connection connection = DBConnection.getConnection();
      PreparedStatement preparedStatement = connection.prepareStatement(
            "select password from users when")
   }
}
