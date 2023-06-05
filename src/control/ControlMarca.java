/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import conn.ConectionDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author cesar
 */
public class ControlMarca {
        public String getID(String marca) throws SQLException{
        String id="";
        String consulta="select * from marca where nombre_marca='"+marca+"'";
        ConectionDB con = new ConectionDB();
        try {
             System.out.println(consulta);      
            Statement sentencia= ConectionDB.getConn().createStatement();
            ResultSet resultado=sentencia.executeQuery(consulta);
            while (resultado.next())
            {
                System.out.println (resultado.getObject("id_marca") );
                id = resultado.getString("id_marca");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al consultar en la base marca"+e.getMessage());
           
            con.cerrar();
        }
        return id;
    }
}
