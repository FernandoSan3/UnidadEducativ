/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.com.ModeloGrupo.Controlador;

import ec.edu.com.BaseDeDatos.BDConexcion;
import ec.edu.com.ModeloGrupo.Modelo.AnioLectivo;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author fernandosanchez
 */
public class ControladorAnioLectivo {
    
    public static void crearAnioLectivo(AnioLectivo anioLectivo) {
        try {
            String sql = "INSERT INTO \"edu_anios_lectivos\" (ani_anio_lectivo,ani_fecha_inicio,ani_fecha_final) VALUES (?,?,?)";
            BDConexcion.conectar();
            PreparedStatement sta = BDConexcion.getCon().prepareStatement(sql);            
            sta.setString(1, anioLectivo.getAnioLectivo());
            sta.setDate(2, new Date (anioLectivo.getFechaInicio().getTime()));
            sta.setDate(3, new Date (anioLectivo.getFechaFinal().getTime()));
            sta.executeUpdate();
            sta.close();
            BDConexcion.desconectar();
        } catch (SQLException ex) {
            System.out.println("Error al insertar en la base de datos: " + ex.getMessage());
        }
    }
    
    public static void modificarAnioLectivo(AnioLectivo anioLectivo) {
        try {
            String actualizar = "UPDATE \"edu_anios_lectivos\" SET ani_anio_lectivo = ?, ani_fecha_inicio = ?, ani_fecha_final = ? WHERE ani_codigo = ?";
            BDConexcion.conectar();//conecta
            PreparedStatement sta = BDConexcion.getCon().prepareStatement(actualizar);
            sta.setString(1, anioLectivo.getAnioLectivo());
            sta.setDate(2, new Date (anioLectivo.getFechaInicio().getTime()));
            sta.setDate(3, new Date (anioLectivo.getFechaFinal().getTime()));
            sta.setInt(4, anioLectivo.getCodigo());
            sta.executeUpdate();//Ejecutar las lineas en la base
            sta.close();
            BDConexcion.desconectar();
        } catch (SQLException e) {
            System.out.println("Error al actualizar: " + e.getMessage());
        }
        
    }
    
    public static void buscarAnioLectivo(String ani,AnioLectivo anioLectivo) {
        try {
            String buscarCedula = "SELECT * FROM \"edu_anios_lectivos\" WHERE ani_anio_lectivo = ? ";
            BDConexcion.conectar();
            PreparedStatement sta = BDConexcion.getCon().prepareStatement(buscarCedula);
            sta.setString(1, ani);
            ResultSet res = sta.executeQuery(); //me devuleve y almacena en el result resultset este es el execute
            res.next(); 
            anioLectivo.setCodigo(res.getInt("ani_codigo"));
            anioLectivo.setAnioLectivo(res.getString("ani_anio_lectivo"));
            anioLectivo.setFechaInicio(res.getDate("ani_fecha_inicio"));
            anioLectivo.setFechaFinal(res.getDate("ani_fecha_final"));
            sta.close();
            BDConexcion.desconectar();
        } catch (SQLException e) {
            System.out.println("Error al buscar en la Base de Datos: " + e.getMessage());
        }
        
    }
    
    public static void eliminarAnioLectivo(AnioLectivo anioLectivo) {
        try {
            String eliminar = "DELETE FROM \"edu_anios_lectivos\" WHERE ani_codigo = ? ;";
            BDConexcion.conectar();//conecta
            PreparedStatement sta = BDConexcion.getCon().prepareStatement(eliminar);//devuelve la coneccion y manda el string
            sta.setInt(1, anioLectivo.getCodigo());
            sta.executeUpdate();//ejecutar
            sta.close();//terminar el ejecutado
            BDConexcion.desconectar();//desconectar
        } catch (SQLException ex) {
            System.out.println("Error al eliminar: " + ex.getMessage());
        }
        
    }
    
}
