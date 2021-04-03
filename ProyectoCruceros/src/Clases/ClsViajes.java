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
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Jorge Ayala
 */
public class ClsViajes {
    //Atributos de viajes
    private String descripcion;
    private int codigoViaje;
    private int codigoBuque; //Codigo del buque asignado para el viaje
    private String descripBuque;
    private int codigoPuerto; //codigo del puerto de donde partira el viaje
    private String descripPuerto;
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

    public String getDescripBuque() {
        return descripBuque;
    }

    public void setDescripBuque(String descripBuque) {
        this.descripBuque = descripBuque;
    }

    public String getDescripPuerto() {
        return descripPuerto;
    }

    public void setDescripPuerto(String descripPuerto) {
        this.descripPuerto = descripPuerto;
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
            
            JOptionPane.showMessageDialog(null, "Viaje ingresado");
            
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
    //Ingresa los destinos al viaje
    public void ingresarDestino(int cPuerto, String fechaL, String fechaS){
        
        try{
            Connection con = ClsConexion.obtenerConexion();
            PreparedStatement ps = con.prepareStatement("INSERT INTO [dbo].[Detalle_destinos]\n" +
                                                        "VALUES((Select MAX(codigo_viaje) From [dbo].[Viajes]), ?, TRY_CONVERT(DATETIME,?,120),TRY_CONVERT(DATETIME,?,120))");
            
            ps.setInt(1, cPuerto);
            ps.setString(2, fechaL);
            ps.setString(3, fechaS);
            ps.executeUpdate();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
        
    }
    
    //Extrae los datos de la base para su edicion
    public void consultarViaje(int codigo){
        try{
            PreparedStatement ps;
            ResultSet rs;
            
            Connection con = ClsConexion.obtenerConexion();
            
            ps = con.prepareStatement("Select codigo_viaje, b.descripcion, p.descripcion, fecha_partida, fecha_regreso, v.descripcion\n" +
                                        "From [dbo].[Viajes] v join [dbo].[Buques] b\n" +
                                        "on v.codigo_buque = b.codigo_buque join [dbo].[Puertos-Destinos] p\n" +
                                        "on v.codigo_puerto = p.codigo_puerto WHERE codigo_viaje = ?");
            
            ps.setInt(1, codigo);
            rs = ps.executeQuery();
            
            while(rs.next()){
                codigoViaje = rs.getInt(1);
                descripcion = rs.getString(6);
                fechaSalida = String.valueOf(rs.getDate(4));
                fechaRegreso = String.valueOf(rs.getDate(5));
                descripPuerto = rs.getString(3);
                descripBuque = rs.getString(2);
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
            
            JOptionPane.showMessageDialog(null, "Viaje modificado");
            
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
    public void eliminarViaje(){
        
    }
    
    //Elimina todos los destinos de un viaje
    public void eliminarDestinos(){
        try{
            Connection con = ClsConexion.obtenerConexion();
            
            PreparedStatement ps = con.prepareStatement("DELETE FROM [dbo].[Detalle_destinos] WHERE codigo_viaje = ?");
            
            ps.setInt(1, codigoViaje);
            ps.executeUpdate();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
    //Vuelve a insertar los destinos de un viaje
    public void actualizarDestinos(int cPuerto, String fechaL, String fechaS){
        try{
            Connection con = ClsConexion.obtenerConexion();
            PreparedStatement ps = con.prepareStatement("INSERT INTO [dbo].[Detalle_destinos]\n" +
                                                        "VALUES( ?, ?, TRY_CONVERT(DATETIME,?,120),TRY_CONVERT(DATETIME,?,120))");
            
            ps.setInt(1, codigoViaje);
            ps.setInt(2, cPuerto);
            ps.setString(3, fechaL);
            ps.setString(4, fechaS);
            ps.executeUpdate();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
    //Consulta el codigo del puerto
    public int codigoPuerto(String descrip){
        int codigoP = 0;
        
        PreparedStatement ps;
        ResultSet rs;
        
        try{
            
            Connection con = ClsConexion.obtenerConexion();
            
            ps = con.prepareStatement("SELECT codigo_puerto FROM [Puertos-Destinos] WHERE descripcion = ?");
            
            ps.setString(1, descrip);
            rs = ps.executeQuery();
            
            while(rs.next()){
                codigoP = rs.getInt("codigo_puerto");
            }
            
            
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
        
        return codigoP;
    }
    
    //Consulta el codigo del buque
    public int codigoBuque(String descrip){
        int codigoB = 0;
        
        PreparedStatement ps;
        ResultSet rs;
        
        try{
            
            Connection con = ClsConexion.obtenerConexion();
            
            ps = con.prepareStatement("SELECT codigo_buque FROM [dbo].[Buques] WHERE descripcion = ? and estado = 1");
            
            ps.setString(1, descrip);
            rs = ps.executeQuery();
            
            while(rs.next()){
                codigoB = rs.getInt("codigo_buque");
            }
            
            
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
        
        return codigoB;
    }
    
    //Consulta el codigo del destino
    public int codigoDestino(String descrip){
        int codigoD = 0;
        
        PreparedStatement ps;
        ResultSet rs;
        
        try{
            
            Connection con = ClsConexion.obtenerConexion();
            
            ps = con.prepareStatement("SELECT codigo_destino FROM [dbo].[Destinos_Turisticos] WHERE descripcion = ?");
            
            ps.setString(1, descrip);
            rs = ps.executeQuery();
            
            while(rs.next()){
                codigoD = rs.getInt("codigo_destino");
            }
            
            
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
        
        return codigoD;
    }
    
    //Llena el comboBox de Puertos
    public DefaultComboBoxModel getvaluesPuertos(){
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
    
    //Llena el comboBox de puertos del destino filtrado por el destino seleccionado
    public DefaultComboBoxModel getvaluesPuertos(int codigo){
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        
        PreparedStatement ps;
        ResultSet rs;
        
        try{
            Connection con = ClsConexion.obtenerConexion();
            
            ps = con.prepareStatement("Select descripcion From [dbo].[Puertos-Destinos] where codigo_destino = ?");
            ps.setInt(1, codigo);
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
    public DefaultComboBoxModel getvaluesBuques(){
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
    public DefaultComboBoxModel getvaluesDestinos(){
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
