/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dacon.proyectopoo;
import Enum.TipoHabitacion;
/**
 *
 * @author User
 */
public class Habitacion extends Hotel{
    protected TipoHabitacion tipoHabitacion;
    protected double precio;
    protected int capacidad;
    protected int numerodeHabitacion;
    protected boolean estado;
    //Getters
    public TipoHabitacion GettipoHabitacion(){
        return this.tipoHabitacion;
    }
    public double Getprecio(){
        return this.precio;
    }
    public int Getcapacidad(){
        return this.capacidad;
    }
    public int GetnumerodeHabitacion(){
        return this.numerodeHabitacion;
    }
    public boolean Getestado(){
        return this.estado;
    }
    //Setters
    public void settipoHabitacion(TipoHabitacion tipoHabitacion){
        this.tipoHabitacion=tipoHabitacion;
    }
    public void setprecio(double precio){
        this.precio=precio;
    }
    public void setcapacidad(int capacidad){
        this.capacidad=capacidad;
    }
    public void setnumerodeHabitacion(int numerodeHabitacion){
        this.numerodeHabitacion=numerodeHabitacion;
    }
    public void setestado(boolean estado){
        this.estado=estado;
    }
        
}
