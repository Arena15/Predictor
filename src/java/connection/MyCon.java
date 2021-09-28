/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Asus
 */

public class MyCon{
    
        static Connection con = null; 
        static{
          try
              { 
                      Class.forName("com.mysql.jdbc.Driver");
                      System.out.println("Driver load...........");
                
               }catch (ClassNotFoundException e) {
                      System.out.println(e);
               }  
        }
    
    public static Connection getConnection(){
        try {
               con = DriverManager.getConnection("jdbc:mysql://localhost:3307/diabetes", "janvi", "janvi");
               System.out.println("Data base Conneted.........");
               
        }catch (SQLException e) {
            System.out.println(e);
        } 
       return con;
    }
}

