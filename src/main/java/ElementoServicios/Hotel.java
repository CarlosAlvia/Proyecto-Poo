/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ElementoServicios;
import ElementoServicios.Habitacion;
import java.util.ArrayList;
/**
 *
 * @author User
 */
public class Hotel {
    private String ciudadH;
    private String codigoHotel;
    private String nombre;
    private String direccion;
    private int numeroEstrellas;
    private boolean desayuno;
    private boolean parqueo;
    private ArrayList<Habitacion> listaHabitaciones;
    private Habitacion habitacion;
    private boolean cancelacionGratis;
    
    public Hotel(){
        
    }
    public Hotel(String codigoHotel){
       this.codigoHotel=codigoHotel;
    }

    public Hotel(String ciudadH, String codigoHotel, String nombre,int numeroEstrellas, String direccion,  boolean desayuno, boolean parqueo, boolean cancelacionGratis) {
        this.ciudadH = ciudadH;
        this.codigoHotel = codigoHotel;
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroEstrellas = numeroEstrellas;
        this.desayuno = desayuno;
        this.parqueo = parqueo;
        this.cancelacionGratis = cancelacionGratis;
    }
    
    

    
    public String getCodigoHotel() {
        return codigoHotel;
    }

    public void setCodigoHotel(String codigoHotel) {
        this.codigoHotel = codigoHotel;
    }
  
    public String getCiudadH() {
        return ciudadH;
    }

    public void setCiudadH(String ciudadH) {
        this.ciudadH = ciudadH;
    }
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

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }
    
}
