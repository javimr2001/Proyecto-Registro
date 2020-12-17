package com.flagship.usuarios;
import com.flagship.Conector;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class usuarios {                                                 // Clase usuarios, creamos el objecto usuarios con los siguientes parámetros.


    private static int id;
    private static String nombre, apellidos, usuario, contraseña, fech_nac, tiempoRegistro;


    public usuarios(String nombre, String apellidos, String usuario, String contraseña, String fech_nac, String tiempoRegistro){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.usuario = usuario;                                 //Constructor público
        this.contraseña = contraseña;
        this.fech_nac = fech_nac;
    }

    public static int getId() {
        return id;                                              //Coger la ID
    }

    public void setId(int id) {
        this.id = id;                                           //Setear una ID
    }

    public static String getNombre() {
        return nombre;                                          //Coger nombre
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;                                   //Setear un nombre
    }

    public static String getApellidos() {
        return apellidos;                                       //Coger apellido
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;                             //Setear apellidos
    }

    public void save(){                                        // Guardar datos en la BBDD
        Conector con = new Conector();                         // Creamos una nueva variable conector para crear la conexion a la BBDD
        con.connect();                                         // Conectamos a la BBDD
        con.saveUser(this);                             // Guardamos el usuario creado mediante una función del conector
        con.close();                                           // Cerramos conexión con la base de datos
    }

    public void delete(){                                      // Borrar la tabla usuarios, mismos pasos que arriba, pero con otra función que hace un DELETE
        Conector con = new Conector();
        con.connect();
        con.deleteAll(this);
        con.close();
    }
}
