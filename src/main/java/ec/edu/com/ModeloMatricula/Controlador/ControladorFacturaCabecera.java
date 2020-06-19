/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.com.ModeloMatricula.Controlador;


import ec.edu.com.BaseDeDatos.BDConexcion;
import ec.edu.com.ModeloMatricula.Modelo.FacturaCabecera;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author jorim
 */
public class ControladorFacturaCabecera {
    
    private PreparedStatement preSta;
    private ResultSet res;
    private String sql;

    public void crear(FacturaCabecera datos) {
        sql = "INSERT INTO \"FacturaCabecera\" VALUES (?,?,?,?,?,?,?)";
        BDConexcion.conectar();
        try {
            preSta = BDConexcion.getCon().prepareStatement(sql);
            preSta.setInt(1, datos.getCodigo());
            preSta.setInt(2, datos.getNumeroFacura());
        //    preSta.setDate(3, datos.getSubtotal());
            preSta.setInt(4, datos.getPersona().getCodigo());
          //  preSta.setInt(5, datos.getFormaDePago().getCodigo());
            preSta.setDouble(6, datos.getSubtotal());
            preSta.setDouble(7, datos.getTotal());
            
            preSta.execute();
            preSta.close();
            BDConexcion.desconectar();
        } catch (SQLException e) {
            System.out.println("Error al guardar el año" + e.getMessage());
        }
    }
//Actualizar el FacturaDetalle
    
      public void actualizarGuia(FacturaCabecera datos) {
        sql = "UPDATE \"AnoLectivo\" SET  fcab_codigo =? , fcab_numero=? , fcab_fecha=? ,fcab_subtotal=?, fcab_total =?,edu_representantes_rep_codigo=?  WHERE fcab_codigo=?";
        BDConexcion.conectar();
        try {
            preSta = BDConexcion.getCon().prepareStatement(sql);
            preSta.setInt(1, datos.getNumeroFacura());
          //  preSta.setString(2, datos.getFecha());
            preSta.setInt(3, datos.getPersona().getCodigo());
           // preSta.setInt(4, datos.getFormaDePago().getCodigo());
            preSta.setDouble(5, datos.getSubtotal());
            preSta.setDouble(6, datos.getTotal());
            preSta.execute();
            preSta.close();
            BDConexcion.desconectar();
        } catch (SQLException e) {
            System.out.println("Error al actualizar la Guia" + e.getMessage());
        }
    }

        public void eliminarGuia(FacturaCabecera datos) {
        sql = "DELETE FROM \"FacturaDetalle\" WHERE fcab_codigo=?";
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
