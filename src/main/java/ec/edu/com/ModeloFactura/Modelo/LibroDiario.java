/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.com.ModeloFactura.Modelo;

import java.util.List;

/**
 *
 * @author alexCT
 */
public class LibroDiario {
    
    private int codigo;
    private String empresa;
    private String descripcion;
    private List<LibroDetalle> listLibroDetalle;
    private double debe;
    private double haber;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<LibroDetalle> getListLibroDetalle() {
        return listLibroDetalle;
    }

    public void setListLibroDetalle(List<LibroDetalle> listLibroDetalle) {
        this.listLibroDetalle = listLibroDetalle;
    }

    public double getDebe() {
        return debe;
    }

    public void setDebe(double debe) {
        this.debe = debe;
    }

    public double getHaber() {
        return haber;
    }

    public void setHaber(double haber) {
        this.haber = haber;
    }
    
    
}
