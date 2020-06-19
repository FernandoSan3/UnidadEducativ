/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.com.ModeloFactura.Controlador;

import ec.edu.com.BaseDeDatos.BDConexcion;
import ec.edu.com.ModeloFactura.Modelo.LibroDetalle;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alexCT
 */
public class ControladorLibroDetalle {

    private String sql;
    private PreparedStatement sta;
    private ResultSet res;

    public void crearLibroDetalle(LibroDetalle libroDetalle) {

        sql = "INSERT INTO \"edu_libro_detalles\" VALUES (?,?,?,?,?,?)";
        BDConexcion.conectar();
        try {
            sta = BDConexcion.getCon().prepareStatement(sql);
            sta.setInt(1, libroDetalle.getCodigo());
            sta.setDate(2, libroDetalle.getFecha());
            sta.setString(3, libroDetalle.getDetalle());
            sta.setDouble(4, libroDetalle.getDebe());
            sta.setDouble(5, libroDetalle.getHaber());
            sta.setInt(6, libroDetalle.getValores().getCodigo());
            sta.execute();
            sta.close();
            System.out.println("Datos Ingresados!");
            } catch (SQLException ex) {
            //ex.printStackTrace();
            System.out.println("Error de ingreso: " +ex);
        }
    }

    public List<LibroDetalle> listarLibroDetalle() {
        List<LibroDetalle> listlibroDetalle = new ArrayList<>();
        sql = "SELECT * FROM \"edu_libro_detalles\"";
        BDConexcion.conectar();
        try {
            sta = BDConexcion.getCon().prepareStatement(sql);
            res = sta.executeQuery();
            while (res.next()) {
                LibroDetalle libroDet = new LibroDetalle();
                libroDet.setCodigo(res.getInt("ldet_codigo"));
                libroDet.setFecha(res.getDate("ldet_fecha"));
                libroDet.setDetalle(res.getString("ldet_detalle"));
                libroDet.setDebe(res.getDouble("ldet_debe"));
                libroDet.setHaber(res.getDouble("ldet_haber"));
                listlibroDetalle.add(libroDet);
            }
            sta.close();
            BDConexcion.desconectar();
        } catch (SQLException ex) {
            System.out.println("Error al listar " + ex);
        }
        return listlibroDetalle;
    }

    public void actualizarPago(LibroDetalle libroDetalle) {
        sql = "UODATE FROM\"edu_libro_detalles\" SET  ldet_fecha=?, ldet_detalle=?, ldet_debe=? ldet_haber WHERE ldet_codigo=?";
        BDConexcion.conectar();
        try {
            sta = BDConexcion.getCon().prepareStatement(sql);
            sta.setDate(1, libroDetalle.getFecha());
            sta.setString(2, libroDetalle.getDetalle());
            sta.setDouble(3, libroDetalle.getDebe());
            sta.setDouble(4, libroDetalle.getHaber());
            sta.setInt(5, libroDetalle.getCodigo());
            sta.execute();
            sta.close();
            System.out.println("Datos Actualizados!");
            BDConexcion.desconectar();
        } catch (SQLException ex) {
            System.out.println("Error al Actualizar: " +ex);
        }
    }

    public void eliminarPago(LibroDetalle libroDetalle) {
        sql = "DELETE FROM \"edu_libro_detalles\" WHERE ldet_codigo=?";
        BDConexcion.conectar();
        try {
            sta = BDConexcion.getCon().prepareStatement(sql);
            sta.setInt(1, libroDetalle.getCodigo());
            sta.execute();
            sta.close();
            System.out.println("Datos Eliminados!");
            BDConexcion.desconectar();
        } catch (SQLException ex) {
            System.out.println("Error al eliminar " +ex);
        }
    }
}
