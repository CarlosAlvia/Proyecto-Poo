/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dacon.proyectopoo;

/**
 *
 * @author User
 */
public class Paquete {
    
    String informacion;
    double costo; 
    String diasSalida;
    String fechaDisponible;
    int numeroPersonas;
    public Paquete(String informacion, double costo, String diasSalida, String fechaDisponible, int numeroPersonas) {
        this.informacion = informacion;
        this.costo = costo;
        this.diasSalida = diasSalida;
        this.fechaDisponible = fechaDisponible;
        this.numeroPersonas = numeroPersonas;
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
