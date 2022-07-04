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
    private String MetodoPago;
    private String numeroMetodoPago;
    private String fechaCaducidad;

    public Pago(String fechaDePago, Reserva reserva, double valorAPagar, String MetodoPago, String numeroMetodoPago, String fechaCaducidad) {
        this.fechaDePago = fechaDePago;
        this.reserva = reserva;
        this.valorAPagar = valorAPagar;
        this.MetodoPago = MetodoPago;
        this.numeroMetodoPago = numeroMetodoPago;
        this.fechaCaducidad = fechaCaducidad;
    }
    
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

    public String getMetodoPago() {
        return MetodoPago;
    }

    public String getNumeroMetodoPago() {
        return numeroMetodoPago;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
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
    public void setMetodoPago(String MetodoPago) {
        this.MetodoPago = MetodoPago;
    }

    public void setNumeroMetodoPago(String numeroMetodoPago) {
        this.numeroMetodoPago = numeroMetodoPago;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
    @Override
    public String toString(){
        String a=this.reserva.getNumeroReserva()+","+this.identificador+","+this.reserva.getCliente().GetNombres()+" ";
        a+=this.reserva.getCliente().GetApellidos()+","+this.fechaDePago+","+this.reserva.getValorPagar()+",";
        a+=this.valorAPagar+","+this.MetodoPago+","+this.numeroMetodoPago+","+this.fechaCaducidad;
        return a;
        
    }
}
