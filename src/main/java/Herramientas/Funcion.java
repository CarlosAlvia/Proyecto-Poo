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
import java.util.Random;
/**
 *
 * @author CJAA
 */
public class Funcion {
    public static ArrayList calcularDias(){
        //Esta funcion incluye el código que solicita los días
        Scanner sc=new Scanner(System.in);
        long diasReserva;
        String fechaInicio;
        String fechaFin;
        //se crea esta variable para poder usarla como condición del while
        //y verificar que no se está reservando en una fecha anterior a la actual
        LocalDate fechaIni;
        do{
        System.out.println("Ingrese la fecha desde la reserva: ");
        fechaInicio=sc.nextLine();
        System.out.println("Ingrese la fecha hasta la reserva: ");
        fechaFin=sc.nextLine();
        //Se hace un split del formato(dd/mm/aa) de las fechas de inicio y fin 
        String[] arrFecha1=fechaInicio.split("/");
        String[] arrFecha2=fechaFin.split("/");
        //Se trasnforma los valores de mes,dia y año a enteros y se los guarda en variables
        int año1=Integer.valueOf(arrFecha1[2]);
        int año2=Integer.valueOf(arrFecha2[2]);
        int dia1=Integer.valueOf(arrFecha1[0]);
        int dia2=Integer.valueOf(arrFecha2[0]);
        int mes1=Integer.valueOf(arrFecha1[1]);
        int mes2=Integer.valueOf(arrFecha2[1]);
        //Se crean objetos de tipo fecha para poder usar la funcion between de la clase DAYS
        //La cual calcula el número de días que hay entre dos fechas
        fechaIni=LocalDate.of(año1,Month.of(mes1),dia1);
        LocalDate fechaFinal=LocalDate.of(año2,Month.of(mes2),dia2);
        //Se guarda la información en la variable diasReserva
        diasReserva=ChronoUnit.DAYS.between(fechaIni,fechaFinal);
        //Se verifica que el valor devuelto sea distinto de cero
        if (diasReserva<=0||(ChronoUnit.DAYS.between(LocalDate.now(),fechaIni))<0){
            System.out.println("Ingrese fechas válidas");
        }
        //El código se ejecuta hasta que se ingresen fechas que disten entre sí de forma positiva
        //es decir, que la fecha de fin sea después de la fecha de inicio. También se verifica que 
        //la fecha de inicio sea la fecha actual o posterior
        }while(diasReserva<=0||(ChronoUnit.DAYS.between(LocalDate.now(),fechaIni))<0);
        Long dias=diasReserva;
        //Se crea una lista que contiene la cantidad de días, la fecha de inicio y la fecha de fin
        ArrayList datos=new ArrayList();
        datos.add(dias);
        datos.add(fechaInicio);
        datos.add(fechaFin);
        return datos;
    }
        public static ArrayList<String[]> generarArreglo(String nombreArchivo){
            //Se cree una lista de arreglos de Strings
            //Se crea una lista de Strings que guardará las líneas que devuelve el método LeeFichero
            //Luego se hace split a cada línea y cada arreglo de Strings se agrega a la lista de arreglos de 
            //String y se la retorna
            ArrayList<String> variableGenerado;
            variableGenerado=ManejoArchivos.LeeFichero(nombreArchivo);
            ArrayList<String[] > arregloFinal= new ArrayList();
            for(int a=1;a<variableGenerado.size();a++){
                String[] linea=variableGenerado.get(a).split(","); 
                arregloFinal.add(linea);
        }
        return arregloFinal;
    }
        public static long calcularDias(String fechaInicio,String fechaFin){
        long diasReserva;
        
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
       
       
        Long dias=diasReserva;
        return dias;
        }
        
        public static String generarNumerosAleatorios(int inicio,int fin,String nombreArchivo){
            //Este método aplica para generar números aleatorios únicos para pago y reservas
            Random a= new Random();
            String numeroReservaOPagoGenerado;
            //Se crea un boolean iniciado en falso para usar en el while
            boolean generarOtroNumero=false;
            do{
                //Se genera un long al azar
                Long b= a.nextLong(inicio,fin);
                //Se lo convierte a String y se lo asigna a la variable a retornar
                numeroReservaOPagoGenerado=b.toString();
                //Se verfica con el archivo de pago o reserva que el número no esté repetido
                ArrayList<String[]> datosReservasOPago=Funcion.generarArreglo(nombreArchivo);
                //Esta estructura condicional verifica que el número ya esté usado, si es el caso
                //se cambia el boolean a true para que genere otro número hasta que este no esté usado
                //en otra reserva o pago
                if (!datosReservasOPago.isEmpty()){
                    for (String[] atributosArchivo:datosReservasOPago){
                        if ((atributosArchivo[0].equals(numeroReservaOPagoGenerado))){
                            generarOtroNumero=true;
                        }
                    }
                }
            }while(generarOtroNumero);
            return numeroReservaOPagoGenerado;
        }
}
