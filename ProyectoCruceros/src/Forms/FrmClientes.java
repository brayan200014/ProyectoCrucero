
package Forms;

import Clases.ClsConexion;
import Clientes.ClsClientes;
import Clientes.ClsMetodosCliente;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;
 
public class FrmClientes extends javax.swing.JPanel {
        
    ClsClientes cli=new ClsClientes();
    ClsMetodosCliente meCli= new ClsMetodosCliente();
   
    public FrmClientes() {
        initComponents();
        cargarTabla();
    }
    
    private void cargarTabla() {
        DefaultTableModel modelotabla = (DefaultTableModel) JTabla.getModel();
        modelotabla.setRowCount(0);

        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;
        try {
            Connection con = ClsConexion.obtenerConexion();
            ps = con.prepareStatement("SELECT codigo_cliente, nombre, apellido,"
                    + "identidad, telefono, sexo, fecha_nacimiento, correo_electronico, "
                    + "direccion,"
                    + "nacionalidad FROM Clientes");
            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            columnas = rsmd.getColumnCount();

            while (rs.next()) {
                Object[] fila = new Object[columnas];
                for (int i = 0; i < columnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modelotabla.addRow(fila);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error Carga de Datos" + ex);
        }
    }
    
    private void LimpiarRegistro(){
        txtNombre.setText(null);
        txtApellido.setText(null);
        txtIdentidad.setText(null);
        txtDireccion.setText(null);
        jDateNacimiento.setDate(new Date());
        buttonGroup1.clearSelection();
        txtTelefono.setText(null);
        txtNacionalidad.setText(null);
        txtCorreo.setText(null);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        rbMasculino = new javax.swing.JRadioButton();
        rbFemenino = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTabla = new javax.swing.JTable();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtIdentidad = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtNacionalidad = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jDateNacimiento = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(96, 203, 249));
        setPreferredSize(new java.awt.Dimension(286, 171));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(96, 203, 249));
        jPanel1.setPreferredSize(new java.awt.Dimension(870, 390));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setText("Identidad:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setText("Nacionalidad:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel5.setText("Apellido:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel6.setText("Teléfono:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel7.setText("Dirección:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, -1, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel8.setText("Género:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel9.setText("Correo Electrónico:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel10.setText("Nacimiento:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, -1, -1));

        buttonGroup1.add(rbMasculino);
        rbMasculino.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        rbMasculino.setText("Masculino");
        jPanel1.add(rbMasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, -1));

        buttonGroup1.add(rbFemenino);
        rbFemenino.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        rbFemenino.setText("Femenino");
        jPanel1.add(rbFemenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, -1, -1));

        JTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Apellido", "Identidad", "Telefono", "Genero", "Nacimiento", "Correo", "Direccion", "Nacionalidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(JTabla);
        JTabla.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (JTabla.getColumnModel().getColumnCount() > 0) {
            JTabla.getColumnModel().getColumn(0).setResizable(false);
            JTabla.getColumnModel().getColumn(1).setResizable(false);
            JTabla.getColumnModel().getColumn(2).setResizable(false);
            JTabla.getColumnModel().getColumn(3).setResizable(false);
            JTabla.getColumnModel().getColumn(4).setResizable(false);
            JTabla.getColumnModel().getColumn(5).setResizable(false);
            JTabla.getColumnModel().getColumn(6).setResizable(false);
            JTabla.getColumnModel().getColumn(7).setResizable(false);
            JTabla.getColumnModel().getColumn(8).setResizable(false);
            JTabla.getColumnModel().getColumn(9).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 810, 80));

        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 190, -1));

        txtApellido.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 50, 180, -1));

        txtIdentidad.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtIdentidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdentidadKeyTyped(evt);
            }
        });
        jPanel1.add(txtIdentidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 190, -1));

        txtTelefono.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 180, -1));

        txtNacionalidad.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtNacionalidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNacionalidadKeyTyped(evt);
            }
        });
        jPanel1.add(txtNacionalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 190, -1));

        txtCorreo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 190, -1));

        txtDireccion.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, 180, -1));

        btnAgregar.setBackground(new java.awt.Color(12, 69, 104));
        btnAgregar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/agregar.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 150, -1));

        btnEditar.setBackground(new java.awt.Color(12, 69, 104));
        btnEditar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Icono Editar.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, 140, -1));

        jButton3.setBackground(new java.awt.Color(12, 69, 104));
        jButton3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/actualizar.png"))); // NOI18N
        jButton3.setText("Actualizar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 420, 150, -1));

        jDateNacimiento.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jDateNacimiento.setMaxSelectableDate(new java.util.Date(1262329262000L));
        jDateNacimiento.setMinSelectableDate(new java.util.Date(-631126738000L));
        jPanel1.add(jDateNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 180, 30));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 580));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
     
        SimpleDateFormat dFormat=new SimpleDateFormat("dd-MM-yy");
        String fecha_nacimiento=dFormat.format(jDateNacimiento.getDate());
        String sexo=" ";
       if(rbMasculino.isSelected()==true){
           sexo="Masculino";
       }else if(rbFemenino.isSelected()==true){
           sexo="Femenino";
       }
        cli.setNombre(txtNombre.getText());
        cli.setApellido(txtApellido.getText());
        cli.setIdentidad(txtIdentidad.getText());
        cli.setTelefono(txtTelefono.getText());
        cli.setNacionalidad(txtNacionalidad.getText());
        cli.setDireccion(txtDireccion.getText());
        cli.setCorreo_electronico(txtCorreo.getText());
        cli.setFecha_nacimiento(fecha_nacimiento);
        cli.setSexo(sexo);
        
        meCli.Insertar();
        cargarTabla();
        LimpiarRegistro();
        
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        try {
            jDateNacimiento.getCalendarButton().setEnabled(false);
            int fila = JTabla.getSelectedRow();
            int id = Integer.parseInt(JTabla.getValueAt(fila, 0).toString());
            ResultSet rs;
            PreparedStatement ps;
            Connection conn = ClsConexion.obtenerConexion();
            ps = conn.prepareStatement("SELECT nombre,apellido,fecha_nacimiento,identidad,sexo,telefono,correo_electronico,direccion,nacionalidad FROM Clientes where codigo_cliente=?");
            ps.setInt(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {
                txtNombre.setText(rs.getString("nombre"));
                txtApellido.setText(rs.getString("apellido"));
                jDateNacimiento.setDate(rs.getDate("fecha_nacimiento"));
                txtIdentidad.setText(rs.getString("identidad"));
                
                if (rs.getString("sexo").equals("Masculino")) {
                    rbMasculino.setSelected(true);
                } else if (rs.getString("sexo").equals("Femenino")) {
                    rbFemenino.setSelected(true);
                }
                txtTelefono.setText(rs.getString("telefono"));
                txtCorreo.setText(rs.getString("correo_electronico"));
                txtDireccion.setText(rs.getString("direccion"));
                txtNacionalidad.setText(rs.getString("nacionalidad"));

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de Seleccion" + ex);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        SimpleDateFormat dFormat=new SimpleDateFormat("dd-MM-yy");
        String fecha_nacimiento=dFormat.format(jDateNacimiento.getDate());
        String sexo=" ";
       if(rbMasculino.isSelected()==true){
           sexo="Masculino";
       }else if(rbFemenino.isSelected()==true){
           sexo="Femenino";
       }
        
        int fila = JTabla.getSelectedRow();
        int id = Integer.parseInt(JTabla.getValueAt(fila, 0).toString());
        
        cli.setId(id);
        cli.setNombre(txtNombre.getText());
        cli.setApellido(txtApellido.getText());
        cli.setIdentidad(txtIdentidad.getText());
        cli.setTelefono(txtTelefono.getText());
        cli.setNacionalidad(txtNacionalidad.getText());
        cli.setDireccion(txtDireccion.getText());
        cli.setCorreo_electronico(txtCorreo.getText());
        cli.setFecha_nacimiento(fecha_nacimiento);
        cli.setSexo(sexo);
        
        meCli.Actualizar();
        LimpiarRegistro();
        cargarTabla();
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char letra = evt.getKeyChar();
        
        if(Character.isDigit(letra)){
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese solamente letras", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
         char letra = evt.getKeyChar();
        
        if(Character.isDigit(letra)){
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese solamente letras", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void txtIdentidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdentidadKeyTyped
        char numero = evt.getKeyChar();
        if((numero<'0' || numero>'9') && numero != evt.VK_BACK_SPACE){
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese solamente numeros", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_txtIdentidadKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
         char numero = evt.getKeyChar();
        if((numero<'0' || numero>'9') && numero != evt.VK_BACK_SPACE){
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese solamente numeros", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtNacionalidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNacionalidadKeyTyped
        char letra = evt.getKeyChar();
        
        if(Character.isDigit(letra)){
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese solamente letras", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtNacionalidadKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTabla;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDateChooser jDateNacimiento;
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
    private javax.swing.JRadioButton rbFemenino;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtIdentidad;
    private javax.swing.JTextField txtNacionalidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
