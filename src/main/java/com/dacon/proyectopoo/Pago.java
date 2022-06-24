/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dacon.proyectopoo;

/**
 *
 * @author CJAA
 */
public class Pago {
    private String fechaDePago;
    private int identificador;
    private Reserva reserva;
    private double valorAPagar;
    
    public String getFechaDePago(){
        return this.fechaDePago;
    }
    public int getIdentificador(){
        return this.identificador;
    }
    public Reserva getReserva(){
        return this.reserva;
    }
    public double getValorAPagar(){
        return this.valorAPagar;
    }
    public void setFechaDePago(String fechaDePago){
        this.fechaDePago=fechaDePago;
    }
    public void setIdentificador(int identificador){
        this.identificador=identificador;
    }
    public void setReserva(Reserva reserva){
        this.reserva=reserva;
    }
    public void setValorAPagar(double valorAPagar){
        this.valorAPagar=valorAPagar;
    }
}
