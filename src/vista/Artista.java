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
public class Artista {

    private final Conexion con;
    private Connection cn;
    private Statement st;

    public Artista(Conexion conexion) {
        con = conexion;
    }

    public void AgregarArt(String nom, String ide) {
        if (nom.equals("") || ide.equals("")) {
            JOptionPane.showMessageDialog(null, "La Tabla esta Vacia...!!!");
        } else {
            String sql = "INSERT INTO ARTISTA(nom_artista,identificacion)VALUES('" + nom + "','" + ide + "')";
            try {
                cn = con.getConnection();
                st = cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Artista Agregado...!!!");

            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public void modificarArt(String nom, String ide, String artistaId) {
        String sql = "UPDATE ARTISTA SET nom_artista='" + nom + "',identificacion='" + ide + "' WHERE idArtista=" + artistaId;
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

    public void eliminarArt(String artistaId) {
        if (artistaId.isBlank()) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar fila");
        } else {
            String sql = "DELETE FROM ARTISTA WHERE idArtista=" + artistaId;
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
