/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

import Herramientas.Funcion;
import com.dacon.proyectopoo.Hotel;
import com.dacon.proyectopoo.Reserva;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Administrador extends Usuario {
    public Administrador(String cedula, String nombres, String apellidos, String user, String contraseña, String celular,char tipoUsuario){
        super(cedula,nombres,apellidos,user,contraseña,celular,tipoUsuario);
    }
    
    
    public void consultarReservas(){
        String simbolo="/*****RESUMEN DE SERVICIOS RESERVADOS******/";
        String simbolo1="/*                                       */";
        String simbolo2="/*****************************************/";
        System.out.println(simbolo);
        System.out.println(simbolo1);
        System.out.println(simbolo2);
        System.out.println("");
        ArrayList<String[]> reservasString=new ArrayList();
        reservasString=Funcion.generarArreglo("reservas.txt");
//     int indice=1;
        ArrayList<Reserva> reservas=new ArrayList<Reserva>();
        for(int i=0;i<reservasString.size();i++){
//                Reserva hotelito=new Reserva(reservasString.get(i)[0],reservasString.get(i)[1],reservasString.get(i)[2],Integer.parseInt (reservasString.get(i)[3]), reservasString.get(i)[4], reservasString.get(i)[5].equals("true"));
//            
//            hoteles.add(hotelito);
// 
           
        }
    }
}


//String simbolo="/************MENU ADMINISTRADOR************/";
//        String simbolo1="/*                                       */";
//        String simbolo2="/*****************************************/";
//        System.out.println(simbolo);
//        System.out.println(simbolo1);
//        System.out.println(simbolo2);
//        System.out.println("");
//        System.out.println("1. Consultar Reservas");
//        System.out.println("2. Reservar Transporte");