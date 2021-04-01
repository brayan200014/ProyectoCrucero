/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Clases.ClsConexion;
import Ventas.ClsVentas;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author BRAYAN HERNADEZ
 */
public class FrmListadoVentas extends javax.swing.JPanel {
  

    private TableRowSorter TRSFfilter;
     ClsConexion conexion= new ClsConexion();
     PreparedStatement ps= null;
     ResultSet rs; 
     ResultSetMetaData rsmd;
        
      ClsVentas ventas = new ClsVentas();
      
    /**
     * Creates new form FrmListadoVentas
     */
    public FrmListadoVentas() {
        initComponents();
       cargardatos();
     
    }

    private void cargardatos()
    {
       int columnas;
      DefaultTableModel modelo= (DefaultTableModel) tableVentas.getModel();
      modelo.setRowCount(0);
        try 
         {
             Connection con= conexion.obtenerConexion();
            ps=con.prepareStatement("execute cargarDatosVentas");
             rs=ps.executeQuery();
             rsmd= rs.getMetaData();
             columnas= rsmd.getColumnCount();
             while(rs.next())
             {
                Object [] fila= new Object[columnas];
                 for(int i=0; i<columnas; i++)
                 {
                     fila[i]=rs.getObject(i+1);
                 }
                 modelo.addRow(fila);
             }
         }
         catch(SQLException ex)
         {
              JOptionPane.showMessageDialog(null, "Ocurrio un error al extraer los datos"+ex, "Warning", JOptionPane.WARNING_MESSAGE);
         }
        
    }
    
    public void Filtro()
    {
        int columnas= 2;
                TRSFfilter.setRowFilter(RowFilter.regexFilter(txtBuscar.getText(),columnas));
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tableVentas = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        btnVerDetalle = new javax.swing.JButton();

        setBackground(new java.awt.Color(96, 203, 249));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setText("Buscar:");

        tableVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo Venta", "Fecha Venta", "Cliente", "Codigo Viaje", "Empleado", "Subtotal", "ISV", "Imp. Portuario", "Propina", "Descuento", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableVentas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tableVentas);
        if (tableVentas.getColumnModel().getColumnCount() > 0) {
            tableVentas.getColumnModel().getColumn(0).setResizable(false);
            tableVentas.getColumnModel().getColumn(1).setResizable(false);
            tableVentas.getColumnModel().getColumn(2).setResizable(false);
            tableVentas.getColumnModel().getColumn(3).setResizable(false);
            tableVentas.getColumnModel().getColumn(4).setResizable(false);
            tableVentas.getColumnModel().getColumn(5).setResizable(false);
            tableVentas.getColumnModel().getColumn(6).setResizable(false);
            tableVentas.getColumnModel().getColumn(7).setResizable(false);
            tableVentas.getColumnModel().getColumn(8).setResizable(false);
            tableVentas.getColumnModel().getColumn(9).setResizable(false);
            tableVentas.getColumnModel().getColumn(10).setResizable(false);
        }

        txtBuscar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });

        btnVerDetalle.setBackground(new java.awt.Color(12, 69, 104));
        btnVerDetalle.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnVerDetalle.setForeground(new java.awt.Color(255, 255, 255));
        btnVerDetalle.setText("Ver Detalle");
        btnVerDetalle.setBorderPainted(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 773, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVerDetalle)
                .addGap(358, 358, 358))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVerDetalle)
                .addContainerGap(32, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        // TODO add your handling code here:
        txtBuscar.addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyReleased(final KeyEvent e) {
                    String cadena = (txtBuscar.getText());
                    txtBuscar.setText(cadena);
                    Filtro(); 
        }
        });    
        TRSFfilter= new TableRowSorter(tableVentas.getModel());
        tableVentas.setRowSorter(TRSFfilter);
    }//GEN-LAST:event_txtBuscarKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVerDetalle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableVentas;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
