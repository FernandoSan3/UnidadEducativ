/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.com.ModeloFactura.Controlador;


import ec.edu.com.BaseDeDatos.BDConexcion;
import ec.edu.com.ModeloFactura.Modelo.Pago;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alexCT
 */
public class ControladorPago {

    private String sql;
    private PreparedStatement sta;
    private ResultSet res;

    public void crearPago(Pago pago) {

        sql = "INSERT INTO \"edu_pagos\" VALUES (?,?,?,?,?)";
        BDConexcion.conectar();
        try {
            sta = BDConexcion.getCon().prepareStatement(sql);
            sta.setInt(1, pago.getCodigo());
            sta.setDate(2, pago.getFecha());
            sta.setString(3, pago.getEstado());
            sta.setDouble(4, pago.getValor());
            sta.setInt(5, pago.getFormaPago().getCodigo());
            sta.execute();
            sta.close();
            System.out.println("Datos Ingresados!");
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Error de ingreso: " +ex);
        }
    }

    public List<Pago> listarPago() {
        List<Pago> listaPagos = new ArrayList<>();
        sql = "SELECT * FROM \"edu_pagos\"";
        BDConexcion.conectar();
        try {
            sta = BDConexcion.getCon().prepareStatement(sql);
            res = sta.executeQuery();
            while (res.next()) {
                Pago p = new Pago();
                p.setCodigo(res.getInt("pag_codigo"));
                p.setFecha(res.getDate("pag_fecha"));
                p.setEstado(res.getString("pag_estado"));
                p.setValor(res.getDouble("pag_valor"));
                listaPagos.add(p);
            }
            sta.close();
            BDConexcion.desconectar();
        } catch (SQLException ex) {
            System.out.println("Error al listar " + ex);
        }
        return listaPagos;
    }

    public void actualizarPago(Pago pago) {
        sql = "UODATE FROM\"edu_pagos\" SET  pag_fecha=?, pag_estado=?, pag_valor=? edu_formas_pagos_fpag_codigo WHERE pag_codigo=?";
        BDConexcion.conectar();
        try {
            sta = BDConexcion.getCon().prepareStatement(sql);
            sta.setDate(1, pago.getFecha());
            sta.setString(2, pago.getEstado());
            sta.setDouble(3, pago.getValor());
            sta.setInt(4, pago.getFormaPago().getCodigo());
            sta.setInt(5, pago.getCodigo());
            sta.execute();
            sta.close();
            System.out.println("Datos Actualizados!");
            BDConexcion.desconectar();
        } catch (SQLException ex) {
            System.out.println("Error al Actualizar: " +ex);
        }
    }

    public void eliminarPago(Pago pago) {
        sql = "DELETE FROM \"edu_pagos\" WHERE pag_codigo=?";
        BDConexcion.conectar();
        try {
            sta = BDConexcion.getCon().prepareStatement(sql);
            sta.setInt(1, pago.getCodigo());
            sta.execute();
            sta.close();
            System.out.println("Datos Eliminados!");
            BDConexcion.desconectar();
        } catch (SQLException ex) {
            System.out.println("Error al eliminar " +ex);
        }
    }

}
