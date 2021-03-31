package Forms;

import Clases.ClsConexion;
import Reservaciones.ClsMetodosReservaciones;
import Reservaciones.ClsReservaciones;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;

public class FrmReservaciones extends javax.swing.JFrame {

    ClsConexion conn = new ClsConexion();
    ClsReservaciones reser = new ClsReservaciones();
    ClsMetodosReservaciones metreser = new ClsMetodosReservaciones();
    private TableRowSorter TRSFiltro;

    public FrmReservaciones() {
        initComponents();
        cargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbReservaciones = new javax.swing.JTable();
        txtFiltro = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(96, 203, 249));

        jPanel1.setBackground(new java.awt.Color(96, 203, 249));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbReservaciones.setBackground(new java.awt.Color(96, 203, 249));
        tbReservaciones.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        tbReservaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código Viaje", "Destino", "Codigo Camarote", "Tipo Camarote", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
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
        tbReservaciones.setAutoscrolls(false);
        tbReservaciones.setSelectionBackground(new java.awt.Color(12, 69, 104));
        tbReservaciones.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbReservaciones.getTableHeader().setResizingAllowed(false);
        tbReservaciones.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbReservaciones);
        if (tbReservaciones.getColumnModel().getColumnCount() > 0) {
            tbReservaciones.getColumnModel().getColumn(0).setResizable(false);
            tbReservaciones.getColumnModel().getColumn(1).setResizable(false);
            tbReservaciones.getColumnModel().getColumn(2).setResizable(false);
            tbReservaciones.getColumnModel().getColumn(3).setResizable(false);
            tbReservaciones.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 690, 250));

        txtFiltro.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFiltroKeyTyped(evt);
            }
        });
        jPanel1.add(txtFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 490, 30));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setText("Búsqueda");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, -1));

        btnCancelar.setBackground(new java.awt.Color(12, 69, 104));
        btnCancelar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar Reservación");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, -1, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 930, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void verificarEstado() {
        ResultSet rs;
        try {
            Connection cn = conn.obtenerConexion();

            PreparedStatement ps = cn.prepareStatement("select estado from Reservaciones where codigo_viaje = ?");

            ps.setInt(1, reser.getCodigo());
            rs = ps.executeQuery();

            if (rs.next()) {

                reser.setEstado(rs.getInt("estado"));
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
       

        if (tbReservaciones.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione una fila para eliminar", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {

            int fila = tbReservaciones.getSelectedRow();
            reser.setCodigo(Integer.parseInt(tbReservaciones.getValueAt(fila, 0).toString()));
            metreser.cancelar();
            cargarTabla();

        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtFiltroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyTyped
        char c = evt.getKeyChar();

        if (Character.isDigit(c)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Sólo se admiten letras", "WARNING", JOptionPane.WARNING_MESSAGE);
        } else {
            txtFiltro.addKeyListener(new KeyAdapter() {

                @Override
                public void keyReleased(final KeyEvent e) {
                    String cadena = (txtFiltro.getText());
                    txtFiltro.setText(cadena);
                    busqueda();
                }
            });

            TRSFiltro = new TableRowSorter(tbReservaciones.getModel());
            tbReservaciones.setRowSorter(TRSFiltro);
        }
    }//GEN-LAST:event_txtFiltroKeyTyped

    private void cargarTabla() {
        DefaultTableModel modeloTabla = (DefaultTableModel) tbReservaciones.getModel();
        modeloTabla.setRowCount(0);

        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;

        int[] anchos = {10, 50, 5, 100, 20};
        for (int i = 0; i < tbReservaciones.getColumnCount(); i++) {
            tbReservaciones.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }

        try {
            Connection cn = conn.obtenerConexion();
            ps = cn.prepareStatement("select r.codigo_viaje,\n"
                    + "dt.descripcion,\n"
                    + "c.codigo_camarote,\n"
                    + "tc.descripcion,\n"
                    + "\n"
                    + "case when r.estado = 1 then 'Confirmado'\n"
                    + "else\n"
                    + "'Cancelado' end as estado \n"
                    + "\n"
                    + "from [dbo].[Viajes] v join [dbo].[Reservaciones] r\n"
                    + "on r.codigo_viaje = v.codigo_viaje\n"
                    + "join [dbo].[Camarote] c\n"
                    + "on c.codigo_camarote = r.codigo_camarote\n"
                    + "join [dbo].[Tipo_Camarote] tc \n"
                    + "on tc.codigo_tipo_camarote = c.codigo_tipo_camarote\n"
                    + "join [dbo].[Detalle_destinos] dd\n"
                    + "on v.codigo_viaje = dd.codigo_viaje\n"
                    + "join [dbo].[Puertos-Destinos] pd\n"
                    + "on pd.codigo_puerto = dd.codigo_puerto\n"
                    + "join [dbo].[Destinos_Turisticos] dt\n"
                    + "on dt.codigo_destino = pd.codigo_destino");

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

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmReservaciones().setVisible(true);
            }
        });
    }

    private void busqueda() {
        int columnaTabla = 1;
        TRSFiltro.setRowFilter(RowFilter.regexFilter("(?i)" + txtFiltro.getText(), columnaTabla));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbReservaciones;
    private javax.swing.JTextField txtFiltro;
    // End of variables declaration//GEN-END:variables
}
