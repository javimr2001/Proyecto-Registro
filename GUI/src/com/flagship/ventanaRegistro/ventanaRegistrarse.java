package com.flagship.ventanaRegistro;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.flagship.Conector;
import com.flagship.usuarios.usuarios;

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

                 if (nombre.equals("") || apellidos.equals("") || fech_nac.equals("") || user.equals("") || psswd.equals("") || psswd2.equals("")){
                    tfNombre.setText("");
                    tfApellidos.setText("");
                    tfFechaNacimiento.setText("");
                    tfContraseña.setText("");
                    tfUsuario.setText("");
                    tfContraseña2.setText("");
                     JOptionPane.showMessageDialog(tfApellidos, "Rellena todos los campos.", "Error", 1);
                } else if (!psswd.equals(psswd2)){
                     tfNombre.setText("");
                     tfApellidos.setText("");
                     tfFechaNacimiento.setText("");
                     tfContraseña.setText("");
                     tfUsuario.setText("");
                     tfContraseña2.setText("");
                     JOptionPane.showMessageDialog(tfApellidos, "Las contraseñas no son iguales.", "Error", 1);
                 }

                 usuarios usuario = new usuarios(nombre, apellidos, user, psswd, fech_nac, "0");
                 usuario.save();
            }
        });
    }

    public static void main(String[] args) {
    }
}
