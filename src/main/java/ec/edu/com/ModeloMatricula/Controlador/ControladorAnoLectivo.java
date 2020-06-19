/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.com.ModeloMatricula.Controlador;

import ec.edu.com.BaseDeDatos.BDConexcion;
import ec.edu.com.ModeloMatricula.Modelo.AnoLectivo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author jorim
 */
public class ControladorAnoLectivo {
//metodo para crear el año lectivo

    private PreparedStatement preSta;
    private ResultSet res;
    private String sql;

    public void guardarGuia(AnoLectivo datos) {
        sql = "INSERT INTO \"AnoLectivo\" VALUES (?,?,?,?)";
        BDConexcion.conectar();
        try {
            preSta = BDConexcion.getCon().prepareStatement(sql);
            preSta.setInt(1, datos.getCodigo());
            preSta.setString(2, datos.getAnolectivo());
            preSta.setString(3, datos.getFechaInicio());
            preSta.setString(4, datos.getFechafinal());
            preSta.execute();
            preSta.close();
            BDConexcion.desconectar();
        } catch (SQLException e) {
            System.out.println("Error al guardar el año" + e.getMessage());
        }
    }

//Actualizar el año lectivo 
      public void actualizarGuia(AnoLectivo datos) {
        sql = "UPDATE \"AnoLectivo\" SET ani_anio_lectivo=? , ani_fecha_inicio=? , ani_fecha_final=? WHERE ani_codigo=?";
        BDConexcion.conectar();
        try {
            preSta = BDConexcion.getCon().prepareStatement(sql);
            preSta.setString(1, datos.getAnolectivo());
            preSta.setString(2, datos.getFechaInicio());
            preSta.setString(3, datos.getFechafinal());
            preSta.setInt(4, datos.getCodigo());
            preSta.execute();
            preSta.close();
            BDConexcion.desconectar();
        } catch (SQLException e) {
            System.out.println("Error al actualizar la Guia" + e.getMessage());
        }
    }

        public void eliminarGuia(AnoLectivo datos) {
        sql = "DELETE FROM \"GuiaTelefonica\" WHERE ani_codigo=?";
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
      
/*
    public List<Cliente> listarTodo() {
        List<Cliente> lista = new ArrayList<>();
        try {
            String listar = "SELECT * FROM cliente ORDER BY cli_id ASC";
            BDConexcion.conectar();
            PreparedStatement sta = BDConexcion.getCon().prepareStatement(listar);
            ResultSet res = sta.executeQuery(); //me devuleve y almacena en el result resultset este es el execute
            while (res.next()) {
                Cliente datos = new Cliente();
                datos.setCodigo(res.getInt("cli_id"));
                datos.setCedula(res.getString("cli_cedula"));
                datos.setNombre(res.getString("cli_nombres"));
                datos.setApellido(res.getString("cli_apallidos"));
                datos.setTelefono(res.getString("cli_direccion"));
                datos.setDireccion(res.getString("cli_telefono"));
                datos.setPeso(res.getDouble("cli_credito"));
                lista.add(datos);
            }
            sta.close();
            BDConexcion.desconectar();
        } catch (SQLException e) {
            System.out.println("Error al listar: " + e.getMessage());
        }
        return lista;
    }

    public void buscarCodigo(int codigo, Cliente datos) {
        try {
            //DatosPersonales datos = new DatosPersonales();
            String buscar = "SELECT * FROM cliente WHERE cli_id = ?";
            BDConexcion.conectar();
            PreparedStatement sta = BDConexcion.getCon().prepareStatement(buscar);
            sta.setInt(1, codigo);
            ResultSet res = sta.executeQuery(); //me devuleve y almacena en el result resultset este es el execute
            res.next();

            datos.setCodigo(res.getInt("cli_id"));
            datos.setCedula(res.getString("cli_cedula"));
            datos.setNombre(res.getString("cli_nombres"));
            datos.setApellido(res.getString("cli_apallidos"));
            datos.setTelefono(res.getString("cli_direccion"));
            datos.setDireccion(res.getString("cli_telefono"));
            datos.setPeso(res.getDouble("cli_credito"));

            sta.close();
            BDConexcion.desconectar();

        } catch (SQLException e) {
            System.out.println("Error al buscar en la base: " + e.getMessage());
        }
    }
*/
}
