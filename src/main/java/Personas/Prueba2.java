/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

import Enum.*;
import Enum.Transmision;
import Herramientas.Funcion;
import com.dacon.proyectopoo.Reserva;
import com.dacon.proyectopoo.Transporte;
import com.dacon.proyectopoo.*;
import java.util.ArrayList;

/**
 *
 * @author CJAA
 */
public class Prueba2 {
            for (String[] datosHospedaje:reservasHospedaje){
                for (Reserva reserva:reservasCliente){
                    if(datosHospedaje[0].equals(reserva.getNumeroReserva())){
                        if(!datosHospedaje[3].equals("ED")){
                            ArrayList<String[]> datosHoteles;
                            datosHoteles=Funcion.generarArreglo("hoteles.txt");
                            for (String[] hotel:datosHoteles){
                                if(datosHospedaje[2].equals(hotel[1])){
                                    ArrayList<String[]> datosHabitaciones;
                                    datosHabitaciones=Funcion.generarArreglo("habitaciones.txt");
                                    for (String[] room:datosHabitaciones){
                                        if(hotel[1].equals(room[0])&&datosHospedaje[4].equals(room[4])){
                                            Habitacion habitacionReservada=new Habitacion(room[0],TipoHabitacion.valueOf(room[1]),Double.valueOf(room[2]),Integer.valueOf(room[3]),Integer.valueOf(room[4]),Estado.valueOf(room[5]));
                                            Hotel hotelReserva=new Hotel(hotel[0],hotel[1],hotel[2],Integer.valueOf(hotel[3]),hotel[4],Boolean.valueOf(hotel[5]),Boolean.valueOf(hotel[6]),Boolean.valueOf(hotel[7]));
                                            ArrayList<Habitacion> habitaciones=new ArrayList();
                                            habitaciones.add(habitacionReservada);
                                            hotelReserva.setListaHabitaciones(habitaciones);
                                            Hospedaje hospedajeReservado=new Hospedaje(datosHospedaje[1],Double.valueOf(datosHospedaje[4]),hotelReserva);
                                            servicios.add(hospedajeReservado);
                                        }
                                    }
                                }
                            }
                        }else{
                            ArrayList<String[]> datosDepartamentos;
                            datosDepartamentos=Funcion.generarArreglo("departamento.txt");
                            for (String[] departamento:datosDepartamentos){
                                if(datosHospedaje[2].equals(departamento[1])){
                                    Departamento departamentoReservado=new Departamento(departamento[0],departamento[1],Double.valueOf(departamento[2]),Integer.valueOf(departamento[3]),Estado.valueOf(departamento[4]),Boolean.valueOf(departamento[5]),Boolean.valueOf(departamento[6]));
                                    Hospedaje hospedajeReservado=new Hospedaje(datosHospedaje[1],Double.valueOf(datosHospedaje[4]),departamentoReservado);
                                    servicios.add(hospedajeReservado);
                                }
                            }
                        }

                    }
                }
            }
        
}
