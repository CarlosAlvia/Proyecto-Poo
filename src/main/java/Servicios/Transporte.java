/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import ElementoServicios.Vehiculo;

/**
 *
 * @author User
 */
public class Transporte extends Servicio {
    private Vehiculo vehiculo;

    //En este constructor se debe arreglar para que el super no reciba los dos últimos valores
    public Transporte(String ciudad, double valor,Vehiculo vehiculo){
        super(ciudad,valor);
        this.vehiculo=vehiculo;
    }
    
    @Override
    public void mostrarReserva(){
        super.mostrarReserva();
        System.out.println("VEHICULO: "+this.vehiculo.getMarca()+" "+this.vehiculo.getModelo());
        System.out.println("CÓDIGO VEHICULO: "+this.vehiculo.getId());
        System.out.println("VALOR A PAGAR: "+this.valor);
    }
    @Override
    public String toString(){
        return this.reserva.getNumeroReserva()+","+this.ciudad+","+this.vehiculo.getId()+","+this.reserva.getValorPagar();
    }
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }   
}
