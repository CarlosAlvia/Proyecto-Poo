/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dacon.proyectopoo;

/**
 *
 * @author CJAA
 */
public class Departamento extends Hospedaje{
    private int numeroHabitaciones;
    private boolean wifi;
    private boolean piscina;
    
    public int getNumeroHabitaciones(){
        return this.numeroHabitaciones;
    }
    public boolean getWifi(){
        return this.wifi;
    }
    public boolean getPiscina(){
        return this.piscina;
    }
    public void setNumeroHabitaciones(int numeroHabitaciones){
        this.numeroHabitaciones=numeroHabitaciones;
    }
    public void setWifi(boolean wifi){
        this.wifi=wifi;
    }
    public void setPiscina(boolean piscina){
        this.piscina=piscina;
    }
}
