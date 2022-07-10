/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;
import java.util.Scanner;
import java.util.ArrayList;
import ElementoServicios.Vehiculo;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import PagoReserva.Reserva;
import Herramientas.ManejoArchivos;
import ElementoServicios.Paquete;
import PagoReserva.Reserva;
/**
 *
 * @author User
 */
public class Entretenimiento extends Servicio {
    private Paquete paquete;
    
    public Entretenimiento(Paquete paquete, String ciudad, double valor, double puntuacion, int identificador) {
        super(ciudad, valor, puntuacion, identificador);
        this.paquete = paquete;
    }
    public Entretenimiento(Paquete paquete, String ciudad, double valor) {
        super(ciudad, valor);
        this.paquete = paquete;
    }
    
    public Entretenimiento(Reserva reserva){
        this.reserva=reserva;
    }
    
    
    @Override
     public void mostrarReserva(){
        super.mostrarReserva();
        System.out.println("CIUDAD: "+this.paquete.getCiudadPa());
        System.out.println("PAQUETE: "+this.paquete.getNombrePaquete());
        System.out.println("VALOR PAGAR: "+this.paquete.getCostoP()*this.paquete.getNumeroPersonas());
     }
    
    public Paquete getPaquete() {
        return paquete;
    }
    public void setPaquete(Paquete paquete) {
        this.paquete = paquete;
    }
    public Entretenimiento(Paquete paquete){
        this.paquete=paquete;
    }
    
    public Entretenimiento(String ciudad, double valor, double puntuacion, int identificador){
        super(ciudad,valor, puntuacion,identificador);
    }
    public Entretenimiento(){
        
    }
    
}
