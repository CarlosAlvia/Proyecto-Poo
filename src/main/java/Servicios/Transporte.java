/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import ElementoServicios.Vehiculo;

/**
 *
 * @author User
 */

/**
 * Esta clase contiene variables y constructores que apoyan la creación de métodos
 */
public class Transporte extends Servicio {
    private Vehiculo vehiculo;

    /**
     * Este constructor llama al constructor de la clase padre e inicializa su atributo vehículo
     * @param ciudad
     * @param valor
     * @param vehiculo 
     */
    public Transporte(String ciudad, double valor,Vehiculo vehiculo){
        super(ciudad,valor);
        this.vehiculo=vehiculo;
    }
     /**
     *Este método permite a un objeto de tipo Transporte presentar los datos generados
     * por la reserva en pantalla. Debe ser escrito 
     * Sobreescribiendo el método 
     * Esta definido en la clase  padre
     */ 
    @Override
    public void mostrarReserva(){
        super.mostrarReserva();
        System.out.println("VEHICULO: "+this.vehiculo.getMarca()+" "+this.vehiculo.getModelo());
        System.out.println("CÓDIGO VEHICULO: "+this.vehiculo.getId());
        System.out.println("VALOR A PAGAR: "+this.valor);
    }

    /**
     *
     * @return
     */
    @Override
    /**
     * Este método permite obtener una cadena algunos atributos del servicio
     * @return retorna la línea que se escribe en el archivo reservasTransporte al momento de reservar este servicio
     */
    public String toString(){
        return this.reserva.getNumeroReserva()+","+this.ciudad+","+this.vehiculo.getId()+","+this.reserva.getValorPagar();
    }

    /**
     *
     * @return
     */
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    /**
     *
     * @param vehiculo
     */
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }   
}
