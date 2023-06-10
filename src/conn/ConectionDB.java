/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author cesar
 */
public class ConectionDB {
        
       private static String url = "jdbc:mysql://localhost:3306/autocompany";
       private static String user = "root";
       private static String pswrd = "";
       private static Connection conn = null;

   
        public static Connection getConn() throws SQLException, ClassNotFoundException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, pswrd);
            System.out.println("Conexion Exitosa");
        } catch(SQLException e) {
            System.out.println("Error en la conexion: " + e.getMessage());
        }
        return conn;
    }
        
    public  void cerrar() throws SQLException {
        if (conn != null) {
            conn.close();
        }
    }
    
}
