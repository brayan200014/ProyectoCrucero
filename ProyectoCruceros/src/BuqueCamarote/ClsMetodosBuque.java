package BuqueCamarote;

import Clases.ClsConexion;
import java.sql.*;
import javax.swing.*;

public class ClsMetodosBuque extends ClsBuque{

    ResultSet rs;
    private ClsConexion conn = new ClsConexion();
    ClsBuque buque = new ClsBuque();
    
    @Override
    public void insertar()
    {
       
       try
       {
           Connection cn = conn.obtenerConexion();
           
            PreparedStatement ps = cn.prepareStatement("insert into Buques (descripcion, cantidad_camarotes, cantidad_niveles, "
                    + "cantidad_personas, codigo_tipo_buque, estado) values (?,?,?,?,?,?)");

            ps.setString(1, buque.getDescripcion());
            ps.setInt(2, buque.getCamarotes());
            ps.setInt(3, buque.getNiveles());
            ps.setInt(4, buque.getPersonas());
            ps.setInt(5, buque.getTipoBuque());
            ps.setInt(6,1);
            
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Registro guardado");   
  
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
       
    }
    
    
    @Override
     public void editar()
    {
         try
       {
           Connection cn = conn.obtenerConexion();
           
            PreparedStatement ps = cn.prepareStatement("update Buques set descripcion = ?, cantidad_camarotes = ?, cantidad_niveles = ?, "
                    + "cantidad_personas = ?, codigo_tipo_buque = ? where codigo_buque = ?");

            ps.setString(1, buque.getDescripcion());
            ps.setInt(2, buque.getCamarotes());
            ps.setInt(3, buque.getNiveles());
            ps.setInt(4, buque.getPersonas());
            ps.setInt(5, buque.getTipoBuque());
            ps.setInt(6, buque.getCodigo());
            
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Registro actualizado");   
  
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
     
    @Override
     public void eliminar()
     {
        try
       {
           Connection cn = conn.obtenerConexion();
           
            PreparedStatement ps = cn.prepareStatement("update Buques set estado = 0 where codigo_buque = ?");

            ps.setInt(1, buque.getCodigo());
            
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Registro eliminado");   
  
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
     }

    
     }

