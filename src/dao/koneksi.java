/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.*;
/**
 *
 * @author Suban
 */
public class koneksi {
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.jdbc.Drive");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pos?zeroDateTimeBehavior=CONVERT_TO_NULL [root on Default schema]");
            return con;
        }catch(Exception e){
            return null;
        }
        
    }
    
}
