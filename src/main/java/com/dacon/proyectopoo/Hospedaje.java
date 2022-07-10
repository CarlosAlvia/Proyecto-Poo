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
    private Hotel hotel;
    private Departamento departamento;
    private double precioH;

    public Hospedaje(String fechaEntrada, String fechaSalida, Hotel hotel,double precioH) {
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.hotel = hotel;
        this.precioH = precioH;
    }

    public Hospedaje(String fechaEntrada, String fechaSalida, Departamento departamento, double precioH) {
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.departamento = departamento;
         this.precioH = precioH;
    }
    public Hospedaje(String ciudad,double precio, Hotel hotel){
        super(ciudad,precio);
        this.hotel=hotel;

    }
    public Hospedaje(String ciudad,double precio,Departamento departamento){
        
    }
    public Hospedaje(){
        
    }
      
    @Override
     public void mostrarReserva(){
        super.mostrarReserva();
        System.out.println("FECHAS: "+this.fechaEntrada+"-"+this.fechaSalida);
        System.out.println("CIUDAD: "+this.hotel.getCiudadH());
        System.out.println("HOTEL: "+this.hotel.getNombre());
        System.out.println("VALOR A PAGAR: "+this.getPrecioH());
     }

     public void mostrarReservaDe(){
        super.mostrarReserva();
        System.out.println("FECHAS: "+this.fechaEntrada+"-"+this.fechaSalida);
        System.out.println("CIUDAD: "+this.departamento.getCiudadDepa());
        System.out.println("DEPARTAMENTO: "+this.departamento.getNombreDepa());
        System.out.println("VALOR A PAGAR: "+this.getPrecioH());
     }
    
    
    //Getters

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Double getPrecioH() {
        return precioH;
    }

    public void setPrecioH(Double precioH) {
        this.precioH = precioH;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
    
    public String getFechaEntrada(){
        return this.fechaEntrada;
    }
    public String getFechaSalida(){
        return this.fechaSalida;
    }
    //Setters
    public void setFechaEntrada(String fechaEntrada){
        this.fechaEntrada=fechaEntrada;
    }
    public void setFechaSalida(String fechaSalida){
        this.fechaSalida=fechaSalida;
    }
    
}
