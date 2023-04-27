/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import conn.ConectionDB;
import entities.entityLogin;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author jonix
 */
public class controlLogin {
    public entityLogin getID(String user, String pass) throws SQLException{
        entityLogin entity = new entityLogin();
        entity.setBandera(false);
        String usua="";
        String clave="";
        String rol ="";
        String consulta="select usuario,clave,nombres,id_rol,alias_empleado,area from loguin lo\n" +
        "inner join reg_usuario reg\n" +
        "on lo.id_loguin = reg.id_loguin\n" +
        "where usuario = '"+user+"'";
        ConectionDB con = new ConectionDB();
        try {
            System.out.println(consulta);      
            Statement sentencia=ConectionDB.getConn().createStatement();
            ResultSet resultado=sentencia.executeQuery(consulta);
            while (resultado.next())
            {
                System.out.println (resultado.getObject("usuario") );
                usua = resultado.getString("usuario");
                clave = resultado.getString("clave");
                rol = resultado.getString("id_rol");
            }
            if(user.equalsIgnoreCase(usua) && pass.equalsIgnoreCase(clave)){
                entity.setBandera(true);
                entity.setRol(rol);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al consultar datos en la base tipo  "+e.getMessage());
           
            con.cerrar();
        }
        return entity;
    }
    
    public String getIDLOguin(String user) throws SQLException{
        entityLogin entity = new entityLogin();
        entity.setBandera(false);
        String rol ="";
        String consulta="select * from loguin where usuario='"+user+"'";
        ConectionDB con = new ConectionDB();
        try {
            System.out.println(consulta);      
            Statement sentencia=ConectionDB.getConn().createStatement();
            ResultSet resultado=sentencia.executeQuery(consulta);
            while (resultado.next())
            {
                System.out.println (resultado.getObject("usuario") );
                
                rol = resultado.getString("id_loguin");
            }
           
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al consultar datos en la base tipo  "+e.getMessage());
           
            con.cerrar();
        }
        return rol;
    }
}
