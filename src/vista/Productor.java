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
public class Productor {
    private final Conexion con;
    private Connection cn;
    private Statement st;

    public Productor(Conexion conexion) {
        con = conexion;
    }
    
    
    public void AgregarProd(String nom,String ide) {
        if (nom.equals("") || ide.equals("")) {
            JOptionPane.showMessageDialog(null, "La Tabla esta Vacia...!!!");
        } else {
            String sql = "INSERT INTO PRODUCTOR(nom_productor,identificacion)VALUES('" + nom + "','" + ide + "')";
            try {
                cn = con.getConnection();
                st = cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Productor Agregado...!!!");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    
    public void modificarPro(String nom, String ide, String idProductor) {
        String sql = "UPDATE PRODUCTOR SET nom_productor='" + nom + "',identificacion='" + ide + "' WHERE idProductor=" + idProductor;
        if (nom.equals("") || ide.equals("")) {
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
    
    public void eliminarPro(String idProductor) {
        if (idProductor.isBlank()) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar fila");
        } else {
            String sql = "DELETE FROM PRODUCTOR WHERE idProductor=" + idProductor;
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
