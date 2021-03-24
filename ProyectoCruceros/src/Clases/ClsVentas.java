/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.*;
import Clases.ClsConexion;
import javax.swing.JOptionPane;

/**
 *
 * @author BRAYAN HERNADEZ
 */
public class ClsVentas {
    
    private  static String identidad;
    private static int codigo_viaje;
    private static int cantidad_camarotes;
    private static int cantidad_personas;
    private static String tipo_camarote;
    private static java.util.Date fecha_salida;
     private static java.util.Date fecha_regreso;
     private static String puerto_salida;

    public  String getIdentidad() {
        return identidad;
    }

    public void setIdentidad(String identidad) {
        ClsVentas.identidad = identidad;
    }

    public int getCodigo_viaje() {
        return codigo_viaje;
    }

    public void setCodigo_viaje(int codigo_viaje) {
        ClsVentas.codigo_viaje = codigo_viaje;
    }

    public  int getCantidad_camarotes() {
        return cantidad_camarotes;
    }

    public  void setCantidad_camarotes(int cantidad_camarotes) {
        ClsVentas.cantidad_camarotes = cantidad_camarotes;
    }

    public int getCantidad_personas() {
        return cantidad_personas;
    }

    public  void setCantidad_personas(int cantidad_personas) {
        ClsVentas.cantidad_personas = cantidad_personas;
    }

    public  String getTipo_camarote() {
        return tipo_camarote;
    }

    public  void setTipo_camarote(String tipo_camarote) {
        ClsVentas.tipo_camarote = tipo_camarote;
    }

    public java.util.Date getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(java.util.Date fecha_salida) {
        ClsVentas.fecha_salida = fecha_salida;
    }

    public  java.util.Date getFecha_regreso() {
        return fecha_regreso;
    }

    public  void setFecha_regreso(java.util.Date fecha_regreso) {
        ClsVentas.fecha_regreso = fecha_regreso;
    }

    public  String getPuerto_salida() {
        return puerto_salida;
    }

    public  void setPuerto_salida(String puerto_salida) {
        ClsVentas.puerto_salida = puerto_salida;
    }

    public ClsConexion getConexion() {
        return conexion;
    }

    public void setConexion(ClsConexion conexion) {
        this.conexion = conexion;
    }
     
     
     ClsConexion conexion= new ClsConexion();
     
    public  String nombreCliente()
    {
        String nombre= null;
        Connection con= conexion.obtenerConexion();
        PreparedStatement ps= null;
        ResultSet rs; 
        
        
        try {
            ps= con.prepareStatement("SELECT CONCAT(nombre, ' ', apellido)Nombre FROM [dbo].[Clientes] where identidad=?");
            ps.setString(1,identidad);
            rs= ps.executeQuery();
            while(rs.next())
            {
                nombre=(rs.getString("Nombre"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Surgio un error"+ex);
        }
      return nombre;
    }
     
    
     public  void infoViaje()
    {
       
        Connection con= conexion.obtenerConexion();
        PreparedStatement ps= null;
        ResultSet rs; 
        
        
        try {
            ps= con.prepareStatement("execute datosViajesVenta ?");
            ps.setInt(1,codigo_viaje);
            rs= ps.executeQuery();
            while(rs.next())
            {
                puerto_salida=(rs.getString("descripcion"));
                fecha_salida=(rs.getDate("fecha_partida"));
                fecha_regreso=(rs.getDate("fecha_regreso"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Surgio un error"+ex);
        }
     
        
    }
     
}
