package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.SQLException;

public class ClsUsuariosMetodos extends ClsUsuarios{
    Connection con = ClsConexion.obtenerConexion();
    PreparedStatement ps;
    
    @Override
    public void Insertar(){
        try {
            ps = con.prepareStatement("INSERT INTO Usuarios "
                    + "(nombre_usuario, contrasenia, estado) VALUES(?,?,?)");
            ps.setString(1, nombreUsuario);
            ps.setString(2, contrasena);
            ps.setInt(3, estado);

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Agregado");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de Ingreso" + ex);
        }
    }
    
    @Override
    public void Actualizar(){
        try {       
            ps = con.prepareStatement("UPDATE Usuarios SET nombre_usuario=?, "
                    + "contrasenia=? WHERE codigo_usuario=?");
            ps.setString(1, nombreUsuario);
            ps.setString(2, contrasena);
            ps.setInt(3, id);
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Actualizado");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de Actualizacion" + ex);
        }
    }
    
    @Override
    public void Eliminar(){
        try {       
            ps = con.prepareStatement("UPDATE Usuarios SET estado=? WHERE codigo_usuario=?");
            ps.setInt(1, 0);
            ps.setInt(2, id);
             if (JOptionPane.showConfirmDialog(null, "¿Desea Deshabilitar Usuario?",
                "WARNING", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
             {
                 ps.executeUpdate();
                 JOptionPane.showMessageDialog(null, "Usuario Deshabilitado");
             }
   
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al Deshabilitar" + ex);
        }
    }
}
