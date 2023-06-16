/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ElementoServicios;

import Enum.Estado;
import java.util.ArrayList;

/**
 *
 * @author Jorge Daniel
 */
public class Doble extends Habitacion {

    public Doble(String codigoHotel, double precio, int capacidad, int numerodeHabitacion, Estado estado) {
        super(codigoHotel, precio, capacidad, numerodeHabitacion, estado);
    }

    public Doble() {
        
    }
    
    public void tipoHabitacion(ArrayList<String[]> habitacionString, Hotel hotElegido, ArrayList<Habitacion> habitaciones, long dias) {
        for (int i = 0; i < habitacionString.size(); i++) {
            //para obtner la habitación necesita pasar por 3 requisitos, que pertenezca al hotel, que este disponible y que sea del tipo que el cliente solicito
            if (habitacionString.get(i)[0].equals(hotElegido.getCodigoHotel()) && habitacionString.get(i)[5].equals("DISPONIBLE")) {
                Habitacion habi = new Doble(habitacionString.get(i)[0], Double.valueOf(habitacionString.get(i)[2]), Integer.parseInt(habitacionString.get(i)[3]), Integer.parseInt(habitacionString.get(i)[4]), Estado.valueOf(habitacionString.get(i)[5]));
                habitaciones.add(habi);
                int numero = (int) (Math.random() * habitaciones.size() + 1);
                System.out.println("Usted ha elegido una habitación Doble para un total de " + dias + " noche(s).");
                System.out.println("El costo del paquete a pagar es de: " + habitaciones.get(numero - 1).getPrecio() * dias);
            }
        }
    }

}
