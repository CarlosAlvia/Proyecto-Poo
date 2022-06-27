/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dacon.proyectopoo;

/**
 *
 * @author User
 */
public class Paquete extends Entretenimiento{
    String informacion;
    double costo; 
    String diasSalida;
    String fechaDisponible;
    int numeroPersonas;
    public Paquete(Paquete paquete) {
        super(paquete);
    }

    public Paquete(String ciudad, double valor, Reserva reserva, double puntuacion, int identificador) {
        super(ciudad, valor, reserva, puntuacion, identificador);
    }
   

    public Paquete() {
    }
    
    
    
            
            
            
    
    public String getInformacion() {
        return informacion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getDiasSalida() {
        return diasSalida;
    }

    public void setDiasSalida(String diasSalida) {
        this.diasSalida = diasSalida;
    }

    public String getFechaDisponible() {
        return fechaDisponible;
    }

    public void setFechaDisponible(String fechaDisponible) {
        this.fechaDisponible = fechaDisponible;
    }

    public int getNumeroPersonas() {
        return numeroPersonas;
    }

    public void setNumeroPersonas(int numeroPersonas) {
        this.numeroPersonas = numeroPersonas;
    }
    
    
}
