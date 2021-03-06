/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.com.ModeloMatricula.Controlador;

import ec.edu.com.BaseDeDatos.BDConexcion;
import ec.edu.com.ModeloMatricula.Modelo.Matricula;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author jorim
 */
public class ControladorMatricula {

    private PreparedStatement preSta;
    private ResultSet res;
    private String sql;

    public void crear(Matricula datos) {
        sql = "INSERT INTO \"FacturaCabecera\" VALUES (?,?,?,?,?)";
        BDConexcion.conectar();
        try {
            preSta = BDConexcion.getCon().prepareStatement(sql);
            preSta.setInt(1, datos.getCodigo());
         //   preSta.setDate(2, datos.getNumeroFacura());
           // preSta.setInt(3, datos.getGrupoCabeveras().getCodigo());
            preSta.setInt(4, datos.getEstudiante().getCodigo());
            preSta.setInt(5, datos.getAnoLectivo().getCodigo());
            

            preSta.execute();
            preSta.close();
            BDConexcion.desconectar();
        } catch (SQLException e) {
            System.out.println("Error al guardar el año" + e.getMessage());
        }
    }
//Actualizar el FacturaDetalle

    public void actualizarGuia(Matricula datos) {
        sql = "UPDATE \"AnoLectivo\" SET  fcab_codigo =? , fcab_numero=? , fcab_fecha=? ,fcab_subtotal=?, fcab_total =?,edu_representantes_rep_codigo=?  WHERE fcab_codigo=?";
        BDConexcion.conectar();
        try {
            preSta = BDConexcion.getCon().prepareStatement(sql);
            preSta.setInt(1, datos.getCodigo());
        //    preSta.setDate(2, datos.getNumeroFacura());
          //  preSta.setInt(3, datos.getGrupoCabeveras().getCodigo());
            preSta.setInt(4, datos.getEstudiante().getCodigo());
            preSta.setInt(5, datos.getAnoLectivo().getCodigo());
            preSta.execute();
            preSta.close();
            BDConexcion.desconectar();
        } catch (SQLException e) {
            System.out.println("Error al actualizar la Guia" + e.getMessage());
        }
    }

    public void eliminarGuia(Matricula datos) {
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
