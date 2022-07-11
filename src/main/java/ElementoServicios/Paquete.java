/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ElementoServicios;
import Personas.Cliente;
import java.util.ArrayList;
/**
 *
 * @author User
 */

/**
 * Esta clase contiene funciones que se utilizan para obtener recursos del archivo
 * @author CJAA
 */
public class Paquete {
   String ciudadPa;
   ArrayList<Paquete> paquetes;
   String nombrePaquete;
   String informacion;
   double costoP; 
   String diasSalida;
   String fechaDisponible;
   int numeroPersonas;

    /**
     *
     * @return
     */
    public String getCiudadPa() {
        return ciudadPa;
    }

    /**
     *
     * @param ciudadPa
     */
    public void setCiudadPa(String ciudadPa) {
        this.ciudadPa = ciudadPa;
    }

    /**
     *
     * @return
     */
    public ArrayList<Paquete> getPaquetes() {
        return paquetes;
    }

    /**
     *
     * @param paquetes
     */
    public void setPaquetes(ArrayList<Paquete> paquetes) {
        this.paquetes = paquetes;
    }
 
    /**
     *
     * @return
     */
    public String getNombrePaquete() {
        return nombrePaquete;
    }

    /**
     *
     * @param nombrePaquete
     */
    public void setNombrePaquete(String nombrePaquete) {
        this.nombrePaquete = nombrePaquete;
    }

    /**
     *
     * @return
     */
    public String getInformacion() {
        return informacion;
    }

    /**
     *
     * @param informacion
     */
    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }

    /**
     *
     * @return
     */
    public double getCostoP() {
        return costoP;
    }

    /**
     *
     * @param costoP
     */
    public void setCostoP(double costoP) {
        this.costoP = costoP;
    }

    /**
     *
     * @return
     */
    public String getDiasSalida() {
        return diasSalida;
    }

    /**
     *
     * @param diasSalida
     */
    public void setDiasSalida(String diasSalida) {
        this.diasSalida = diasSalida;
    }

    /**
     *
     * @return
     */
    public String getFechaDisponible() {
        return fechaDisponible;
    }

    /**
     *
     * @param fechaDisponible
     */
    public void setFechaDisponible(String fechaDisponible) {
        this.fechaDisponible = fechaDisponible;
    }

    /**
     *
     * @return
     */
    public int getNumeroPersonas() {
        return numeroPersonas;
    }

    /**
     *
     * @param numeroPersonas
     */
    public void setNumeroPersonas(int numeroPersonas) {
        this.numeroPersonas = numeroPersonas;
    }
    
    /**
     *
     * @param informacion
     * @param costoP
     * @param diasSalida
     * @param fechaDisponible
     * @param numeroPersonas
     */
    public Paquete(String informacion, double costoP, String diasSalida, String fechaDisponible, int numeroPersonas) {
        this.informacion = informacion;
        this.costoP = costoP;
        this.diasSalida = diasSalida;
        this.fechaDisponible = fechaDisponible;
        this.numeroPersonas = numeroPersonas;
    }

    /**
     *
     * @param ciudadPa
     * @param nombrePaquete
     * @param informacion
     * @param costoP
     * @param diasSalida
     * @param fechaDisponible
     */
    public Paquete(String ciudadPa,String nombrePaquete, String informacion, double costoP, String diasSalida, String fechaDisponible) {
        this.ciudadPa=ciudadPa;
        this.nombrePaquete = nombrePaquete;
        this.informacion = informacion;
        this.costoP = costoP;
        this.diasSalida = diasSalida;
        this.fechaDisponible = fechaDisponible; 
    }
    
    /**
     *
     */
    public Paquete() {    
    }
}
