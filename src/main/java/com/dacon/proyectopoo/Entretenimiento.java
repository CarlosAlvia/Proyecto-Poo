/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dacon.proyectopoo;
import java.util.Scanner;
import java.util.ArrayList;
import com.dacon.proyectopoo.Vehiculo;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import com.dacon.proyectopoo.Reserva;
import Herramientas.ManejoArchivos;
import com.dacon.proyectopoo.Transporte;
/**
 *
 * @author User
 */
public class Entretenimiento extends Servicio {
    private Paquete paquete;
    
    @Override
     public void mostrarReserva(){
        String simbolo="/**************RESERVA GENERADA*************/";
        String simbolo1="/*                                         */";
        String simbolo2="/*******************************************/";
        System.out.println(simbolo);
        System.out.println(simbolo1);
        System.out.println(simbolo2);
        System.out.println("CÓDIGO RESERVA: "+this.reserva.getNumeroReserva());
        System.out.println("CLIENTE: "+this.reserva.getCliente().GetNombres()+" "+this.reserva.getCliente().GetApellidos()); 
        System.out.println("TIPO RESERVA: "+this.reserva.getTipoReserva());
        System.out.println("CIUDAD: "+this.paquete);
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
