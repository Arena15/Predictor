/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
  
import connection.MyCon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import model.diabetes;
/**
 *
 * @author Asus
 */
public class diadao {

    public boolean checklogin(String user_id, String password) throws Exception{
        
        String sql;
        Connection con = null;
        sql = "select user_id , password from user where user_id =? and password =?";
        PreparedStatement ps = null;
        con = MyCon.getConnection();
        if (con == null) {
           throw new Exception(" Exception connection is null");     
        } 
        ps = con.prepareStatement(sql);
        ps.setString(1, user_id);
        ps.setString(2, password);
        ResultSet rs = null;
        rs = ps.executeQuery();
        if(rs.next())
            return true;
        else
            return false;
      } 
    
         public int Register(diabetes d) throws SQLException    {
         Connection con=null;
         ResultSet rs=null;
         PreparedStatement ps=null;
         con=MyCon.getConnection();
         String sql;  
         sql="insert into user values(?,?,?,?,?,?)";
         ps=con.prepareStatement(sql);
         ps.setInt(1,d.getUser_id() );
         ps.setString(2, d.getFirst_name());
         ps.setString(3, d.getLast_name());
          ps.setString(4, d.getPassword());
         ps.setString(5, d.getEmail());
         ps.setString(6, d.getPhone());
           int n=0; 
         n=ps.executeUpdate();
 //           System.out.println("Record Inserted........ " + n);
        return(n);
      }      

}
