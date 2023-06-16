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
/**
 * Esta clase contiene funciones que se utilizan para obtener recursos en el documento
 * @author CJAA
 */
public class Funcion {

    /**
     * Este método solicita dos fechas y calcula la cantidad de días que hay
     * entre ellas
     *
     * @return ArrayList que contiene la distancia entre los días, el día de
     * inicio de la reserva y el día de fin de la reserva
     */
    public static ArrayList calcularDiasDeReserva() {
        
        long diasReserva;
        ArrayList<LocalDate> fechas;
        do {
            fechas=pedirFechas();
            diasReserva = ChronoUnit.DAYS.between(fechas.get(0), fechas.get(1));
            boolean fechasSonNoValidas = diasReserva <= 0 || (ChronoUnit.DAYS.between(LocalDate.now(), fechas.get(0))) < 0;
            if (fechasSonNoValidas) {
                System.out.println("Ingrese fechas válidas");
            }
        } while (diasReserva <= 0 || (ChronoUnit.DAYS.between(LocalDate.now(), fechas.get(0))) < 0);
        Long dias = diasReserva;
        ArrayList datos = new ArrayList();
        datos.add(dias);
        datos.add(fechas.get(0));
        datos.add(fechas.get(1));
        return datos;
    }
    
    public static ArrayList<LocalDate> pedirFechas(){
            Scanner sc = new Scanner(System.in);
            ArrayList<LocalDate> fechas=new ArrayList<>();
            for(int i=0;i<2;i++){
                System.out.println("Ingrese la fecha de inicio o fin de la reserva(según corresponda): ");
                String fechaIngresada = sc.nextLine();
                fechas.add(LocalDate.parse(fechaIngresada));
            }
            return fechas;
    }

    /**
     * Este método generar Arraylist que permite para simplificar el proceso de
     * creación de los objetos en las varias clases
     *
     * @param nombreArchivo del cual se extraen los datos para devolver el
     * Arraylist de arreglos de Strings
     * @return se devuelve el ArrayList que luego se usan para crear los objetos
     * de la clase correspondiente al archivo
     */
    public static ArrayList<String[]> generarArreglo(String nombreArchivo) {
        //Se cree una lista de arreglos de Strings
        //Se crea una lista de Strings que guardará las líneas que devuelve el método LeeFichero
        //Luego se hace split a cada línea y cada arreglo de Strings se agrega a la lista de arreglos de 
        //String y se la retorna
        ArrayList<String> variableGenerado;
        variableGenerado = ManejoArchivos.LeeFichero(nombreArchivo);
        ArrayList<String[]> arregloFinal = new ArrayList();
        for (int a = 1; a < variableGenerado.size(); a++) {
            String[] linea = variableGenerado.get(a).split(",");
            arregloFinal.add(linea);
        }
        return arregloFinal;
    }

    /**
     * Este método es una sobrecarga que recibe las fechas para luego calcular a
     * diferencia de la otra versión que no recibe fechas
     *
     * @param fechaInicio
     * @param fechaFin
     * @return dias entre las fechas ingresadas
     */
    public static long calcularDias(String fechaInicio, String fechaFin) {
        long diasReserva;

        //Calcular cuántos días se reserva 
        String[] arrFecha1 = fechaInicio.split("/");
        String[] arrFecha2 = fechaFin.split("/");
        int año1 = Integer.valueOf(arrFecha1[2]);
        int año2 = Integer.valueOf(arrFecha2[2]);
        int dia1 = Integer.valueOf(arrFecha1[0]);
        int dia2 = Integer.valueOf(arrFecha2[0]);
        int mes1 = Integer.valueOf(arrFecha1[1]);
        int mes2 = Integer.valueOf(arrFecha2[1]);
        LocalDate fechaIni = LocalDate.of(año1, Month.of(mes1), dia1);
        LocalDate fechaFinal = LocalDate.of(año2, Month.of(mes2), dia2);
        diasReserva = ChronoUnit.DAYS.between(fechaIni, fechaFinal);

        Long dias = diasReserva;
        return dias;
    }

    /**
     * Este método genera números aleatorios para reservas y pagos entre el
     * rango que se da sin incluir el fin y un nombre del archivo
     * correspondiente para verificar que estos sean únicos
     *
     * @param inicio
     * @param fin
     * @param nombreArchivo
     * @return el número generado como un String
     */
    public static String generarNumerosAleatorios(int inicio, int fin, String nombreArchivo) {
        //Este método aplica para generar números aleatorios únicos para pago y reservas
        Random a = new Random();
        String numeroReservaOPagoGenerado;
        //Se crea un boolean iniciado en falso para usar en el while
        boolean generarOtroNumero = false;
        do {
            //Se genera un long al azar
            Long b = a.nextLong(inicio, fin);
            //Se lo convierte a String y se lo asigna a la variable a retornar
            numeroReservaOPagoGenerado = b.toString();
            //Se verfica con el archivo de pago o reserva que el número no esté repetido
            ArrayList<String[]> datosReservasOPago = Funcion.generarArreglo(nombreArchivo);
            //Esta estructura condicional verifica que el número ya esté usado, si es el caso
            //se cambia el boolean a true para que genere otro número hasta que este no esté usado
            //en otra reserva o pago
            if (!datosReservasOPago.isEmpty()) {
                for (String[] atributosArchivo : datosReservasOPago) {
                    if ((atributosArchivo[0].equals(numeroReservaOPagoGenerado))) {
                        generarOtroNumero = true;
                    }
                }
            }
        } while (generarOtroNumero);
        return numeroReservaOPagoGenerado;
    }
}
