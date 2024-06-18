/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helper;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
    private static Connection conn;
    
    public static Connection getconnection() throws SQLException{
        try {
            String url = "jdbc:mysql://localhost:3306/db_tubes_dapa";
            String user = "root";
            String pass = "";
            DriverManager.registerDriver(new Driver());
            conn = (Connection) DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
}
