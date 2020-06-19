/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.com.ModeloPersona.Controlador;


import ec.edu.com.ModeloPersona.Controlador.ControladorPersona;
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
public class ControladorDocente extends ControladorPersona {
    
    Docente docente = new Docente();

    public ControladorDocente() {
        
    }
    
    public static void contarPersona() {
        try {
            //DatosPersonales d = new DatosPersonales();
            int s;
            String contar = "SELECT MAX (per_codigo) FROM \"edu_personas\" ";
            BDConexcion.conectar();//conecta
            PreparedStatement sta = BDConexcion.getCon().prepareStatement(contar);//devuelve la coneccion y manda el string
            ResultSet res = sta.executeQuery(); //me devuleve y almacena en el result resultset este es el execute
            res.next();
            s = res.getInt(1) + 1;
            sta.close();//terminar el ejecutado
            BDConexcion.desconectar();//desconectar
        } catch (SQLException e) {
            System.out.println("Error al contar en la Base de Datos: " + e.getMessage());
        }
    }
    
    

    @Override
    public void crearUsuario(Persona persona, String titulo) {
        
        try {
            int s;
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
            String contar = "SELECT MAX (per_codigo) FROM \"edu_personas\" ";            
            PreparedStatement st = BDConexcion.getCon().prepareStatement(contar);//devuelve la coneccion y manda el string
            ResultSet res = st.executeQuery(); //me devuleve y almacena en el result resultset este es el execute
            res.next();
            s = res.getInt(1);
            st.close();//terminar el ejecutado
            
            String sqll = "INSERT INTO \"edu_docentes\" (doce_titulo,edu_personas_per_codigo) VALUES (?,?)";            
            PreparedStatement sta1 = BDConexcion.getCon().prepareStatement(sqll);
            sta1.setString(1, titulo);
            sta1.setInt(2, s);
            sta1.executeUpdate();
            sta1.close();
            BDConexcion.desconectar();
        } catch (SQLException ex) {
            System.out.println("Error al insertar en la base de datos: " + ex.getMessage());
        }
    }

    

    @Override
    public void buscarUsuario(String cedula,Persona persona, Docente docente) {
        try {
            
            String buscarCedula = "SELECT * from edu_docentes d, edu_personas p  where p.per_codigo  = d.edu_personas_per_codigo and p.per_cedula  = ? ";
            BDConexcion.conectar();
            PreparedStatement sta = BDConexcion.getCon().prepareStatement(buscarCedula);
            sta.setString(1, cedula);
            ResultSet res = sta.executeQuery(); //me devuleve y almacena en el result resultset este es el execute
            res.next();
            docente.setTitulo(res.getString("doce_titulo"));           
            docente.setCodigo(res.getInt("per_codigo"));
            docente.setCedula(res.getString("per_cedula"));
            docente.setNombre(res.getString("per_nombre"));
            docente.setApellido(res.getString("per_apellido"));
            docente.setDireccion(res.getString("per_direccion"));
            docente.setTelefono(res.getString("per_telefono"));           
            docente.setCorreo(res.getString("per_correo"));
            
            sta.close();
            
            BDConexcion.desconectar();

        } catch (SQLException e) {
            System.out.println("Error al buscar en la Base de Datos: " + e.getMessage());
        }
    }

    @Override
    public void eliminarUsuario(Persona persona) {
        
        try {
            
            String eliminar = "DELETE FROM \"edu_docentes\" WHERE edu_personas_per_codigo = ? ;";
            BDConexcion.conectar();//conecta
            PreparedStatement sta = BDConexcion.getCon().prepareStatement(eliminar);//devuelve la coneccion y manda el string
            sta.setInt(1, persona.getCodigo());
            sta.executeUpdate();//ejecutar
            sta.close();//terminar el ejecutado
            BDConexcion.desconectar();//desconectar
            
            String eliminar1 = "DELETE FROM \"edu_personas\" WHERE per_codigo = ? ;";
            BDConexcion.conectar();//conecta
            PreparedStatement sta1 = BDConexcion.getCon().prepareStatement(eliminar1);//devuelve la coneccion y manda el string
            sta1.setInt(1, persona.getCodigo());
            sta1.executeUpdate();//ejecutar
            sta1.close();//terminar el ejecutado
            BDConexcion.desconectar();//desconectar
            
        } catch (SQLException ex) {
            System.out.println("Error al eliminar: " + ex.getMessage());
        }
    }

    @Override
    public void modificarUsuario(Persona persona, String titulo,Docente docente) {
        
        try {
            String actualizar = "UPDATE \"edu_personas\" SET per_cedula = ?, per_nombre = ?, per_apellido=?, per_direccion = ?, per_telefono = ?, per_correo = ?   WHERE per_codigo = ?";
            BDConexcion.conectar();//conecta
            PreparedStatement sta1 = BDConexcion.getCon().prepareStatement(actualizar);
            sta1.setString(1, persona.getCedula());
            sta1.setString(2, persona.getNombre());
            sta1.setString(3, persona.getApellido());
            sta1.setString(4, persona.getDireccion());
            sta1.setString(5, persona.getTelefono());
            sta1.setString(6, persona.getCorreo());
            sta1.setInt(7, persona.getCodigo());
            sta1.executeUpdate();//Ejecutar las lineas en la base
            sta1.close();
            BDConexcion.desconectar();
        } catch (SQLException e) {
            System.out.println("Error al actualizar: " + e.getMessage());
        }
        
    }

  
    
}
