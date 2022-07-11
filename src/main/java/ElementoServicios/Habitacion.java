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

/**
 * Esta clase contiene funciones que se utilizan para obtener recursos del archivo
 * @author CJAA
 */
public class Habitacion{
    private String codigoHotel;
    private TipoHabitacion tipoHabitacion;
    private double precio;
    private int capacidad;
    private int numeroDeHabitacion;
    private Estado estado;

    /**
     *
     */
    public Habitacion(){
         
     }
    
    /**
     *
     * @param codigoHotel
     * @param tipoHabitacion
     * @param precio
     * @param capacidad
     * @param numerodeHabitacion
     * @param estado
     */
    public Habitacion(String codigoHotel, TipoHabitacion tipoHabitacion, double precio, int capacidad, int numerodeHabitacion, Estado estado) {
        this.codigoHotel = codigoHotel;
        this.tipoHabitacion = tipoHabitacion;
        this.precio = precio;
        this.capacidad = capacidad;
        this.numeroDeHabitacion = numerodeHabitacion;
        this.estado = estado;
    }

    /**
     *
     * @return
     */
    public String getCodigoHotel() {
        return codigoHotel;
    }

    /**
     *
     * @param codigoHotel
     */
    public void setCodigoHotel(String codigoHotel) {
        this.codigoHotel = codigoHotel;
    }

    //Getters

    /**
     *
     * @return
     */
    public TipoHabitacion getTipoHabitacion(){
        return this.tipoHabitacion;
    }

    /**
     *
     * @return
     */
    public double getPrecio(){
        return this.precio;
    }

    /**
     *
     * @return
     */
    public int getCapacidad(){
        return this.capacidad;
    }

    /**
     *
     * @return
     */
    public int getNumeroDeHabitacion(){
        return this.numeroDeHabitacion;
    }

    /**
     *
     * @return
     */
    public Estado getEstado(){
        return this.estado;
    }
    //Setters

    /**
     *
     * @param tipoHabitacion
     */
    public void setTipoHabitacion(TipoHabitacion tipoHabitacion){
        this.tipoHabitacion=tipoHabitacion;
    }

    /**
     *
     * @param precio
     */
    public void setPrecio(double precio){
        this.precio=precio;
    }

    /**
     *
     * @param capacidad
     */
    public void setCapacidad(int capacidad){
        this.capacidad=capacidad;
    }

    /**
     *
     * @param numerodeHabitacion
     */
    public void setNumeroDeHabitacion(int numerodeHabitacion){
        this.numeroDeHabitacion=numerodeHabitacion;
    }

    /**
     *
     * @param estado
     */
    public void setEstado(Estado estado){
        this.estado=estado;
    }
        
}
