/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dacon.proyectopoo;

/**
 *
 * @author User
 */
public class Hospedaje extends Servicio{
    protected String fechaEntrada;
    protected String fechaSalida;
    
    //Getters
    public String GetfechaEntrada(){
        return this.fechaEntrada;
    }
    public String GetfechaSalida(){
        return this.fechaSalida;
    }
    //Setters
    public void setfechaEntrada(String fechaEntrada){
        this.fechaEntrada=fechaEntrada;
    }
    public void setfechaSalida(String fechaSalida){
        this.fechaSalida=fechaSalida;
    }
    
}
