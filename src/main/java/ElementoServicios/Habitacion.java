/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ElementoServicios;
import Enum.TipoHabitacion;
import Enum.Estado;
/**
 *
 * @author User
 */
public class Habitacion{
    private String codigoHotel;
    private TipoHabitacion tipoHabitacion;
    private double precio;
    private int capacidad;
    private int numeroDeHabitacion;
    private Estado estado;

    
    public Habitacion(){
         
     }
    
    public Habitacion(String codigoHotel, TipoHabitacion tipoHabitacion, double precio, int capacidad, int numerodeHabitacion, Estado estado) {
        this.codigoHotel = codigoHotel;
        this.tipoHabitacion = tipoHabitacion;
        this.precio = precio;
        this.capacidad = capacidad;
        this.numeroDeHabitacion = numerodeHabitacion;
        this.estado = estado;
    }

    public String getCodigoHotel() {
        return codigoHotel;
    }

    public void setCodigoHotel(String codigoHotel) {
        this.codigoHotel = codigoHotel;
    }

    //Getters
    public TipoHabitacion getTipoHabitacion(){
        return this.tipoHabitacion;
    }
    public double getPrecio(){
        return this.precio;
    }
    public int getCapacidad(){
        return this.capacidad;
    }
    public int getNumeroDeHabitacion(){
        return this.numeroDeHabitacion;
    }
    public Estado getEstado(){
        return this.estado;
    }
    //Setters
    public void setTipoHabitacion(TipoHabitacion tipoHabitacion){
        this.tipoHabitacion=tipoHabitacion;
    }
    public void setPrecio(double precio){
        this.precio=precio;
    }
    public void setCapacidad(int capacidad){
        this.capacidad=capacidad;
    }
    public void setNumeroDeHabitacion(int numerodeHabitacion){
        this.numeroDeHabitacion=numerodeHabitacion;
    }
    public void setEstado(Estado estado){
        this.estado=estado;
    }
        
}
