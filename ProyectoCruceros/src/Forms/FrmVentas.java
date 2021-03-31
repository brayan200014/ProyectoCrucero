/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Clases.ClsConexion;
import Clases.ClsVentas;
import java.awt.Dialog;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author BRAYAN HERNADEZ
 */
public class FrmVentas extends javax.swing.JPanel {

    /**
     * Creates new form FrmVentas
     */
    ClsConexion conexion = new ClsConexion();
    ClsVentas ventas = new ClsVentas();
    DefaultTableModel modelo;

    float subtotal;

    public FrmVentas() {
        initComponents();
        comboboxTipo.setModel(ventas.getValues());
        comboboxTipo.setSelectedIndex(-1);
        lblNombre.setText("Prueba");
        lblEmpleado.setText(ventas.nombreEmpleado(2));

        // camarotes= new DefaultListModel();
        // listSelectCam.setModel(camarotes);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtIdentidad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCodigoViaje = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        spinCantidadCam = new javax.swing.JSpinner();
        spinCantidadPer = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        comboboxTipo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        btnAgregarCam = new javax.swing.JButton();
        btnEliminarCam = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableDetalle = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblPuerto = new javax.swing.JLabel();
        lblSubtotal = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lblSalida = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblDescuento = new javax.swing.JLabel();
        lblPortuario = new javax.swing.JLabel();
        lblisv = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblEmpleado = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblPropina = new javax.swing.JLabel();
        lblRegreso = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnVerificarDisponibilidad = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();

        setBackground(new java.awt.Color(96, 203, 249));
        setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setText("Identidad:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 27, -1, -1));

        txtIdentidad.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtIdentidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdentidadKeyTyped(evt);
            }
        });
        add(txtIdentidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 24, 280, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setText("Codigo Viaje:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 27, -1, -1));

        txtCodigoViaje.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtCodigoViaje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoViajeKeyTyped(evt);
            }
        });
        add(txtCodigoViaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(587, 24, 280, -1));

        jPanel1.setBackground(new java.awt.Color(38, 151, 186));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setText("Cantidad de Camarotes:");

        spinCantidadCam.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        spinCantidadCam.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        spinCantidadPer.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        spinCantidadPer.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 4));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel5.setText("Cantidad de Personas:");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel6.setText("Tipo de Camarote:");

        comboboxTipo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        comboboxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel7.setText("Camarotes Seleccionados:");

        btnAgregarCam.setBackground(new java.awt.Color(12, 69, 104));
        btnAgregarCam.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        btnAgregarCam.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarCam.setText("Agregar");
        btnAgregarCam.setBorderPainted(false);
        btnAgregarCam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCamActionPerformed(evt);
            }
        });

        btnEliminarCam.setBackground(new java.awt.Color(12, 69, 104));
        btnEliminarCam.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        btnEliminarCam.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarCam.setText("Eliminar");
        btnEliminarCam.setBorderPainted(false);
        btnEliminarCam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCamActionPerformed(evt);
            }
        });

        tableDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cantidad Personas", "Cantidad Camarotes", "Tipo Camarote"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableDetalle.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(tableDetalle);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(spinCantidadPer, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(spinCantidadCam, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(comboboxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAgregarCam)
                            .addGap(18, 18, 18)
                            .addComponent(btnEliminarCam))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addGap(48, 48, 48))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spinCantidadCam, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregarCam)
                            .addComponent(btnEliminarCam)
                            .addComponent(comboboxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel5)
                        .addGap(6, 6, 6)
                        .addComponent(spinCantidadPer, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 59, 870, 210));

        jPanel2.setBackground(new java.awt.Color(38, 151, 186));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel8.setText("Descuento:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, -1, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel9.setText("Impuesto Portuario:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, -1, -1));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel10.setText("Subtotal:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, -1, -1));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel11.setText("Total:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, -1, -1));

        lblPuerto.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblPuerto.setText("-");
        jPanel2.add(lblPuerto, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 190, -1));

        lblSubtotal.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblSubtotal.setText("0.00");
        jPanel2.add(lblSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 0, -1, -1));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel14.setText("Puerto Salida:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel15.setText("Impuesto Venta:");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, -1, -1));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel16.setText("Nombre Cliente:");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 0, -1, -1));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel17.setText("Nombre Empleado:");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 41, -1, -1));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel18.setText("Fecha Salida:");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        jLabel19.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel19.setText("Fecha Regreso:");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        lblSalida.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblSalida.setText("-");
        jPanel2.add(lblSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 200, -1));

        lblNombre.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblNombre.setText("-");
        jPanel2.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 0, 180, -1));

        lblDescuento.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblDescuento.setText("0.00");
        jPanel2.add(lblDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 40, -1, -1));

        lblPortuario.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblPortuario.setText("0.00");
        jPanel2.add(lblPortuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 80, -1, -1));

        lblisv.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblisv.setText("0.00");
        jPanel2.add(lblisv, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 120, -1, -1));

        lblTotal.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblTotal.setText("0.00");
        jPanel2.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, -1, -1));

        lblEmpleado.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblEmpleado.setText("-");
        jPanel2.add(lblEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 41, 180, -1));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel12.setText("Propina:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, -1, -1));

        lblPropina.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblPropina.setText("0.00");
        jPanel2.add(lblPropina, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 160, -1, -1));

        lblRegreso.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblRegreso.setText("-");
        jPanel2.add(lblRegreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 200, -1));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 868, 220));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setText("Factura a Realizar");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 268, -1, -1));

        btnVerificarDisponibilidad.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnVerificarDisponibilidad.setText("Verificar");
        btnVerificarDisponibilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarDisponibilidadActionPerformed(evt);
            }
        });
        add(btnVerificarDisponibilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 530, -1, -1));

        btnBuscar.setBackground(new java.awt.Color(96, 203, 249));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Vector (1).png"))); // NOI18N
        btnBuscar.setBorderPainted(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(873, 24, 30, 29));

        btnConfirmar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 530, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        String identidad = txtIdentidad.getText();
        String codigo = txtCodigoViaje.getText();
        if (identidad.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe Ingresar un valor en la identidad"
                    + "", "Warning", JOptionPane.ERROR_MESSAGE);
        } else if (identidad.length() < 13 || identidad.length() > 13) {
            JOptionPane.showMessageDialog(null, "La identidad debe contener 13 caracteres"
                    + "", "Warning", JOptionPane.ERROR_MESSAGE);
        } else if (codigo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingresar el codigo de viaje"
                    + "", "Warning", JOptionPane.ERROR_MESSAGE);
        } else {
            ventas.setIdentidad(txtIdentidad.getText());
            ventas.setCodigo_viaje(Integer.parseInt(txtCodigoViaje.getText()));
            ventas.infoViaje();
            lblNombre.setText(ventas.nombreCliente());
            lblPuerto.setText(ventas.getPuerto_salida());
            lblRegreso.setText(ventas.getFecha_regreso().toString());
            lblSalida.setText(ventas.getFecha_salida().toString());
            lblEmpleado.setText(ventas.nombreEmpleado(2));
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAgregarCamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCamActionPerformed
        // TODO add your handling code here:

        if (Integer.parseInt(spinCantidadCam.getValue().toString()) == 0) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un valor en Cantidad de camarotes"
                    + "", "Warning", JOptionPane.ERROR_MESSAGE);
        } else if (Integer.parseInt(spinCantidadPer.getValue().toString()) == 0) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un valor en Cantidad de Personas"
                    + "", "Warning", JOptionPane.ERROR_MESSAGE);
        } else if (comboboxTipo.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione un valor en el combo box de tipo camarote"
                    + "", "Warning", JOptionPane.ERROR_MESSAGE);
        } else {
            ventas.setCantidad_camarotes((int) spinCantidadCam.getValue());
            ventas.setCantidad_personas((int) spinCantidadPer.getValue());
            ventas.setTipo_camarote(comboboxTipo.getSelectedItem().toString());

            modelo = (DefaultTableModel) tableDetalle.getModel();
            modelo.addRow(new Object[]{String.valueOf(ventas.getCantidad_personas()),
                String.valueOf(ventas.getCantidad_camarotes()), ventas.getTipo_camarote()});

            subtotal = subtotal + ventas.precioExtraer();
            ventas.setSubtotal(subtotal);
            lblSubtotal.setText(String.valueOf(subtotal));
            lblDescuento.setText(String.valueOf(ventas.calculoDescuento()));
            lblisv.setText(String.valueOf(ventas.calculoIsv()));
            lblPortuario.setText(String.valueOf(ventas.calculoImpuestoPortuario()));
            lblPropina.setText(String.valueOf(ventas.calculoPropina()));
            lblTotal.setText(String.valueOf(ventas.calculoTotal()));

            spinCantidadCam.setValue(0);
            spinCantidadPer.setValue(0);
            comboboxTipo.setSelectedIndex(-1);
        }
    }//GEN-LAST:event_btnAgregarCamActionPerformed

    private void btnEliminarCamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCamActionPerformed

        int fila = tableDetalle.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione una fila a eliminar"
                    + "", "Warning", JOptionPane.ERROR_MESSAGE);
        } else {
            ventas.setCantidad_camarotes(Integer.parseInt(tableDetalle.getValueAt(fila, 1).toString()));
            ventas.setCantidad_personas(Integer.parseInt(tableDetalle.getValueAt(fila, 0).toString()));
            ventas.setTipo_camarote(String.valueOf(tableDetalle.getValueAt(fila, 2)));
            subtotal = subtotal - ventas.precioExtraer();
            ventas.setSubtotal(subtotal);
            lblSubtotal.setText(String.valueOf(ventas.getSubtotal()));
            lblDescuento.setText(String.valueOf(ventas.calculoDescuento()));
            lblisv.setText(String.valueOf(ventas.calculoIsv()));
            lblPortuario.setText(String.valueOf(ventas.calculoImpuestoPortuario()));
            lblPropina.setText(String.valueOf(ventas.calculoPropina()));
            lblTotal.setText(String.valueOf(ventas.calculoTotal()));

            modelo = (DefaultTableModel) tableDetalle.getModel();
            modelo.removeRow(fila);

        }

    }//GEN-LAST:event_btnEliminarCamActionPerformed


    private void txtIdentidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdentidadKeyTyped
        // TODO add your handling code here:

        char c = evt.getKeyChar();
        if ((c < '0' || c > '9') && c != evt.VK_BACK_SPACE) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Sólo se admiten números", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtIdentidadKeyTyped

    private void txtCodigoViajeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoViajeKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9') && c != evt.VK_BACK_SPACE) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Sólo se admiten números", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtCodigoViajeKeyTyped

    private void btnVerificarDisponibilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarDisponibilidadActionPerformed
        // TODO add your handling code here:
        ArrayList<Integer> camarotes = new ArrayList<Integer>();
        if (tableDetalle.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "No tiene ningun producto agregado", "Information", JOptionPane.INFORMATION_MESSAGE);
        } /*else 
        {
             ventas.setSubtotal(Float.parseFloat(lblSubtotal.getText()));
             ventas.setIsv(Float.parseFloat(lblisv.getText()));
             ventas.setDescuento(Float.parseFloat(lblDescuento.getText()));
             ventas.setIs_portuario(Float.parseFloat(lblPortuario.getText()));
             ventas.setPropina(Float.parseFloat(lblPropina.getText()));
             ventas.insertarVenta(2);
            for(int i=0; i<=tableDetalle.getRowCount();i++)
            {
                ventas.codigosCamarotes(Integer.parseInt(tableDetalle.getValueAt(i, 1).toString()));
                if(ventas.getCamarotes().size()<Integer.parseInt(tableDetalle.getValueAt(i, 1).toString()))
                {
                    JOptionPane.showMessageDialog(null, "No hay Suficientes para"+ventas.getTipo_camarote());
                }
                
                for(int j=0; j<=i;j++)
                {
                    ventas.setCantidad_personas(Integer.parseInt(tableDetalle.getValueAt(j, 0).toString()));
                    ventas.setTipo_camarote(tableDetalle.getValueAt(j, 2).toString());
                    JOptionPane.showMessageDialog(null, " " + ventas.getCamarotes().indexOf(j));
                    ventas.insertarDetalle(ventas.extraerCodigoVenta(), ventas.getCamarotes().indexOf(j));
                }
              
            }
        }*/ else {
            for (int i = 0; i < tableDetalle.getRowCount(); i++) {
                ventas.setTipo_camarote(tableDetalle.getValueAt(i, 2).toString());
                camarotes.addAll(ventas.codigosCamarotes(Integer.parseInt(tableDetalle.getValueAt(i, 1).toString())));
                JOptionPane.showMessageDialog(null, camarotes);

                if (camarotes.size() < Integer.parseInt(tableDetalle.getValueAt(i, 1).toString())) {
                    JOptionPane.showMessageDialog(null, "No hay Suficientes camarotes para  " + ventas.getTipo_camarote());
                }

                camarotes.clear();
            }

        }
    }//GEN-LAST:event_btnVerificarDisponibilidadActionPerformed

    
    
    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        // TODO add your handling code here:
       
        
        ArrayList<Integer> camarotes = new ArrayList<Integer>();
        int acumulador = 0;
        if (tableDetalle.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "No tiene ningun producto agregado", "Information", JOptionPane.INFORMATION_MESSAGE);
        } else {
            ventas.setSubtotal(Float.parseFloat(lblSubtotal.getText()));
            ventas.setIsv(Float.parseFloat(lblisv.getText()));
            ventas.setDescuento(Float.parseFloat(lblDescuento.getText()));
            ventas.setIs_portuario(Float.parseFloat(lblPortuario.getText()));
            ventas.setPropina(Float.parseFloat(lblPropina.getText()));
            ventas.insertarVenta(2);
            int codigo_venta= ventas.extraerCodigoVenta();
            for (int i = 0; i < tableDetalle.getRowCount(); i++) {
            
                ventas.setTipo_camarote(tableDetalle.getValueAt(i, 2).toString());
                camarotes.addAll(ventas.codigosCamarotes(Integer.parseInt(tableDetalle.getValueAt(i, 1).toString())));

                for (int j = 0; j < Integer.parseInt(tableDetalle.getValueAt(i, 1).toString()); j++) {
                  
                        ventas.setCantidad_personas(Integer.parseInt(JOptionPane.showInputDialog(null, "Distribucion para la " + i + " Habitacion")));
                        ventas.setTipo_camarote(tableDetalle.getValueAt(i, 2).toString());
                        JOptionPane.showMessageDialog(null, camarotes.get(j));
                        ventas.insertarDetalle(codigo_venta, camarotes.get(j));

                }

                camarotes.clear();
            }

        }
        limpiarControles();
        
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void limpiarControles()
    {
        lblSubtotal.setText("0.00");
        lblEmpleado.setText("-");
        lblNombre.setText("-");
        lblPortuario.setText("0.00");
        lblisv.setText("0.00");
        lblDescuento.setText("0.00");
        lblPropina.setText("0.00");
        lblTotal.setText("0.00");
        lblRegreso.setText("-");
        lblSalida.setText("-");
        lblPuerto.setText("-");
        txtIdentidad.setText(" ");
        txtCodigoViaje.setText("");
        comboboxTipo.setSelectedIndex(-1);
        modelo = (DefaultTableModel) tableDetalle.getModel();
        for(int i=0; i<tableDetalle.getRowCount(); i++)
        {
            modelo.removeRow(i);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCam;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnEliminarCam;
    private javax.swing.JButton btnVerificarDisponibilidad;
    private javax.swing.JComboBox<String> comboboxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDescuento;
    private javax.swing.JLabel lblEmpleado;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPortuario;
    private javax.swing.JLabel lblPropina;
    private javax.swing.JLabel lblPuerto;
    private javax.swing.JLabel lblRegreso;
    private javax.swing.JLabel lblSalida;
    private javax.swing.JLabel lblSubtotal;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblisv;
    private javax.swing.JSpinner spinCantidadCam;
    private javax.swing.JSpinner spinCantidadPer;
    private javax.swing.JTable tableDetalle;
    private javax.swing.JTextField txtCodigoViaje;
    private javax.swing.JTextField txtIdentidad;
    // End of variables declaration//GEN-END:variables
}
