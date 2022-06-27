/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dacon.proyectopoo;
import java.util.Scanner;
import java.util.ArrayList;
import com.dacon.proyectopoo.Vehiculo;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import com.dacon.proyectopoo.Reserva;
import ManejoArchivos.ManejoArchivos;
import com.dacon.proyectopoo.Transporte;
/**
 *
 * @author User
 */
public class Entretenimiento extends Servicio {
    protected int dias;
    protected String actividades;
    protected String paquetes;
    
    //Getters
    public int Getdias(){
        return this.dias;
    }
    public String Getactividades(){
        return this.actividades;
    }
    public String Getpaquetes(){
        return this.paquetes;
    }
    
    //Setters
    public void setdias(int dias){
        this.dias=dias;
    }
    public void setactividades(String actividades){
        this.actividades=actividades;
    }
    public void setpaquetes(String paquetes){
        this.paquetes=paquetes;
    }
    
    public void reservarEntretenimiento(){
        Scanner sc=new Scanner(System.in);
        Reserva.encabezado();
        System.out.print("Ingrese el nombre de la ciudad donde se alojará");
//        String ciudad=sc.nextLine();
//        ArrayList<Entretenimiento>=ManejoArchivos.LeeFichero("entretenimiento.txt");
//        for(Entretenimiento entretenimiento:)
//        
    }
    
    
}
