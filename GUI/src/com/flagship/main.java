package com.flagship;
import com.flagship.usuarios.*;
import com.flagship.ventanaRegistro.ventanaRegistrarse;

import java.sql.*;
import javax.swing.*;

public class main {

    public static void main (String[] args){

        Conector con = new Conector();
        con.connect();

        JFrame frame = new JFrame("ventanaRegistrarse");
        frame.setContentPane(new ventanaRegistrarse().panel2);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


        con.close();

    }


}





