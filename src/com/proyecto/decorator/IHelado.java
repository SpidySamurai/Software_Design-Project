/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.decorator;

/**
 *
 * @author Javier
 */
public abstract class IHelado {
    double precio;
    
    public void setPrecio(double precio){
        this.precio = precio;
    }
    
    public double Precio(){
        return precio;
    }
}
