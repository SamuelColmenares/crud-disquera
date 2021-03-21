package vista;

import config.Conexion;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author epena
 */
public final class Principal extends javax.swing.JFrame {

    Conexion con = new Conexion();
    Connection cn;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;
    int id;
    
    public Principal() {
        initComponents();
        setLocationRelativeto(null);
        Listar();
        ListarPro();
        ListarVen();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNomArt = new javax.swing.JTextField();
        txtIdentArt = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtNomProd = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtIdentProd = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNomVend = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtIdentVend = new javax.swing.JTextField();
        btnAgreArt = new javax.swing.JButton();
        btnAgreProd = new javax.swing.JButton();
        btnModificarP = new javax.swing.JButton();
        btnEliminarP = new javax.swing.JButton();
        btnAgreVend = new javax.swing.JButton();
        btnModificarV = new javax.swing.JButton();
        btnEliminarV = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDatos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaDatosVen = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaDatosPro = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        txtidArt = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnNuevo1 = new javax.swing.JButton();
        btnNuevo2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtidPro = new javax.swing.JTextField();
        txtidVen = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Disquera CRUD");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jLabel2.setText("Nombre Artista:");

        jLabel3.setText("Identificación:");

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel4.setText("Nombre Productor:");

        jLabel5.setText("Identificación:");

        jLabel6.setText("Nombre Vendedor:");

        jLabel7.setText("Identificación:");

        btnAgreArt.setText("Agregar");
        btnAgreArt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgreArtActionPerformed(evt);
            }
        });

        btnAgreProd.setText("Agregar");
        btnAgreProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgreProdActionPerformed(evt);
            }
        });

        btnModificarP.setText("Modificar");
        btnModificarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarPActionPerformed(evt);
            }
        });

        btnEliminarP.setText("Eliminar");
        btnEliminarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPActionPerformed(evt);
            }
        });

        btnAgreVend.setText("Agregar");
        btnAgreVend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgreVendActionPerformed(evt);
            }
        });

        btnModificarV.setText("Modificar");
        btnModificarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarVActionPerformed(evt);
            }
        });

        btnEliminarV.setText("Eliminar");
        btnEliminarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarVActionPerformed(evt);
            }
        });

        TablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre Artista", "Identificación"
            }
        ));
        TablaDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaDatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaDatos);
        if (TablaDatos.getColumnModel().getColumnCount() > 0) {
            TablaDatos.getColumnModel().getColumn(0).setMinWidth(50);
            TablaDatos.getColumnModel().getColumn(0).setPreferredWidth(50);
            TablaDatos.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        TablaDatosVen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre Vendedor", "Identificación"
            }
        ));
        TablaDatosVen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaDatosVenMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TablaDatosVen);
        if (TablaDatosVen.getColumnModel().getColumnCount() > 0) {
            TablaDatosVen.getColumnModel().getColumn(0).setMinWidth(50);
            TablaDatosVen.getColumnModel().getColumn(0).setPreferredWidth(50);
            TablaDatosVen.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        TablaDatosPro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre Productor", "Identificación"
            }
        ));
        TablaDatosPro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaDatosProMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TablaDatosPro);
        if (TablaDatosPro.getColumnModel().getColumnCount() > 0) {
            TablaDatosPro.getColumnModel().getColumn(0).setMinWidth(50);
            TablaDatosPro.getColumnModel().getColumn(0).setPreferredWidth(50);
            TablaDatosPro.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        jLabel8.setText("ID:");

        txtidArt.setEditable(false);
        txtidArt.setEnabled(false);

        btnNuevo.setText("Limpiar");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnNuevo1.setText("Limpiar");
        btnNuevo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevo1ActionPerformed(evt);
            }
        });

        btnNuevo2.setText("Limpiar");
        btnNuevo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevo2ActionPerformed(evt);
            }
        });

        jLabel9.setText("ID:");

        txtidPro.setEditable(false);
        txtidPro.setEnabled(false);

        txtidVen.setEditable(false);
        txtidVen.setEnabled(false);

        jLabel10.setText("ID:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel8))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNomArt, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                                    .addComponent(txtidArt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIdentArt)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(94, 94, 94)
                                .addComponent(txtidPro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtNomProd, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtIdentProd, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgreProd)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnAgreVend)
                                    .addGap(36, 36, 36)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnNuevo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnModificarV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(28, 28, 28)
                                    .addComponent(btnEliminarV)
                                    .addGap(75, 75, 75)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnAgreArt)
                                    .addGap(36, 36, 36)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(28, 28, 28)
                                    .addComponent(btnEliminar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(btnModificarP))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(452, 452, 452)
                                                .addComponent(btnNuevo1, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)))
                                        .addGap(28, 28, 28)
                                        .addComponent(btnEliminarP)
                                        .addGap(66, 66, 66))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtidVen, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtIdentVend, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNomVend, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnModificar)
                                .addComponent(btnAgreArt)
                                .addComponent(btnEliminar)
                                .addComponent(txtidArt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtNomArt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtIdentArt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnNuevo)))
                        .addGap(90, 90, 90)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(txtidPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnAgreProd)
                                    .addComponent(btnModificarP)
                                    .addComponent(btnEliminarP))
                                .addGap(24, 24, 24)
                                .addComponent(btnNuevo1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtNomProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtIdentProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(102, 102, 102)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtidVen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(8, 8, 8)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtNomVend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnModificarV)
                            .addComponent(btnAgreVend)
                            .addComponent(btnEliminarV))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(txtIdentVend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnNuevo2))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(538, 538, 538)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgreArtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgreArtActionPerformed
        AgregarArt();
        Listar();
        nuevo();
    }//GEN-LAST:event_btnAgreArtActionPerformed

    private void btnAgreProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgreProdActionPerformed
        AgregarProd();
        ListarPro();
        nuevoP();
    }//GEN-LAST:event_btnAgreProdActionPerformed

    private void btnAgreVendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgreVendActionPerformed
        AgregarVen();
        ListarVen();
        nuevoV();
    }//GEN-LAST:event_btnAgreVendActionPerformed

    private void TablaDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDatosMouseClicked
        int fila = TablaDatos.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Usuario no Seleccionado");
        } else {
            int id = Integer.parseInt((String) TablaDatos.getValueAt(fila, 0).toString());
            String nom = (String) TablaDatos.getValueAt(fila, 1);
            String ide = (String) TablaDatos.getValueAt(fila, 2);
            txtidArt.setText("" + id);
            txtNomArt.setText(nom);
            txtIdentArt.setText(ide);
        }
    }//GEN-LAST:event_TablaDatosMouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        modificarArt();
        Listar();
        nuevo();
    }//GEN-LAST:event_btnModificarActionPerformed
   
    void modificarArt() {
        String nom = txtNomArt.getText();
        String ide = txtIdentArt.getText();
        String artistaId = txtidArt.getText();
        String sql = "UPDATE ARTISTA SET nom_artista='" + nom + "',identificacion='" + ide + "' WHERE idArtista=" + artistaId;
        if (nom.equals("") || ide.equals("")) {
            JOptionPane.showMessageDialog(null, "Debe ingresar Datos");
        } else {
            try {
                cn = con.getConnection();
                st = cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Usuario Actualizado");
                LimpiarTabla();
            } catch (Exception e) {

            }
        }

    }

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminarArt();
        Listar();
        nuevo();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        nuevo();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnNuevo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevo1ActionPerformed
        nuevoP();
    }//GEN-LAST:event_btnNuevo1ActionPerformed

    private void btnNuevo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevo2ActionPerformed
        nuevoV();
    }//GEN-LAST:event_btnNuevo2ActionPerformed

    private void TablaDatosProMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDatosProMouseClicked
        int fila = TablaDatosPro.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Usuario no Seleccionado");
        } else {
            int id = Integer.parseInt((String) TablaDatosPro.getValueAt(fila, 0).toString());
            String nom = (String) TablaDatosPro.getValueAt(fila, 1);
            String ide = (String) TablaDatosPro.getValueAt(fila, 2);
            txtidPro.setText("" + id);
            txtNomProd.setText(nom);
            txtIdentProd.setText(ide);
        }
    }//GEN-LAST:event_TablaDatosProMouseClicked

    private void btnModificarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarPActionPerformed
        modificarPro();
        ListarPro();
        nuevoP();
    }//GEN-LAST:event_btnModificarPActionPerformed
    void modificarPro() {
        String nom = txtNomProd.getText();
        String ide = txtIdentProd.getText();
        String idProductor = txtidPro.getText();
        String sql = "UPDATE PRODUCTOR SET nom_productor='" + nom + "',identificacion='" + ide + "' WHERE idProductor=" + idProductor;
        if (nom.equals("") || ide.equals("")) {
            JOptionPane.showMessageDialog(null, "Debe ingresar Datos");
        } else {
            try {
                cn = con.getConnection();
                st = cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Usuario Actualizado");
                LimpiarTablaPro();
            } catch (Exception e) {

            }
        }

    }


    private void btnEliminarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPActionPerformed
        eliminarPro();
        ListarPro();
        nuevoP();
    }//GEN-LAST:event_btnEliminarPActionPerformed

    private void TablaDatosVenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDatosVenMouseClicked
        int fila = TablaDatosVen.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Usuario no Seleccionado");
        } else {
            int id = Integer.parseInt((String) TablaDatosVen.getValueAt(fila, 0).toString());
            String nom = (String) TablaDatosVen.getValueAt(fila, 1);
            String ide = (String) TablaDatosVen.getValueAt(fila, 2);
            txtidVen.setText("" + id);
            txtNomVend.setText(nom);
            txtIdentVend.setText(ide);
        }
    }//GEN-LAST:event_TablaDatosVenMouseClicked

    private void btnModificarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarVActionPerformed
        modificarVen();
        ListarVen();
        nuevoV();
    }//GEN-LAST:event_btnModificarVActionPerformed

    private void btnEliminarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarVActionPerformed
        eliminarVen();
        ListarVen();
        nuevoV();
    }//GEN-LAST:event_btnEliminarVActionPerformed
    void modificarVen() {
        String nom = txtNomVend.getText();
        String ide = txtIdentVend.getText();
        String idVendedor = txtidVen.getText();
        String sql = "UPDATE VENDEDOR SET nom_vendedor='" + nom + "',identificacion='" + ide + "' WHERE idVendedor=" + idVendedor;
        if (nom.equals("") || ide.equals("")) {
            JOptionPane.showMessageDialog(null, "Debe ingresar Datos");
        } else {
            try {
                cn = con.getConnection();
                st = cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Usuario Actualizado");
                LimpiarTablaVen();
            } catch (Exception e) {

            }
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    void Listar() {
        String sql = "SELECT *FROM ARTISTA";

        try {
            cn = con.getConnection();
            st = cn.createStatement();
            rs = st.executeQuery(sql);

            Object[] artistas = new Object[3];
            modelo = (DefaultTableModel) TablaDatos.getModel();
            while (rs.next()) {
                artistas[0] = rs.getInt("idArtista");
                artistas[1] = rs.getString("nom_artista");
                artistas[2] = rs.getString("identificacion");
                modelo.addRow(artistas);

            }
            TablaDatos.setModel(modelo);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    void ListarPro() {
        String sql = "SELECT *FROM PRODUCTOR";

        try {
            cn = con.getConnection();
            st = cn.createStatement();
            rs = st.executeQuery(sql);

            Object[] productor = new Object[3];
            modelo = (DefaultTableModel) TablaDatosPro.getModel();
            while (rs.next()) {
                productor[0] = rs.getInt("idProductor");
                productor[1] = rs.getString("nom_productor");
                productor[2] = rs.getString("identificacion");
                modelo.addRow(productor);

            }
            TablaDatosPro.setModel(modelo);
        } catch (Exception e) {

        }

    }

    void ListarVen() {
        String sql = "SELECT *FROM VENDEDOR";

        try {
            cn = con.getConnection();
            st = cn.createStatement();
            rs = st.executeQuery(sql);

            Object[] vendedor = new Object[3];
            modelo = (DefaultTableModel) TablaDatosVen.getModel();
            while (rs.next()) {
                vendedor[0] = rs.getInt("idVendedor");
                vendedor[1] = rs.getString("nom_vendedor");
                vendedor[2] = rs.getString("identificacion");
                modelo.addRow(vendedor);

            }
            TablaDatosVen.setModel(modelo);
        } catch (Exception e) {

        }

    }

    
    void AgregarArt() {
        String nom = txtNomArt.getText();
        String ide = txtIdentArt.getText();
        if (nom.equals("") || ide.equals("")) {
            JOptionPane.showMessageDialog(null, "La Tabla esta Vacia...!!!");
        } else {
            String sql = "INSERT INTO ARTISTA(nom_artista,identificacion)VALUES('" + nom + "','" + ide + "')";
            try {
                cn = con.getConnection();
                st = cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Artista Agregado...!!!");
                LimpiarTabla();
            } catch (Exception e) {

            }
        }
    }

    void LimpiarTabla() {
        modelo = (DefaultTableModel) TablaDatos.getModel();
        for (int i = 0; i <= TablaDatos.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

   
    void eliminarArt() {
        int filaseleccionado = TablaDatos.getSelectedRow();

        if (filaseleccionado == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar fila");
        } else {
            String artistaId = txtidArt.getText();
            String sql = "DELETE FROM ARTISTA WHERE idArtista=" + artistaId;
            try {
                cn = con.getConnection();
                st = cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Usuario Eliminado con exito...!!!");
                LimpiarTabla();
            } catch (Exception e) {

            }

        }
    }
    
    void nuevo() {
        txtidArt.setText("");
        txtNomArt.setText("");
        txtIdentArt.setText("");
        txtNomArt.requestFocus();
    }

    void AgregarProd() {
        String nom = txtNomProd.getText();
        String ide = txtIdentProd.getText();
        if (nom.equals("") || ide.equals("")) {
            JOptionPane.showMessageDialog(null, "La Tabla esta Vacia...!!!");
        } else {
            String sql = "INSERT INTO PRODUCTOR(nom_productor,identificacion)VALUES('" + nom + "','" + ide + "')";
            try {
                cn = con.getConnection();
                st = cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Productor Agregado...!!!");
                LimpiarTablaPro();
            } catch (Exception e) {

            }
        }
    }

    void LimpiarTablaPro() {
        modelo = (DefaultTableModel) TablaDatosPro.getModel();
        for (int i = 0; i <= TablaDatosPro.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    void eliminarPro() {
        int filaseleccionado = TablaDatosPro.getSelectedRow();

        if (filaseleccionado == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar fila");
        } else {
            String idProductor = txtidPro.getText();
            String sql = "DELETE FROM PRODUCTOR WHERE idProductor=" + idProductor;
            try {
                cn = con.getConnection();
                st = cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Usuario Eliminado con exito...!!!");
                LimpiarTablaPro();
            } catch (Exception e) {

            }

        }
    }

    void nuevoP() {
        txtidPro.setText("");
        txtNomProd.setText("");
        txtIdentProd.setText("");
        txtNomProd.requestFocus();
    }

    void AgregarVen() {
        String nom = txtNomVend.getText();
        String ide = txtIdentVend.getText();
        if (nom.equals("") || ide.equals("")) {
            JOptionPane.showMessageDialog(null, "La Tabla esta Vacia...!!!");
        } else {
            String sql = "INSERT INTO VENDEDOR(nom_vendedor,identificacion)VALUES('" + nom + "','" + ide + "')";
            try {
                cn = con.getConnection();
                st = cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Vendedor Agregado...!!!");
                LimpiarTablaVen();
            } catch (Exception e) {

            }
        }
    }

    void LimpiarTablaVen() {
        modelo = (DefaultTableModel) TablaDatosVen.getModel();
        for (int i = 0; i <= TablaDatosVen.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    void eliminarVen() {
        int filaseleccionado = TablaDatosVen.getSelectedRow();

        if (filaseleccionado == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar fila");
        } else {
            String idVendedor = txtidVen.getText();
            String sql = "DELETE FROM vendedor WHERE idVendedor=" + idVendedor;
            try {
                cn = con.getConnection();
                st = cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Usuario Eliminado con exito...!!!");
                LimpiarTablaVen();
            } catch (Exception e) {

            }

        }
    }

    void nuevoV() {
        txtidVen.setText("");
        txtNomVend.setText("");
        txtIdentVend.setText("");
        txtNomVend.requestFocus();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaDatos;
    private javax.swing.JTable TablaDatosPro;
    private javax.swing.JTable TablaDatosVen;
    private javax.swing.JButton btnAgreArt;
    private javax.swing.JButton btnAgreProd;
    private javax.swing.JButton btnAgreVend;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminarP;
    private javax.swing.JButton btnEliminarV;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnModificarP;
    private javax.swing.JButton btnModificarV;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnNuevo1;
    private javax.swing.JButton btnNuevo2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField txtIdentArt;
    private javax.swing.JTextField txtIdentProd;
    private javax.swing.JTextField txtIdentVend;
    private javax.swing.JTextField txtNomArt;
    private javax.swing.JTextField txtNomProd;
    private javax.swing.JTextField txtNomVend;
    private javax.swing.JTextField txtidArt;
    private javax.swing.JTextField txtidPro;
    private javax.swing.JTextField txtidVen;
    // End of variables declaration//GEN-END:variables

    private void setLocationRelativeto(Object object) {
        //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
