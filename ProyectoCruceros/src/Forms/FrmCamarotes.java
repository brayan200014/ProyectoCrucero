/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import BuqueCamarote.ClsCamarote;
import BuqueCamarote.ClsMetodosCamarote;
import Clases.ClsConexion;
import Clases.ClsHelper;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.*;

/**
 *
 * @author BRAYAN HERNADEZ
 */
public class FrmCamarotes extends javax.swing.JPanel {

    private ClsConexion conn = new ClsConexion();
    ClsHelper hp = new ClsHelper();
    ClsCamarote cama = new ClsCamarote();
    ClsMetodosCamarote metcama = new ClsMetodosCamarote();
    String valor;
    private TableRowSorter TRSFiltro;

    public FrmCamarotes() {
        initComponents();

        cbBuque.setModel(hp.buque());
        cbBuque.setSelectedIndex(-1);
        cbTipoCamarote.setModel(hp.tipoCamarote());
        cbTipoCamarote.setSelectedIndex(-1);

        cargarTabla();
        btnActualizar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbBuque = new javax.swing.JComboBox<>();
        spNivel = new javax.swing.JSpinner();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCamarote = new javax.swing.JTable();
        btnAgregar1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        cbTipoCamarote = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        txtNiveles = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtBusqueda = new javax.swing.JTextField();

        setBackground(new java.awt.Color(96, 203, 249));
        setPreferredSize(new java.awt.Dimension(930, 460));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel8.setText("Buque");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 130, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel9.setText("Nivel");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 60, -1));

        cbBuque.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        cbBuque.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbBuque.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbBuqueItemStateChanged(evt);
            }
        });
        add(cbBuque, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 220, -1));

        spNivel.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        spNivel.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        add(spNivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 60, -1));

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
        add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, 140, 40));

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
        add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 420, 140, 40));

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
        add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, 160, 40));

        tbCamarote.setBackground(new java.awt.Color(96, 203, 249));
        tbCamarote.setBorder(new javax.swing.border.MatteBorder(null));
        tbCamarote.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        tbCamarote.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Tipo Camarote", "Precio ", "Buque", "Nivel"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbCamarote.setAutoscrolls(false);
        tbCamarote.setSelectionBackground(new java.awt.Color(12, 69, 104));
        tbCamarote.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbCamarote.getTableHeader().setResizingAllowed(false);
        tbCamarote.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbCamarote);
        if (tbCamarote.getColumnModel().getColumnCount() > 0) {
            tbCamarote.getColumnModel().getColumn(0).setResizable(false);
            tbCamarote.getColumnModel().getColumn(1).setResizable(false);
            tbCamarote.getColumnModel().getColumn(2).setResizable(false);
            tbCamarote.getColumnModel().getColumn(3).setResizable(false);
            tbCamarote.getColumnModel().getColumn(4).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, -1, 300));

        btnAgregar1.setBackground(new java.awt.Color(12, 69, 104));
        btnAgregar1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnAgregar1.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/agregar25x25.png"))); // NOI18N
        btnAgregar1.setText("Agregar");
        btnAgregar1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnAgregar1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnAgregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar1ActionPerformed(evt);
            }
        });
        add(btnAgregar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, 140, 40));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel10.setText("Precio");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 60, 20));

        cbTipoCamarote.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        cbTipoCamarote.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbTipoCamarote.setSelectedIndex(-1);
        cbTipoCamarote.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbTipoCamaroteItemStateChanged(evt);
            }
        });
        add(cbTipoCamarote, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 220, -1));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel11.setText("Tipo Camarote");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 190, -1));

        txtPrecio.setEditable(false);
        txtPrecio.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 70, 30));

        txtNiveles.setEditable(false);
        txtNiveles.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        add(txtNiveles, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 70, 30));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setText("Nivel/es");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setText("Búsqueda");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, -1, -1));

        txtBusqueda.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBusquedaKeyTyped(evt);
            }
        });
        add(txtBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 450, 30));
    }// </editor-fold>//GEN-END:initComponents

    public void cargarBuques()
    {
         cbBuque.setModel(hp.buque());
    }
    private void busqueda() {
        int columnaTabla = 1;
        TRSFiltro.setRowFilter(RowFilter.regexFilter("(?i)" + txtBusqueda.getText(), columnaTabla));

    }

    private void cargarTabla() {

        DefaultTableModel modeloTabla = (DefaultTableModel) tbCamarote.getModel();
        modeloTabla.setRowCount(0);

        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;

        int[] anchos = {10, 110, 10, 110, 10};
        for (int i = 0; i < tbCamarote.getColumnCount(); i++) {
            tbCamarote.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }
        try {
            Connection cn = conn.obtenerConexion();
            ps = cn.prepareStatement("select c.codigo_camarote,\n"
                    + "tc.descripcion,\n"
                    + "tc.precio_unitario,\n"
                    + "b.descripcion,\n"
                    + "c.nivel \n"
                    + "from [dbo].[Camarote]c  join [dbo].[Tipo_Camarote] tc \n"
                    + "on c.codigo_tipo_camarote = tc.codigo_tipo_camarote \n"
                    + "join [dbo].[Buques] b \n"
                    + "on b.codigo_buque = c.codigo_buque \n"
                    + "where c.estado = 1");

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

    private void precio() {

        valor = cbTipoCamarote.getSelectedItem().toString();
        ResultSet rs;

        try {
            Connection cn = conn.obtenerConexion();

            PreparedStatement ps = cn.prepareStatement("select precio_unitario from Tipo_Camarote where descripcion = ?");

            ps.setString(1, valor);
            rs = ps.executeQuery();

            if (rs.next()) {

                txtPrecio.setText(rs.getString("precio_unitario"));

            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    private void nivel() {

        SpinnerNumberModel nm = new SpinnerNumberModel();

        String valor = cbBuque.getSelectedItem().toString();

        ResultSet rs;
        try {
            Connection cn = conn.obtenerConexion();

            PreparedStatement ps = cn.prepareStatement("select cantidad_niveles from Buques where descripcion = ?");

            ps.setString(1, valor);
            rs = ps.executeQuery();

            if (rs.next()) {

                txtNiveles.setText(rs.getString("cantidad_niveles"));
                nm.setMinimum(0);
                nm.setMaximum(rs.getInt("cantidad_niveles"));
                spNivel.setModel(nm);

            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    private void idBuque() {

        String valor = cbBuque.getSelectedItem().toString();

        ResultSet rs;
        try {
            Connection cn = conn.obtenerConexion();

            PreparedStatement ps = cn.prepareStatement("select codigo_buque from [dbo].[Buques] where descripcion = ? and estado = 1");

            ps.setString(1, valor);
            rs = ps.executeQuery();

            if (rs.next()) {

                cama.setIdBuque(rs.getInt("codigo_buque"));
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    private void cargarDatos() {

        cama.setIdTipoCamarote(cbTipoCamarote.getSelectedIndex() + 1);
        idBuque();
        cama.setNivel((int) spNivel.getValue());
    }

    private void limpiar() {
        cbTipoCamarote.setSelectedIndex(-1);
        txtPrecio.setText(null);
        cbBuque.setSelectedIndex(-1);
        spNivel.setValue(0);
        txtNiveles.setText(null);
    }

    private void btnAgregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar1ActionPerformed

        if (spNivel.getValue().equals(0) || cbTipoCamarote.getSelectedIndex() == -1 || cbBuque.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, " Favor llenar todos campos", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            cargarDatos();
            metcama.insertarEditarCamarote();
            cargarTabla();
            limpiar();

        }


    }//GEN-LAST:event_btnAgregar1ActionPerformed


    private void cbTipoCamaroteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbTipoCamaroteItemStateChanged

        if (cbTipoCamarote.getSelectedIndex() > -1) {
            precio();
        }

    }//GEN-LAST:event_cbTipoCamaroteItemStateChanged

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        if (tbCamarote.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione una fila para editar", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            int fila = tbCamarote.getSelectedRow();
            int id = Integer.parseInt(tbCamarote.getValueAt(fila, 0).toString());

            try {
                Connection cn = conn.obtenerConexion();

                btnAgregar1.setVisible(false);
                btnEditar.setVisible(false);
                btnEliminar.setVisible(false);
                btnActualizar.setVisible(true);

                PreparedStatement ps;
                ResultSet rs;

                ps = cn.prepareStatement("select tc.descripcion,\n"
                        + "b.descripcion as buque,\n"
                        + "c.nivel \n"
                        + "from [dbo].[Camarote]c  join [dbo].[Tipo_Camarote] tc \n"
                        + "on c.codigo_tipo_camarote = tc.codigo_tipo_camarote \n"
                        + "join [dbo].[Buques] b \n"
                        + "on b.codigo_buque = c.codigo_buque \n"
                        + "where c.codigo_camarote = ? and   c.estado = 1");

                ps.setInt(1, id);
                rs = ps.executeQuery();

                while (rs.next()) {
                    cbTipoCamarote.setSelectedItem(rs.getString("descripcion"));
                    cbBuque.setSelectedItem(rs.getString("buque"));
                    spNivel.setValue(rs.getInt("nivel"));
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }


    }//GEN-LAST:event_btnEditarActionPerformed

    private void cbBuqueItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbBuqueItemStateChanged

        if (cbBuque.getSelectedIndex() > -1) {
            nivel();
        }

    }//GEN-LAST:event_cbBuqueItemStateChanged

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        if (spNivel.getValue().equals(0) || cbTipoCamarote.getSelectedIndex() == -1 || cbBuque.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, " Favor llenar todos campos", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            int fila = tbCamarote.getSelectedRow();
            cama.setCodigo(Integer.parseInt(tbCamarote.getValueAt(fila, 0).toString()));
            int codigo = cama.getCodigo();

            cargarDatos();
            metcama.insertarEditarCamarote(codigo);
            cargarTabla();
            limpiar();

            btnAgregar1.setVisible(true);
            btnEditar.setVisible(true);
            btnEliminar.setVisible(true);
            btnActualizar.setVisible(false);
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        if (tbCamarote.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione una fila para eliminar", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            int fila = tbCamarote.getSelectedRow();
            cama.setCodigo(Integer.parseInt(tbCamarote.getValueAt(fila, 0).toString()));

            metcama.eliminar();
            cargarTabla();
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtBusquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyTyped

        char c = evt.getKeyChar();

        txtBusqueda.addKeyListener(new KeyAdapter() {

            @Override
            public void keyReleased(final KeyEvent e) {
                String cadena = (txtBusqueda.getText());
                txtBusqueda.setText(cadena);
                busqueda();
            }
        });

        TRSFiltro = new TableRowSorter(tbCamarote.getModel());
        tbCamarote.setRowSorter(TRSFiltro);


    }//GEN-LAST:event_txtBusquedaKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar1;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<String> cbBuque;
    private javax.swing.JComboBox<String> cbTipoCamarote;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spNivel;
    private javax.swing.JTable tbCamarote;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JTextField txtNiveles;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
