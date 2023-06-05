/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import conn.ConectionDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author SergioCardoza
 */
public class TipoVehiculo {
    public String getID(String tipo) throws SQLException{
        String id="";
        String consulta="select * from cat_tipo_vehi where tipo_vehiculo='"+tipo+"'";
        ConectionDB con = new ConectionDB();
        try {
             System.out.println(consulta);      
            Statement sentencia=ConectionDB.getConn().createStatement();
            ResultSet resultado=sentencia.executeQuery(consulta);
            while (resultado.next())
            {
                System.out.println (resultado.getObject("id_tipo_vehi") );
                id = resultado.getString("id_tipo_vehi");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al guardar datos en la base "+e.getMessage());
           
            con.cerrar();
        }
        return id;
    }
    
}
