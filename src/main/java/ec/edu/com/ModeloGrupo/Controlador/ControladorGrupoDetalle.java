/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.com.ModeloGrupo.Controlador;

import ec.edu.com.BaseDeDatos.BDConexcion;
import ec.edu.com.ModeloGrupo.Modelo.GrupoDetalle;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author fernandosanchez
 */
public class ControladorGrupoDetalle {
    
    public static void crearGrupoDetalle(GrupoDetalle grupoDetalle) {
        try {
            String sql = "INSERT INTO \"edu_grupo_detalles\" (edu_materias_mat_codigo, edu_aulas_aul_codigo, edu_docentes_doce_codigo, edu_grupos_cabecera_gru_cab_codigo) VALUES (?,?,?,?)";
            BDConexcion.conectar();
            PreparedStatement sta = BDConexcion.getCon().prepareStatement(sql);            
            sta.setInt(1, grupoDetalle.getMateria().getCodigo());
            sta.setInt(2, grupoDetalle.getAula().getCodigo());
            sta.setInt(3, grupoDetalle.getPersona().getCodigo());
            sta.setInt(4, grupoDetalle.getGrupoDetalle().getCodigo());
            sta.executeUpdate();
            sta.close();
            BDConexcion.desconectar();
        } catch (SQLException ex) {
            System.out.println("Error al insertar en la base de datos: " + ex.getMessage());
        }
    }
    
    public static void modificarGrupoDetalle(GrupoDetalle grupoDetalle) {
        try {
            String actualizar = "UPDATE \"edu_grupo_detalles\" SET edu_materias_mat_codigo = ?, edu_aulas_aul_codigo = ?, edu_docentes_doce_codigo = ? , edu_grupos_cabecera_gru_cab_codigo = ? WHERE gru_det_codigo = ?";
            BDConexcion.conectar();//conecta
            PreparedStatement sta = BDConexcion.getCon().prepareStatement(actualizar);
            sta.setInt(1, grupoDetalle.getMateria().getCodigo());
            sta.setInt(2, grupoDetalle.getAula().getCodigo());
            sta.setInt(3, grupoDetalle.getPersona().getCodigo());
            sta.setInt(4, grupoDetalle.getGrupoDetalle().getCodigo());
            sta.setInt(5, grupoDetalle.getCodigo());
            sta.executeUpdate();//Ejecutar las lineas en la base
            sta.close();
            BDConexcion.desconectar();
        } catch (SQLException e) {
            System.out.println("Error al actualizar: " + e.getMessage());
        }
        
    }
    
    public static void buscarGrupoDetalle(String grupo,GrupoDetalle grupoDetalle) {
        try {
            ControladorMateria materia = new ControladorMateria();
            String buscarCedula = "SELECT * FROM \"edu_grupo_detalles\" WHERE men_mension = ? ";
            BDConexcion.conectar();
            PreparedStatement sta = BDConexcion.getCon().prepareStatement(buscarCedula);
            sta.setString(1, grupo);
            ResultSet res = sta.executeQuery(); //me devuleve y almacena en el result resultset este es el execute
            res.next();

            grupoDetalle.setCodigo(res.getInt("gru_det_codigo"));
            //grupoDetalle.setMateria(materia.buscarMateriaCodigo(res.getInt("edu_materias_mat_codigo")));
            

            sta.close();
            BDConexcion.desconectar();

        } catch (SQLException e) {
            System.out.println("Error al buscar en la Base de Datos: " + e.getMessage());
        }
        
    }
    
    public static void eliminarGrupoDetalle(GrupoDetalle grupoDetalle) {
        try {
            String eliminar = "DELETE FROM \"edu_grupo_detalles\" WHERE gru_det_codigo = ? ;";
            BDConexcion.conectar();//conecta
            PreparedStatement sta = BDConexcion.getCon().prepareStatement(eliminar);//devuelve la coneccion y manda el string
            sta.setInt(1, grupoDetalle.getCodigo());
            sta.executeUpdate();//ejecutar
            sta.close();//terminar el ejecutado
            BDConexcion.desconectar();//desconectar
        } catch (SQLException ex) {
            System.out.println("Error al eliminar: " + ex.getMessage());
        }
        
    }
    
}
