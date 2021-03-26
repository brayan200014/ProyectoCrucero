
package BuqueCamarote;

import Clases.ClsConexion;
import java.sql.*;
import javax.swing.JOptionPane;

public class ClsMetodosCamarote extends ClsCamarote {
    
    ResultSet rs;
    private ClsConexion conn = new ClsConexion();
    ClsCamarote cama = new ClsCamarote();
    
    /*public void idTipoCamarote()
    {
        try
       {
           Connection cn = conn.obtenerConexion();
           
            PreparedStatement ps = cn.prepareStatement("select [codigo_tipo_camarote] from [dbo].[Tipo_Camarote] "
                    + "where [descripcion] = ?");

             ps.setString(1, cama.getDescripcion());
             rs = ps.executeQuery();
             
             if(rs.next())
             {
                cama.setIdTipoCamarote(rs.getInt("codigo_tipo_camarote"));
             }
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }*/
    
    @Override
    public void insertarTipoCamarote()
    {
        try
       {
           Connection cn = conn.obtenerConexion();
           
            PreparedStatement ps = cn.prepareStatement("insert into Tipo_Camarote (descripcion, precio_unitario) values (?,?)");

            ps.setString(1, cama.getDescripcion());
            ps.setDouble(2, cama.getPrecio());
            
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Registro guardado");   
  
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
       
    }
    
    @Override
    public void insertarCamarote()
    {
         try
       {
           Connection cn = conn.obtenerConexion();
           
            PreparedStatement ps = cn.prepareStatement("insert into Camarote (codigo_tipo_camarote, codigo_buque,nivel, estado) values (?,?,?,?)");

            ps.setInt(1, cama.getIdTipoCamarote());
            ps.setInt(2, cama.getIdBuque());
            ps.setInt(3, cama.getNivel());
            ps.setInt(4, 1);
            
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Registro guardado");   
  
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
       
    }
    
    
}
