package ec.edu.com.ModeloGrupo.Controlador;

import ec.edu.com.BaseDeDatos.BDConexcion;
import ec.edu.com.ModeloGrupo.Modelo.Aula;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author fernandosanchez
 */
public class ControladorAula {
    
     public static void crearAula(Aula aula) {
        try {
            String sql = "INSERT INTO \"edu_aulas\" (aul_aula,aul_piso,aul_num_aula,aul_edificio,aul_tipo) VALUES (?,?,?,?,?)";
            BDConexcion.conectar();
            PreparedStatement sta = BDConexcion.getCon().prepareStatement(sql);            
            sta.setString(1, aula.getAula());
            sta.setInt(2, aula.getPiso());
            sta.setInt(3, aula.getNumeroAula());
            sta.setString(4, aula.getEdificio());
            sta.setString(5, aula.getTipo());
            sta.executeUpdate();
            sta.close();
            BDConexcion.desconectar();
        } catch (SQLException ex) {
            System.out.println("Error al insertar en la base de datos: " + ex.getMessage());
        }
    }
    
    public static void modificarAula(Aula aula) {
        try {
            String actualizar = "UPDATE \"edu_aulas\" SET aul_aula = ?, aul_piso = ?, aul_num_aula = ?, aul_edificio = ?, aul_tipo = ? WHERE aul_codigo = ?";
            BDConexcion.conectar();//conecta
            PreparedStatement sta = BDConexcion.getCon().prepareStatement(actualizar);
            sta.setString(1, aula.getAula());
            sta.setInt(2, aula.getPiso());
            sta.setInt(3, aula.getNumeroAula());
            sta.setString(4, aula.getEdificio());
            sta.setString(5, aula.getTipo());
            sta.setInt(6, aula.getCodigo());
            sta.executeUpdate();//Ejecutar las lineas en la base
            sta.close();
            BDConexcion.desconectar();
        } catch (SQLException e) {
            System.out.println("Error al actualizar: " + e.getMessage());
        }
        
    }
    
    public static void buscarAula(String aul,Aula aula) {
        try {
            String buscarCedula = "SELECT * FROM \"edu_aulas\" WHERE aul_aula = ? ";
            BDConexcion.conectar();
            PreparedStatement sta = BDConexcion.getCon().prepareStatement(buscarCedula);
            sta.setString(1, aul);
            ResultSet res = sta.executeQuery(); //me devuleve y almacena en el result resultset este es el execute
            res.next();
            
            aula.setCodigo(res.getInt("aul_codigo"));
            aula.setAula(res.getString("aul_aula"));
            aula.setPiso(res.getInt("aul_piso"));
            aula.setNumeroAula(res.getInt("aul_num_aula"));
            aula.setEdificio(res.getString("aul_edificio"));
            aula.setTipo(res.getString("aul_tipo"));
            

            sta.close();
            BDConexcion.desconectar();

        } catch (SQLException e) {
            System.out.println("Error al buscar en la Base de Datos: " + e.getMessage());
        }
        
    }
    
    public static void eliminarAula(Aula aula) {
        try {
            String eliminar = "DELETE FROM \"edu_aulas\" WHERE aul_codigo = ? ;";
            BDConexcion.conectar();//conecta
            PreparedStatement sta = BDConexcion.getCon().prepareStatement(eliminar);//devuelve la coneccion y manda el string
            sta.setInt(1, aula.getCodigo());
            sta.executeUpdate();//ejecutar
            sta.close();//terminar el ejecutado
            BDConexcion.desconectar();//desconectar
        } catch (SQLException ex) {
            System.out.println("Error al eliminar: " + ex.getMessage());
        }
        
    }
}
