
package Clases;

import javax.swing.DefaultComboBoxModel;
import java.sql.*;
import javax.swing.JOptionPane;


public class ClsHelper extends ClsConexion{
    
    //cargar los datos de sql server
    
    public DefaultComboBoxModel tipoBuque()
    {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        
        try
        {
            Connection cn = this.obtenerConexion();
            
            String sql = "select [descripcion] from [dbo].[Tipo_Buque]";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next())
            {
                modelo.addElement(rs.getString(1));
            }
            
            cn.close();
            rs.close();
        }
        catch(Exception ex)
        {
            
        }
        return modelo;
    }
    
     public DefaultComboBoxModel buque()
    {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        
        try
        {
            Connection cn = this.obtenerConexion();
            
            String sql = "select descripcion from Buques";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next())
            {
                modelo.addElement(rs.getString(1));
            }
            
            cn.close();
            rs.close();
        }
        catch(Exception ex)
        {
            
        }
        return modelo;
    }
    
}
