package System;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class Koneksi {
    public static Connection Go() {
        try {
            MysqlDataSource m = new MysqlDataSource();
            m.setServerName("localhost");
            m.setDatabaseName("warungm");  
            m.setUser("root");
            m.setPassword("");  
            m.setPortNumber(3306);  
            m.setServerTimezone("Asia/Jakarta");

            Connection c = m.getConnection();
            System.out.println("Koneksi Sukses");
            return c;
        } 
        catch (SQLException e) {
            System.out.println("Koneksi Gagal!\n" + e.getMessage());  // Corrected error handling
        }
        return null;
    }

    public static void main(String[] args) {
        Connection conn = Go();
        if (conn != null) {
            System.out.println("Connection Successful");
        } else {
            System.out.println("Connection failed.");
        }
    }

    static Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    PreparedStatement prepareStatement(String Q) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}