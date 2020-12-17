package com.flagship;
import java.sql.*;
import java.util.logging.*;
import com.flagship.usuarios.*;


public class Conector {

    //String url = "C:\\Users\\javi\\Documents\\GitHub\\Proyecyo-Registro\\GUI\\src\\com\\flagship\\registroSQL.db"; //Portátil
    String url = "D:\\GitHub\\Proyecyo-Registro\\GUI\\src\\com\\flagship\\registroSQL.db"; //Clónico
    Connection connect;

    public void connect(){          // Función para conectarnos a la base de datos mediante un try-catch, especificando la ruta de acceso mediante el string url
        try {
            connect = DriverManager.getConnection("jdbc:sqlite:"+url);
            if (connect!=null) {
                System.out.println("Conectado");
            }
        }catch (SQLException ex) {
            System.err.println("No se ha podido conectar a la base de datos\n"+ex.getMessage());
        }
    }
    public void close(){            // Función para cerrar la conexión a la base de datos
        try {
            connect.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void saveUser(usuarios usuario){  // Función para guardar el objecto creado y guardado en la ventanaRegistrarse en la BBDD
        try {
            PreparedStatement st = connect.prepareStatement("insert into usuarios (id, nombre, apellidos) values (?,?,?,?,?,?)"); //Statement de la BBDD
            st.setInt(1, usuarios.getId());           // Cogemos los datos con las funciones get del objecto Usuario
            st.setString(2, usuarios.getNombre());
            st.setString(3, usuarios.getApellidos());
            st.execute();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    public void deleteAll(usuarios usuario){                //Mismas sentencias que arriba, pero con un DELETE para borrar la base de datos (Opciones de desarrollador)
        try {
            PreparedStatement st = connect.prepareStatement("delete from usuarios;");
            st.execute();
        } catch (SQLException ex){
            System.err.println(ex.getMessage());
        }
    }


}
