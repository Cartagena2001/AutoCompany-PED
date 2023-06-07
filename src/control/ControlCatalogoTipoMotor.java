/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import conn.ConectionDB;
import java.sql.Statement;

/**
 *
 * @author cesar
 */
public class ControlCatalogoTipoMotor {
      public boolean process(String dat){
        boolean bandera = false;
        System.out.println("parametros de entrada ==> " +dat);
        ConectionDB con = new ConectionDB();
        try {
            
            Statement st=ConectionDB.getConn().createStatement();
            st.executeUpdate("insert into cat_motor(tipo_motor) value ('"+dat+"')");
            
            bandera = true;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al guardar datos en la base "+e.getMessage());
            bandera = false;
        }
        return bandera;
    }
      
    public boolean update(String dat, String id){
        boolean bandera = false;
        System.out.println("parametros de entrada ==> " +dat);
        ConectionDB con = new ConectionDB();
        try {
            
            Statement st=ConectionDB.getConn().createStatement();
            st.executeUpdate("update cat_motor set id_motor="+id+" where tipo_motor='"+dat+"'");
            con.cerrar();
            bandera = true;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al guardar datos en la base "+e.getMessage());
            bandera = false;
        }
        return bandera;
    }
    
    public boolean delete(String dat){
        boolean bandera = false;
        System.out.println("parametros de entrada ==> " +dat);
        ConectionDB con = new ConectionDB();
        try {
            
            Statement st=ConectionDB.getConn().createStatement();
            st.executeUpdate("delete from cat_motor where tipo_motor='"+dat+"'");
            con.cerrar();
            bandera = true;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al datos en la base "+e.getMessage());
            bandera = false;
        }
        return bandera;
    }
}
