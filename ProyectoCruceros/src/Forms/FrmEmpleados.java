package Forms;

import Clases.ClsConexion;
import Clases.ClsEmpleados;
import Clases.ClsEmpleadosMetodos;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmEmpleados extends javax.swing.JPanel {

    Connection con = ClsConexion.obtenerConexion();
    ClsEmpleados emp = new ClsEmpleados();
    ClsEmpleadosMetodos empmetodos = new ClsEmpleadosMetodos();
    SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yy");
    int seleccion;

    PreparedStatement ps;
    ResultSet rs;
    ResultSetMetaData rsmd;

    public FrmEmpleados() {
        initComponents();
        cargarTabla();
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);
    }

    private void cargarTabla() {
        DefaultTableModel modelotabla = (DefaultTableModel) tblEmpleados.getModel();
        modelotabla.setRowCount(0);

        int columnas;
        try {
            ps = con.prepareStatement("SELECT * FROM Empleados");
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
        txtidentidad.setText(null);
        txtnombre.setText(null);
        txtapellido.setText(null);
        jcnacimiento.setDate(new Date());
        btngroup.clearSelection();
        txttelefono.setText(null);
        txtcorreo.setText(null);
        txtdireccion.setText(null);
        txtcodpuesto.setText(null);
        txtnacionalidad.setText(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngroup = new javax.swing.ButtonGroup();
        rbm = new javax.swing.JRadioButton();
        txtidentidad = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtapellido = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        txtcorreo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        rbf = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpleados = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txtnacionalidad = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jcnacimiento = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        txtcodpuesto = new javax.swing.JTextField();

        setBackground(new java.awt.Color(96, 203, 249));
        setLayout(null);

        btngroup.add(rbm);
        rbm.setText("Masculino");
        add(rbm);
        rbm.setBounds(180, 190, 90, 23);

        txtidentidad.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtidentidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidentidadActionPerformed(evt);
            }
        });
        txtidentidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidentidadKeyTyped(evt);
            }
        });
        add(txtidentidad);
        txtidentidad.setBounds(180, 10, 190, 30);

        txtnombre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });
        add(txtnombre);
        txtnombre.setBounds(180, 50, 190, 30);

        txtapellido.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtapellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapellidoKeyTyped(evt);
            }
        });
        add(txtapellido);
        txtapellido.setBounds(180, 90, 190, 30);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setText("Nombre:");
        add(jLabel1);
        jLabel1.setBounds(50, 50, 110, 20);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setText("Apellido:");
        add(jLabel2);
        jLabel2.setBounds(50, 90, 110, 20);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setText("Identidad:");
        add(jLabel3);
        jLabel3.setBounds(50, 10, 110, 20);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setText("Sexo:");
        add(jLabel4);
        jLabel4.setBounds(50, 190, 100, 20);

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel5.setText("Telefono:");
        add(jLabel5);
        jLabel5.setBounds(50, 140, 110, 20);

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel6.setText("Direccion:");
        add(jLabel6);
        jLabel6.setBounds(470, 50, 130, 20);

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel7.setText("Correo:");
        add(jLabel7);
        jLabel7.setBounds(470, 10, 120, 20);

        txttelefono.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txttelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelefonoKeyTyped(evt);
            }
        });
        add(txttelefono);
        txttelefono.setBounds(180, 140, 190, 30);

        txtdireccion.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtdireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdireccionKeyTyped(evt);
            }
        });
        add(txtdireccion);
        txtdireccion.setBounds(630, 60, 240, 30);

        txtcorreo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtcorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcorreoKeyTyped(evt);
            }
        });
        add(txtcorreo);
        txtcorreo.setBounds(630, 10, 240, 30);

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel8.setText("Fecha Nacimiento:");
        add(jLabel8);
        jLabel8.setBounds(470, 100, 180, 20);

        btngroup.add(rbf);
        rbf.setText("Femenino");
        add(rbf);
        rbf.setBounds(280, 190, 90, 23);

        tblEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Apellido", "Nacimiento", "Identidad", "Sexo", "Telefono", "Correo", "Direccion", "Codigo Puesto", "Estado", "Nacionalidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmpleadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmpleados);
        if (tblEmpleados.getColumnModel().getColumnCount() > 0) {
            tblEmpleados.getColumnModel().getColumn(0).setResizable(false);
            tblEmpleados.getColumnModel().getColumn(1).setResizable(false);
            tblEmpleados.getColumnModel().getColumn(2).setResizable(false);
            tblEmpleados.getColumnModel().getColumn(3).setResizable(false);
            tblEmpleados.getColumnModel().getColumn(4).setResizable(false);
            tblEmpleados.getColumnModel().getColumn(5).setResizable(false);
            tblEmpleados.getColumnModel().getColumn(6).setResizable(false);
            tblEmpleados.getColumnModel().getColumn(7).setResizable(false);
            tblEmpleados.getColumnModel().getColumn(8).setResizable(false);
            tblEmpleados.getColumnModel().getColumn(9).setResizable(false);
            tblEmpleados.getColumnModel().getColumn(10).setResizable(false);
            tblEmpleados.getColumnModel().getColumn(11).setResizable(false);
        }

        add(jScrollPane1);
        jScrollPane1.setBounds(20, 240, 870, 150);

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel9.setText("Codigo Puesto:");
        add(jLabel9);
        jLabel9.setBounds(470, 150, 140, 20);

        txtnacionalidad.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtnacionalidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnacionalidadKeyTyped(evt);
            }
        });
        add(txtnacionalidad);
        txtnacionalidad.setBounds(640, 190, 230, 30);

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
        btnAgregar.setBounds(110, 400, 170, 40);

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
        btnEditar.setBounds(300, 400, 140, 40);

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
        btnActualizar.setBounds(460, 400, 160, 40);

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
        btnEliminar.setBounds(650, 400, 160, 40);

        jcnacimiento.setMaxSelectableDate(new java.util.Date(1262329281000L));
        jcnacimiento.setMinSelectableDate(new java.util.Date(-631126705000L));
        add(jcnacimiento);
        jcnacimiento.setBounds(660, 100, 210, 30);

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel10.setText("Nacionalidad:");
        add(jLabel10);
        jLabel10.setBounds(470, 190, 140, 20);

        txtcodpuesto.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtcodpuesto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcodpuestoKeyTyped(evt);
            }
        });
        add(txtcodpuesto);
        txtcodpuesto.setBounds(640, 150, 230, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void txtidentidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidentidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidentidadActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        if (txtidentidad.getText().equals("") || txtnombre.getText().equals("") || txtapellido.getText().equals("")
                || txttelefono.getText().equals("") || txtcorreo.getText().equals("") || txtdireccion.getText().equals("")
                || txtcodpuesto.getText().equals("") || txtnacionalidad.getText().equals("") || rbm.isSelected() == false
                || rbm.isSelected() == false || jcnacimiento.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Debe llenar todos los Campos",
                    "WARNING", JOptionPane.WARNING_MESSAGE);
        } else {
            String nacimiento = dFormat.format(jcnacimiento.getDate());
            String sexo = "";
            if (rbm.isSelected() == true) {
                sexo = "Masculino";
            } else if (rbf.isSelected() == true) {
                sexo = "Femenino";
            }
            int estado = 1;

            emp.setNombre(txtnombre.getText());
            emp.setApellido(txtapellido.getText());
            emp.setIdentidad(txtidentidad.getText());
            emp.setNacimiento(nacimiento);
            emp.setSexo(sexo);
            emp.setTelefono(txttelefono.getText());
            emp.setCorreo(txtcorreo.getText());
            emp.setDireccion(txtdireccion.getText());
            emp.setCodigoPuesto(Integer.parseInt(txtcodpuesto.getText()));
            emp.setEstado(estado);
            emp.setNacionalidad(txtnacionalidad.getText());

            empmetodos.Insertar();
            limpiar();
            cargarTabla();
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void tblEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmpleadosMouseClicked
        seleccion = 1;

    }//GEN-LAST:event_tblEmpleadosMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (seleccion == 1) {
            btnActualizar.setEnabled(true);
            btnEditar.setEnabled(false);
            btnAgregar.setEnabled(false);
            btnEliminar.setEnabled(true);
            try {
                int fila = tblEmpleados.getSelectedRow();
                int id = Integer.parseInt(tblEmpleados.getValueAt(fila, 0).toString());

                ps = con.prepareStatement("SELECT nombre, apellido,"
                        + "fecha_nacimiento, identidad, sexo, telefono, correo_electronico, "
                        + "direccion, codigo_puesto, estado,"
                        + "nacionalidad FROM Empleados WHERE codigo_empleado=?");
                ps.setInt(1, id);
                rs = ps.executeQuery();

                while (rs.next()) {
                    txtnombre.setText(rs.getString("nombre"));
                    txtapellido.setText(rs.getString("apellido"));
                    jcnacimiento.setDate(rs.getDate("fecha_nacimiento"));
                    txtidentidad.setText(rs.getString("identidad"));
                    if (rs.getString("sexo").equals("Masculino")) {
                        rbm.setSelected(true);
                    } else if (rs.getString("sexo").equals("Femenino")) {
                        rbf.setSelected(true);
                    }
                    txttelefono.setText(rs.getString("telefono"));
                    txtcorreo.setText(rs.getString("correo_electronico"));
                    txtdireccion.setText(rs.getString("direccion"));
                    txtcodpuesto.setText(rs.getString("codigo_puesto"));
                    txtnacionalidad.setText(rs.getString("nacionalidad"));
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

        if (txtidentidad.getText().equals("") || txtnombre.getText().equals("") || txtapellido.getText().equals("")
                || txttelefono.getText().equals("") || txtcorreo.getText().equals("") || txtdireccion.getText().equals("")
                || txtcodpuesto.getText().equals("") || txtnacionalidad.getText().equals("") || rbm.isSelected() == false
                || rbm.isSelected() == false || jcnacimiento.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Debe llenar todos los Campos",
                    "WARNING", JOptionPane.WARNING_MESSAGE);
        } else {
            String nacimiento = dFormat.format(jcnacimiento.getDate());
            String sexo = "";
            if (rbm.isSelected() == true) {
                sexo = "Masculino";
            } else if (rbf.isSelected() == true) {
                sexo = "Femenino";
            }
            int estado = 1;
            int fila = tblEmpleados.getSelectedRow();
            int id = Integer.parseInt(tblEmpleados.getValueAt(fila, 0).toString());

            emp.setId(id);
            emp.setNombre(txtnombre.getText());
            emp.setApellido(txtapellido.getText());
            emp.setIdentidad(txtidentidad.getText());
            emp.setNacimiento(nacimiento);
            emp.setSexo(sexo);
            emp.setTelefono(txttelefono.getText());
            emp.setCorreo(txtcorreo.getText());
            emp.setDireccion(txtdireccion.getText());
            emp.setEstado(estado);
            emp.setNacionalidad(txtnacionalidad.getText());
            emp.setCodigoPuesto(Integer.parseInt(txtcodpuesto.getText()));

            empmetodos.Actualizar();
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
        if (txtidentidad.getText().equals("") || txtnombre.getText().equals("") || txtapellido.getText().equals("")
                || txttelefono.getText().equals("") || txtcorreo.getText().equals("") || txtdireccion.getText().equals("")
                || txtcodpuesto.getText().equals("") || txtnacionalidad.getText().equals("") || rbm.isSelected() == false
                || rbm.isSelected() == false) {
            JOptionPane.showMessageDialog(null, "Deben estar los campos llenos, vuelva a seleccionar el registro",
                    "WARNING", JOptionPane.WARNING_MESSAGE);
            btnActualizar.setEnabled(false);
            btnEditar.setEnabled(true);
            btnEliminar.setEnabled(false);
            limpiar();
        } else {
            int fila = tblEmpleados.getSelectedRow();
            int id = Integer.parseInt(tblEmpleados.getValueAt(fila, 0).toString());
            emp.setId(id);

            empmetodos.Eliminar();
            limpiar();
            cargarTabla();

            btnActualizar.setEnabled(false);
            btnEditar.setEnabled(true);
            btnAgregar.setEnabled(true);
            btnEliminar.setEnabled(false);
            seleccion = 0;
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txttelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyTyped
        char numero = evt.getKeyChar();
        if ((numero < '0' || numero > '9') && numero != evt.VK_BACK_SPACE) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo puede ingresar numeros", "WARNING", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txttelefonoKeyTyped

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
        char letra = evt.getKeyChar();

        if (Character.isDigit(letra)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo puede ingresar letras", "WARNING", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtnombreKeyTyped

    private void txtidentidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidentidadKeyTyped
        char numero = evt.getKeyChar();
        if ((numero < '0' || numero > '9') && numero != evt.VK_BACK_SPACE) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo puede ingresar numeros", "WARNING", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtidentidadKeyTyped

    private void txtapellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidoKeyTyped
        char letra = evt.getKeyChar();

        if (Character.isDigit(letra)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo puede ingresar letras", "WARNING", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtapellidoKeyTyped

    private void txtcorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcorreoKeyTyped

    }//GEN-LAST:event_txtcorreoKeyTyped

    private void txtdireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdireccionKeyTyped

    }//GEN-LAST:event_txtdireccionKeyTyped

    private void txtnacionalidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnacionalidadKeyTyped
        char letra = evt.getKeyChar();

        if (Character.isDigit(letra)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo puede ingresar letras", "WARNING", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtnacionalidadKeyTyped

    private void txtcodpuestoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodpuestoKeyTyped
        char numero = evt.getKeyChar();
        if ((numero < '0' || numero > '9') && numero != evt.VK_BACK_SPACE) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo puede ingresar numeros", "WARNING", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtcodpuestoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.ButtonGroup btngroup;
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
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jcnacimiento;
    private javax.swing.JRadioButton rbf;
    private javax.swing.JRadioButton rbm;
    private javax.swing.JTable tblEmpleados;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtcodpuesto;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtidentidad;
    private javax.swing.JTextField txtnacionalidad;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
