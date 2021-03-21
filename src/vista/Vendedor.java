/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import config.Conexion;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Samuel Colmenares.
 */
public class Vendedor {

    private final Conexion con;
    private Connection cn;
    private Statement st;

    public Vendedor(Conexion conexion) {
        con = conexion;
    }

    public void AgregarVen(String nom, String ide) {
        if (nom.isBlank() || ide.isBlank()) {
            JOptionPane.showMessageDialog(null, "La Tabla esta Vacia...!!!");
        } else {
            String sql = "INSERT INTO VENDEDOR(nom_vendedor,identificacion)VALUES('" + nom + "','" + ide + "')";
            try {
                cn = con.getConnection();
                st = cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Vendedor Agregado...!!!");

            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public void modificarVen(String nom, String ide, String idVendedor) {
        String sql = "UPDATE VENDEDOR SET nom_vendedor='" + nom + "',identificacion='" + ide + "' WHERE idVendedor=" + idVendedor;
        if (nom.isBlank() || ide.isBlank()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar Datos");
        } else {
            try {
                cn = con.getConnection();
                st = cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Usuario Actualizado");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public void eliminarVen(String idVendedor) {
        if (idVendedor.isBlank()) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar fila");
        } else {
            String sql = "DELETE FROM vendedor WHERE idVendedor=" + idVendedor;
            try {
                cn = con.getConnection();
                st = cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Usuario Eliminado con exito...!!!");
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }
}
