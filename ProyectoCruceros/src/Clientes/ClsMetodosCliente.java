
package Clientes;

import Clases.ClsConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.*;

public class ClsMetodosCliente extends ClsClientes {


    @Override
    public void Insertar(){
        try{
        

           Connection conn = ClsConexion.obtenerConexion();
           PreparedStatement ps =conn.prepareStatement("INSERT INTO Clientes (nombre,apellido,fecha_nacimiento,identidad,sexo,telefono,correo_electronico,direccion,nacionalidad)VALUES(?,?, TRY_CONVERT(DATE, ?),?,?,?,?,?,?)");
           ps.setString(1,nombre);
           ps.setString(2,apellido);
           ps.setString(3,fecha_nacimiento);
           ps.setString(4,identidad);
           ps.setString(5,sexo);
           ps.setString(6,telefono);
           ps.setString(7,correo_electronico);
           ps.setString(8,direccion);
           ps.setString(9,nacionalidad);
           ps.executeUpdate();
           JOptionPane.showMessageDialog(null, "Registro Guardado");
           
           
       }catch(SQLException e){
          JOptionPane.showMessageDialog(null, "Error al agregar los datos"+e); 
       }
    }
    
    
    @Override
    public void Actualizar(){
        try{
  
           Connection conn = ClsConexion.obtenerConexion();
           PreparedStatement ps =conn.prepareStatement("UPDATE Clientes SET nombre=?,apellido=?,fecha_nacimiento=TRY_CONVERT(DATE, ?),identidad=?,sexo=?,telefono=?,correo_electronico=?,direccion=?,nacionalidad=? where codigo_cliente=?");
           ps.setString(1,nombre);
           ps.setString(2,apellido);
           ps.setString(3, fecha_nacimiento);
           ps.setString(4,identidad);
           ps.setString(5,sexo);
           ps.setString(6,telefono);
           ps.setString(7,correo_electronico);
           ps.setString(8,direccion);
           ps.setString(9,nacionalidad);
           ps.setInt(10, id);
           ps.executeUpdate();
           JOptionPane.showMessageDialog(null, "Registro Actualizado");
           
           
       }catch(SQLException e){
          JOptionPane.showMessageDialog(null, "Error al Actualizar"+e); 
       }
        
        
    }
    
}
