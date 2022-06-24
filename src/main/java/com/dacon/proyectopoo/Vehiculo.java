/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dacon.proyectopoo;
import Enum.Estado;
/**
 *
 * @author User
 */
public class Vehiculo extends Transporte{
    private int id;
    private String marca;
    private String modelo;
    private String placa;
    private String color;
    private int capacidad;
    private Estado estado;
    private double costoPorDia;
    private String transmision;
    
    
    public int GetId(){
        return this.id;
    }
    public String GetMarca(){
        return this.marca;
    }
    public String GetModelo(){
        return this.modelo;
    }
    public String GetPlaca(){
        return this.placa;
    }
    public String GetColor(){
        return this.color;
    }
    public int GetCapacidad(){
        return this.capacidad;
    }
    public Estado GetEstado(){
        return this.estado;
    }
    public double GetCostoPorDia(){
        return this.costoPorDia;
    }
    public String GetTransmision(){
        return this.transmision;
    }
    public void setId(int id){
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
    public void setTransmision(String transmision){
        this.transmision=transmision;
    }
}
