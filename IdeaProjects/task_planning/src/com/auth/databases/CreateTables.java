package com.auth.databases;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTables {

   public static void main(String[] args) throws SQLException {
      Connection connection = DBConnection.getConnection();
      Statement statement = connection.createStatement();

      // We create the table
      String sql = "create table if not exists " +
            "user(id integer primary key autoincrement, " +
            "username text unique, password text)";
      statement.executeUpdate(sql);

      statement.close();
      connection.close();
   }
}
