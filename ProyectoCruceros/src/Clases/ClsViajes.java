/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.Date;
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
            JOptionPane.showMessageDialog(null, "Registro guardados");
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
    public void actualizarViaje(){
        
    }
    
    public void eliminarViaje(){
        
    }
    
    public void consultarViajes(){
        
    }
}
