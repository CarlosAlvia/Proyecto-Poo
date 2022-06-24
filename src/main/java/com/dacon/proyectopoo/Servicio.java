/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dacon.proyectopoo;

/**
 *
 * @author CJAA
 */
public class Servicio {
    protected String ciudad;
    protected double valor;
    protected Reserva reserva;
    protected double puntuacion;
    protected int identificador;
    
    public String getCiudad(){
        return this.ciudad;
    }
    public double getValor(){
        return this.valor;
    }
    public Reserva getReserva(){
        return this.reserva;
    }
    public double getPuntuacion(){
        return this.puntuacion;
    }
    public int getIdentificador(){
        return this.identificador;
    }
    public void setCiudad(String ciudad){
        this.ciudad = ciudad;
    }
    public void setValor(double valor){
        this.valor = valor;
    }
    public void setReserva(Reserva reserva){
        this.reserva = reserva;
    }
    public void setPuntuacion(double puntuacion){
        this.puntuacion = puntuacion;
    }
    public void setIdentificador(int identificador){
        this.identificador = identificador;
    }
}
