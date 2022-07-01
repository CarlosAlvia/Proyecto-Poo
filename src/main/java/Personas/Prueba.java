/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import Herramientas.ManejoArchivos;
import com.dacon.proyectopoo.Reserva;
import com.dacon.proyectopoo.Transporte;
import com.dacon.proyectopoo.Vehiculo;
import java.util.Scanner;
import Enum.Estado;
import Enum.Transmision;

/**
 *
 * @author CJAA
 */
public class Prueba {
    public static void main(String[] args){
        ArrayList<String[]> hola=new ArrayList();
        ArrayList<Vehiculo> hola1=new ArrayList();
        hola=llenarArreglo("vehiculos.txt");
        

        Cliente cliente2=new Cliente("0945698598","Marco","Cárdenas","mcarden","abcde",975342533);
        for (String[] ele:hola){
        Vehiculo vehiculo=new Vehiculo(ele[0],ele[1],ele[2],ele[3],ele[4],Integer.valueOf(ele[5]),Estado.valueOf(ele[6]),Double.valueOf(ele[7]),Transmision.valueOf(ele[8]));
        hola1.add(vehiculo);
        }
        reservarTransporte(hola1,cliente2);
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
    public static ArrayList<String[]> llenarArreglo(String nombreArchivo){
        //Revisar error de escritura del archivo
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
//        for(String[] elemento: arregloFinal ){
//            for(String elem: elemento){
//                System.out.println(elem);
//            }
        return arregloFinal;
        }
        
        
//        String [][] matriz=new String[filas][columnas];
//        for(int i=0; i<filas;i++){
//            for(int a=0;a<columnas;a++){
//                matriz[i][a]=
//            }
            
        
        
    
    public static void reservarTransporte(ArrayList<Vehiculo> vehiculos, Cliente cliente){
        Scanner sc=new Scanner(System.in);
        String simbolo="/***************RESERVACIÓN***************/";
        String simbolo1="/*                                       */";
        String simbolo2="/*****************************************/";
        System.out.println(simbolo);
        System.out.println(simbolo1);
        System.out.println(simbolo2);
        System.out.println("");
        System.out.println("Ingrese la ciudad de reserva: ");
        String ciudad=sc.nextLine();
        long diasReserva;
        String fechaInicio;
        String fechaFin;
        do{
        System.out.println("Ingrese la fecha desde la reserva del vehículo: ");
        fechaInicio=sc.nextLine();
        System.out.println("Ingrese la fecha hasta la reserva del vehículo: ");
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
         
        //fin de calcular cuántos días se reserva
        System.out.println("Elija la capacidad del vehículo");
        //El documento decía preguntar tamaño y en este caso se asemeja el atributo capacidad
        int capacidadElegida=sc.nextInt();
        sc.nextLine();
        System.out.println("Estos son los vehículos disponibles:");
        int contador=0;
        ArrayList<Vehiculo> opciones=new ArrayList<Vehiculo>();
        for (Vehiculo vehiculo:vehiculos){
            if(vehiculo.getCapacidad()==capacidadElegida&&vehiculo.getEstado().name().equals("DISPONIBLE")){
                contador+=1;
                System.out.println(contador+". "+vehiculo);
                opciones.add(vehiculo);
            }
        }
        if (!opciones.isEmpty()){
            System.out.println("Elija una opción");
            int op=sc.nextInt();
            while (op<1||op>opciones.size()){
                System.out.println("Elija una opción válida");
                op=sc.nextInt();
            }
            sc.nextLine();
            System.out.println("Usted ha elegido un "+opciones.get(op-1).getMarca()+" "+opciones.get(op-1).getModelo()+" por "+diasReserva+" días");
            double valorPagar=diasReserva*opciones.get(op-1).getCostoPorDia();
            System.out.println("El costo a pagar es de "+valorPagar+" dólares");
            System.out.println("¿Desea reservar?");
            String deseaReserva=sc.nextLine().toLowerCase();
            if (deseaReserva.equals("si")||deseaReserva.equals("sí")){
                Transporte transporte=new Transporte(ciudad,valorPagar,5.0,4,opciones.get(op-1));
                Reserva reservaTransporte=new Reserva(fechaInicio,fechaFin,valorPagar,cliente,"transporte");
                transporte.setReserva(reservaTransporte);
                ManejoArchivos.EscribirArchivo("reservas.txt", reservaTransporte.toString());
                String lineaTransporte;
                lineaTransporte=reservaTransporte.getNumeroReserva()+","+opciones.get(op-1).getId()+","+valorPagar;
                ManejoArchivos.EscribirArchivo("reservasTransporte.txt", lineaTransporte);
                //Falta iniciar el código de reserva en el constructor de Reserva y ver si reserva debe tener un
                //objeto servicio o si servicio debe tener un objeto reserva
                
                transporte.mostrarReserva();
                //Falta crear el constructor de servicio y el transporte
                //public Transporte(String ciudad, double valor, Reserva reserva, double puntuacion, int identificador,Vehiculo vehiculo)
                
            }
        }else{
            System.out.println("No hay vehículos disponibles");
        }
        //hola
    }
}
