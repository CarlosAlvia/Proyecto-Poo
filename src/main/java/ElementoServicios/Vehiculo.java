/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ElementoServicios;
import Enum.Estado;
import Enum.Transmision;
/**
 *
 * @author User
 */

/**
 * Esta clase contiene funciones que se utilizan para obtener recursos del archivo
 * @author CJAA
 */
public class Vehiculo {
    private String id;
    private String marca;
    private String modelo;
    private String placa;
    private String color;
    private int capacidad;
    private Estado estado;
    private double costoPorDia;
    private Transmision transmision;
    
    /**
     *
     * @param id
     * @param marca
     * @param modelo
     * @param placa
     * @param color
     * @param capacidad
     * @param estado
     * @param costoPorDia
     * @param transmision
     */
    public Vehiculo(String id,String marca,String modelo,String placa, String color, int capacidad, Estado estado,double costoPorDia, Transmision transmision ){
        this.id=id;
        this.marca=marca;
        this.modelo=modelo;
        this.placa=placa;
        this.color=color;
        this.capacidad=capacidad;
        this.estado=estado;
        this.costoPorDia=costoPorDia;
        this.transmision=transmision;
    }
    
    /**
     *
     * @return
     */
    public String getId(){
        return this.id;
    }

    /**
     *
     * @return
     */
    public String getMarca(){
        return this.marca;
    }

    /**
     *
     * @return
     */
    public String getModelo(){
        return this.modelo;
    }

    /**
     *
     * @return
     */
    public String getPlaca(){
        return this.placa;
    }

    /**
     *
     * @return
     */
    public String getColor(){
        return this.color;
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
    public Estado getEstado(){
        return this.estado;
    }

    /**
     *
     * @return
     */
    public double getCostoPorDia(){
        return this.costoPorDia;
    }

    /**
     *
     * @return
     */
    public Transmision getTransmision(){
        return this.transmision;
    }

    /**
     *
     * @param id
     */
    public void setId(String id){
        this.id=id;
    }

    /**
     *
     * @param marca
     */
    public void setMarca(String marca){
        this.marca=marca;
    }

    /**
     *
     * @param modelo
     */
    public void setModelo(String modelo){
        this.modelo=modelo;
    }

    /**
     *
     * @param placa
     */
    public void setPlaca(String placa){
        this.placa=placa;
    }

    /**
     *
     * @param color
     */
    public void setColor(String color){
        this.color=color;
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
     * @param estado
     */
    public void setEstado(Estado estado){
        this.estado=estado;
    }

    /**
     *
     * @param costoPorDia
     */
    public void setCostoPorDia(double costoPorDia){
        this.costoPorDia=costoPorDia;
    }

    /**
     *
     * @param transmision
     */
    public void setTransmision(Transmision transmision){
        this.transmision=transmision;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return this.marca+" "+this.modelo+" "+this.color+" con transmisión: "+this.transmision+" costo por día: "+this.costoPorDia;
    }
}
