package com.flagship;
import java.sql.*;
import java.util.logging.*;
import com.flagship.usuarios.*;

public class Conector {

    String url = "C:\\Users\\javi\\Documents\\GitHub\\Proyecyo-Registro\\GUI\\src\\com\\flagship\\registroSQL.db";
    Connection connect;

    public void connect(){
        try {
            connect = DriverManager.getConnection("jdbc:sqlite:"+url);
            if (connect!=null) {
                System.out.println("Conectado");
            }
        }catch (SQLException ex) {
            System.err.println("No se ha podido conectar a la base de datos\n"+ex.getMessage());
        }
    }
    public void close(){
        try {
            connect.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void saveUser(usuarios usuario){
        try {
            PreparedStatement st = connect.prepareStatement("insert into usuarios (nombre, apellidos) values (?,?)");
            st.setString(1, usuarios.getNombre());
            st.setString(2, usuarios.getApellidos());
            st.execute();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }


}
