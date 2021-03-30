package Forms;

import Clases.ClsConexion;
import Reservaciones.ClsMetodosReservaciones;
import Reservaciones.ClsReservaciones;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmReservaciones extends javax.swing.JFrame {

    ClsConexion conn = new ClsConexion();
    ClsReservaciones reser = new ClsReservaciones();
    ClsMetodosReservaciones metreser = new ClsMetodosReservaciones();

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
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(96, 203, 249));
        setPreferredSize(new java.awt.Dimension(930, 460));

        jPanel1.setBackground(new java.awt.Color(96, 203, 249));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbReservaciones.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
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
        jScrollPane1.setViewportView(tbReservaciones);
        if (tbReservaciones.getColumnModel().getColumnCount() > 0) {
            tbReservaciones.getColumnModel().getColumn(0).setResizable(false);
            tbReservaciones.getColumnModel().getColumn(1).setResizable(false);
            tbReservaciones.getColumnModel().getColumn(2).setResizable(false);
            tbReservaciones.getColumnModel().getColumn(3).setResizable(false);
            tbReservaciones.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 690, 250));

        jTextField1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 490, 30));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setText("Búsqueda");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        btnCancelar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnCancelar.setText("Cancelar Reservación");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, -1, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tbReservaciones;
    // End of variables declaration//GEN-END:variables
}
