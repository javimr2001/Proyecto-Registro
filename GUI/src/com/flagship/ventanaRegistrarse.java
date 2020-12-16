package com.flagship;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ventanaRegistrarse {
    public JPanel panel2;
    private JPasswordField tfContraseña;
    private JPasswordField tfContraseña2;
    private JButton btRegistrarse;
    private JButton btCancelar;
    private JLabel lbNombre;
    private JLabel lbApellidos;
    private JLabel lbNacimiento;
    private JLabel lbUsuario;
    private JLabel lbContraseña;
    private JLabel lbContraseña2;
    private JTextField tfNombre;
    private JTextField tfApellidos;
    private JTextField tfFechaNacimiento;
    private JTextField tfUsuario;

    public ventanaRegistrarse() {
        btRegistrarse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = tfNombre.getText();
                String apellidos = tfApellidos.getText();
                String fech_nac = tfFechaNacimiento.getText();
                String user = tfUsuario.getText();
                String psswd = tfContraseña.getText();
                String psswd2 = tfContraseña2.getText();

                System.out.println("Se ha registrado " + nombre + " " + apellidos + " con usuario = " + user + " , fecha de nacimiento = " + fech_nac + " y contraseña =  " + psswd);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("ventanaRegistrarse");
        frame.setContentPane(new ventanaRegistrarse().panel2);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
