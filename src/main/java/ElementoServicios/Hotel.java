/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ElementoServicios;
import java.util.ArrayList;
/**
 *
 * @author User
 */

/**
 * Esta clase contiene funciones que se utilizan para obtener recursos del archivo
 * @author CJAA
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
    
    /**
     *
     */
    public Hotel(){
        
    }

    /**
     *
     * @param codigoHotel
     */
    public Hotel(String codigoHotel){
       this.codigoHotel=codigoHotel;
    }

    /**
     *
     * @param ciudadH
     * @param codigoHotel
     * @param nombre
     * @param numeroEstrellas
     * @param direccion
     * @param desayuno
     * @param parqueo
     * @param cancelacionGratis
     */
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
  
    /**
     *
     * @return
     */
    public String getCiudadH() {
        return ciudadH;
    }

    /**
     *
     * @param ciudadH
     */
    public void setCiudadH(String ciudadH) {
        this.ciudadH = ciudadH;
    }

    /**
     *
     * @return
     */
    public String getNombre(){
        return this.nombre;
    }

    /**
     *
     * @return
     */
    public String getDireccion(){
        return this.direccion;
    }

    /**
     *
     * @return
     */
    public int getNumeroEstrellas(){
        return this.numeroEstrellas;
    }

    /**
     *
     * @return
     */
    public boolean getDesayuno(){
        return this.desayuno;
    }

    /**
     *
     * @return
     */
    public boolean getParqueo(){
        return this.parqueo;
    }

    /**
     *
     * @return
     */
    public ArrayList<Habitacion> getListaHabitaciones(){
        return this.listaHabitaciones;
    }

    /**
     *
     * @return
     */
    public boolean getCancelacionGratis(){
        return this.cancelacionGratis;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    /**
     *
     * @param direccion
     */
    public void setDireccion(String direccion){
        this.direccion=direccion;
    }

    /**
     *
     * @param numeroEstrellas
     */
    public void setNumeroEstrellas(int numeroEstrellas){
        this.numeroEstrellas=numeroEstrellas;
    }

    /**
     *
     * @param desayuno
     */
    public void setDesayuno(boolean desayuno){
        this.desayuno=desayuno;
    }

    /**
     *
     * @param parqueo
     */
    public void setParqueo(boolean parqueo){
        this.parqueo=parqueo;
    }

    /**
     *
     * @param listaHabitaciones
     */
    public void setListaHabitaciones(ArrayList<Habitacion> listaHabitaciones){
        this.listaHabitaciones=listaHabitaciones;
    }

    /**
     *
     * @param cancelacionGratis
     */
    public void setCancelacionGratis(boolean cancelacionGratis){
        this.cancelacionGratis=cancelacionGratis;
    }

    /**
     *
     * @return
     */
    public Habitacion getHabitacion() {
        return habitacion;
    }

    /**
     *
     * @param habitacion
     */
    public void setHabitacion(Habitacion habitacion) {
        this.habitacion=habitacion;
    }
    
}
