package com.auth.databases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class AuthDB {

   public AuthDB() {}

   public static boolean authenticate(
         String username, String password
   ) throws SQLException {
      Connection connection = DBConnection.getConnection();
      PreparedStatement preparedStatement = connection.prepareStatement(
            "select password from users where username=?");
      preparedStatement.setString(1, username);
      ResultSet resultSet = preparedStatement.executeQuery();

      if (resultSet.next()) {
         String storedPassword = resultSet.getString("password");
         // Hash entered password using same algorithm and salt (if used)
         boolean match = true/* Secure password comparison (bcrypt/Argon2) */;
         if (match) {
            return true;
         }
      }
      resultSet.close();
      preparedStatement.close();
      connection.close();
      return false;
   }
}
