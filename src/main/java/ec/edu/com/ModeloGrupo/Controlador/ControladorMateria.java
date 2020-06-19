/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.com.ModeloGrupo.Controlador;

import ec.edu.com.BaseDeDatos.BDConexcion;
import ec.edu.com.ModeloGrupo.Modelo.Materia;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author fernandosanchez
 */
public class ControladorMateria {
    
    public static void crearMateria(Materia materia) {
        try {
            String sql = "INSERT INTO \"edu_materias\" (mat_materia, mat_abrebiatura, mat_horas, mat_costo) VALUES (?,?,?,?)";
            BDConexcion.conectar();
            PreparedStatement sta = BDConexcion.getCon().prepareStatement(sql);            
            sta.setString(1, materia.getMateria());
            sta.setString(2, materia.getAbrebiatura());
            sta.setString(3, materia.getHoras());
            sta.setDouble(4, materia.getCosto());
            sta.executeUpdate();
            sta.close();
            BDConexcion.desconectar();
        } catch (SQLException ex) {
            System.out.println("Error al insertar en la base de datos: " + ex.getMessage());
        }
    }
    
    public static void modificarMateria(Materia materia) {
        try {
            String actualizar = "UPDATE \"edu_materias\" SET mat_materia = ?, mat_abrebiatura = ?, mat_horas = ? ,mat_costo = ? WHERE mat_codigo = ?";
            BDConexcion.conectar();//conecta
            PreparedStatement sta = BDConexcion.getCon().prepareStatement(actualizar);
            sta.setString(1, materia.getMateria());
            sta.setString(2, materia.getAbrebiatura());
            sta.setString(3, materia.getHoras());
            sta.setDouble(4, materia.getCosto());
            sta.setInt(5, materia.getCodigo());
            sta.executeUpdate();//Ejecutar las lineas en la base
            sta.close();
            BDConexcion.desconectar();
        } catch (SQLException e) {
            System.out.println("Error al actualizar: " + e.getMessage());
        }
        
    }
    
    public static void buscarMateria(String materi,Materia materia) {
        try {
            String buscarCedula = "SELECT * FROM \"edu_materias\" WHERE mat_materia = ? ";
            BDConexcion.conectar();
            PreparedStatement sta = BDConexcion.getCon().prepareStatement(buscarCedula);
            sta.setString(1, materi);
            ResultSet res = sta.executeQuery(); //me devuleve y almacena en el result resultset este es el execute
            res.next(); 
            materia.setCodigo(res.getInt("mat_codigo"));
            materia.setMateria(res.getString("mat_materia"));
            materia.setAbrebiatura(res.getString("mat_abrebiatura"));
            materia.setHoras(res.getString("mat_horas"));
            materia.setCosto(res.getDouble("mat_costo"));
            sta.close();
            BDConexcion.desconectar();
        } catch (SQLException e) {
            System.out.println("Error al buscar en la Base de Datos: " + e.getMessage());
        }
        
    }
    
    public static void buscarMateriaCodigo(int codigo) {
        try {
            Materia  materia = new Materia();
            String buscarCedula = "SELECT * FROM \"edu_materias\" WHERE mat_codigo = ? ";
            BDConexcion.conectar();
            PreparedStatement sta = BDConexcion.getCon().prepareStatement(buscarCedula);
            sta.setInt(1, codigo);
            ResultSet res = sta.executeQuery(); //me devuleve y almacena en el result resultset este es el execute
            res.next(); 
            materia.setCodigo(res.getInt("mat_codigo"));
            materia.setMateria(res.getString("mat_materia"));
            materia.setAbrebiatura(res.getString("mat_abrebiatura"));
            materia.setHoras(res.getString("mat_horas"));
            materia.setCosto(res.getDouble("mat_costo"));
            sta.close();
            BDConexcion.desconectar();
        } catch (SQLException e) {
            System.out.println("Error al buscar en la Base de Datos: " + e.getMessage());
        }
        
    }
    
    public static void eliminarMateria(Materia materia) {
        try {
            String eliminar = "DELETE FROM \"edu_materias\" WHERE mat_codigo = ? ;";
            BDConexcion.conectar();//conecta
            PreparedStatement sta = BDConexcion.getCon().prepareStatement(eliminar);//devuelve la coneccion y manda el string
            sta.setInt(1, materia.getCodigo());
            sta.executeUpdate();//ejecutar
            sta.close();//terminar el ejecutado
            BDConexcion.desconectar();//desconectar
        } catch (SQLException ex) {
            System.out.println("Error al eliminar: " + ex.getMessage());
        }
        
    }
    
    
}
