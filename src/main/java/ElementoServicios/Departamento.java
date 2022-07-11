/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ElementoServicios;
import Enum.Estado;
/**
 *
 * @author CJAA
 */
 /**
 * Esta clase contiene funciones que se utilizan para obtener recursos del archivo
 * @author CJAA
 */
public class Departamento {
    
    private String ciudadDepa;
    private String nombreDepa;
    private double costoDepa;
    private Estado estadoDepa;
    private int numeroHabitaciones;
    private boolean wifi;
    private boolean piscina;

    /**
     *
     * @param ciudadDepa
     * @param nombreDepa
     * @param costoDepa
     * @param numeroHabitaciones
     * @param estadoDepa
     * @param wifi
     * @param piscina
     */
    public Departamento(String ciudadDepa, String nombreDepa, double costoDepa, int numeroHabitaciones,Estado estadoDepa, boolean wifi, boolean piscina) {
        this.ciudadDepa = ciudadDepa;
        this.nombreDepa = nombreDepa;
        this.costoDepa = costoDepa;
        this.estadoDepa = estadoDepa;
        this.numeroHabitaciones = numeroHabitaciones;
        this.wifi = wifi;
        this.piscina = piscina;
    }
    
    /**
     *
     * @return
     */
    public String getCiudadDepa() {
        return ciudadDepa;
    }

    /**
     *
     * @param ciudadDepa
     */
    public void setCiudadDepa(String ciudadDepa) {
        this.ciudadDepa = ciudadDepa;
    }

    /**
     *
     * @return
     */
    public String getNombreDepa() {
        return nombreDepa;
    }

    /**
     *
     * @param nombreDepa
     */
    public void setNombreDepa(String nombreDepa) {
        this.nombreDepa = nombreDepa;
    }

    /**
     *
     * @return
     */
    public double getCostoDepa() {
        return costoDepa;
    }

    /**
     *
     * @param costoDepa
     */
    public void setCostoDepa(double costoDepa) {
        this.costoDepa = costoDepa;
    }

    /**
     *
     * @return
     */
    public Estado getEstadoDepa() {
        return estadoDepa;
    }

    /**
     *
     * @param estadoDepa
     */
    public void setEstadoDepa(Estado estadoDepa) {
        this.estadoDepa = estadoDepa;
    }

    /**
     *
     * @return
     */
    public int getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    /**
     *
     * @param numeroHabitaciones
     */
    public void setNumeroHabitaciones(int numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    /**
     *
     * @return
     */
    public boolean getWifi() {
        return wifi;
    }

    /**
     *
     * @param wifi
     */
    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    /**
     *
     * @return
     */
    public boolean getPiscina() {
        return piscina;
    }

    /**
     *
     * @param piscina
     */
    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }

    /**
     *
     */
    public Departamento(){
        
    }
   
    
}
