/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herramientas;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

/**
 *
 * @author CJAA
 */
public class Funcion {
    public static ArrayList calcularDias(){
        Scanner sc=new Scanner(System.in);
        long diasReserva;
        String fechaInicio;
        String fechaFin;
        do{
        System.out.println("Ingrese la fecha desde la reserva: ");
        fechaInicio=sc.nextLine();
        System.out.println("Ingrese la fecha hasta la reserva: ");
        fechaFin=sc.nextLine();
        //Calcular cuántos días se reserva 
        String[] arrFecha1=fechaInicio.split("/");
        String[] arrFecha2=fechaFin.split("/");
        int año1=Integer.valueOf(arrFecha1[2]);
        int año2=Integer.valueOf(arrFecha2[2]);
        int dia1=Integer.valueOf(arrFecha1[0]);
        int dia2=Integer.valueOf(arrFecha2[0]);
        int mes1=Integer.valueOf(arrFecha1[1]);
        int mes2=Integer.valueOf(arrFecha2[1]);
        LocalDate fechaIni=LocalDate.of(año1,Month.of(mes1),dia1);
        LocalDate fechaFinal=LocalDate.of(año2,Month.of(mes2),dia2);
        diasReserva=ChronoUnit.DAYS.between(fechaIni,fechaFinal);
        if (diasReserva<=0){
            System.out.println("Ingrese fechas válidas");
        }
        }while(diasReserva<=0);
        Long dias=diasReserva;
        ArrayList datos=new ArrayList();
        datos.add(dias);
        datos.add(fechaInicio);
        datos.add(fechaFin);
        return datos;
    }
}
