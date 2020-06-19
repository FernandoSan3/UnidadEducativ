package ec.edu.com.ModeloGrupo.Controlador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import ec.edu.com.ModeloGrupo.Modelo.Mension;
import ec.edu.com.BaseDeDatos.BDConexcion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;

/**
 *
 * @author fernandosanchez
 */
public class ControladorMension {
    
    public static void crearMension(Mension mension) {
        try {
            String sql = "INSERT INTO \"edu_menciones\" (men_abrebiatura,men_mension,men_horast) VALUES (?,?,?)";
            BDConexcion.conectar();
            PreparedStatement sta = BDConexcion.getCon().prepareStatement(sql);            
            sta.setString(1, mension.getAbrebiatura());
            sta.setString(2, mension.getMension());
            sta.setDate(3, new Date(mension.getHorasTotales().getTime()));
            sta.executeUpdate();
            sta.close();
            BDConexcion.desconectar();
        } catch (SQLException ex) {
            System.out.println("Error al insertar en la base de datos: " + ex.getMessage());
        }
    }
    
    public static void modificarMension(Mension mension) {
        try {
            String actualizar = "UPDATE \"edu_menciones\" SET men_abrebiatura = ?, men_mension = ?, men_horast = ?  WHERE men_codigo = ?";
            BDConexcion.conectar();//conecta
            PreparedStatement sta = BDConexcion.getCon().prepareStatement(actualizar);
            sta.setString(1, mension.getAbrebiatura());
            sta.setString(2, mension.getMension());
            sta.setDate(3, new Date(mension.getHorasTotales().getTime()));
            sta.setInt(4, mension.getCodigo());
            sta.executeUpdate();//Ejecutar las lineas en la base
            sta.close();
            BDConexcion.desconectar();
        } catch (SQLException e) {
            System.out.println("Error al actualizar: " + e.getMessage());
        }
        
    }
    
    public static void buscarMension(String mensio,Mension mension) {
        try {
            String buscarCedula = "SELECT * FROM \"edu_menciones\" WHERE men_mension = ? ";
            BDConexcion.conectar();
            PreparedStatement sta = BDConexcion.getCon().prepareStatement(buscarCedula);
            sta.setString(1, mensio);
            ResultSet res = sta.executeQuery(); //me devuleve y almacena en el result resultset este es el execute
            res.next();

            mension.setCodigo(res.getInt("men_codigo"));
            mension.setAbrebiatura(res.getString("men_abrebiatura"));
            mension.setMension(res.getString("men_mension"));
            mension.setHorasTotales(res.getDate("men_horast"));

            sta.close();
            BDConexcion.desconectar();

        } catch (SQLException e) {
            System.out.println("Error al buscar en la Base de Datos: " + e.getMessage());
        }
        
    }
    
    public static void eliminarMension(Mension mension) {
        try {
            String eliminar = "DELETE FROM \"edu_menciones\" WHERE men_codigo = ? ;";
            BDConexcion.conectar();//conecta
            PreparedStatement sta = BDConexcion.getCon().prepareStatement(eliminar);//devuelve la coneccion y manda el string
            sta.setInt(1, mension.getCodigo());
            sta.executeUpdate();//ejecutar
            sta.close();//terminar el ejecutado
            BDConexcion.desconectar();//desconectar
        } catch (SQLException ex) {
            System.out.println("Error al eliminar: " + ex.getMessage());
        }
        
    }
    
}
