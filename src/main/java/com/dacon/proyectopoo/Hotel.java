/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dacon.proyectopoo;
import java.util.ArrayList;
/**
 *
 * @author User
 */
public class Hotel extends Hospedaje {
    private String nombre;
    private String direccion;
    private int numeroEstrellas;
    private boolean desayuno;
    private boolean parqueo;
    private ArrayList<Habitacion> listaHabitaciones;
    private boolean cancelacionGratis;
    
    public String getNombre(){
        return this.nombre;
    }
    public String getDireccion(){
        return this.direccion;
    }
    public int getNumeroEstrellas(){
        return this.numeroEstrellas;
    }
    public boolean getDesayuno(){
        return this.desayuno;
    }
    public boolean getParqueo(){
        return this.parqueo;
    }
    public ArrayList<Habitacion> getListaHabitaciones(){
        return this.listaHabitaciones;
    }
    public boolean getCancelacionGratis(){
        return this.cancelacionGratis;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setDireccion(String direccion){
        this.direccion=direccion;
    }
    public void setNumeroEstrellas(int numeroEstrellas){
        this.numeroEstrellas=numeroEstrellas;
    }
    public void setDesayuno(boolean desayuno){
        this.desayuno=desayuno;
    }
    public void setParqueo(boolean parqueo){
        this.parqueo=parqueo;
    }
    public void setListaHabitaciones(ArrayList<Habitacion> listaHabitaciones){
        this.listaHabitaciones=listaHabitaciones;
    }
    public void setCancelacionGratis(boolean cancelacionGratis){
        this.cancelacionGratis=cancelacionGratis;
    }
}
