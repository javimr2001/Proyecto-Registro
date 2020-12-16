package com.flagship.ventanaRegistro;

import com.flagship.ventanaRegistrarse;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.Principal;

public class ventana {
    private JPanel panel1;
    private JTextField tfUser;
    private JPasswordField tfContraseña;
    private JButton btRegistrarse;
    private JButton btIniciarsesion;
    private JLabel lbUser;
    private JLabel lbPsswd;
    private JButton btCancelar;


    public ventana() {
        btIniciarsesion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ventanaRegistrarse();
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("ventana");
        frame.setContentPane(new ventana().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
