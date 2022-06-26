/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dacon.proyectopoo;
import Enum.Estado;
import Enum.Transmision;
/**
 *
 * @author User
 */
public class Vehiculo extends Transporte{
    private String id;
    private String marca;
    private String modelo;
    private String placa;
    private String color;
    private int capacidad;
    private Estado estado;
    private double costoPorDia;
    private Transmision transmision;
    
    
    public String getId(){
        return this.id;
    }
    public String getMarca(){
        return this.marca;
    }
    public String getModelo(){
        return this.modelo;
    }
    public String getPlaca(){
        return this.placa;
    }
    public String getColor(){
        return this.color;
    }
    public int getCapacidad(){
        return this.capacidad;
    }
    public Estado getEstado(){
        return this.estado;
    }
    public double getCostoPorDia(){
        return this.costoPorDia;
    }
    public Transmision getTransmision(){
        return this.transmision;
    }
    public void setId(String id){
        this.id=id;
    }
    public void setMarca(String marca){
        this.marca=marca;
    }
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    public void setPlaca(String placa){
        this.placa=placa;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void setCapacidad(int capacidad){
        this.capacidad=capacidad;
    }
    public void setEstado(Estado estado){
        this.estado=estado;
    }
    public void setCostoPorDia(double costoPorDia){
        this.costoPorDia=costoPorDia;
    }
    public void setTransmision(Transmision transmision){
        this.transmision=transmision;
    }
    @Override
    public String toString(){
        return this.marca+" "+this.modelo+" "+this.color+" con transmisión: "+this.transmision+" costo por día: "+this.costoPorDia;
    }
}
