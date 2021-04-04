package Clases;

import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class PuertosDestinos {

    private String Puerto;
    private String Estado;
    private String Destino;
    private int CodDestino;
    

    Connection con = ClsConexion.obtenerConexion();
    PreparedStatement ps;
    ResultSet rs;
    
    public String getDestino() {
        return Destino;
    }

    public void setDestino(String Destino) {
        this.Destino = Destino;
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

    public int getCodDestino() {
        return CodDestino;
    }

    public void setCodDestino(int CodDestino) {
        this.CodDestino = CodDestino;
    } 
    
    public DefaultComboBoxModel getvalues(){
        
        DefaultComboBoxModel modeloCmb = new DefaultComboBoxModel();
        try{
            
            String sql="select descripcion from [dbo].[Destinos_Turisticos]";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                modeloCmb.addElement(rs.getString(1));
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        
        
        return modeloCmb;
    }
    
    
    public void ingresar(){

        try {
            ps = con.prepareStatement("INSERT INTO "
                    + "[dbo].[Puertos-Destinos] ([descripcion],"
                    + "[codigo_destino],[estado]) VALUES (?,?,?)");
            ps.setString(1, getPuerto());
            ps.setInt(2, getCodDestino());
            ps.setString(3, getEstado());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Ingresado");
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, e.toString());
        }

    }

    public void ingresar(int idPuerto) {

        try {
            Connection con = ClsConexion.obtenerConexion();
            ps = con.prepareStatement("UPDATE [dbo].[Puertos-Destinos]"
                    + "SET [descripcion]=?, [codigo_destino]=?, [estado]=?"
                    + "WHERE ");
            ps.setString(1, getPuerto());
            ps.setInt(2, getCodDestino());
            ps.setString(3, getEstado());
            ps.setInt(4, idPuerto);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Editado");

        } catch (SQLException e){
            
            JOptionPane.showMessageDialog(null, e.toString());
        }

    }

}
