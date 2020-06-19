/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.com.ModeloFactura.Modelo;

import java.sql.Date;


/**
 *
 * @author alexCT
 */
public class Pago {
    
    private int codigo;
    private Date fecha;
    private String estado;
    private double valor;
    private FormasDePago formaPago;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public FormasDePago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(FormasDePago formaPago) {
        this.formaPago = formaPago;
    }
    
    
        
}
