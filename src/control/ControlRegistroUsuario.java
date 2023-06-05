/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import conn.ConectionDB;
import entities.EntityRegistroUsuarios;
import java.sql.Statement;

/**
 *
 * @author cesar
 */
public class ControlRegistroUsuario {

    public boolean process(EntityRegistroUsuarios registroUsuario, String id) {
        boolean flag = false;
        System.out.println("parametros de entrada ==> " + registroUsuario.toString());
        ConectionDB con = new ConectionDB();
        try {

            Statement st = ConectionDB.getConn().createStatement();
            st.executeUpdate("insert into reg_usuario(id_loguin,nombres,alias_empleado,id_rol,area) value('" + id + "','" + registroUsuario.getNombre()
                    + "','" + registroUsuario.getAlias() + "'," + registroUsuario.getRol() + "," + registroUsuario.getArea() + ")");

            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al guardar datos en la base " + e.getMessage());
            flag = false;
        }
        return flag;
    }

    public boolean processLoguin(String usuario, String clave) {
        boolean flag = false;
        System.out.println("parametros de entrada ==> ");
        ConectionDB con = new ConectionDB();
        try {

            Statement st = ConectionDB.getConn().createStatement();
            st.executeUpdate("insert into loguin(usuario,clave) value('" + usuario + "','" + clave + "')");
            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al guardar datos en la base " + e.getMessage());
            flag = false;
        }
        return flag;
    }

}
