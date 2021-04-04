
package Clientes;

import java.util.Date;


public class ClsClientes {
    protected static int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        ClsClientes.id = id;
    }
    protected static String nombre;
    protected static String apellido;
    protected static String identidad;
    protected static String telefono;
    protected static String direccion;
    protected static String sexo;
    protected static String nacionalidad;
    protected static String correo_electronico;
    protected static String fecha_nacimiento;
    
    
    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        ClsClientes.fecha_nacimiento = fecha_nacimiento;
    }
   
   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        ClsClientes.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        ClsClientes.apellido = apellido;
    }

    public String getIdentidad() {
        return identidad;
    }

    public void setIdentidad(String identidad) {
        ClsClientes.identidad = identidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        ClsClientes.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        ClsClientes.direccion = direccion;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        ClsClientes.sexo = sexo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        ClsClientes.nacionalidad = nacionalidad;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        ClsClientes.correo_electronico = correo_electronico;
    }

   
   
    
    
    
    
    public void Insertar(){
        
    }
    
    public void Actualizar(){
        
    }
    
}
