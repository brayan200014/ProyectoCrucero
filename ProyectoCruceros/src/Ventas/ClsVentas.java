/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventas;

import Ventas.ClsVentasMetodos;
import java.sql.*;
import Clases.ClsConexion;
import Clases.ClsConexion;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author BRAYAN HERNADEZ
 */
public class ClsVentas extends ClsVentasMetodos{
    
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
    private static int edad;
    private static int cantidad_dias;
    private static float subtotal;
    private static float descuento;
    private static float is_portuario;
    private static float isv;
    private static float propina;
    private static float total;
    private float desc;
    public DefaultTableModel modelo;
   ArrayList <Integer> camarotes= new ArrayList<Integer>();
   ArrayList <Integer> destinos= new ArrayList<Integer>();


    public  float getPropina() {
        return propina;
    }

    public  void setPropina(float propina) {
        ClsVentas.propina = propina;
    }
    
    
      public  float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        ClsVentas.subtotal = subtotal;
    }

    public  float getDescuento() {
        return descuento;
    }

    public  void setDescuento(float descuento) {
        ClsVentas.descuento = descuento;
    }

    public  float getIs_portuario() {
        return is_portuario;
    }

    public void setIs_portuario(float is_portuario) {
        ClsVentas.is_portuario = is_portuario;
    }

    public  float getIsv() {
        return isv;
    }

    public  void setIsv(float isv) {
        ClsVentas.isv = isv;
    }

    public  float getTotal() {
        return total;
    }

    public  void setTotal(float total) {
        ClsVentas.total = total;
    }

    public int getCantidad_dias() {
        return cantidad_dias;
    }

    public void setCantidad_dias(int cantidad_dias) {
        ClsVentas.cantidad_dias = cantidad_dias;
    }

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
       public  int getEdad() {
        return edad;
    }

    public  void setEdad(int edad) {
        ClsVentas.edad = edad;
    }


   
     
    /* ClsConexion conexion= new ClsConexion();*/
     PreparedStatement ps= null;
     ResultSet rs; 
     ResultSetMetaData rsmd;
        
      public  String nombreEmpleado(int codigo)
    {
        String nombre= null;
        codigo= 2;
     
        try {
            Connection con= ClsConexion.obtenerConexion();
            ps= con.prepareStatement("execute infoEmpleado ?");
            ps.setInt(1,codigo);
            rs= ps.executeQuery();
            if(rs.next())
            {
                codigo=(rs.getInt("codigo_empleado"));
                nombre=(rs.getString("nombre"));
            } else 
            {
                JOptionPane.showMessageDialog(null, "No existe el empleado en la base de datos"
                        + "", "Warning", JOptionPane.ERROR_MESSAGE);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Surgio un error"+ex);
        }
      return nombre;
    }
    public  String nombreCliente()
    {
        String nombre= null;
     
        try {
            Connection con= ClsConexion.obtenerConexion();
            ps= con.prepareStatement("execute infoCliente ?");
            ps.setString(1,identidad);
            rs= ps.executeQuery();
            if(rs.next())
            {
                codigo_cliente=(rs.getInt("codigo_cliente"));
                nombre=(rs.getString("Nombre"));
                edad=(rs.getInt("Edad"));
            }/* else 
            {
                JOptionPane.showMessageDialog(null, "No existe el cliente en la base de datos"
                        + "", "Warning", JOptionPane.ERROR_MESSAGE);
            }*/
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Surgio un error"+ex);
        }
      return nombre;
    }
     
    
     public  int infoViaje()
    { 
        int codigo=0;
        try {
            Connection con= ClsConexion.obtenerConexion();
            ps= con.prepareStatement("execute datosViajesVenta ?");
            ps.setInt(1,codigo_viaje);
            rs= ps.executeQuery();
            if(rs.next())
            {
                codigo=(rs.getInt("codigo_viaje"));
                puerto_salida=(rs.getString("descripcion"));
                fecha_salida=(rs.getDate("fecha_partida"));
                fecha_regreso=(rs.getDate("fecha_regreso"));
                codigo_buque=(rs.getInt("codigo_buque"));
                cantidad_dias=(rs.getInt("CantidadDias"));
                
            }
          
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Surgio un error"+ex);
        }
     
        return codigo;
    }
     
     public  String descripcionBuque()
    {
        String nombre= null;
     
        try {
            Connection con= ClsConexion.obtenerConexion();
            ps= con.prepareStatement("  SELECT descripcion FROM [dbo].[Buques] where codigo_buque= ?");
            ps.setInt(1,codigo_buque);
            rs= ps.executeQuery();
            if(rs.next())
            {
                nombre= (rs.getString("descripcion"));
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Surgio un error"+ex);
        }
      return nombre;
    }
     
     public DefaultComboBoxModel  getValues()
     {
         
         DefaultComboBoxModel modelo= new DefaultComboBoxModel();
         try 
         {
             Connection con= ClsConexion.obtenerConexion();
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
       
         try 
         {
             Connection con= ClsConexion.obtenerConexion();
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
        
        
          return precio*cantidad_personas*cantidad_dias;
                 
     }
     
     public void insertarVenta(int codigo)
     {    
         codigo=2;
         try 
         {
             Connection con= ClsConexion.obtenerConexion();
             ps= con.prepareStatement("execute insertarVenta ?,?,?,?,?,?,?,?");
             ps.setInt(1, codigo_cliente);
             ps.setInt(2,codigo_viaje);
             ps.setInt(3, codigo);
             ps.setFloat(4, subtotal);
             ps.setFloat(5, (float)0.07);
             ps.setFloat(6, (float)0.05);
             ps.setFloat(7, (float)0.10);
             ps.setFloat(8, desc);
             ps.executeUpdate();
             JOptionPane.showMessageDialog(null, "Registro Guardado con exito", "Information", JOptionPane.INFORMATION_MESSAGE);
             con.close();
             
         }
         catch(SQLException ex)
         {
             JOptionPane.showMessageDialog(null, "Ocurrio un error al insertar los datos", "Warning", JOptionPane.WARNING_MESSAGE);
         }
     }
     
     public int extraerCodigoVenta()
     {
         int codigoVenta=0;
         try 
         {
             Connection con= ClsConexion.obtenerConexion();
             ps= con.prepareStatement("SELECT IDENT_CURRENT('Ventas')CodigoVenta");
             rs=ps.executeQuery();
             while(rs.next())
             {
                 codigoVenta= rs.getInt("CodigoVenta");
             }
         }
         catch(SQLException ex)
         {
             JOptionPane.showMessageDialog(null, "Ocurrio un error al extraer los datos", "Warning", JOptionPane.WARNING_MESSAGE);
         }
         return codigoVenta;
     }
     
     public ArrayList codigosCamarotes(int cantidad)
     {
         int column=0;
       
        camarotes.clear();
        
           try 
         {
             Connection con= ClsConexion.obtenerConexion();
             ps= con.prepareStatement("execute extraerCodigoCamarotes ?,?,?,?");
             ps.setInt(1, codigo_viaje);
             ps.setInt(2, codigo_buque);
             ps.setString(3,tipo_camarote );
             ps.setInt(4, cantidad);
             rs=ps.executeQuery();
             rsmd=rs.getMetaData();
             column= rsmd.getColumnCount();
             while(rs.next())
             {
              int [] fila= new int [column]; 
              int j=0;
               for(int i=0; i<column;i++)
               {
                   fila[i]= rs.getInt(i+1);
               }
                
                camarotes.add((fila[j]));
                j++;
                
             }
         
             
         }
         catch(SQLException ex)
         {
             JOptionPane.showMessageDialog(null, "Ocurrio un error al extraer los datos", "Warning", JOptionPane.WARNING_MESSAGE);
         }
            return camarotes;
     }
     
     public void insertarDetalle(int codigoVenta, int codigoCamarote)
     {
         try 
         {
             Connection con= ClsConexion.obtenerConexion();
              ps=con.prepareStatement("execute insertarDetalleVenta ?,?,?,?,?");
              ps.setInt(1, codigo_viaje);
              ps.setInt(2, codigoVenta);
              ps.setInt(3, codigoCamarote);
              ps.setInt(4,cantidad_dias);
              ps.setInt(5, cantidad_personas);
              ps.executeUpdate();
               JOptionPane.showMessageDialog(null, "Registro Guardado con exito", "Information", JOptionPane.INFORMATION_MESSAGE);
         }
           catch(SQLException ex)
         {
             JOptionPane.showMessageDialog(null, "Ocurrio un error al extraer los datos"+ex, "Warning", JOptionPane.WARNING_MESSAGE);
         }
        
     }
     
      
    /*  public ArrayList destinos()
     {
         int column=0;
       
        destinos.clear();
        
           try 
         {
             Connection con= conexion.obtenerConexion();
             ps= con.prepareStatement("execute destinosViajesItem ?");
             ps.setInt(1, codigo_viaje);
             rs=ps.executeQuery();
             rsmd=rs.getMetaData();
             column= rsmd.getColumnCount();
             while(rs.next())
             {
              String [] fila= new String [column]; 
              int j=0;
               for(int i=0; i<column;i++)
               {
                   fila[i]= rs.getString(i+1);    
                 
                     destinos.add(Integer.parseInt(fila[i]));
               }
                 
               /* destinos.add((fila[j]));
                j++;
                
             }
         
             
         }
         catch(SQLException ex)
         {
             JOptionPane.showMessageDialog(null, "Ocurrio un error al extraer los datos", "Warning", JOptionPane.WARNING_MESSAGE);
         }
            return destinos;
     }*/
      
     public void eliminarVenta()
     {
         try 
         {
             Connection con= ClsConexion.obtenerConexion();
              ps=con.prepareStatement("DELETE FROM Ventas WHERE "
                      + "codigo_viaje=(SELECT IDENT_CURRENT('Ventas'))");
              ps.executeUpdate();
              
         }
           catch(SQLException ex)
         {
             JOptionPane.showMessageDialog(null, "Ocurrio un error al extraer los datos"+ex, "Warning", JOptionPane.WARNING_MESSAGE);
         }
     }
     
     /*public void cargarDatosVentas ()
     {
         int columnas;
        
        modelo.setRowCount(0);
        try 
         {
             Connection con= conexion.obtenerConexion();
            ps=con.prepareStatement("execute cargarDatosVentas");
             rs=ps.executeQuery();
             rsmd= rs.getMetaData();
             columnas= rsmd.getColumnCount();
             while(rs.next())
             {
                Object [] fila= new Object[columnas];
                 for(int i=0; i<columnas; i++)
                 {
                     fila[i]=rs.getObject(i+1);
                 }
                 modelo.addRow(fila);
             }
         }
         catch(SQLException ex)
         {
              JOptionPane.showMessageDialog(null, "Ocurrio un error al extraer los datos"+ex, "Warning", JOptionPane.WARNING_MESSAGE);
         }
      
     }*/
    @Override
     public float calculoDescuento()
     {
      
         if(edad>=60)
         {
             descuento= subtotal*(float)0.25;
             desc= (float)0.25;
         }
         else
         {
             descuento=0;
             desc=0;
         }
         return descuento;
     }
     
    @Override
     public float calculoIsv()
     {
         isv= subtotal*(float)0.07;
         return isv;
     }
    
    @Override
     public float calculoImpuestoPortuario()
     {
         is_portuario= subtotal*(float)0.05;
         return is_portuario;
     }
     
    @Override
     public float calculoPropina()
     {
         propina= subtotal*(float)0.10;
         return propina;
     }
     
    @Override
     public float calculoTotal()
     {
         total= (subtotal+isv+is_portuario+propina)-descuento;
         return total;
     }
}
