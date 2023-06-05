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
}
