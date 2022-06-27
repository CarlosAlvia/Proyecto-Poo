/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dacon.proyectopoo;

/**
 *
 * @author User
 */
public class Transporte extends Servicio {
    private Vehiculo vehiculo;
    public Transporte(String ciudad, double valor, Reserva reserva, double puntuacion, int identificador,Vehiculo vehiculo){
        super(ciudad,valor,reserva,puntuacion,identificador);
        this.vehiculo=vehiculo;
    }
    public Transporte(){
        
    }
    @Override
    public void mostrarReserva(){
        super.mostrarReserva();
        System.out.println("VEHICULO: "+this.vehiculo.getMarca()+" "+this.vehiculo.getModelo());
        System.out.println("CÓDIGO VEHICULO: "+this.vehiculo.getId());
        System.out.println("VALOR A PAGAR: "+this.valor);
    }
}
