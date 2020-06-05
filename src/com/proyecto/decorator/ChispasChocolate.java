/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.decorator;

/**
 *
 * @author LEFT4
 */
public class ChispasChocolate extends DecoradorHelado{

    private double precio = 8;
    @Override
    public double getPrecio() {
       return this.helado.Precio();
    }
    
    public ChispasChocolate (IHelado helado){
        this.setHelado(helado);
        this.helado.setPrecio(this.helado.Precio()+precio);
    }
    
}