/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.com.ModeloPersona.Controlador;


import ec.edu.com.ModeloPersona.Modelo.Docente;
import ec.edu.com.ModeloPersona.Modelo.Persona;
import ec.edu.com.BaseDeDatos.BDConexcion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author fernandosanchez
 */
public abstract class ControladorPersona {

    public ControladorPersona() {
    }
    
    public static void crearPersona(Persona persona) {
        try {
            String sql = "INSERT INTO \"edu_personas\" (per_cedula,per_nombre,per_apellido,per_direccion,per_telefono,per_correo) VALUES (?,?,?,?,?,?)";
            BDConexcion.conectar();
            PreparedStatement sta = BDConexcion.getCon().prepareStatement(sql);            
            sta.setString(1, persona.getCedula());
            sta.setString(2, persona.getNombre());
            sta.setString(3, persona.getApellido());
            sta.setString(4, persona.getDireccion());
            sta.setString(5, persona.getTelefono());
            sta.setString(6, persona.getCorreo());
            sta.executeUpdate();
            sta.close();
            BDConexcion.desconectar();
        } catch (SQLException ex) {
            System.out.println("Error al insertar en la base de datos: " + ex.getMessage());
        }
    }
    
    
    public static void modificarPersona(Persona persona) {
        try {
            String actualizar = "UPDATE \"edu_personas\" SET per_cedula = ?, per_nombre = ?, per_apellido=?, per_direccion = ?, per_telefono = ?, per_correo = ?   WHERE per_codigo = ?";
            BDConexcion.conectar();//conecta
            PreparedStatement sta = BDConexcion.getCon().prepareStatement(actualizar);
            sta.setString(1, persona.getCedula());
            sta.setString(2, persona.getNombre());
            sta.setString(3, persona.getApellido());
            sta.setString(4, persona.getDireccion());
            sta.setString(5, persona.getTelefono());
            sta.setString(6, persona.getCorreo());
            sta.setInt(7, persona.getCodigo());
            sta.executeUpdate();//Ejecutar las lineas en la base
            sta.close();
            BDConexcion.desconectar();
        } catch (SQLException e) {
            System.out.println("Error al actualizar: " + e.getMessage());
        }
    }
    
    public static void buscarPersona(String cedula, Persona persona) {
        try {
            String buscarCedula = "SELECT * FROM \"edu_personas\" WHERE per_cedula = ? ";
            BDConexcion.conectar();
            PreparedStatement sta = BDConexcion.getCon().prepareStatement(buscarCedula);
            sta.setString(1, cedula);
            ResultSet res = sta.executeQuery(); //me devuleve y almacena en el result resultset este es el execute
            res.next();

            persona.setCodigo(res.getInt("per_codigo"));
            persona.setCedula(res.getString("per_cedula"));
            persona.setNombre(res.getString("per_nombre"));
            persona.setApellido(res.getString("per_apellido"));
            persona.setDireccion(res.getString("per_direccion"));
            persona.setTelefono(res.getString("per_telefono"));           
            persona.setCorreo(res.getString("per_correo"));

            sta.close();
            BDConexcion.desconectar();

        } catch (SQLException e) {
            System.out.println("Error al buscar en la Base de Datos: " + e.getMessage());
        }
    }
    
    public static void eliminarPersona(Persona persona) {
        try {
            String eliminar = "DELETE FROM \"edu_personas\" WHERE per_codigo = ? ;";
            BDConexcion.conectar();//conecta
            PreparedStatement sta = BDConexcion.getCon().prepareStatement(eliminar);//devuelve la coneccion y manda el string
            sta.setInt(1, persona.getCodigo());
            sta.executeUpdate();//ejecutar
            sta.close();//terminar el ejecutado
            BDConexcion.desconectar();//desconectar
        } catch (SQLException ex) {
            System.out.println("Error al eliminar: " + ex.getMessage());
        }
    }
    
    public abstract void crearUsuario(Persona persona,String titulo);
    public abstract void modificarUsuario(Persona persona, String titulo,Docente docente);
    public abstract void buscarUsuario(String cedula,Persona persona, Docente docente);
    public abstract void eliminarUsuario(Persona persona);
    
    
}
