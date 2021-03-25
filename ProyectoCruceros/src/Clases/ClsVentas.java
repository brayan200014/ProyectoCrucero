/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.*;
import Clases.ClsConexion;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author BRAYAN HERNADEZ
 */
public class ClsVentas {
    
    private  static String identidad;
    private static int codigo_viaje;
    private static int codigo_cliente;
    private static int cantidad_camarotes;
    private static int cantidad_personas;
    private static String tipo_camarote;
    private static java.util.Date fecha_salida;
    private static java.util.Date fecha_regreso;
    private static String puerto_salida;
    private static int codigo_buque;

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
    
    public int getCodigo_cliente() {
        return codigo_cliente;
    }

    public void setCodigo_cliente(int codigo_cliente) {
        ClsVentas.codigo_cliente = codigo_cliente;
    }
    
    public int getCodigo_buque() {
        return codigo_buque;
    }

    public void setCodigo_buque(int codigo_buque) {
        ClsVentas.codigo_buque = codigo_buque;
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
     PreparedStatement ps= null;
     ResultSet rs; 
        
     
    public  String nombreCliente()
    {
        String nombre= null;
     
        try {
            Connection con= conexion.obtenerConexion();
            ps= con.prepareStatement("SELECT codigo_cliente,CONCAT(nombre, ' ', apellido)Nombre FROM [dbo].[Clientes] where identidad=?");
            ps.setString(1,identidad);
            rs= ps.executeQuery();
            while(rs.next())
            {
                codigo_cliente=(rs.getInt("codigo_cliente"));
                nombre=(rs.getString("Nombre"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Surgio un error"+ex);
        }
      return nombre;
    }
     
    
     public  void infoViaje()
    { 
        
        try {
            Connection con= conexion.obtenerConexion();
            ps= con.prepareStatement("execute datosViajesVenta ?");
            ps.setInt(1,codigo_viaje);
            rs= ps.executeQuery();
            while(rs.next())
            {
                puerto_salida=(rs.getString("descripcion"));
                fecha_salida=(rs.getDate("fecha_partida"));
                fecha_regreso=(rs.getDate("fecha_regreso"));
                codigo_buque=(rs.getInt("codigo_buque"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Surgio un error"+ex);
        }
     
        
    }
     
     public DefaultComboBoxModel  getValues()
     {
         
         DefaultComboBoxModel modelo= new DefaultComboBoxModel();
         try 
         {
             Connection con= conexion.obtenerConexion();
             ps=con.prepareStatement("select descripcion from [dbo].[Tipo_Camarote]");
             rs= ps.executeQuery();
             while(rs.next())
             {
                 modelo.addElement(rs.getString("descripcion"));
              
             }
             con.close();
             rs.close();
         }
         catch(Exception e)
                 {
                    JOptionPane.showMessageDialog(null, "Error la cargar");
                 }
         return modelo;
     }
     
     public float precioExtraer()
     {
         float precio=0;
         int cantidad_dias=0;
         try 
         {
             Connection con= conexion.obtenerConexion();
             ps=con.prepareStatement("select precio_unitario from [dbo].[Tipo_Camarote] where descripcion= ?");
             ps.setString(1, tipo_camarote);
             rs= ps.executeQuery();
             while(rs.next())
             {
               precio= (rs.getFloat("precio_unitario"));
             }
             con.close();
             rs.close();
         }
         catch(Exception e)
                 {
                    JOptionPane.showMessageDialog(null, "Error la cargar");
                 }
         
          try 
         {
             Connection con= conexion.obtenerConexion();
             ps=con.prepareStatement("select "
                     + "DATEDIFF(DAY,fecha_partida,fecha_regreso)CantidadDias  "
                     + "from [dbo].[Viajes] where codigo_viaje=?");
             ps.setInt(1, codigo_viaje);
             rs= ps.executeQuery();
             while(rs.next())
             {
               cantidad_dias= (rs.getInt("CantidadDias"));
             }
             con.close();
             rs.close();
         }
         catch(Exception e)
                 {
                    JOptionPane.showMessageDialog(null, "Error la cargar");
                 }
        
          return precio*cantidad_personas*cantidad_dias;
                 
     }
     
}
