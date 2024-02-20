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
            "select password from users where username=?");
      preparedStatement.setString(1, username);
      ResultSet resultSet = preparedStatement.executeQuery();

      if (resultSet.next()) {
         String hashedPassword = resultSet.getString("password");
         if (BCrypt.checkpw(password, hashedPassword)) {
            // Passwords match
            resultSet.close();
            preparedStatement.close();
            connection.close();
            return true;
         }
      }
      resultSet.close();
      preparedStatement.close();
      connection.close();
      return false;
   }
}
