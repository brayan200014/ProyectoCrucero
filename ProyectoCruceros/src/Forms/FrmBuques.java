/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import BuqueCamarote.ClsBuque;
import BuqueCamarote.ClsMetodosBuque;
import Clases.ClsConexion;
import Clases.ClsHelper;
import java.awt.event.*;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author BRAYAN HERNADEZ
 */
public class FrmBuques extends javax.swing.JPanel {

    DefaultTableModel dm;
    private TableRowSorter TRSFiltro;

    ClsConexion conn = new ClsConexion();

    FrmCamarotes frmcama = new FrmCamarotes();
    ClsHelper hp = new ClsHelper();
    ClsMetodosBuque metbuque = new ClsMetodosBuque();
    ClsBuque buque = new ClsBuque();

    public FrmBuques() {
        initComponents();

        btnActualizar.setVisible(false);
        cbBuque.setModel(hp.tipoBuque());
        cbBuque.setSelectedIndex(-1);
        cargarTabla();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtFiltro = new javax.swing.JTextField();
        spCamarotes = new javax.swing.JSpinner();
        spNiveles = new javax.swing.JSpinner();
        spPersonas = new javax.swing.JSpinner();
        cbBuque = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbBuque = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(96, 203, 249));
        setPreferredSize(new java.awt.Dimension(930, 460));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setText("Cantidad Niveles");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setText("Descripción");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setText("Cantidad Personas");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setText("Tipo Buque");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel5.setText("Cantidad Camarotes");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        txtFiltro.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFiltroKeyTyped(evt);
            }
        });
        add(txtFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 510, -1));

        spCamarotes.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        spCamarotes.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        add(spCamarotes, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 60, -1));

        spNiveles.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        spNiveles.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        add(spNiveles, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 60, -1));

        spPersonas.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        spPersonas.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        add(spPersonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 60, -1));

        cbBuque.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        add(cbBuque, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 260, -1));

        tbBuque.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        tbBuque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Descripción", "Camarotes", "Niveles", "Personas", "Tipo Buque"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbBuque);
        if (tbBuque.getColumnModel().getColumnCount() > 0) {
            tbBuque.getColumnModel().getColumn(0).setResizable(false);
            tbBuque.getColumnModel().getColumn(1).setResizable(false);
            tbBuque.getColumnModel().getColumn(2).setResizable(false);
            tbBuque.getColumnModel().getColumn(3).setResizable(false);
            tbBuque.getColumnModel().getColumn(4).setResizable(false);
            tbBuque.getColumnModel().getColumn(5).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 100, 510, 300));

        btnEditar.setBackground(new java.awt.Color(12, 69, 104));
        btnEditar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Icono Editar.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnEditar.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, 140, 40));

        btnEliminar.setBackground(new java.awt.Color(12, 69, 104));
        btnEliminar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Basurero.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 420, 140, 40));

        btnAgregar.setBackground(new java.awt.Color(12, 69, 104));
        btnAgregar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/agregar25x25.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnAgregar.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, 140, 40));

        btnActualizar.setBackground(new java.awt.Color(12, 69, 104));
        btnActualizar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/actualizar.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnActualizar.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 420, 160, 40));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel6.setText("Búsqueda");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, -1));

        txtDescripcion.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyTyped(evt);
            }
        });
        add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 250, -1));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void busqueda() {
        int columnaTabla = 1;
        TRSFiltro.setRowFilter(RowFilter.regexFilter("(?i)" + txtFiltro.getText(), columnaTabla));

    }

    private void cargarDatos() {
        buque.setDescripcion(txtDescripcion.getText());
        buque.setCamarotes((int) (spCamarotes.getValue()));
        buque.setNiveles((int) (spNiveles.getValue()));
        buque.setPersonas((int) (spPersonas.getValue()));
        buque.setTipoBuque(cbBuque.getSelectedIndex() + 1);
    }

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        if (txtDescripcion.getText().length() == 0 || spCamarotes.getValue().equals(0) || spNiveles.getValue().equals(0)
                || spPersonas.getValue().equals(0) || cbBuque.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, " Favor llenar todos campos", "ERROR", JOptionPane.ERROR_MESSAGE);

        } else {
            buque.setDescripcion(txtDescripcion.getText());

            if (metbuque.existente() == true) {
                JOptionPane.showMessageDialog(null, "Buque ya existente", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                cargarDatos();
                metbuque.insertar();
                limpiar();
                cargarTabla();
                frmcama.cargarBuques();
            }
        }


    }//GEN-LAST:event_btnAgregarActionPerformed

    private void limpiar() {
        txtDescripcion.setText(null);
        spCamarotes.setValue(0);
        spNiveles.setValue(0);
        spPersonas.setValue(0);
        cbBuque.setSelectedIndex(-1);
    }

    private void cargarTabla() {
        DefaultTableModel modeloTabla = (DefaultTableModel) tbBuque.getModel();
        modeloTabla.setRowCount(0);

        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;

        int[] anchos = {10, 100, 35, 30, 30, 100};
        for (int i = 0; i < tbBuque.getColumnCount(); i++) {
            tbBuque.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }

        try {
            Connection cn = conn.obtenerConexion();
            ps = cn.prepareStatement("select b.codigo_buque, \n"
                    + "b.descripcion, \n"
                    + "b.cantidad_camarotes, \n"
                    + "b.cantidad_niveles, \n"
                    + "b.cantidad_personas, \n"
                    + "tb.descripcion\n"
                    + "from Buques b join [dbo].[Tipo_Buque] tb\n"
                    + "on b.codigo_tipo_buque = tb.codigo_tipo_buque\n"
                    + "where estado = 1");

            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            columnas = rsmd.getColumnCount();

            while (rs.next()) {
                Object[] fila = new Object[columnas];

                for (int indice = 0; indice < columnas; indice++) {
                    fila[indice] = rs.getObject(indice + 1);
                }
                modeloTabla.addRow(fila);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    private void txtFiltroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyTyped

        char c = evt.getKeyChar();

        if (Character.isDigit(c)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Sólo se admiten letras", "WARNING", JOptionPane.WARNING_MESSAGE);
        } else {
            txtFiltro.addKeyListener(new KeyAdapter() {

                @Override
                public void keyReleased(final KeyEvent e) {
                    String cadena = (txtFiltro.getText());
                    txtFiltro.setText(cadena);
                    busqueda();
                }
            });

            TRSFiltro = new TableRowSorter(tbBuque.getModel());
            tbBuque.setRowSorter(TRSFiltro);
        }


    }//GEN-LAST:event_txtFiltroKeyTyped

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        if (tbBuque.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione una fila para editar", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            int fila = tbBuque.getSelectedRow();
            int id = Integer.parseInt(tbBuque.getValueAt(fila, 0).toString());

            try {
                Connection cn = conn.obtenerConexion();

                btnAgregar.setVisible(false);
                btnEditar.setVisible(false);
                btnEliminar.setVisible(false);
                btnActualizar.setVisible(true);

                PreparedStatement ps;
                ResultSet rs;

                ps = cn.prepareStatement(" select b.descripcion, \n"
                        + " b.cantidad_camarotes,\n"
                        + " b.cantidad_niveles, \n"
                        + " b.cantidad_personas, \n"
                        + " tb.descripcion as buque\n"
                        + " from Buques b join [dbo].[Tipo_Buque] tb \n"
                        + " on b.codigo_tipo_buque = tb.codigo_tipo_buque\n"
                        + " where codigo_buque = ? and estado = 1");

                ps.setInt(1, id);
                rs = ps.executeQuery();

                while (rs.next()) {
                    txtDescripcion.setText(rs.getString("descripcion"));
                    spCamarotes.setValue(rs.getInt("cantidad_camarotes"));
                    spNiveles.setValue(rs.getInt("cantidad_niveles"));
                    spPersonas.setValue(rs.getInt("cantidad_personas"));
                    cbBuque.setSelectedItem(rs.getString("buque"));
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }

        }


    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        if (txtDescripcion.getText().length() == 0 || spCamarotes.getValue().equals(0) || spNiveles.getValue().equals(0)
                || spPersonas.getValue().equals(0) || cbBuque.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, " Favor llenar todos campos", "ERROR", JOptionPane.ERROR_MESSAGE);

        } else {
            int fila = tbBuque.getSelectedRow();
            buque.setCodigo(Integer.parseInt(tbBuque.getValueAt(fila, 0).toString()));

            cargarDatos();
            metbuque.editar();
            limpiar();
            cargarTabla();

            btnAgregar.setVisible(true);
            btnEditar.setVisible(true);
            btnEliminar.setVisible(true);
            btnActualizar.setVisible(false);
        }

    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        if (tbBuque.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione una fila para eliminar", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            int fila = tbBuque.getSelectedRow();
            buque.setCodigo(Integer.parseInt(tbBuque.getValueAt(fila, 0).toString()));

            metbuque.eliminar();
            cargarTabla();
            frmcama.cargarBuques();
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyTyped

        char c = evt.getKeyChar();

        if (Character.isDigit(c)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Sólo se admiten letras", "WARNING", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_txtDescripcionKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       FrmReservaciones reser = new FrmReservaciones();
       
       reser.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<String> cbBuque;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spCamarotes;
    private javax.swing.JSpinner spNiveles;
    private javax.swing.JSpinner spPersonas;
    private javax.swing.JTable tbBuque;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtFiltro;
    // End of variables declaration//GEN-END:variables
}
