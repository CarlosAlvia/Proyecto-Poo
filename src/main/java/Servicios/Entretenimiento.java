/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import ElementoServicios.Paquete;

/**
 *
 * @author User
 */
public class Entretenimiento extends Servicio {
    private Paquete paquete;
    

    public Entretenimiento(Paquete paquete, String ciudad, double valor) {
        super(ciudad, valor);
        this.paquete = paquete;
    }
    
    @Override
     public void mostrarReserva(){
        super.mostrarReserva();
        System.out.println("CIUDAD: "+this.paquete.getCiudadPa());
        System.out.println("PAQUETE: "+this.paquete.getNombrePaquete());
        System.out.println("VALOR PAGAR: "+this.getValor());
     }
    
    public Paquete getPaquete() {
        return paquete;
    }
    public void setPaquete(Paquete paquete) {
        this.paquete = paquete;
    }
  
}
