/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

import Enum.Estado;
import Enum.Transmision;
import Herramientas.Funcion;
import com.dacon.proyectopoo.Hotel;
import com.dacon.proyectopoo.Reserva;
import java.util.ArrayList;
import com.dacon.proyectopoo.*;
/**
 *
 * @author User
 */
public class Administrador extends Usuario {
    
    public Administrador(String cedula, String nombres, String apellidos, String user, String contraseña, String celular,char tipoUsuario){
        super(cedula,nombres,apellidos,user,contraseña,celular,tipoUsuario);
    }
    
    
    @Override
    public void consultarReservas(){
 
        String simbolo="/*****RESUMEN DE SERVICIOS RESERVADOS******/";
        String simbolo1="/*                                       */";
        String simbolo2="/*****************************************/";
        System.out.println(simbolo);
        System.out.println(simbolo1);
        System.out.println(simbolo2);
        System.out.println("");
        
        if(Reserva.getCantidadReservas()!=0){
            Reserva.setCantidadReservas(0);
        }
        ArrayList<String[]> reservasString=new ArrayList();
       reservasString=Funcion.generarArreglo("reservas.txt");
        //creación de las reservas   
       ArrayList<Reserva> reservas=new ArrayList<Reserva>();
       for(int i=0;i<reservasString.size();i++){
            Reserva reservaElemento=new Reserva(reservasString.get(i)[0],reservasString.get(i)[1],reservasString.get(i)[2], reservasString.get(i)[4],reservasString.get(i)[5],Double.parseDouble(reservasString.get(i)[6]));
            reservas.add(reservaElemento); 
        }
        ArrayList<String[]> reservasHospedaje=Funcion.generarArreglo("reservasHospedaje.txt");
        ArrayList<String[]> reservasTransporte=Funcion.generarArreglo("reservasTransporte.txt");
         ArrayList<String[]> reservasEntretenimiento=Funcion.generarArreglo("reservasEntretenimiento.txt");
        // creciación de un lista de arrays que sus elementos contienen a la ciudad y al tipo
        ArrayList<String[]> ciudadYtipo=new ArrayList<String[]>();
        // Llenar la lista
        for(Reserva elemento:reservas){
            String tipo=elemento.getTipoReserva();
            String numerRese=elemento.getNumeroReserva();
            switch(tipo.toLowerCase()){
                case "transporte":
                   for(int i=0; i<reservasTransporte.size();i++){
                       if(numerRese.equals(reservasTransporte.get(i)[0])){
                           String linea= reservasTransporte.get(i)[1].toLowerCase()+","+"transporte";
                           String[] lineas=linea.split(",");
                           ciudadYtipo.add(lineas);
                        }
                   }
                    break;
                case "hospedaje":

                    for(int i=0; i<reservasHospedaje.size();i++){
                       if(numerRese.equals(reservasHospedaje.get(i)[0])){
                           String linea= reservasHospedaje.get(i)[1].toLowerCase()+","+"hospedaje";
                           String[] lineas=linea.split(",");
                           ciudadYtipo.add(lineas);
                    }
                   }
                    break;
                case "entretenimiento":
                   for(int i=0; i<reservasEntretenimiento.size();i++){
                       if(numerRese.equals(reservasEntretenimiento.get(i)[0])){
                           String linea= reservasEntretenimiento.get(i)[1].toLowerCase()+","+"entretenimiento";
                           String[] lineas=linea.split(",");
                           ciudadYtipo.add(lineas);
                       }
                   }
                    break;
            }
        }
            
           // crear una lista de ciudades
            ArrayList<String> ciudades=new ArrayList<String>();
//[cuenca, entretenimienot][quito,transporte]
            for(int i=0; i<ciudadYtipo.size();i++){
                if(!(ciudades.contains(ciudadYtipo.get(i)[0]))){
                String nombreCiudad=ciudadYtipo.get(i)[0].toLowerCase();
                ciudades.add(nombreCiudad);
                }
            }   
            for(String ciudad: ciudades){
                int contadorEntretenimiento=0;
                int contadorTransporte=0;
                int contadorHospedaje=0;
                for(String[]ele:ciudadYtipo){
                    if(ciudad.equals(ele[0])){
                        if(ele[1].toLowerCase().equals("entretenimiento")){
                        contadorEntretenimiento++;
                        }
                        else if(ele[1].toLowerCase().equals("transporte")){
                        contadorTransporte++;
                        }
                        else if(ele[1].toLowerCase().equals("hospedaje")){
                        contadorHospedaje++;
                        }
                    }
                } 
                System.out.println("/-------"+(ciudad.substring(0,1).toUpperCase()+ciudad.substring(1).toLowerCase())+"--------/");
                System.out.println("Hospedaje: "+contadorHospedaje);
                System.out.println("Transporte: "+contadorTransporte);
                System.out.println("Entretenimiento: "+contadorEntretenimiento);
            }
            System.out.println("El total de reservas es: "+Reserva.getCantidadReservas());
        
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