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
import javax.swing.JOptionPane;

/**
 *
 * @author BRAYAN HERNADEZ
 */
public class FrmCamarotes extends javax.swing.JPanel {

  
     private ClsConexion conn = new ClsConexion();
     ClsHelper hp = new ClsHelper();
     ClsCamarote cama = new ClsCamarote();
     ClsMetodosCamarote metcama = new ClsMetodosCamarote();
     
    public FrmCamarotes() {
        initComponents();
        cbBuque.setModel(hp.buque());
        cbBuque.setSelectedIndex(-1);
     
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

        setBackground(new java.awt.Color(96, 203, 249));
        setPreferredSize(new java.awt.Dimension(930, 460));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel8.setText("Buque");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 130, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel9.setText("Nivel");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 60, -1));

        cbBuque.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        cbBuque.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cbBuque, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 220, -1));

        spNivel.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        spNivel.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        add(spNivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 60, -1));

        btnEditar.setBackground(new java.awt.Color(12, 69, 104));
        btnEditar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Icono Editar.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnEditar.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 420, 140, 40));

        btnEliminar.setBackground(new java.awt.Color(12, 69, 104));
        btnEliminar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Basurero.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 420, 140, 40));

        btnActualizar.setBackground(new java.awt.Color(12, 69, 104));
        btnActualizar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/actualizar.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnActualizar.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, 160, 40));

        tbCamarote.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        tbCamarote.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo Camarote", "Precio Unitario", "Tipo Buque", "Nivel"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.Integer.class
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
        jScrollPane1.setViewportView(tbCamarote);
        if (tbCamarote.getColumnModel().getColumnCount() > 0) {
            tbCamarote.getColumnModel().getColumn(0).setResizable(false);
            tbCamarote.getColumnModel().getColumn(1).setResizable(false);
            tbCamarote.getColumnModel().getColumn(2).setResizable(false);
            tbCamarote.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, -1, 380));

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
        add(btnAgregar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 140, 40));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel10.setText("Tipo Camarote");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 190, -1));

        cbTipoCamarote.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        cbTipoCamarote.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cbTipoCamarote, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 220, -1));
    }// </editor-fold>//GEN-END:initComponents
    
    private void datosTipoCamarote()
    {
       
    }
    
    private void datosCamarote()
    {
        cama.setIdBuque( cbBuque.getSelectedIndex() + 1);
        cama.setNivel((int) spNivel.getValue());
    }
    
    private void btnAgregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar1ActionPerformed
        
        datosTipoCamarote();
        datosCamarote();
        
        metcama.idTipoCamarote();
        metcama.insertarTipoCamarote();
        metcama.insertarCamarote();
        
    }//GEN-LAST:event_btnAgregar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar1;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<String> cbBuque;
    private javax.swing.JComboBox<String> cbTipoCamarote;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spNivel;
    private javax.swing.JTable tbCamarote;
    // End of variables declaration//GEN-END:variables
}
