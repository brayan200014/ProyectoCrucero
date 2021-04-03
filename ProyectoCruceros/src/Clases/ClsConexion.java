/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author BRAYAN HERNADEZ
 */
public class ClsConexion {
    
    static Connection conn = null;

    //metodos
<<<<<<< HEAD
    public Connection obtenerConexion() {
        String url = "jdbc:sqlserver://localhost:1433;databaseName=AgenciaDeViajes";
=======
    public static Connection obtenerConexion() {
        String url = "jdbc:sqlserver://DESKTOP-4O10KLU:1433;databaseName=AgenciaDeViajes";
>>>>>>> origin/ClientesDavid

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            
        } catch (Exception ex) {
            
            JOptionPane.showMessageDialog(null,"Error de conexion");
                
        }
        
        
        try
        {
<<<<<<< HEAD
            conn = DriverManager.getConnection(url, "sa", "123456");
             //JOptionPane.showMessageDialog(null,"Conexion con exito");
=======
            conn = DriverManager.getConnection(url, "sa", "12345");
            //JOptionPane.showMessageDialog(null,"Conexion con exito");
>>>>>>> origin/ClientesDavid
        }
        catch(Exception ex)
        {
             JOptionPane.showMessageDialog(null,"Error de conexion");
        }
        
        return conn;

    }
}
