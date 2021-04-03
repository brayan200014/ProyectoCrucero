package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ClsEmpleadosMetodos extends ClsEmpleados{
    
    Connection con = ClsConexion.obtenerConexion();
    PreparedStatement ps;
    
    @Override
    public void Insertar(){
        try {
            ps = con.prepareStatement("INSERT INTO Empleados "
                    + "(nombre, apellido, fecha_nacimiento, identidad, sexo, telefono, correo_electronico, "
                    + "direccion, codigo_puesto, estado, nacionalidad) VALUES(?,?,TRY_CONVERT(DATETIME, ?),?,?,?,?,?,?,?,?)");
            ps.setString(1, nombre);
            ps.setString(2, apellido);
            ps.setString(3, nacimiento);
            ps.setString(4, identidad);
            ps.setString(5, sexo);
            ps.setString(6, telefono);
            ps.setString(7, correo);
            ps.setString(8, direccion);
            ps.setInt(9, codigoPuesto);
            ps.setInt(10, 1);
            ps.setString(11, nacionalidad);

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Agregado");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de Ingreso" + ex);
        }
    }
    
    @Override
    public void Actualizar(){
        try {       
            ps = con.prepareStatement("UPDATE Empleados SET nombre=?, "
                    + "apellido=?, fecha_nacimiento=TRY_CONVERT(DATETIME, ?), identidad=?, sexo=?, telefono=?, "
                    + "correo_electronico=?,direccion=?, codigo_puesto=?, nacionalidad=? WHERE codigo_empleado=?");
            ps.setString(1, nombre);
            ps.setString(2, apellido);
            ps.setString(3, nacimiento);
            ps.setString(4, identidad);
            ps.setString(5, sexo);
            ps.setString(6, telefono);
            ps.setString(7, correo);
            ps.setString(8, direccion);
            ps.setInt(9, codigoPuesto);
            ps.setString(10, nacionalidad);
            ps.setInt(11, id);
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Actualizado");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de Actualizacion" + ex);
        }
    }
    
    @Override
    public void Eliminar(){
        try {       
            ps = con.prepareStatement("UPDATE Empleados SET estado=? WHERE codigo_empleado=?");
            ps.setInt(1, 0);
            ps.setInt(2, id);
             if (JOptionPane.showConfirmDialog(null, "¿Desea Despedir al Empleado?",
                "WARNING", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
             {
                 ps.executeUpdate();
                 JOptionPane.showMessageDialog(null, "Empleado Despedido");
             }
   
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al Eliminar" + ex);
        }
    }
}
