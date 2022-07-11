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

    public Departamento(String ciudadDepa, String nombreDepa, double costoDepa, int numeroHabitaciones,Estado estadoDepa, boolean wifi, boolean piscina) {
        this.ciudadDepa = ciudadDepa;
        this.nombreDepa = nombreDepa;
        this.costoDepa = costoDepa;
        this.estadoDepa = estadoDepa;
        this.numeroHabitaciones = numeroHabitaciones;
        this.wifi = wifi;
        this.piscina = piscina;
    }
    

    public String getCiudadDepa() {
        return ciudadDepa;
    }

    public void setCiudadDepa(String ciudadDepa) {
        this.ciudadDepa = ciudadDepa;
    }

    public String getNombreDepa() {
        return nombreDepa;
    }

    public void setNombreDepa(String nombreDepa) {
        this.nombreDepa = nombreDepa;
    }

    public double getCostoDepa() {
        return costoDepa;
    }

    public void setCostoDepa(double costoDepa) {
        this.costoDepa = costoDepa;
    }

    public Estado getEstadoDepa() {
        return estadoDepa;
    }

    public void setEstadoDepa(Estado estadoDepa) {
        this.estadoDepa = estadoDepa;
    }

    public int getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(int numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public boolean getWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public boolean getPiscina() {
        return piscina;
    }

    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }
    public Departamento(){
        
    }
   
    
}
