package com.flagship.usuarios;

import com.flagship.Conector;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class usuarios {


    private int id;
    private static String nombre, apellidos, usuario, contraseña, fech_nac, tiempoRegistro;


    public usuarios(String nombre, String apellidos, String usuario, String contraseña, String fech_nac, String tiempoRegistro){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.fech_nac = fech_nac;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void save(){
        Conector con = new Conector();
        con.connect();
        con.saveUser(this);
        con.close();
    }
}
