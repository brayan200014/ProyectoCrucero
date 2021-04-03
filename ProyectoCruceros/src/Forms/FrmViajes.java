/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Clases.ClsConexion;
import Clases.ClsViajes;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author BRAYAN HERNADEZ
 */
public class FrmViajes extends javax.swing.JPanel {
    //Objetos
    ClsViajes viaje = new ClsViajes();
    
    /**
     * Creates new form FrmViajes
     */
    public FrmViajes() {
        initComponents();
        cargarTablaViajes();
        cbPuerto.setModel(viaje.getvaluesPuertos());//Llena el comboBox de puertos
        cbBuque.setModel(viaje.getvaluesBuques());//Llena el comboBox de Buques
        cbDestinoTuristico.setModel(viaje.getvaluesDestinos());//Llena el comboBox de destinos
        //cbPuertoDestino.setModel(viaje.getvaluesPuertos());//Llena el comboBox de puerto del destino
        
        /* Establece los comboBox en -1 para que no este seleccionado ninguno
        al momento de iniciar el jpanel */
        cbPuerto.setSelectedIndex(-1);
        cbBuque.setSelectedIndex(-1);
        cbDestinoTuristico.setSelectedIndex(-1);
        cbPuertoDestino.setSelectedIndex(-1);
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
        txtNombre = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblViajes = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jdcFechaSalida = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jdcFechaRegreso = new com.toedter.calendar.JDateChooser();
        cbPuerto = new javax.swing.JComboBox<>();
        btnAgregar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        cbBuque = new javax.swing.JComboBox<>();
        btnActualizar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cbDestinoTuristico = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jdcFechaLlegada = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jdcFechaPartida = new com.toedter.calendar.JDateChooser();
        btnEliminarDestino = new javax.swing.JButton();
        btnAgregarDestino = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDestinos = new javax.swing.JTable();
        cbPuertoDestino = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(96, 203, 249));
        setPreferredSize(new java.awt.Dimension(920, 460));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel1.setText("Nombre:");

        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        tblViajes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Descripción", "Buque", "Puerto de sallida", "Fecha de salida", "Fecha de regreso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblViajes);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel2.setText("Fecha de salida:");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel3.setText("Fecha de regreso:");

        jdcFechaSalida.setDateFormatString("yyyy/MM/dd hh:mm:ss");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel4.setText("Puerto de salida:");

        jdcFechaRegreso.setDateFormatString("yyyy/MM/dd hh:mm:ss");

        cbPuerto.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        cbPuerto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel5.setText("Buque:");

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        cbBuque.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        cbBuque.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(52, 161, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel6.setText("Destino turistico:");

        cbDestinoTuristico.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        cbDestinoTuristico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbDestinoTuristico.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbDestinoTuristicoItemStateChanged(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel8.setText("Fecha de llegada:");

        jdcFechaLlegada.setDateFormatString("yyyy/MM/dd hh:mm:ss");

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel9.setText("Fecha de partida:");

        jdcFechaPartida.setDateFormatString("yyyy/MM/dd hh:mm:ss");

        btnEliminarDestino.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnEliminarDestino.setText("Eliminar destino");
        btnEliminarDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarDestinoActionPerformed(evt);
            }
        });

        btnAgregarDestino.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnAgregarDestino.setText("Agregar destino");
        btnAgregarDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarDestinoActionPerformed(evt);
            }
        });

        tblDestinos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Destino", "ID Puerto", "Fecha de llegada", "Fecha de partida"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane3.setViewportView(tblDestinos);

        cbPuertoDestino.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel7.setText("Puerto del destino:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jdcFechaLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregarDestino))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(cbDestinoTuristico, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbPuertoDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jdcFechaPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarDestino))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbDestinoTuristico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbPuertoDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdcFechaLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jdcFechaPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jdcFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jdcFechaRegreso, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(cbPuerto, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(cbBuque, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(63, 63, 63)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(btnAgregar)
                        .addGap(35, 35, 35)
                        .addComponent(btnConsultar)
                        .addGap(34, 34, 34)
                        .addComponent(btnActualizar)
                        .addGap(42, 42, 42)
                        .addComponent(btnLimpiar)))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1)
                        .addGap(6, 6, 6)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2)
                        .addGap(6, 6, 6)
                        .addComponent(jdcFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel3)
                        .addGap(7, 7, 7)
                        .addComponent(jdcFechaRegreso, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel4)
                        .addGap(7, 7, 7)
                        .addComponent(cbPuerto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel5)
                        .addGap(6, 6, 6)
                        .addComponent(cbBuque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregar)
                    .addComponent(btnConsultar)
                    .addComponent(btnActualizar)
                    .addComponent(btnLimpiar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    //Agrega destinos a la tabla tblDestinos
    private void btnAgregarDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarDestinoActionPerformed
        SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
        
        if(cbDestinoTuristico.getSelectedIndex() < 0){
            JOptionPane.showMessageDialog(null, "Seleccione un Destino");
        }
        else{
            if(jdcFechaLlegada.getDate() == null || jdcFechaPartida.getDate() == null){
                JOptionPane.showMessageDialog(null, "Ingrese el intinerario del destino");
            }
            else{
                int[] anchos = {50, 20, 50, 50};
                for (int i = 0; i < tblDestinos.getColumnCount(); i++) {
                    tblDestinos.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
                }

                DefaultTableModel modelo=(DefaultTableModel) tblDestinos.getModel(); 

                Object [] fila=new Object[4]; 

                fila[0]=cbDestinoTuristico.getSelectedItem().toString();
                fila[1]=viaje.codigoPuerto(cbPuertoDestino.getSelectedItem().toString());
                fila[2]=df.format(jdcFechaLlegada.getDate());
                fila[3]=df.format(jdcFechaPartida.getDate());

                modelo.addRow(fila); 

                tblDestinos.setModel(modelo);

                cbDestinoTuristico.setSelectedIndex(-1);
                cbPuertoDestino.setSelectedIndex(-1);
                jdcFechaLlegada.setDate(null);
                jdcFechaPartida.setDate(null);
            }
        }
    }//GEN-LAST:event_btnAgregarDestinoActionPerformed

    //Elimina el destino seleccionado de la tabla
    private void btnEliminarDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarDestinoActionPerformed
        if(tblDestinos.getSelectedRow() < 0){
            JOptionPane.showMessageDialog(null, "Seleccione el destino a eliminar");
        }
        else{
            int fila = tblDestinos.getSelectedRow();
        
            DefaultTableModel modelo = (DefaultTableModel)tblDestinos.getModel();
            modelo.removeRow(fila);
        }
    }//GEN-LAST:event_btnEliminarDestinoActionPerformed

    //Guardar  los datos e ingresa el viaje a la base de datos
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        
        if (txtNombre.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese una descripcion");
        }
        else{
            if(jdcFechaRegreso.getDate() == null || jdcFechaSalida.getDate() == null){
                JOptionPane.showMessageDialog(null, "Ingrese las fechas");
            }
            else{
                if(cbPuerto.getSelectedIndex() < 0){
                    JOptionPane.showMessageDialog(null, "Seleccione un puerto");
                }
                else{
                    if(cbBuque.getSelectedIndex() < 0){
                        JOptionPane.showMessageDialog(null, "Seleccione un buque");
                    }
                    else{
                        guardarDatos();
                        viaje.ingresarViaje();
                        ingresarDestinos();
                        limpiar();
                        cargarTablaViajes();
                    }
                }
            }
            
        }
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    //Extrae los datos de la base de datos del viaje seleccionado
    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        if(tblViajes.getSelectedRow() < 0){
            JOptionPane.showMessageDialog(null, "Seleccione el viaje a consultar");
        }
        else{
            int fila = tblViajes.getSelectedRow();
            int codigo = Integer.parseInt(tblViajes.getValueAt(fila, 0).toString());

            viaje.consultarViaje(codigo);
            cargarTablaDestino(codigo);

            txtNombre.setText(viaje.getDescripcion());
            jdcFechaSalida.setDate(Date.valueOf(viaje.getFechaSalida()));
            jdcFechaRegreso.setDate(Date.valueOf(viaje.getFechaRegreso()));
            cbBuque.setSelectedItem(viaje.getDescripBuque());
            cbPuerto.setSelectedItem(viaje.getDescripPuerto());
        }
        
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if(viaje.getCodigoViaje() < 1){
            JOptionPane.showMessageDialog(null, "Debe consultar el viaje a modificar");
        }
        else{
            if (txtNombre.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese una descripcion");
            }
            else{
                if(jdcFechaRegreso.getDate() == null || jdcFechaSalida.getDate() == null){
                    JOptionPane.showMessageDialog(null, "Ingrese las fechas");
                }
                else{
                    if(cbPuerto.getSelectedIndex() < 0){
                        JOptionPane.showMessageDialog(null, "Seleccione un puerto");
                    }
                    else{
                        if(cbBuque.getSelectedIndex() < 0){
                            JOptionPane.showMessageDialog(null, "Seleccione un buque");
                        }
                        else{
                            guardarDatos();
                            viaje.actualizarViaje();
                            viaje.eliminarDestinos();

                            for (int i = 0; i < tblDestinos.getRowCount(); i++) {
                                viaje.actualizarDestinos(Integer.parseInt(tblDestinos.getValueAt(i,1).toString()), 
                                    tblDestinos.getValueAt(i, 2).toString() , tblDestinos.getValueAt(i, 3).toString());
                            }

                            limpiar();
                            viaje.setCodigoViaje(0);
                            cargarTablaViajes();
                        }
                    }
                }

            }
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void cbDestinoTuristicoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbDestinoTuristicoItemStateChanged
        
        if(cbDestinoTuristico.getSelectedIndex() > -1){
            cbPuertoDestino.setModel(viaje.getvaluesPuertos(viaje.codigoDestino(cbDestinoTuristico.getSelectedItem().toString())));
        }
        
    }//GEN-LAST:event_cbDestinoTuristicoItemStateChanged

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
        viaje.setCodigoViaje(0);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    //Llena la tabla de viajes con los viajes existentes
    private void cargarTablaViajes(){
        DefaultTableModel modeloTabla = (DefaultTableModel) tblViajes.getModel();
        
        modeloTabla.setRowCount(0);
        
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;
        
        int[] anchos = {10, 75, 75, 75, 75,75};
        for (int i = 0; i < tblViajes.getColumnCount(); i++) {
            tblViajes.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }
        
        try{
            Connection con = ClsConexion.obtenerConexion();
            
            ps = con.prepareStatement("SELECT codigo_viaje,v.descripcion, b.descripcion, p.descripcion ,fecha_partida,fecha_regreso \n" +
                                        "FROM [dbo].[Viajes] v join [dbo].[Buques] b\n" +
                                        "on v.codigo_buque = b.codigo_buque \n" +
                                        "join [dbo].[Puertos-Destinos] p\n" +
                                        "on v.codigo_puerto = p.codigo_puerto");
            
            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            columnas = rsmd.getColumnCount();
            
            while(rs.next()){
                Object[] fila = new Object[columnas];
                
                for (int i = 0; i < columnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                
                modeloTabla.addRow(fila);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
    //Llena la tabla de destinos con los destinos de ese viaje
    private  void cargarTablaDestino(int codigo){
        DefaultTableModel modeloTabla = (DefaultTableModel) tblDestinos.getModel();
        
        modeloTabla.setRowCount(0);
        
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;
        
        int[] anchos = {50, 20, 50, 50};
        for (int i = 0; i < tblDestinos.getColumnCount(); i++) {
            tblDestinos.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }
        
        
        try{
            Connection con = ClsConexion.obtenerConexion();
            
            ps = con.prepareStatement("Select dt.descripcion, dd.codigo_puerto, dd.fecha_llegada, dd.fecha_salida\n" +
                                        "From [dbo].[Detalle_destinos] dd join [dbo].[Puertos-Destinos] pd\n" +
                                        "on dd.codigo_puerto = pd.codigo_puerto\n" +
                                        "join [dbo].[Destinos_Turisticos] dt\n" +
                                        "on pd.codigo_destino = dt.codigo_destino\n" +
                                        "Where codigo_viaje = ?");
            
            ps.setInt(1, codigo);
            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            columnas = rsmd.getColumnCount();
            
            while(rs.next()){
                Object[] fila = new Object[columnas];
                
                for (int i = 0; i < columnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                
                modeloTabla.addRow(fila);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
    //Guardo los datos del viaje en la clase ClsViajes
    private void guardarDatos(){
        SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
        
        viaje.setFechaSalida(df.format(jdcFechaSalida.getDate()));
        viaje.setFechaRegreso(df.format(jdcFechaRegreso.getDate()));
        viaje.setCodigoBuque(viaje.codigoBuque(cbBuque.getSelectedItem().toString()));
        viaje.setCodigoPuerto(viaje.codigoPuerto(cbPuerto.getSelectedItem().toString()));
        viaje.setDescripcion(txtNombre.getText());
    }
    
    //Ingresa los destinos de la tabla en la base de datos
    private void ingresarDestinos(){
        
        for (int i = 0; i < tblDestinos.getRowCount(); i++) {
            viaje.ingresarDestino(Integer.parseInt(tblDestinos.getValueAt(i,1).toString()), 
                tblDestinos.getValueAt(i, 2).toString() , tblDestinos.getValueAt(i, 3).toString());
        }
        
    }
    
    //Limpia los datos del formulario
    private void limpiar(){
        txtNombre.setText(null);
        jdcFechaSalida.setDate(null);
        jdcFechaRegreso.setDate(null);
        cbPuerto.setSelectedIndex(-1);
        cbBuque.setSelectedIndex(-1);
        cbDestinoTuristico.setSelectedIndex(-1);
        cbPuertoDestino.setSelectedIndex(-1);
        jdcFechaLlegada.setDate(null);
        jdcFechaPartida.setDate(null);
        
        DefaultTableModel modeloTabla = (DefaultTableModel) tblDestinos.getModel();
        
        modeloTabla.setRowCount(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAgregarDestino;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminarDestino;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cbBuque;
    private javax.swing.JComboBox<String> cbDestinoTuristico;
    private javax.swing.JComboBox<String> cbPuerto;
    private javax.swing.JComboBox<String> cbPuertoDestino;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private com.toedter.calendar.JDateChooser jdcFechaLlegada;
    private com.toedter.calendar.JDateChooser jdcFechaPartida;
    private com.toedter.calendar.JDateChooser jdcFechaRegreso;
    private com.toedter.calendar.JDateChooser jdcFechaSalida;
    private javax.swing.JTable tblDestinos;
    private javax.swing.JTable tblViajes;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
