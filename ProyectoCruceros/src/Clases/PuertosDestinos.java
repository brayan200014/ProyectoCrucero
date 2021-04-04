
package Clases;

import java.sql.*;
import javax.swing.JOptionPane;

public class PuertosDestinos {
    

    private String Puerto;
    private String Estado;
    private int IdDestino;
    
    public int getIdDestino() {
        return IdDestino;
    }

    public void setIdDestino(int IdDestino) {
        this.IdDestino = IdDestino;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
    public String getPuerto() {
        return Puerto;
    }

    public void setPuerto(String Puerto) {
        this.Puerto = Puerto;
    }

    public void ingresar(){
        
        try{
        Connection con = ClsConexion.obtenerConexion();
        PreparedStatement ps = con.prepareStatement("INSERT INTO "
                + "[dbo].[Puertos-Destinos] ([descripcion],"
                + "[codigo_destino],[estado]) VALUES (?,?,?)");
        ps.setString(1,getPuerto());
        ps.setInt(2,getIdDestino());
        ps.setString(3,getEstado()); 
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Registro Ingresado");
        
    }catch(SQLException e){
       
            JOptionPane.showMessageDialog(null, e.toString());
    }
    
    
    
    }
    
    public void ingresar(int fila){
        
        try{
        Connection con = ClsConexion.obtenerConexion();
        PreparedStatement ps = con.prepareStatement("INSERT INTO "
                + "[dbo].[Puertos-Destinos] ([descripcion],"
                + "[codigo_destino],[estado]) VALUES (?,?,?,?)");
        ps.setString(2,getPuerto());
        ps.setInt(3,getIdDestino());
        ps.setString(4,getEstado()); 
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Registro Ingresado");
        
    }catch(SQLException e){
       
            JOptionPane.showMessageDialog(null, e.toString());
    }
    
    
    
    }
    
    
    
}
