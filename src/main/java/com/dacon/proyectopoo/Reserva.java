/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dacon.proyectopoo;
import Personas.Cliente;
import Herramientas.Funcion;
import java.time.LocalDate;
/**
 *
 * @author CJAA
 */
public class Reserva {
    private String numeroReserva;
    private String fechaReserva;
    private String desde;
    private String hasta;
    private double valorPagar;
    private String tipoReserva;
    private Cliente cliente;
    
    
    public Reserva(String desde,String hasta,double valorPagar, Cliente cliente,String tipoReserva){
        this.desde=desde;
        this.hasta=hasta;
        this.valorPagar=valorPagar;
        this.cliente=cliente;
        this.tipoReserva=tipoReserva;
        this.numeroReserva=Funcion.generarNumerosAleatorios(20000,30000,"reservas.txt");
        //Fin Generado del numeroReserva y asignación
        String[] arrFechaActual= LocalDate.now().toString().split("-");
        String fechaActual=arrFechaActual[2]+"/"+arrFechaActual[1]+"/"+arrFechaActual[0];
        this.fechaReserva=fechaActual;
    }

    public Reserva(String numeroReserva, String fechaReserva, String tipoReserva, Cliente cliente, String desde, String hasta, double valorPagar ) {
        this.numeroReserva = numeroReserva;
        this.fechaReserva = fechaReserva;
        this.desde = desde;
        this.hasta = hasta;
        this.valorPagar = valorPagar;
        this.tipoReserva = tipoReserva;
        this.cliente = cliente;
    }
    public Reserva(String numeroReserva, String fechaReserva, String tipoReserva, String desde, String hasta, double valorPagar ) {
        this.numeroReserva = numeroReserva;
        this.fechaReserva = fechaReserva;
        this.desde = desde;
        this.hasta = hasta;
        this.valorPagar = valorPagar;
        this.tipoReserva = tipoReserva;
        
    }
    public static void mostrarCabecera(){
        String simbolo="/***************RESERVACIÓN***************/";
        String simbolo1="/*                                       */";
        String simbolo2="/*****************************************/";
        System.out.println(simbolo);
        System.out.println(simbolo1);
        System.out.println(simbolo2);
        System.out.println("");
    }
    public String getTipoReserva() {
        return tipoReserva;
    }
    
    public void setTipoReserva(String tipoReserva) {
        this.tipoReserva = tipoReserva;
    }
    public String getNumeroReserva(){
        return this.numeroReserva;
    }
    
    public String getFechaReserva(){
        return this.fechaReserva;
    }
    
    public String getDesde(){
        return this.desde;
    }
    
    public String getHasta(){
        return this.hasta;
    }
    
    public double getValorPagar(){
        return this.valorPagar;
    }
    
    //public Servicio Getservicio(){
    //    return this.servicio;
    //}
    public Cliente getCliente(){
        return this.cliente;
    }
    
    public void setNumeroReserva(String numeroReserva){
        this.numeroReserva=numeroReserva;
    }
    
    public void setFechaReserva(String fechaReserva){
        this.fechaReserva=fechaReserva;
    }
    public void setDesde(String desde){
        this.desde=desde;
    }
    public void setHasta(String hasta){
        this.hasta=hasta;
    }
    public void setValorPagar(double valorPagar){
        this.valorPagar=valorPagar;
    }
//    public void setservicio(Servicio servicio){
//        this.servicio=servicio;
//    }
    public void setCliente(Cliente cliente){
        this.cliente=cliente;
    }
    @Override
    public String toString(){
        //numeroReserva,fecha reserva,tipoReserva,nombreCliente,desde,hasta,valorPagar
        return this.numeroReserva+","+this.fechaReserva+","+this.tipoReserva+","+this.cliente.getNombres()+" "+this.cliente.getApellidos()+","+this.desde+","+this.hasta+","+this.valorPagar;
    }
}

