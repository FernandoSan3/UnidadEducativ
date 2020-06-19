/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.com.ModeloMatricula.Controlador;

import ec.edu.com.BaseDeDatos.BDConexcion;
import ec.edu.com.ModeloMatricula.Modelo.FacturaDetalle;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author jorim
 */
public class ControladorFacturaDetalle {
    
     private PreparedStatement preSta;
    private ResultSet res;
    private String sql;

    public void crear(FacturaDetalle datos) {
        sql = "INSERT INTO \"FacturaDetalle\" VALUES (?,?,?,?,?)";
        BDConexcion.conectar();
        try {
            preSta = BDConexcion.getCon().prepareStatement(sql);
            preSta.setInt(1, datos.getCodigo());
            preSta.setDouble(2, datos.getCantidad());
            preSta.setDouble(3, datos.getSubtotal());
            preSta.setString(4, datos.getDescripcion());
            preSta.setInt(5, datos.getMatricula().getCodigo());
            preSta.execute();
            preSta.close();
            BDConexcion.desconectar();
        } catch (SQLException e) {
            System.out.println("Error al guardar el año" + e.getMessage());
        }
    }
//Actualizar el FacturaDetalle
    
      public void actualizarGuia(FacturaDetalle datos) {
        sql = "UPDATE \"AnoLectivo\" SET fdet_cantidad=? , fdet_subtotal=? , fdet_descripcion=? WHERE fdet_codigo=?";
        BDConexcion.conectar();
        try {
            preSta = BDConexcion.getCon().prepareStatement(sql);
            preSta.setDouble(1, datos.getCantidad());
            preSta.setDouble(2, datos.getSubtotal());
            preSta.setString(3, datos.getDescripcion());
            preSta.setInt(4, datos.getMatricula().getCodigo());
            preSta.execute();
            preSta.close();
            BDConexcion.desconectar();
        } catch (SQLException e) {
            System.out.println("Error al actualizar la Guia" + e.getMessage());
        }
    }

        public void eliminarGuia(FacturaDetalle datos) {
        sql = "DELETE FROM \"FacturaDetalle\" WHERE fdet_codigo=?";
        BDConexcion.conectar();
        try {
            preSta = BDConexcion.getCon().prepareStatement(sql);
            preSta.setInt(1, datos.getCodigo());
            preSta.executeUpdate();
            preSta.close();
            BDConexcion.desconectar();
        } catch (SQLException e) {
            System.out.println("Error al eliminar la Guia" + e.getMessage());
        }
    }
      
    
    
}
