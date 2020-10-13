/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pkohli
 */

import com.mysql.jdbc.Connection;
//import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
  
   private static Connection con = null;
   private static final String USERNAME = "root";
   private static final String PASSWORD = "";
   private static final String DRIVER = "com.mysql.jdbc.Driver";
   private static final String URL = "jdbc:mysql://127.0.0.1:8012/ampify";

   public static Connection getDatabaseConnection() throws ClassNotFoundException{
       Class.forName(DRIVER);
       try{
       return con = (Connection) DriverManager.getConnection(URL,USERNAME,PASSWORD);
       }
       catch (SQLException e)
       {
         System.out.println(e.getMessage());
       }
       return null;
    }
    
    public static void main(String[] args) throws ClassNotFoundException
    {}
}
