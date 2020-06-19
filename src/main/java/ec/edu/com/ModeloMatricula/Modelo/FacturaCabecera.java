/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.com.ModeloMatricula.Modelo;


import ec.edu.com.ModeloPersona.Modelo.Persona;
import ec.edu.com.ModeloFactura.Modelo.FormasDePago;
import java.util.Date;

/**
 *
 * @author josepandiguana
 */
public class FacturaCabecera {
    private int codigo;
    private int numeroFacura;
    private Date fecha;
    private Persona persona;
    private FormasDePago formaDePago;
    private double subtotal;
    private double total;

    public FacturaCabecera(int codigo, int numeroFacura, Date fecha, Persona persona, FormasDePago formaDePago, double subtotal, double total) {
        this.codigo = codigo;
        this.numeroFacura = numeroFacura;
        this.fecha = fecha;
        this.persona = persona;
        this.formaDePago = formaDePago;
        this.subtotal = subtotal;
        this.total = total;
    }
    
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNumeroFacura() {
        return numeroFacura;
    }

    public void setNumeroFacura(int numeroFacura) {
        this.numeroFacura = numeroFacura;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public FormasDePago getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(FormasDePago formaDePago) {
        this.formaDePago = formaDePago;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "FacturaCabecera{" + "codigo=" + codigo + ", numeroFacura=" + numeroFacura + ", fecha=" + fecha + ", persona=" + persona + ", formaDePago=" + formaDePago + ", subtotal=" + subtotal + ", total=" + total + '}';
    }
    
    
    
}
