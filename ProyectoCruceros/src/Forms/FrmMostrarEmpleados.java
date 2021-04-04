package Forms;

import Clases.ClsConexion;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class FrmMostrarEmpleados extends javax.swing.JFrame {

    Connection con = ClsConexion.obtenerConexion();
    PreparedStatement ps = null;
    ResultSet rs;
    ResultSetMetaData rsmd;

    public FrmMostrarEmpleados() {
        initComponents();
        cargarTabla();
    }

    private TableRowSorter TRSfiltro;

    private void cargarTabla() {
        DefaultTableModel modelotabla = (DefaultTableModel) tblMostrarEmpleados.getModel();
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

    public void Filtro() {
        int columnaTabla = 4;
        TRSfiltro.setRowFilter(RowFilter.regexFilter(txtbuscarident.getText(), columnaTabla));
    }

    public void FiltroN() {

        int columNombre = 1;
        TRSfiltro.setRowFilter(RowFilter.regexFilter(txtbuscarnombre.getText(), columNombre));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMostrarEmpleados = new javax.swing.JTable();
        txtbuscarident = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtbuscarnombre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(96, 203, 249));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setText("Identidad:");

        tblMostrarEmpleados.setModel(new javax.swing.table.DefaultTableModel(
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
        tblMostrarEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMostrarEmpleadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMostrarEmpleados);

        txtbuscarident.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtbuscarident.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscaridentActionPerformed(evt);
            }
        });
        txtbuscarident.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbuscaridentKeyTyped(evt);
            }
        });

        jLabel1.setText("Nombre:");

        txtbuscarnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbuscarnombreKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbuscarident, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtbuscarnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 884, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbuscarident, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtbuscarnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblMostrarEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMostrarEmpleadosMouseClicked

    }//GEN-LAST:event_tblMostrarEmpleadosMouseClicked

    private void txtbuscaridentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscaridentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuscaridentActionPerformed

    private void txtbuscaridentKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscaridentKeyTyped
        char numero = evt.getKeyChar();
        if ((numero < '0' || numero > '9') && numero != evt.VK_BACK_SPACE) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo puede ingresar numeros", "WARNING", JOptionPane.WARNING_MESSAGE);
        }

        txtbuscarident.addKeyListener(new KeyAdapter() {

            public void keyReleased(final KeyEvent e) {
                String cadena = (txtbuscarident.getText());
                txtbuscarident.setText(cadena);
                Filtro();
            }

        });
        TRSfiltro = new TableRowSorter(tblMostrarEmpleados.getModel());
        tblMostrarEmpleados.setRowSorter(TRSfiltro);
    }//GEN-LAST:event_txtbuscaridentKeyTyped

    private void txtbuscarnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarnombreKeyTyped
        char letra = evt.getKeyChar();

        if (Character.isDigit(letra)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo puede ingresar letras", "WARNING", JOptionPane.WARNING_MESSAGE);
        }
        
        txtbuscarnombre.addKeyListener(new KeyAdapter() {

            public void keyReleased(final KeyEvent e) {
                String cadena = (txtbuscarnombre.getText());
                txtbuscarnombre.setText(cadena);
                FiltroN();
            }

        });
        TRSfiltro = new TableRowSorter(tblMostrarEmpleados.getModel());
        tblMostrarEmpleados.setRowSorter(TRSfiltro);
    }//GEN-LAST:event_txtbuscarnombreKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmMostrarEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMostrarEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMostrarEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMostrarEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMostrarEmpleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMostrarEmpleados;
    private javax.swing.JTextField txtbuscarident;
    private javax.swing.JTextField txtbuscarnombre;
    // End of variables declaration//GEN-END:variables
}
