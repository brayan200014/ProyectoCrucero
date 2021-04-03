/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Clases.ClsConexion;
import Clases.PuertosDestinos;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author BRAYAN HERNADEZ
 */
public class FrmDestinos extends javax.swing.JPanel {

    PuertosDestinos puertos = new PuertosDestinos();

    private void limpiar(){
        txtIdDestino.setText("");
        txtPuertoDestino.setText("");
        bgEstadoPuerto.clearSelection();
    } 
    
    private void cargarDatos() {
        puertos.setIdDestino(Integer.parseInt(txtIdDestino.getText()));
        puertos.setPuerto(txtPuertoDestino.getText());
        if (rbActivo.isSelected()) {
            puertos.setEstado("Activo");
        } else if (rbInactivo.isSelected()) {
            puertos.setEstado("Inactivo");
        }
    }

    public int validacion() {
        int v = 0;

        if (txtIdDestino.getText() == null) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese un ID de Destino");
        } else if (txtPuertoDestino.getText() == null) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese un Puerto de Destino");
        } else if (rbActivo.isSelected() == false && rbInactivo.isSelected() == false) {
            JOptionPane.showMessageDialog(null, "Por favor seleccione un Estado de Puerto");
        } else {
            v = 1;
        }

        return v;
    }

    private void cargarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) tblPuertos.getModel();
        modelo.setRowCount(0);

        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;
        
        try {
            Connection con = ClsConexion.obtenerConexion();
            ps = con.prepareStatement("SELECT [codigo_puerto],[descripcion],"
                    + "[codigo_destino],[estado] FROM [dbo].[Puertos-Destinos]");
            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            columnas = rsmd.getColumnCount();

            while (rs.next()) {
                Object[] fila = new Object[columnas];
                for (int i = 0; i < columnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modelo.addRow(fila);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

    /**
     * Creates new form FrmDestinos
     */
    public FrmDestinos() {
        initComponents();
        cargarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgEstadoPuerto = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPuertoDestino = new javax.swing.JTextField();
        txtIdDestino = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPuertos = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        rbActivo = new javax.swing.JRadioButton();
        rbInactivo = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(96, 203, 249));
        setPreferredSize(new java.awt.Dimension(900, 405));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel1.setText("Puerto de Destino: ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel2.setText("Estado: ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        txtPuertoDestino.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        add(txtPuertoDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 150, -1));

        txtIdDestino.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        add(txtIdDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 150, -1));

        btnIngresar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.setPreferredSize(new java.awt.Dimension(95, 25));
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, -1, -1));

        btnEditar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setMinimumSize(new java.awt.Dimension(95, 25));
        btnEditar.setPreferredSize(new java.awt.Dimension(95, 25));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, -1, -1));

        btnLimpiar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setPreferredSize(new java.awt.Dimension(95, 25));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 400, -1, -1));

        btnEliminar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setMinimumSize(new java.awt.Dimension(95, 25));
        btnEliminar.setPreferredSize(new java.awt.Dimension(95, 25));
        add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 400, -1, -1));

        tblPuertos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Puerto", "Puerto", "ID Destino", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPuertos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPuertosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPuertos);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 500, 230));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel4.setText("ID Destino: ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        bgEstadoPuerto.add(rbActivo);
        rbActivo.setText("Activo");
        add(rbActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        bgEstadoPuerto.add(rbInactivo);
        rbInactivo.setText("Inactivo");
        add(rbInactivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        // TODO add your handling code here:

        cargarDatos();
        puertos.ingresar();
        limpiar();
        cargarTabla();


    }//GEN-LAST:event_btnIngresarActionPerformed


    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        
        
        
        
    }//GEN-LAST:event_btnEditarActionPerformed


    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:

        puertos.setIdDestino(Integer.parseInt(txtIdDestino.getText()));
        puertos.setPuerto(txtPuertoDestino.getText());

        puertos.ingresar();

    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void tblPuertosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPuertosMouseClicked
        // TODO add your handling code here:
        try {
            int fila = tblPuertos.getSelectedRow();
            int id = Integer.parseInt(tblPuertos.getValueAt(fila, 0).toString());

            PreparedStatement ps;
            ResultSet rs;
            Connection con = ClsConexion.obtenerConexion();
            ps = con.prepareStatement("SELECT [descripcion],"
                    + "[codigo_destino],[estado] FROM [dbo].[Puertos-Destinos]"
                    + "WHERE [codigo_puerto]=?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            
            while(rs.next()){
                //txt.setText(String.valueOf(id));
                txtPuertoDestino.setText(rs.getString("[descripcion]"));
                txtIdDestino.setText(rs.getString("[codigo_destino]"));
                
            }

        } catch (SQLException ex) {

        }
    }//GEN-LAST:event_tblPuertosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgEstadoPuerto;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbActivo;
    private javax.swing.JRadioButton rbInactivo;
    private javax.swing.JTable tblPuertos;
    private javax.swing.JTextField txtIdDestino;
    private javax.swing.JTextField txtPuertoDestino;
    // End of variables declaration//GEN-END:variables
}
