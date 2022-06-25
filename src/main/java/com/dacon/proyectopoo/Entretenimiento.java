/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dacon.proyectopoo;

/**
 *
 * @author User
 */
public class Entretenimiento extends Servicio {
    protected int dias;
    protected String actividades;
    protected String paquetes;
    
    //Getters
    public int Getdias(){
        return this.dias;
    }
    public String Getactividades(){
        return this.actividades;
    }
    public String Getpaquetes(){
        return this.paquetes;
    }
    
    //Setters
    public void setdias(int dias){
        this.dias=dias;
    }
    public void setactividades(String actividades){
        this.actividades=actividades;
    }
    public void setpaquetes(String paquetes){
        this.paquetes=paquetes;
    }
    
    public void reservarEntretenimiento(){
        Reserva.encabezado();
    }
}
