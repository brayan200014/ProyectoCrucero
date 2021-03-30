/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
/**
 *
 * @author Jorge Ayala
 */
public class ClsViajes {
    //Atributos de viajes
    private String descripcion;
    private int codigoViaje;
    private int codigoBuque; //Codigo del buque asignado para el viaje
    private int codigoPuerto; //codigo del puerto de donde partira el viaje
    private String fechaSalida;
    private String fechaRegreso;

    //Propiedades accesoras
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCodigoViaje() {
        return codigoViaje;
    }

    public void setCodigoViaje(int codigoViaje) {
        this.codigoViaje = codigoViaje;
    }

    public int getCodigoBuque() {
        return codigoBuque;
    }

    public void setCodigoBuque(int codigoBuque) {
        this.codigoBuque = codigoBuque;
    }

    public int getCodigoPuerto() {
        return codigoPuerto;
    }

    public void setCodigoPuerto(int codigoPuerto) {
        this.codigoPuerto = codigoPuerto;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getFechaRegreso() {
        return fechaRegreso;
    }

    public void setFechaRegreso(String fechaRegreso) {
        this.fechaRegreso = fechaRegreso;
    }
    
    //Metodos
    
    //Ingresa los viajes a la base de datos
    public void ingresarViaje(){
        
        try{
            Connection con = ClsConexion.obtenerConexion();
            PreparedStatement ps = con.prepareStatement("INSERT INTO [dbo].[Viajes] ([codigo_buque], [codigo_puerto], [fecha_partida], [fecha_regreso], [descripcion])" +
                                                        "VALUES (?, ?, TRY_CONVERT(DATETIME, ? ,120), TRY_CONVERT(DATETIME, ? ,120), ?)");
            
            ps.setInt(1, codigoBuque);
            ps.setInt(2, codigoPuerto);
            ps.setString(3, fechaSalida);
            ps.setString(4, fechaRegreso);
            ps.setString(5, descripcion);
            ps.executeUpdate();
            
            /*CallableStatement cs = con.prepareCall("{call IngresarViaje(?,?,TRY_CONVERT(DATETIME, ? ,120), TRY_CONVERT(DATETIME, ? ,120),?)}");
            cs.setInt(1, codigoBuque);
            cs.setInt(2, codigoPuerto);
            cs.setString(3, fechaSalida);
            cs.setString(4, fechaRegreso);
            cs.setString(5, descripcion);
            
            ResultSet rs = cs.executeQuery();*/
            
            JOptionPane.showMessageDialog(null, "Registro guardados");
            
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
    //Ingresa los destinos al viaje
    public void ingresarDestino(){
        
    }
    
    //Extrae los datos de la base para su edicion
    public void editarViaje(int codigo){
        try{
            PreparedStatement ps;
            ResultSet rs;
            
            Connection con = ClsConexion.obtenerConexion();
            
            ps = con.prepareStatement("SELECT * FROM Viajes WHERE codigo_viaje = ?");
            
            ps.setInt(1, codigo);
            rs = ps.executeQuery();
            
            while(rs.next()){
                codigoViaje = rs.getInt("codigo_viaje");
                descripcion = rs.getString("descripcion");
                fechaSalida = String.valueOf(rs.getDate("fecha_partida"));
                fechaRegreso = String.valueOf(rs.getDate("fecha_regreso"));
                codigoPuerto = rs.getInt("codigo_puerto");
                codigoBuque = rs.getInt("codigo_buque");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
    //Confirma la edicion en la base de datos
    public void actualizarViaje(){
        try{
            Connection con = ClsConexion.obtenerConexion();
            PreparedStatement ps = con.prepareStatement("UPDATE [dbo].[Viajes] SET [codigo_buque] = ?, [codigo_puerto] = ?, [fecha_partida] = TRY_CONVERT(DATETIME,?,120), [fecha_regreso] = TRY_CONVERT(DATETIME,?,120), [descripcion] = ?\n" +
                                                        "Where codigo_viaje = ?");
            
            ps.setInt(1, codigoBuque);
            ps.setInt(2, codigoPuerto);
            ps.setString(3, fechaSalida);
            ps.setString(4, fechaRegreso);
            ps.setString(5, descripcion);
            ps.setInt(6, codigoViaje);
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Registro modificados");
            
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
    public void eliminarViaje(){
        
    }
    
    public void consultarViajes(){
        
    }
    
    //Llena el comboBox de Puertos
    public DefaultComboBoxModel getvalues(){
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        
        PreparedStatement ps;
        ResultSet rs;
        
        try{
            Connection con = ClsConexion.obtenerConexion();
            
            ps = con.prepareStatement("Select descripcion From [dbo].[Puertos-Destinos]");
            rs = ps.executeQuery();
            
            while(rs.next()){
                modelo.addElement(rs.getString(1));
            }
        }
        catch(SQLException e){
            JOptionPane.showInputDialog(null, e.toString());
        }
        
        return modelo;
    }
    
    //Llena el comboBox de Buques
    public DefaultComboBoxModel getvalues(int i){
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        
        PreparedStatement ps;
        ResultSet rs;
        
        try{
            Connection con = ClsConexion.obtenerConexion();
            
            ps = con.prepareStatement("Select descripcion From [dbo].[Buques]");
            rs = ps.executeQuery();
            
            while(rs.next()){
                modelo.addElement(rs.getString(1));
            }
        }
        catch(SQLException e){
            JOptionPane.showInputDialog(null, e.toString());
        }
        
        return modelo;
    }
    
    //Llena el comboBox de destinos 
    public DefaultComboBoxModel getvalues(String i){
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        
        PreparedStatement ps;
        ResultSet rs;
        
        try{
            Connection con = ClsConexion.obtenerConexion();
            
            ps = con.prepareStatement("Select descripcion From [dbo].[Destinos_Turisticos]");
            rs = ps.executeQuery();
            
            while(rs.next()){
                modelo.addElement(rs.getString(1));
            }
        }
        catch(SQLException e){
            JOptionPane.showInputDialog(null, e.toString());
        }
        
        return modelo;
    }
}
