/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.com.ModeloFactura.Controlador;

import ec.edu.com.BaseDeDatos.BDConexcion;
import ec.edu.com.ModeloFactura.Modelo.LibroDiario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alexCT
 */
public class ControladorLibroDiario {

    private String sql;
    private PreparedStatement sta;
    private ResultSet res;

    public void crearLibroDiario(LibroDiario libroDiario) {

        sql = "INSERT INTO \"edu_libros_diarios\" VALUES (?,?,?,?,?)";
        BDConexcion.conectar();
        try {
            sta = BDConexcion.getCon().prepareStatement(sql);
            sta.setInt(1, libroDiario.getCodigo());
            sta.setString(2, libroDiario.getEmpresa());
            sta.setString(3, libroDiario.getDescripcion());
            sta.setDouble(4, libroDiario.getDebe());
            sta.setDouble(5, libroDiario.getHaber());
            sta.execute();
            sta.close();
            System.out.println("Datos Ingresados!");
        } catch (SQLException ex) {
            //ex.printStackTrace();
            System.out.println("Error de ingreso: " +ex);
        }
    }

    public List<LibroDiario> listarLibroDiario() {
        List<LibroDiario> listlibroDiario = new ArrayList<>();
        sql = "SELECT * FROM \"edu_libros_diarios\"";
        BDConexcion.conectar();
        try {
            sta = BDConexcion.getCon().prepareStatement(sql);
            res = sta.executeQuery();
            while (res.next()) {
                LibroDiario libroD = new LibroDiario();
                libroD.setCodigo(res.getInt("ldia_codigo"));
                libroD.setEmpresa(res.getString("ldia_empresa"));
                libroD.setDescripcion(res.getString("ldia_descripcion"));
                libroD.setDebe(res.getDouble("ldia_total_debe"));
                libroD.setHaber(res.getDouble("ldia_total_haber"));
                listlibroDiario.add(libroD);
            }
            sta.close();
            BDConexcion.desconectar();
        } catch (SQLException ex) {
            System.out.println("Error al listar " + ex);
        }
        return listlibroDiario;
    }

    public void actualizarLibroDiario(LibroDiario libroDiario) {
        sql = "UODATE FROM\"edu_libros_diarios\" SET  ldia_empresa=?, ldia_descripcion=?, ldia_total_debe=? ldia_total_haber WHERE ldia_codigo=?";
        BDConexcion.conectar();
        try {
            sta = BDConexcion.getCon().prepareStatement(sql);
            sta.setString(1, libroDiario.getEmpresa());
            sta.setString(2, libroDiario.getDescripcion());
            sta.setDouble(3, libroDiario.getDebe());
            sta.setDouble(4, libroDiario.getHaber());
            sta.setInt(5, libroDiario.getCodigo());

            sta.execute();
            sta.close();
            System.out.println("Datos Actualizados!");
            BDConexcion.desconectar();
        } catch (SQLException ex) {
            System.out.println("Error al Actualizar: " +ex);
        }
    }

    public void eliminarLibroDiario(LibroDiario libroDiario) {
        sql = "DELETE FROM \"edu_libros_diarios\" WHERE ldia_codigo=?";
        BDConexcion.conectar();
        try {
            sta = BDConexcion.getCon().prepareStatement(sql);
            sta.setInt(1, libroDiario.getCodigo());
            sta.execute();
            sta.close();
            System.out.println("Datos Eliminados!");
            BDConexcion.desconectar();
        } catch (SQLException ex) {
            System.out.println("Error al eliminar " +ex);
        }
    }
}
