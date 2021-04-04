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

    private void limpiar() {
        cmbNombreDestino.setSelectedItem(null);
        txtPuertoDestino.setText("");
        bgEstadoPuerto.clearSelection();
    }

    private void cargarDatos() {

        puertos.setDestino(cmbNombreDestino.getSelectedItem().toString());
        puertos.setPuerto(txtPuertoDestino.getText());
        if (rbActivo.isSelected()) {
            puertos.setEstado("Activo");
        } else if (rbInactivo.isSelected()) {
            puertos.setEstado("Inactivo");
        }
    }

    public void validacion() {

        String valorCmb = cmbNombreDestino.getSelectedItem().toString();
        if (valorCmb == null) {
            JOptionPane.showMessageDialog(null, "Por favor Seleccione un Destino");
        } else if (txtPuertoDestino.getText() == null) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese un Puerto de Destino");
        } else if (rbActivo.isSelected() == false && rbInactivo.isSelected() == false) {
            JOptionPane.showMessageDialog(null, "Por favor seleccione un Estado del Puerto");
        }
    }

    public void obtenerCodigo(){

        try{
            Connection con = ClsConexion.obtenerConexion();
            PreparedStatement ps;
            ResultSet rs;
            ps = con.prepareStatement("select codigo_destino from "
                    + "[dbo].[Destinos_Turisticos] where  descripcion=?");
            ps.setString(1, puertos.getDestino());
            rs = ps.executeQuery();
            
            while(rs.next()){
                puertos.setCodDestino(rs.getInt("codigo_destino"));
            }
  
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.toString());    
        }
        
    }
    
    public void obtenerDestino(){
        
        try{
            Connection con = ClsConexion.obtenerConexion();
            PreparedStatement ps;
            ResultSet rs;
            ps = con.prepareStatement("select codigo_destino from "
                    + "[dbo].[Destinos_Turisticos] where  descripcion=?");
            ps.setString(1, puertos.getDestino());
            rs = ps.executeQuery();
            
            while(rs.next()){
                puertos.setCodDestino(rs.getInt("codigo_destino"));
            }
  
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.toString());    
        }
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
            ps = con.prepareStatement("SELECT p.codigo_puerto, p.[descripcion],"
                    + " d.[descripcion] , p.[estado] "
                    + "FROM [dbo].[Puertos-Destinos] p JOIN "
                    + "[dbo].[Destinos_Turisticos] d "
                    + "on p.codigo_destino = d.codigo_destino ");
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

    public FrmDestinos() {
        initComponents();
        cargarTabla();
        cmbNombreDestino.setModel(puertos.getvalues());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgEstadoPuerto = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jToolBar1 = new javax.swing.JToolBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPuertoDestino = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPuertos = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        rbActivo = new javax.swing.JRadioButton();
        rbInactivo = new javax.swing.JRadioButton();
        cmbNombreDestino = new javax.swing.JComboBox<>();
        jToolBar2 = new javax.swing.JToolBar();
        jPanel2 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(96, 203, 249));
        setPreferredSize(new java.awt.Dimension(900, 405));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToolBar1.setBackground(new java.awt.Color(96, 203, 249));
        jToolBar1.setRollover(true);

        jPanel1.setBackground(new java.awt.Color(96, 203, 249));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setText("Puerto de Destino: ");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setText("Estado: ");

        txtPuertoDestino.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        btnIngresar.setBackground(new java.awt.Color(44, 125, 174));
        btnIngresar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("Ingresar");
        btnIngresar.setBorderPainted(false);
        btnIngresar.setPreferredSize(new java.awt.Dimension(95, 25));
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(44, 125, 174));
        btnEditar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.setBorderPainted(false);
        btnEditar.setMinimumSize(new java.awt.Dimension(95, 25));
        btnEditar.setPreferredSize(new java.awt.Dimension(95, 25));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(44, 125, 174));
        btnLimpiar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorderPainted(false);
        btnLimpiar.setPreferredSize(new java.awt.Dimension(95, 25));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(44, 125, 174));
        btnEliminar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorderPainted(false);
        btnEliminar.setMinimumSize(new java.awt.Dimension(95, 25));
        btnEliminar.setPreferredSize(new java.awt.Dimension(95, 25));

        tblPuertos.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        tblPuertos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Puerto", "Puerto", "Destino", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setText("Destino: ");

        bgEstadoPuerto.add(rbActivo);
        rbActivo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        rbActivo.setText("Activo");

        bgEstadoPuerto.add(rbInactivo);
        rbInactivo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        rbInactivo.setText("Inactivo");

        cmbNombreDestino.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        cmbNombreDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cmbNombreDestino, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGap(19, 19, 19))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(rbActivo)
                            .addGap(18, 18, 18)
                            .addComponent(rbInactivo)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtPuertoDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(144, 144, 144))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPuertoDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(cmbNombreDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbActivo)
                    .addComponent(rbInactivo))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jToolBar1.add(jPanel1);

        jTabbedPane1.addTab("tab1", jToolBar1);

        jToolBar2.setRollover(true);
        jToolBar2.add(jPanel2);

        jTabbedPane1.addTab("tab2", jToolBar2);

        add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 910, 520));
    }// </editor-fold>//GEN-END:initComponents


    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        // TODO add your handling code here:
        
        cargarDatos();
        obtenerCodigo();
        puertos.ingresar();
        limpiar();
        cargarTabla();
        
    }//GEN-LAST:event_btnIngresarActionPerformed


    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:

        int fila = tblPuertos.getSelectedRow();
        int id = Integer.parseInt(tblPuertos.getValueAt(fila, 0).toString());
        cargarDatos();
        puertos.ingresar(id);


    }//GEN-LAST:event_btnEditarActionPerformed


    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:

        limpiar();
        btnIngresar.show();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void tblPuertosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPuertosMouseClicked
        // TODO add your handling code here:
        
        
        try {
            int fila = tblPuertos.getSelectedRow();
            int id = Integer.parseInt(tblPuertos.getValueAt(fila, 0).toString());
            
            PreparedStatement ps;
            ResultSet rs;
            Connection con = ClsConexion.obtenerConexion();
            ps = con.prepareStatement("select p.descripcion, d.descripcion, "
                    + "p.estado from [Puertos-Destinos] p join "
                    + "Destinos_Turisticos d on p.codigo_destino = "
                    + "d.codigo_destino where p.codigo_puerto=? ");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                txtPuertoDestino.setText(rs.getString(1));
                cmbNombreDestino.setSelectedItem(2);
                if (rs.getString(3).equals("Activo")) {
                    rbActivo.setSelected(true);
                } else if (rs.getString(3).equals("Inactivo")) {
                    rbInactivo.setSelected(true);
                }
            }
            btnIngresar.hide();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_tblPuertosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgEstadoPuerto;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cmbNombreDestino;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JRadioButton rbActivo;
    private javax.swing.JRadioButton rbInactivo;
    private javax.swing.JTable tblPuertos;
    private javax.swing.JTextField txtPuertoDestino;
    // End of variables declaration//GEN-END:variables
}
