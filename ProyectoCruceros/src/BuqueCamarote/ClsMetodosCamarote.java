package BuqueCamarote;

import Clases.ClsConexion;
import java.sql.*;
import javax.swing.JOptionPane;

public class ClsMetodosCamarote extends ClsCamarote {

   /* ClsConexion conn = new ClsConexion();*/
    ClsCamarote cama = new ClsCamarote();

    @Override
    public void insertarEditarCamarote() {
        try {
            Connection cn = ClsConexion.obtenerConexion();

            PreparedStatement ps = cn.prepareStatement("insert into Camarote (codigo_tipo_camarote, codigo_buque, nivel, estado) values (?,?,?,?)");

            ps.setInt(1, cama.getIdTipoCamarote());
            ps.setInt(2, cama.getIdBuque());
            ps.setInt(3, cama.getNivel());
            ps.setInt(4, 1);

            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Registro guardado");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void insertarEditarCamarote(int codigo) {
        try {
            Connection cn = ClsConexion.obtenerConexion();

            PreparedStatement ps = cn.prepareStatement("update Camarote set codigo_tipo_camarote = ?, codigo_buque = ?, nivel = ? where codigo_camarote = ?");

            codigo = cama.getCodigo();

            ps.setInt(1, cama.getIdTipoCamarote());
            ps.setInt(2, cama.getIdBuque());
            ps.setInt(3, cama.getNivel());
            ps.setInt(4, codigo);

            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Registro actualizado");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    @Override
    public void eliminar() {
        try {
            Connection cn = ClsConexion.obtenerConexion();

            PreparedStatement ps = cn.prepareStatement("update Camarote set estado = 0 where codigo_camarote = ?");

            ps.setInt(1, cama.getCodigo());

            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Registro eliminado");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
