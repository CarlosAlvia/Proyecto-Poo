/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dacon.proyectopoo;
import Personas.Cliente;
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
    
    public Servicio(String ciudad, double valor, double puntuacion, int identificador) {
        this.ciudad = ciudad;
        this.valor = valor;
        this.puntuacion = puntuacion;
        this.identificador = identificador;
    }
    public Servicio(){
        
    }
    
    public void mostrarReserva(){
        String simbolo="/**************RESERVA GENERADA*************/";
        String simbolo1="/*                                         */";
        String simbolo2="/*******************************************/";
        System.out.println(simbolo);
        System.out.println(simbolo1);
        System.out.println(simbolo2);
        System.out.println("CÓDIGO RESERVA: "+this.reserva.getNumeroReserva());
        System.out.println("CLIENTE: "+this.reserva.getCliente().getNombres()+" "+this.reserva.getCliente().GetApellidos());
        System.out.println("TIPO RESERVA: "+this.reserva.getTipoReserva());
    }
    public void crearReserva(Cliente cliente){
        String simbolo="/**************RESERVA GENERADA*************/";
        String simbolo1="/*                                         */";
        String simbolo2="/*******************************************/";
        System.out.println(simbolo);
        System.out.println(simbolo1);
        System.out.println(simbolo2);
        
        System.out.println("CÓDIGO RESERVA: "+this.reserva.getNumeroReserva());
        System.out.println("CLIENTE: "+this.reserva.getCliente().getNombres()+" "+this.reserva.getCliente().GetApellidos());
        System.out.println("TIPO RESERVA: "+this.reserva.getTipoReserva());
    }
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
