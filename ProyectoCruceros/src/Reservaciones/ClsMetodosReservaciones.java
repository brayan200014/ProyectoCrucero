
package Reservaciones;

import Clases.ClsConexion;
import java.sql.*;
import javax.swing.JOptionPane;

public class ClsMetodosReservaciones extends ClsReservaciones{
    
    ClsConexion conn = new ClsConexion();
    ClsReservaciones reser = new ClsReservaciones();
    
    @Override
    public void cancelar()
    {
        try {
            Connection cn = conn.obtenerConexion();

            PreparedStatement ps = cn.prepareStatement("update Reservaciones set estado = 0 where codigo_viaje = ?");

            ps.setInt(1, reser.getCodigo());

            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Reservación Cancelada");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
}
