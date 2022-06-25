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
public class Reserva {
    protected int numeroReserva;
    protected String fechaReserva;
    protected String desde;
    protected String hasta;
    protected double valorPagar;
    protected int contadorReserva;
    protected Servicio servicio;
    protected Cliente cliente;
    
    
    public int GetnumeroReserva(){
        return this.numeroReserva;
    }
    
    public String GetfechaReserva(){
        return this.fechaReserva;
    }
    
    public String Getdesde(){
        return this.desde;
    }
    
    public String Gethasta(){
        return this.hasta;
    }
    
    public double GetvalorPagar(){
        return this.valorPagar;
    }
    
    public int GetcontadorReserva(){
        return this.contadorReserva;
    }
    
    public Servicio Getservicio(){
        return this.servicio;
    }
    public Cliente Getcliente(){
        return this.cliente;
    }
    
    public void setnumeroReserva(int numeroReserva){
        this.numeroReserva=numeroReserva;
    }
    
    public void setfechaReserva(String fechaReserva){
        this.fechaReserva=fechaReserva;
    }
    public void setdesde(String desde){
        this.desde=desde;
    }
    public void sethasta(String hasta){
        this.hasta=hasta;
    }
    public void setvalorPagar(double valorPagar){
        this.valorPagar=valorPagar;
    }
    public void setcontadorReserva(int contadorReserva){
        this.contadorReserva=contadorReserva;
    }
    public void setservicio(Servicio servicio){
        this.servicio=servicio;
    }
    public void setcliente(Cliente cliente){
        this.cliente=cliente;
    }
    public static void encabezado(){
        String abajo="++++++++++++++++++++++++++++++++++++++++";
        String arriba="+++++++++++++++RESERVACION+++++++++++++++++";
        String medio="+                                     +";
        System.out.println(arriba);
        System.out.println(medio);
        System.out.println(abajo);
    }
        
}

