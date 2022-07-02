/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dacon.proyectopoo;
import Personas.Cliente;
import Personas.Usuario;
import java.util.Random;
import java.util.ArrayList;

/**
 *
 * @author CJAA
 */
public class Reserva {
    private String numeroReserva;
    protected String fechaReserva;
    protected String desde;
    protected String hasta;
    protected double valorPagar;
    protected int contadorReserva;
    protected String tipoReserva;
    //protected Servicio servicio;
    protected Cliente cliente;
    protected ArrayList<String> identificadores;
    
    
    public Reserva(String desde,String hasta,double valorPagar, Cliente cliente,String tipoReserva){
        this.desde=desde;
        this.hasta=hasta;
        this.valorPagar=valorPagar;
        this.cliente=cliente;
        this.tipoReserva=tipoReserva;
        this.numeroReserva="1";
        this.fechaReserva="a";
    }
//    public Reserva(String ciudad,String hasta,double valorPagar, Cliente cliente,String tipoReserva){
//        this.desde=desde;
//        this.hasta=hasta;
//        this.valorPagar=valorPagar;
//        this.cliente=cliente;
//        this.tipoReserva=tipoReserva;
//        //crear arreglo de numeros reserva
//         Random random = new Random();
    
//       while()
//        for(int i = 0; i <=5; i++) {
//            int value = random.nextInt((10 - 1) + 1) + 1;
//            this.numeroReserva+=value;
//          
//            indentificadores.add(this.numeroReserva)
             
//        this.fechaReserva="a";
//    }    
//    }
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
    
    //public Servicio Getservicio(){
    //    return this.servicio;
    //}
    public Cliente getCliente(){
        return this.cliente;
    }
    
    public void setnumeroReserva(String numeroReserva){
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
//    public void setservicio(Servicio servicio){
//        this.servicio=servicio;
//    }
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
    @Override
    public String toString(){
        //numeroReserva,fecha reserva,tipoReserva,nombreCliente,desde,hasta,valorPagar
        return this.numeroReserva+","+this.fechaReserva+","+this.tipoReserva+","+this.cliente.GetNombres()+" "+this.cliente.GetApellidos()+","+this.desde+","+this.hasta+","+this.valorPagar;
    }
}

