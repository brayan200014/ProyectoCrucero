/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author BRAYAN HERNADEZ
 */
public class Principal extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form Principal
     */
    FrmClientes cliente= new FrmClientes();
    FrmUsuarios user= new FrmUsuarios();
    FrmViajesDisponibles viajesDis= new FrmViajesDisponibles();
    FrmEmpleados empleados= new FrmEmpleados();
    FrmBuques buques= new FrmBuques();
    FrmCamarotes camarotes= new FrmCamarotes();
    FrmVentas ventas= new FrmVentas();
    FrmViajes viajes= new FrmViajes();
    FrmDestinos destinos= new FrmDestinos();
    
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        lblTitulo.setText("VIAJES DISPONIBLES");
        PanelPrincipal1.add(viajesDis);
        PanelPrincipal1.validate();
        btnCliente.addActionListener(this);
        btnUsuarios.addActionListener(this);
        btnDisponiblesViajes.addActionListener(this);
        btnEmpleados.addActionListener(this);
        btnBuques.addActionListener(this);
        btnCamarotes.addActionListener(this);
        btnVentas.addActionListener(this);
        btnViajes.addActionListener(this);
        btnDestinos.addActionListener(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        btnMenu = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        PanelMenu = new javax.swing.JPanel();
        btnCliente = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        btnEmpleados = new javax.swing.JButton();
        btnBuques = new javax.swing.JButton();
        btnCamarotes = new javax.swing.JButton();
        btnViajes = new javax.swing.JButton();
        btnDisponiblesViajes = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        btnDestinos = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        PanelPrincipal1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelPrincipal.setBackground(new java.awt.Color(96, 203, 249));
        PanelPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        PanelPrincipal.setPreferredSize(new java.awt.Dimension(890, 436));
        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMenu.setBackground(new java.awt.Color(96, 203, 249));
        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Vector.png"))); // NOI18N
        btnMenu.setBorder(null);
        btnMenu.setContentAreaFilled(false);
        btnMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        PanelPrincipal.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 71, 54));
        btnMenu.getAccessibleContext().setAccessibleName("btnMenu");

        lblTitulo.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblTitulo.setText("TITULO MOSTRADO");
        PanelPrincipal.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, -1, -1));

        PanelMenu.setBackground(new java.awt.Color(0, 87, 139));
        PanelMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnCliente.setBackground(new java.awt.Color(160, 200, 246));
        btnCliente.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        btnCliente.setText("Cliente");
        btnCliente.setContentAreaFilled(false);
        btnCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCliente.setOpaque(true);

        btnUsuarios.setBackground(new java.awt.Color(160, 200, 246));
        btnUsuarios.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        btnUsuarios.setText("Usuarios");
        btnUsuarios.setBorder(null);
        btnUsuarios.setBorderPainted(false);
        btnUsuarios.setContentAreaFilled(false);
        btnUsuarios.setOpaque(true);

        btnEmpleados.setBackground(new java.awt.Color(160, 200, 246));
        btnEmpleados.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        btnEmpleados.setText("Empleados");
        btnEmpleados.setBorder(null);
        btnEmpleados.setBorderPainted(false);
        btnEmpleados.setContentAreaFilled(false);
        btnEmpleados.setOpaque(true);

        btnBuques.setBackground(new java.awt.Color(160, 200, 246));
        btnBuques.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        btnBuques.setText("Buques");
        btnBuques.setBorder(null);
        btnBuques.setBorderPainted(false);
        btnBuques.setContentAreaFilled(false);
        btnBuques.setOpaque(true);

        btnCamarotes.setBackground(new java.awt.Color(160, 200, 246));
        btnCamarotes.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        btnCamarotes.setText("Camarotes");
        btnCamarotes.setBorder(null);
        btnCamarotes.setBorderPainted(false);
        btnCamarotes.setContentAreaFilled(false);
        btnCamarotes.setOpaque(true);
        btnCamarotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCamarotesActionPerformed(evt);
            }
        });

        btnViajes.setBackground(new java.awt.Color(160, 200, 246));
        btnViajes.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        btnViajes.setText("Viajes");
        btnViajes.setBorder(null);
        btnViajes.setBorderPainted(false);
        btnViajes.setContentAreaFilled(false);
        btnViajes.setOpaque(true);

        btnDisponiblesViajes.setBackground(new java.awt.Color(160, 200, 246));
        btnDisponiblesViajes.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        btnDisponiblesViajes.setText("Viajes Disponibles");
        btnDisponiblesViajes.setBorder(null);
        btnDisponiblesViajes.setBorderPainted(false);
        btnDisponiblesViajes.setContentAreaFilled(false);
        btnDisponiblesViajes.setOpaque(true);

        btnVentas.setBackground(new java.awt.Color(160, 200, 246));
        btnVentas.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        btnVentas.setText("Ventas");
        btnVentas.setBorder(null);
        btnVentas.setBorderPainted(false);
        btnVentas.setContentAreaFilled(false);
        btnVentas.setOpaque(true);

        btnDestinos.setBackground(new java.awt.Color(160, 200, 246));
        btnDestinos.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        btnDestinos.setText("Destinos");
        btnDestinos.setBorder(null);
        btnDestinos.setBorderPainted(false);
        btnDestinos.setContentAreaFilled(false);
        btnDestinos.setOpaque(true);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Proyecto 1 (2).png"))); // NOI18N

        javax.swing.GroupLayout PanelMenuLayout = new javax.swing.GroupLayout(PanelMenu);
        PanelMenu.setLayout(PanelMenuLayout);
        PanelMenuLayout.setHorizontalGroup(
            PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMenuLayout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuques, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCamarotes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnViajes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDisponiblesViajes, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addComponent(btnVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDestinos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PanelMenuLayout.setVerticalGroup(
            PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuques, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCamarotes, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnViajes, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDisponiblesViajes, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDestinos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(143, Short.MAX_VALUE))
        );

        PanelPrincipal.add(PanelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(-188, 0, -1, 610));

        PanelPrincipal1.setLayout(new javax.swing.BoxLayout(PanelPrincipal1, javax.swing.BoxLayout.LINE_AXIS));
        PanelPrincipal.add(PanelPrincipal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 930, 560));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/WhatsApp_Image_2021-03-17_at_23.17 1 (4).png"))); // NOI18N
        PanelPrincipal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, 60, 50));

        getContentPane().add(PanelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        // TODO add your handling code here:
        
        int posicion= btnMenu.getX();
        if(posicion>5)
        {
            Animacion.Animacion.mover_izquierda(211, 1, 2, 2, btnMenu);
          /*  Animacion.Animacion.mover_izquierda(211, 1, 1, 1, PanelPrincipal1);*/
             Animacion.Animacion.mover_izquierda(1, -200, 2, 2, PanelMenu);
             
        }
        else
        {
            Animacion.Animacion.mover_derecha(1, 200, 2, 2, btnMenu);
            /*Animacion.Animacion.mover_derecha(1, 211, 1, 1, PanelPrincipal1);*/
            Animacion.Animacion.mover_derecha(-200, 1, 2, 2, PanelMenu);
        }
        
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnCamarotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCamarotesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCamarotesActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelMenu;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JPanel PanelPrincipal1;
    private javax.swing.JButton btnBuques;
    private javax.swing.JButton btnCamarotes;
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnDestinos;
    private javax.swing.JButton btnDisponiblesViajes;
    private javax.swing.JButton btnEmpleados;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JButton btnVentas;
    private javax.swing.JButton btnViajes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
       
         Object evt= e.getSource();
        
        if(evt.equals(btnCliente))
        {
            lblTitulo.setText("CLIENTES");
            cliente.setVisible(true);
            user.setVisible(false);
            viajesDis.setVisible(false);
            empleados.setVisible(false);
            buques.setVisible(false);
            camarotes.setVisible(false);
            ventas.setVisible(false);
            viajes.setVisible(false);
            destinos.setVisible(false);
            Animacion.Animacion.mover_izquierda(211, 1, 2, 2, btnMenu);
           /* Animacion.Animacion.mover_izquierda(211, 5, 2, 2, PanelPrincipal1);*/
            Animacion.Animacion.mover_izquierda(1, -200, 2, 2, PanelMenu);
            PanelPrincipal1.add(cliente);
            PanelPrincipal1.validate();
        }
        else if(evt.equals(btnUsuarios))
        {
            lblTitulo.setText("USUARIOS");
            cliente.setVisible(false);
            user.setVisible(true);
            viajesDis.setVisible(false);
            empleados.setVisible(false);
            buques.setVisible(false);
            camarotes.setVisible(false);
            ventas.setVisible(false);
            viajes.setVisible(false);
            destinos.setVisible(false);
            Animacion.Animacion.mover_izquierda(211, 1, 2, 2, btnMenu);
          /* Animacion.Animacion.mover_izquierda(211, 5, 1, 1, PanelPrincipal1);*/
            Animacion.Animacion.mover_izquierda(1, -200, 2, 2, PanelMenu);
            PanelPrincipal1.add(user);
            PanelPrincipal1.validate();
        }
        else if(evt.equals(btnDisponiblesViajes))
        {
            lblTitulo.setText("VIAJES DISPONIBLES");
            cliente.setVisible(false);
            user.setVisible(false);
            viajesDis.setVisible(true);
            empleados.setVisible(false);
            buques.setVisible(false);
            camarotes.setVisible(false);
            ventas.setVisible(false);
            viajes.setVisible(false);
            destinos.setVisible(false);
             Animacion.Animacion.mover_izquierda(211, 1, 2, 2, btnMenu);
           /*Animacion.Animacion.mover_izquierda(211, 5, 1, 1, PanelPrincipal1);*/
            Animacion.Animacion.mover_izquierda(1, -200, 2, 2, PanelMenu);
            PanelPrincipal1.add(viajesDis);
            PanelPrincipal1.validate();
        }
        else if(evt.equals(btnEmpleados))
        {
            lblTitulo.setText("EMPLEADOS");
            cliente.setVisible(false);
            user.setVisible(false);
            viajesDis.setVisible(false);
            empleados.setVisible(true);
            buques.setVisible(false);
            camarotes.setVisible(false);
            ventas.setVisible(false);
            viajes.setVisible(false);
            destinos.setVisible(false);
             Animacion.Animacion.mover_izquierda(211, 1, 2, 2, btnMenu);
           /*Animacion.Animacion.mover_izquierda(211, 5, 1, 1, PanelPrincipal1);*/
            Animacion.Animacion.mover_izquierda(1, -200, 2, 2, PanelMenu);
            PanelPrincipal1.add(empleados);
            PanelPrincipal1.validate();
        }
         else if(evt.equals(btnBuques))
        {
            lblTitulo.setText("BUQUES");
            cliente.setVisible(false);
            user.setVisible(false);
            viajesDis.setVisible(false);
            empleados.setVisible(false);
            buques.setVisible(true);
            camarotes.setVisible(false);
            ventas.setVisible(false);
            viajes.setVisible(false);
            destinos.setVisible(false);
              Animacion.Animacion.mover_izquierda(211, 1, 2, 2, btnMenu);
           /*Animacion.Animacion.mover_izquierda(211, 5, 1, 1, PanelPrincipal1);*/
            Animacion.Animacion.mover_izquierda(1, -200, 2, 2, PanelMenu);
            PanelPrincipal1.add(buques);
            PanelPrincipal1.validate();
        }
         else if(evt.equals(btnCamarotes))
        {
            lblTitulo.setText("CAMAROTES");
            cliente.setVisible(false);
            user.setVisible(false);
            viajesDis.setVisible(false);
            empleados.setVisible(false);
            buques.setVisible(false);
            camarotes.setVisible(true);
            ventas.setVisible(false);
            viajes.setVisible(false);
            destinos.setVisible(false);
             Animacion.Animacion.mover_izquierda(211, 1, 2, 2, btnMenu);
           /*Animacion.Animacion.mover_izquierda(211, 5, 1, 1, PanelPrincipal1);*/
            Animacion.Animacion.mover_izquierda(1, -200, 2, 2, PanelMenu);
            PanelPrincipal1.add(camarotes);
            PanelPrincipal1.validate();
        }
          else if(evt.equals(btnVentas))
        {
            lblTitulo.setText("VENTAS");
            cliente.setVisible(false);
            user.setVisible(false);
            viajesDis.setVisible(false);
            empleados.setVisible(false);
            buques.setVisible(false);
            camarotes.setVisible(false);
            ventas.setVisible(true);
            viajes.setVisible(false);
            destinos.setVisible(false);
              Animacion.Animacion.mover_izquierda(211, 1, 2, 2, btnMenu);
           /*Animacion.Animacion.mover_izquierda(211, 5, 1, 1, PanelPrincipal1);*/
            Animacion.Animacion.mover_izquierda(1, -200, 2, 2, PanelMenu);
            PanelPrincipal1.add(ventas);
            PanelPrincipal1.validate();
        }
        else if(evt.equals(btnViajes))
        {
            lblTitulo.setText("VIAJES");
            cliente.setVisible(false);
            user.setVisible(false);
            viajesDis.setVisible(false);
            empleados.setVisible(false);
            buques.setVisible(false);
            camarotes.setVisible(false);
            ventas.setVisible(false);
            viajes.setVisible(true);
            destinos.setVisible(false);
               Animacion.Animacion.mover_izquierda(211, 1, 2, 2, btnMenu);
           /*Animacion.Animacion.mover_izquierda(211, 5, 1, 1, PanelPrincipal1);*/
            Animacion.Animacion.mover_izquierda(1, -200, 2, 2, PanelMenu);
            PanelPrincipal1.add(viajes);
            PanelPrincipal1.validate();
        }
         else if(evt.equals(btnDestinos))
        {
            lblTitulo.setText("DESTINOS");
            cliente.setVisible(false);
            user.setVisible(false);
            viajesDis.setVisible(false);
            empleados.setVisible(false);
            buques.setVisible(false);
            camarotes.setVisible(false);
            ventas.setVisible(false);
            viajes.setVisible(false);
            destinos.setVisible(true);
              Animacion.Animacion.mover_izquierda(211, 1, 2, 2, btnMenu);
           /*Animacion.Animacion.mover_izquierda(211, 5, 1, 1, PanelPrincipal1);*/
            Animacion.Animacion.mover_izquierda(1, -200, 2, 2, PanelMenu);
            PanelPrincipal1.add(destinos);
            PanelPrincipal1.validate();
        }
        
        
    }
}
