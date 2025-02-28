/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.*;
/**
 *
 * @author Riya Singh
 */
public class ConnectionProvider {
    //public static void  main(String[] args)
   public static Connection getCon()
    {
       // throw new UnsupportedOperationException("Not supported yet.");
        
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bms","root","12345");
            return con;
           //System.out.println(con);
        }
        catch(Exception e)
        {
            //System.out.println(e);
            return null;
        }
               
    }
   
       public static void main(String[] args) {
        Connection con = getCon();
        if (con != null) {
            System.out.println("Database connection successful!");
        } else {
            System.out.println("Failed to connect to database.");
        }
    }

    //public static Connection getCon() {
      //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 
//}
