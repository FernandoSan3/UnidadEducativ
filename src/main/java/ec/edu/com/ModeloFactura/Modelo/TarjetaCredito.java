/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.com.ModeloFactura.Modelo;

/**
 *
 * @author alexCT
 */
public class TarjetaCredito extends FormasDePago{

    @Override
    public double costoComision() {
    return 1;
    }

    @Override
    public double costoTotal() {
        return 1;
    }
    
}
