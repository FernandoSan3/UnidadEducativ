package ec.edu.com.ModeloGrupo.Controlador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import ec.edu.com.ModeloGrupo.Modelo.Curso;
import ec.edu.com.BaseDeDatos.BDConexcion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author fernandosanchez
 */
public class ControladorCurso {
    
    public static void crearCurso(Curso curso) {
        try {
            String sql = "INSERT INTO \"edu_cursos\" (cur_abrebiatura,cur_curso) VALUES (?,?)";
            BDConexcion.conectar();
            PreparedStatement sta = BDConexcion.getCon().prepareStatement(sql);            
            sta.setString(1, curso.getAbrebiatura());
            sta.setString(2, curso.getCurso());
            sta.executeUpdate();
            sta.close();
            BDConexcion.desconectar();
        } catch (SQLException ex) {
            System.out.println("Error al insertar en la base de datos: " + ex.getMessage());
        }
    }
    
    public static void modificarCurso(Curso curso) {
        try {
            String actualizar = "UPDATE \"edu_cursos\" SET cur_abrebiatura = ?, cur_curso = ?  WHERE cur_codigo = ?";
            BDConexcion.conectar();//conecta
            PreparedStatement sta = BDConexcion.getCon().prepareStatement(actualizar);
            sta.setString(1, curso.getAbrebiatura());
            sta.setString(2, curso.getCurso());
            sta.setInt(3, curso.getCodigo());
            sta.executeUpdate();//Ejecutar las lineas en la base
            sta.close();
            BDConexcion.desconectar();
        } catch (SQLException e) {
            System.out.println("Error al actualizar: " + e.getMessage());
        }
        
    }
    
    public static void buscarCurso(String curs,Curso curso) {
        try {
            String buscarCedula = "SELECT * FROM \"edu_cursos\" WHERE cur_curso = ? ";
            BDConexcion.conectar();
            PreparedStatement sta = BDConexcion.getCon().prepareStatement(buscarCedula);
            sta.setString(1, curs);
            ResultSet res = sta.executeQuery(); //me devuleve y almacena en el result resultset este es el execute
            res.next();

            curso.setCodigo(res.getInt("cur_codigo"));
            curso.setAbrebiatura(res.getString("cur_abrebiatura"));
            curso.setCurso(res.getString("cur_curso"));

            sta.close();
            BDConexcion.desconectar();

        } catch (SQLException e) {
            System.out.println("Error al buscar en la Base de Datos: " + e.getMessage());
        }
        
    }
    
    public static void eliminarCurso(Curso curso) {
        try {
            String eliminar = "DELETE FROM \"edu_cursos\" WHERE cur_codigo = ? ;";
            BDConexcion.conectar();//conecta
            PreparedStatement sta = BDConexcion.getCon().prepareStatement(eliminar);//devuelve la coneccion y manda el string
            sta.setInt(1, curso.getCodigo());
            sta.executeUpdate();//ejecutar
            sta.close();//terminar el ejecutado
            BDConexcion.desconectar();//desconectar
        } catch (SQLException ex) {
            System.out.println("Error al eliminar: " + ex.getMessage());
        }
        
    }
    
}
