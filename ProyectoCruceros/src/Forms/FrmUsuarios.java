package Forms;

import Clases.ClsConexion;
import Clases.ClsUsuarios;
import Clases.ClsUsuariosMetodos;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class FrmUsuarios extends javax.swing.JPanel {

    Connection con = ClsConexion.obtenerConexion();
    ClsUsuarios usu = new ClsUsuarios();
    ClsUsuariosMetodos usumet = new ClsUsuariosMetodos();
    PreparedStatement ps;
    ResultSet rs;
    ResultSetMetaData rsmd;
    int seleccion;

    public FrmUsuarios() {
        initComponents();
        cargarTabla();
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);
    }

    private void cargarTabla() {
        DefaultTableModel modelotabla = (DefaultTableModel) tblUsuarios.getModel();
        modelotabla.setRowCount(0);

        int columnas;
        try {
            ps = con.prepareStatement("SELECT * FROM Usuarios");
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

    private void limpiar() {
        txtnombreUsuario.setText(null);
        txtidemp.setText(null);
        txtcontra.setText(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

<<<<<<< HEAD
<<<<<<< HEAD
=======
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        txtidemp = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtnombreUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtcontra = new javax.swing.JTextField();

>>>>>>> origin/UnionAvance1
=======
        jButton1 = new javax.swing.JButton();
        jCalendar1 = new com.toedter.calendar.JCalendar();

>>>>>>> parent of e46bb1b (limpieza)
        setBackground(new java.awt.Color(96, 203, 249));
        setLayout(null);

<<<<<<< HEAD
<<<<<<< HEAD
=======
        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

>>>>>>> parent of e46bb1b (limpieza)
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
            .addGroup(layout.createSequentialGroup()
                .addGap(299, 299, 299)
                .addComponent(jButton1)
                .addContainerGap(498, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Hola");
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
<<<<<<< HEAD
=======
        btnAgregar.setBackground(new java.awt.Color(12, 69, 104));
        btnAgregar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/agregar.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setInheritsPopupMenu(true);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        add(btnAgregar);
        btnAgregar.setBounds(139, 393, 170, 40);

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
        add(btnEditar);
        btnEditar.setBounds(331, 393, 140, 40);

        btnActualizar.setBackground(new java.awt.Color(12, 69, 104));
        btnActualizar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/actualizar.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        add(btnActualizar);
        btnActualizar.setBounds(489, 393, 160, 40);

        btnEliminar.setBackground(new java.awt.Color(12, 69, 104));
        btnEliminar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Basurero.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        add(btnEliminar);
        btnEliminar.setBounds(679, 393, 160, 40);

        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Id Empleado", "Nombre Usuario", "Contraseña", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
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
        tblUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblUsuarios);

        add(jScrollPane1);
        jScrollPane1.setBounds(458, 107, 419, 195);

        txtidemp.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtidemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidempActionPerformed(evt);
            }
        });
        txtidemp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidempKeyTyped(evt);
            }
        });
        add(txtidemp);
        txtidemp.setBounds(210, 185, 190, 30);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setText("Nombre Usuario:");
        add(jLabel3);
        jLabel3.setBounds(42, 130, 160, 20);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setText("Id Empleado:");
        add(jLabel1);
        jLabel1.setBounds(42, 187, 135, 20);

        txtnombreUsuario.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtnombreUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreUsuarioKeyTyped(evt);
            }
        });
        add(txtnombreUsuario);
        txtnombreUsuario.setBounds(210, 128, 190, 30);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setText("Contraseña:");
        add(jLabel2);
        jLabel2.setBounds(42, 241, 120, 20);

        txtcontra.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtcontra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontraActionPerformed(evt);
            }
        });
        txtcontra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcontraKeyTyped(evt);
            }
        });
        add(txtcontra);
        txtcontra.setBounds(210, 239, 190, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (txtnombreUsuario.getText().equals("") || txtidemp.getText().equals("") || txtcontra.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debe llenar todos los Campos",
                    "WARNING", JOptionPane.WARNING_MESSAGE);
        } else {
            int estado = 1;
            usu.setIdEmpleado(Integer.parseInt(txtidemp.getText()));
            usu.setNombreUsuario(txtnombreUsuario.getText());
            usu.setContrasena(txtcontra.getText());
            usu.setEstado(estado);

            usumet.Insertar();
            limpiar();
            cargarTabla();
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (seleccion == 1) {
            btnActualizar.setEnabled(true);
            btnEditar.setEnabled(false);
            btnAgregar.setEnabled(false);
            btnEliminar.setEnabled(true);

            try {

                int fila = tblUsuarios.getSelectedRow();
                int id = Integer.parseInt(tblUsuarios.getValueAt(fila, 0).toString());

                ps = con.prepareStatement("SELECT codigo_empleado, nombre_usuario, contrasenia FROM Usuarios WHERE codigo_usuario=?");
                ps.setInt(1, id);
                rs = ps.executeQuery();

                while (rs.next()) {
                    txtnombreUsuario.setText(rs.getString("nombre_usuario"));
                    txtcontra.setText(rs.getString("contrasenia"));
                    txtidemp.setText(rs.getString("codigo_empleado"));
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un Registro de la Tabla",
                    "WARNING", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        if (txtnombreUsuario.getText().equals("") || txtidemp.getText().equals("") || txtcontra.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debe llenar todos los Campos",
                    "WARNING", JOptionPane.WARNING_MESSAGE);
            seleccion = 0;
        } else {
            int fila = tblUsuarios.getSelectedRow();
            int id = Integer.parseInt(tblUsuarios.getValueAt(fila, 0).toString());

            usu.setId(id);
            usu.setNombreUsuario(txtnombreUsuario.getText());
            usu.setContrasena(txtcontra.getText());

            usumet.Actualizar();
            limpiar();
            cargarTabla();

            btnActualizar.setEnabled(false);
            btnEditar.setEnabled(true);
            btnAgregar.setEnabled(true);
            btnEliminar.setEnabled(false);
            seleccion = 0;
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (txtnombreUsuario.getText().equals("") || txtidemp.getText().equals("") || txtcontra.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Deben estar los campos llenos, vuelva a seleccionar el registro",
                    "WARNING", JOptionPane.WARNING_MESSAGE);

            btnActualizar.setEnabled(false);
            btnEditar.setEnabled(true);
            btnEliminar.setEnabled(false);
            limpiar();

        } else {
            int fila = tblUsuarios.getSelectedRow();
            int id = Integer.parseInt(tblUsuarios.getValueAt(fila, 0).toString());
            usu.setId(id);

            usumet.Eliminar();
            limpiar();
            cargarTabla();

            btnActualizar.setEnabled(false);
            btnEditar.setEnabled(true);
            btnAgregar.setEnabled(true);
            btnEliminar.setEnabled(false);
            seleccion = 0;
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tblUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsuariosMouseClicked
        seleccion = 1;
    }//GEN-LAST:event_tblUsuariosMouseClicked

    private void txtidempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidempActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidempActionPerformed

    private void txtidempKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidempKeyTyped
        char numero = evt.getKeyChar();
        if ((numero < '0' || numero > '9') && numero != evt.VK_BACK_SPACE) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo puede ingresar numeros", "WARNING", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtidempKeyTyped

    private void txtnombreUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreUsuarioKeyTyped

    }//GEN-LAST:event_txtnombreUsuarioKeyTyped

    private void txtcontraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcontraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcontraActionPerformed

    private void txtcontraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcontraKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcontraKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTextField txtcontra;
    private javax.swing.JTextField txtidemp;
    private javax.swing.JTextField txtnombreUsuario;
>>>>>>> origin/UnionAvance1
=======
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JCalendar jCalendar1;
>>>>>>> parent of e46bb1b (limpieza)
    // End of variables declaration//GEN-END:variables
}
