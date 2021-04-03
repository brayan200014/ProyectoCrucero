/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *e
 * @author BRAYAN HERNADEZ
 */
public class ClsConexion {
    
   static Connection conn = null;

    //metodos

    public static Connection obtenerConexion() {
        String url = "jdbc:sqlserver://localhost:1433;databaseName=AgenciaDeViajes";


        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            
        } catch (Exception ex) {
            
            JOptionPane.showMessageDialog(null,"Error de conexion");
                
        }
        
        
        try
        {
<<<<<<< HEAD

           conn = DriverManager.getConnection(url, "sa", "123456");
          
=======
            conn = DriverManager.getConnection(url, "sa", "semeolvido");
             
>>>>>>> origin/RamaVentasBrayan
        }
        catch(Exception ex)
        {
             JOptionPane.showMessageDialog(null,"Error de conexion"+ex);
        }
        
        return conn;

    }
}
