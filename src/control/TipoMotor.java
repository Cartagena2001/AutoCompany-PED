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
public class TipoMotor {
    
    public boolean process(String tipoMotor){
        boolean bandera = false;
        System.out.println("parametros de entrada ==> " +tipoMotor);
        ConectionDB con = new ConectionDB();
        try {
                        
            Statement st=ConectionDB.getConn().createStatement();
            st.executeUpdate("insert into cat_motor(tipo_motor) value ('"+tipoMotor+"'); ");
            
            bandera = true;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al guardar datos en la base "+e.getMessage());
            bandera = false;
        }
        return bandera;
    }
    
    public String getID(String tipoMotor) throws SQLException{
        String id="";
        String consulta="select * from cat_motor where tipo_motor='"+tipoMotor+"'";
        ConectionDB con = new ConectionDB();
        try {
            System.out.println(consulta);      
            Statement sentencia=ConectionDB.getConn().createStatement();
            ResultSet resultado=sentencia.executeQuery(consulta);
            while (resultado.next())
            {
                System.out.println (resultado.getObject("id_motor") );
                id = resultado.getString("id_motor");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al consultar datos en la base tipo  "+e.getMessage());
           
            con.cerrar();
        }
        return id;
    }
    
}
