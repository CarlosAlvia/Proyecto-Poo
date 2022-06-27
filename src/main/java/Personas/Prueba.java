/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import ManejoArchivos.ManejoArchivos;
/**
 *
 * @author CJAA
 */
public class Prueba {
    public static void main(String[] args){
       llenarArreglo("habitaciones.txt");
//        String hola="09";
//        System.out.println(Month.of(Integer.valueOf(hola)));
//        LocalDate fechaIni=LocalDate.of(2021,Month.of(2),27);
//        LocalDate fechaFinal=LocalDate.of(2021,Month.of(3),2);
//        System.out.println(ChronoUnit.DAYS.between(fechaIni,fechaFinal));
//        ManejoArchivos.LeeFichero("hoteles.txt");
       
      
        
//        ManejoArchivos.EscribirArchivo("hoteles.txt", "");
//        ManejoArchivos.EscribirArchivo("reservas.txt", "");
//        ManejoArchivos.EscribirArchivo("hoteles.txt", "hola");
    }
    public static void llenarArreglo(String nombreArchivo){
         
        ArrayList<String> variableGenerado= new ArrayList();
        ArrayList<String[] > arregloFinal= new ArrayList();
        variableGenerado=ManejoArchivos.LeeFichero(nombreArchivo);
        int filas=0;
        int columnas=variableGenerado.get(0).split(",").length;
        
        for(int a=1;a<variableGenerado.size();a++){
            filas++;
            String[] linea=variableGenerado.get(a).split(","); 
            columnas=linea.length;
            arregloFinal.add(linea);
        }
        for(String[] elemento: arregloFinal ){
            for(String elem: elemento){
                System.out.println(elem);
            }
        }
        
        
//        String [][] matriz=new String[filas][columnas];
//        for(int i=0; i<filas;i++){
//            for(int a=0;a<columnas;a++){
//                matriz[i][a]=
//            }
            
        
        
    }
}
