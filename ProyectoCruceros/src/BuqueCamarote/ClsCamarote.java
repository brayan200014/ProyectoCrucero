
package BuqueCamarote;

public class ClsCamarote {
    
    private static String descripcion;
    private static double precio;
    private static int idTipoCamarote;
    private static int idBuque;
    private static int nivel;

    public  String getDescripcion() {
        return descripcion;
    }

    public  void setDescripcion(String descripcion) {
        ClsCamarote.descripcion = descripcion;
    }

    public  double getPrecio() {
        return precio;
    }

    public  void setPrecio(double precio) {
        ClsCamarote.precio = precio;
    }

    public  int getIdBuque() {
        return idBuque;
    }

    public  void setIdBuque(int idBuque) {
        ClsCamarote.idBuque = idBuque;
    }

    public  int getNivel() {
        return nivel;
    }

    public  void setNivel(int nivel) {
        ClsCamarote.nivel = nivel;
    }

    public int getIdTipoCamarote() {
        return idTipoCamarote;
    }

    public void setIdTipoCamarote(int idTipoCamarote) {
        ClsCamarote.idTipoCamarote = idTipoCamarote;
    }
    
      
    //polimorfismo
    public void insertarCamarote()
    {
        
    }
    
     public void insertarTipoCamarote()
    {
        
    }
     
    public void editar()
    {
        
    }
    
    public void eliminar()
    {
        
    }
}
