
package Clases;

import java.sql.*;
import javax.swing.JOptionPane;

public class PuertosDestinos {
    

    private String Puerto;
    private String Estado;
    private int IdDestino;
    private int IdPuerto;

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

    public int getIdPuerto() {
        return IdPuerto;
    }

    public void setIdPuerto(int IdPuerto) {
        this.IdPuerto = IdPuerto;
    }

    public void ingresar(){
        
        try{
        Connection con = ClsConexion.obtenerConexion();
        PreparedStatement ps = con.prepareStatement("INSERT INTO "
                + "[dbo].[Puertos-Destinos] ([codigo_puerto],[descripcion],"
                + "[codigo_destino],[estado]) VALUES (?,?,?,?)");
        ps.setInt(1, getIdPuerto());
        ps.setString(2,getPuerto());
        ps.setInt(3,getIdDestino());
        ps.setString(4,getEstado()); 
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
                + "[dbo].[Puertos-Destinos] ([codigo_puerto],[descripcion],"
                + "[codigo_destino],[estado]) VALUES (?,?,?,?)");
        ps.setInt(1, getIdPuerto());
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
