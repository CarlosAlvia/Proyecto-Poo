/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
/**
 *
 * @author CJAA
 */
public class Prueba {
    public static void main(String[] args){
        String hola="09";
        System.out.println(Month.of(Integer.valueOf(hola)));
        LocalDate fechaIni=LocalDate.of(2021,Month.of(2),27);
        LocalDate fechaFinal=LocalDate.of(2021,Month.of(3),2);
        System.out.println(ChronoUnit.DAYS.between(fechaIni,fechaFinal));
    }
}
