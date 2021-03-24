package BuqueCamarote;

import Clases.ClsConexion;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ClsMetodosBuque{

    ResultSet rs;
    private ClsConexion conn = new ClsConexion();
    private Connection cn = conn.obtenerConexion();
    ClsBuque buque = new ClsBuque();
    
    public void insertar() {
        try {
            CallableStatement cs = cn.prepareCall("InsertarBuque(?,?,?,?,?,?)");

            cs.setString(1, buque.getDescripcion());
            cs.setInt(2, buque.getCamarotes());
            cs.setInt(3, buque.getNiveles());
            cs.setInt(4, buque.getPersonas());
            cs.setInt(5, buque.getTipoBuque());
            cs.setInt(6,1);
            
            cs.executeUpdate();
            //rs = cs.executeQuery();
            
            JOptionPane.showMessageDialog(null, "Registro guardado");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
   /* public DefaultTableModel mostrar()
    {
        DefaultTableModel modelo;
        
       
    }*/

}
