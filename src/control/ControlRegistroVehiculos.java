/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import conn.ConectionDB;
import entities.EntityRegistroVehiculos;
import java.sql.Statement;

/**
 *
 * @author cesar
 */
public class ControlRegistroVehiculos {
        public boolean process(EntityRegistroVehiculos registroVehiculo){
        boolean flag = false;
        System.out.println("parametros de entrada ==> " +registroVehiculo.toString());
        ConectionDB con = new ConectionDB();
        try {
            
            Statement st=ConectionDB.getConn().createStatement();
            st.executeUpdate("INSERT INTO vehiculo(id_tipo_vehi,id_motor,id_marca,transmision,modelo,precio,año) value("+
                    registroVehiculo.getTipoCarro()+","+registroVehiculo.getTipoMotor()+","+registroVehiculo.getMarca()+","+
                    registroVehiculo.getTranss()+",'"+registroVehiculo.getModelo()+"',"+registroVehiculo.getPrecio()+",'"+registroVehiculo.getAnio()+"')");
            
            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al guardar datos en la base "+e.getMessage());
            flag = false;
        }
        return flag;
    }
}
