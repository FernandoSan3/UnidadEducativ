/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.com.ModeloGrupo.Modelo;

import java.util.Date;

/**
 *
 * @author fernandosanchez
 */
public class Mension {
    
    private int codigo;
    private String abrebiatura;
    private String mension;
    private Date horasTotales;

    public Mension() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getAbrebiatura() {
        return abrebiatura;
    }

    public void setAbrebiatura(String abrebiatura) {
        this.abrebiatura = abrebiatura;
    }

    public String getMension() {
        return mension;
    }

    public void setMension(String mension) {
        this.mension = mension;
    }

    public Date getHorasTotales() {
        return horasTotales;
    }

    public void setHorasTotales(Date horasTotales) {
        this.horasTotales = horasTotales;
    }

    @Override
    public String toString() {
        return "Mension{" + "codigo=" + codigo + ", abrebiatura=" + abrebiatura + ", mension=" + mension + ", horasTotales=" + horasTotales + '}';
    }

    

    
    
    
    
}
