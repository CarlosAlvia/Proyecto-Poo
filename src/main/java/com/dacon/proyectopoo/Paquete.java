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
    String ciudad;
   String nombrePaquete;
    String informacion;
    double costoP; 
    String diasSalida;
    String fechaDisponible;
    int numeroPersonas;
    
    public String getNombrePaquete() {
        return nombrePaquete;
    }

    public void setNombrePaquete(String nombrePaquete) {
        this.nombrePaquete = nombrePaquete;
    }

    public String getInformacion() {
        return informacion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }

    public double getCostoP() {
        return costoP;
    }

    public void setCostoP(double costoP) {
        this.costoP = costoP;
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
    
    
    public Paquete(String informacion, double costo, String diasSalida, String fechaDisponible, int numeroPersonas) {
        this.informacion = informacion;
        this.costo = costo;
        this.diasSalida = diasSalida;
        this.fechaDisponible = fechaDisponible;
        this.numeroPersonas = numeroPersonas;
    }
    
   //s
 public Paquete(String ciudad,String nombrePaquete, String informacion, double costoP, String diasSalida, String fechaDisponible) {
        this.ciudad=ciudad;
        this.nombrePaquete = nombrePaquete;
        this.informacion = informacion;
        this.costoP = costoP;
        this.diasSalida = diasSalida;
        this.fechaDisponible = fechaDisponible;
        
    }
    
    
    public Paquete() {
        
    }

   
    
    
    
            
            
            
   
    
}
