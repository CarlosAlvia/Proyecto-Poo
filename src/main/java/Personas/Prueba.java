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
import Herramientas.Funcion;
import com.dacon.proyectopoo.Paquete;
import com.dacon.proyectopoo.Pago;
/**
 *
 * @author CJAA
 */
public class Prueba {
    public static void main(String[] args){
//        ArrayList<String[]> hola=new ArrayList();
//        ArrayList<Vehiculo> hola1=new ArrayList();
//        hola=Funcion.generarArreglo("vehiculos.txt");
//        Cliente cliente2=new Cliente("0945698598","Marco","Cárdenas","mcarden","abcde","0975342533");
//        for (String[] ele:hola){
//        Vehiculo vehiculo=new Vehiculo(ele[0],ele[1],ele[2],ele[3],ele[4],Integer.valueOf(ele[5]),Estado.valueOf(ele[6]),Double.valueOf(ele[7]),Transmision.valueOf(ele[8]));
//        hola1.add(vehiculo);
//        }
////        reservarTransporte(hola1,cliente2);
// Scanner sc=new Scanner(System.in);
//        ArrayList<String[]> paqueteString=new ArrayList();
//        paqueteString=Funcion.generarArreglo("paquetes.txt");
////        System.out.println(paqueteString);
////    System.out.println(paqueteString.get(0)[3]);
//        System.out.println("Ingrese la ciudad de reserva: ");
//        String ciudad=sc.nextLine();
//        int a=1;
//        ArrayList<Paquete> paquetes=new ArrayList<Paquete>();
//        for(int i=0;i<paqueteString.size();i++){
//            if(paqueteString.get(i)[0].equals(ciudad)){
//                System.out.println(a+". "+ paqueteString.get(i)[1]);
//           Paquete paquete=new Paquete(ciudad,paqueteString.get(i)[1],paqueteString.get(i)[2],Double.parseDouble(paqueteString.get(i)[3]),paqueteString.get(i)[4],paqueteString.get(i)[5]);    
//            a++;
//            paquetes.add(paquete);
//            }
//        }
//        String reservo="";
//        
//        System.out.println("Eleija una opción para conocer más: ");
//        int seleccion =sc.nextInt();
//        Paquete packelegido=new Paquete();
//        int cantPersonas=0;
//        for (Paquete pac:paquetes){
//            if(pac==paquetes.get(seleccion-1)){
//            System.out.println(pac.getInformacion()); 
//            System.out.println("Costo por persona: "+ pac.getCostoP()); 
//            System.out.println("Salidas: "+ pac.getDiasSalida()); 
//            System.out.println("Fecha para realizar ruta: "+ pac.getFechaDisponible());
//            System.out.println("Numero de personas: ");
//            cantPersonas=sc.nextInt();
//            packelegido= pac;
//            sc.nextLine();
//            System.out.println("¿Desea reservar?: ");
//             reservo=sc.nextLine();
//            }
//             
//        }
//        String diaInicio=packelegido.getFechaDisponible().split("-")[0];
//        String diaFin=packelegido.getFechaDisponible().split("-")[1];
//        ;
//        double valorPagar=cantPersonas*packelegido.getCostoP();
//        if (reservo.equals("si")||reservo.equals("sí")){
//                System.out.println("Holaxd");
//                
//                   
//         }
        LocalDate fechaActual= LocalDate.now();
        System.out.println(fechaActual);
   }
//    public static void reservarTransporte(ArrayList<Vehiculo> vehiculos, Cliente cliente){
//        Scanner sc=new Scanner(System.in);
//        Reserva.mostrarCabecera();
//        System.out.println("Ingrese la ciudad de reserva: ");
//        String ciudad=sc.nextLine();
//        ArrayList datos=Funcion.calcularDias();
//        long diasReserva=(Long)datos.get(0);
//        String fechaInicio=(String)datos.get(1);
//        String fechaFin=(String)datos.get(2);
//        System.out.println("Elija la capacidad del vehículo");
//        //El documento decía preguntar tamaño y en este caso se asemeja el atributo capacidad
//        int capacidadElegida=sc.nextInt();
//        sc.nextLine();
//        System.out.println("Estos son los vehículos disponibles:");
//        int contador=0;
//        ArrayList<Vehiculo> opciones=new ArrayList<Vehiculo>();
//        for (Vehiculo vehiculo:vehiculos){
//            if(vehiculo.getCapacidad()==capacidadElegida&&vehiculo.getEstado().name().equals("DISPONIBLE")){
//                contador+=1;
//                System.out.println(contador+". "+vehiculo);
//                opciones.add(vehiculo);
//            }
//        }
//        if (!opciones.isEmpty()){
//            System.out.println("Elija una opción");
//            int op=sc.nextInt();
//            while (op<1||op>opciones.size()){
//                System.out.println("Elija una opción válida");
//                op=sc.nextInt();
//            }
//            sc.nextLine();
//            System.out.println("Usted ha elegido un "+opciones.get(op-1).getMarca()+" "+opciones.get(op-1).getModelo()+" por "+diasReserva+" días");
//            double valorPagar=diasReserva*opciones.get(op-1).getCostoPorDia();
//            System.out.println("El costo a pagar es de "+valorPagar+" dólares");
//            System.out.println("¿Desea reservar?");
//            String deseaReserva=sc.nextLine().toLowerCase();
//            if (deseaReserva.equals("si")||deseaReserva.equals("sí")){
//                Transporte transporte=new Transporte(ciudad,valorPagar,5.0,4,opciones.get(op-1));
//                Reserva reservaTransporte=new Reserva(fechaInicio,fechaFin,valorPagar,cliente,"transporte");
//                transporte.setReserva(reservaTransporte);
//                ManejoArchivos.EscribirArchivo("reservas.txt", reservaTransporte.toString());
//                String lineaTransporte;
//                lineaTransporte=reservaTransporte.getNumeroReserva()+","+opciones.get(op-1).getId()+","+valorPagar;
//                ManejoArchivos.EscribirArchivo("reservasTransporte.txt", lineaTransporte);
//                //Falta iniciar el código de reserva en el constructor de Reserva y ver si reserva debe tener un
//                //objeto servicio o si servicio debe tener un objeto reserva
//                
//                transporte.mostrarReserva();
//                //Falta crear el constructor de servicio y el transporte
//                //public Transporte(String ciudad, double valor, Reserva reserva, double puntuacion, int identificador,Vehiculo vehiculo)
//                
//            }
//        }else{
//            System.out.println("No hay vehículos disponibles");
//        }
//    }
    
    //Pagar reserva
    public void pagarReserva(){
        String[] arrFechaActual= LocalDate.now().toString().split("-");
        String fechaActual=arrFechaActual[2]+"/"+arrFechaActual[1]+"/"+arrFechaActual[0];
        Reserva reservaAPagar = null;
        Cliente cl=new Cliente("","","","","","");
        Scanner sc=new Scanner(System.in);
        final double FACTORDESCUENTO=0.15;
        String tarjetaDeCredito="";
        String caducidadTarjeta="";
        String numeroCheque="";
        double valorPago;
        boolean probarOtraVez=true;
        do{
            System.out.println("Ingrese el código de la reserva");
            String codigoReserva=sc.nextLine();
            ArrayList<String[]> datosReservas=Funcion.generarArreglo("reservas.txt");
            for (String[] datos:datosReservas){
                if(datos[0].equals(codigoReserva)){
                  //String numeroReserva, String fechaReserva, String tipoReserva, Cliente cliente, String desde, String hasta, double valorPagar
                    Reserva reserva=new Reserva(datos[0],datos[1],datos[2],cl,datos[4],datos[5],Double.valueOf(datos[6]));
                    reservaAPagar=reserva;
                }
            }
            if(reservaAPagar==null){
                System.out.println("Número de reserva inválido");
                System.out.println("Desea probar con otro número de reserva");
                String respuesta=sc.nextLine();
                if(!(respuesta.toLowerCase().equals("si")||respuesta.toLowerCase().equals("sí"))){
                    probarOtraVez=false;
                }
            }
        }while(reservaAPagar!=null&&probarOtraVez);
        if (reservaAPagar!=null){
            ArrayList<String[]> reservaServicio=null;
            switch (reservaAPagar.getTipoReserva().toLowerCase()) {
                case "hospedaje":
                    reservaServicio=Funcion.generarArreglo("reservasTransporte.txt");
                    break;
                case "tranporte":
                    reservaServicio=Funcion.generarArreglo("reservasTransporte.txt");
                    break;
                case "transmision":
                    reservaServicio=Funcion.generarArreglo("reservasEntretenimiento.txt");
                    break;
                default:
                    break;
            }
            System.out.println("Seleccione su forma de pago");
            String formaPago=sc.nextLine();
            boolean repetirTarjeta=false;
            if(formaPago.toLowerCase().equals("tarjeta")){
                do{
                System.out.println("Ingrese su número de tarjeta");
                String tarjeta=sc.nextLine();
                System.out.println("Ingrese el mes y año de caducidad");
                String caducidad=sc.nextLine();
                String[] fechaTarjeta=caducidad.split("/");
                int mesTarjeta=Integer.valueOf(fechaTarjeta[0]);
                int anoTarjeta=Integer.valueOf(fechaTarjeta[1]);
                String[] fechaComparacion=fechaActual.split("/");
                int mesActual=Integer.valueOf(fechaComparacion[1]);
                int anoActual=Integer.valueOf(fechaComparacion[2]);
                if(anoTarjeta<anoActual){
                    repetirTarjeta=true;
                }else if(anoTarjeta==anoActual&&mesTarjeta<mesActual){
                    repetirTarjeta=true;
                }
                if(repetirTarjeta){
                    System.out.println("Tarjeta inválida");
                }else{
                    tarjetaDeCredito=tarjeta;
                    caducidadTarjeta=caducidad;
                }
                }while(repetirTarjeta);
                if (reservaAPagar.getCliente().getTipoUsuario()=='V'){
                    double subtotal=reservaAPagar.getValorPagar();
                    double recargoTarjeta=0.10;
                    valorPago=subtotal-(subtotal*FACTORDESCUENTO)+subtotal*recargoTarjeta;
                    System.out.println("Su valor a pagar final es: "+valorPago);
                    System.out.println("¿Desea confirmar su pago?");
                    String confirmacion=sc.nextLine().toLowerCase();
                    if(confirmacion.equals("sí")||confirmacion.equals("si")){                    
                        Pago pago=new Pago(fechaActual,reservaAPagar,valorPago,formaPago,tarjetaDeCredito,caducidadTarjeta);
                        ManejoArchivos.EscribirArchivo("pagos.txt",pago.toString());
                        System.out.println("Pago generado");
                    }
                }else if (reservaAPagar.getCliente().getTipoUsuario()=='C'){
                    double subtotal=reservaAPagar.getValorPagar();
                    double recargoTarjeta=0.10;
                    valorPago=subtotal+subtotal*recargoTarjeta;
                    System.out.println("Su valor a pagar final es: "+valorPago);
                    System.out.println("¿Desea confirmar su pago?");
                    String confirmacion=sc.nextLine().toLowerCase();
                    if(confirmacion.equals("sí")||confirmacion.equals("si")){                    
                        Pago pago=new Pago(fechaActual,reservaAPagar,valorPago,formaPago,tarjetaDeCredito,caducidadTarjeta);
                        ManejoArchivos.EscribirArchivo("pagos.txt",pago.toString());
                        System.out.println("Pago generado");
                    }
                }
            }else if(formaPago.toLowerCase().equals("cheque")){
                System.out.println("Ingrese el número de cheque");
                String cheque=sc.nextLine();
                numeroCheque=cheque;
                if (reservaAPagar.getCliente().getTipoUsuario()=='V'){
                    double subtotal=reservaAPagar.getValorPagar();
                    valorPago=subtotal-(subtotal*FACTORDESCUENTO);
                    System.out.println("Su valor a pagar final es: "+valorPago);
                    System.out.println("¿Desea confirmar su pago?");
                    String confirmacion=sc.nextLine().toLowerCase();
                    if(confirmacion.equals("sí")||confirmacion.equals("si")){                    
                        Pago pago=new Pago(fechaActual,reservaAPagar,valorPago,formaPago,numeroCheque,"12/22");
                        ManejoArchivos.EscribirArchivo("pagos.txt",pago.toString());
                        System.out.println("Pago generado");
                        System.out.println("Debe depositar el cheque en las próximas 24 horas, caso contrario, su pago no será validado ni la reserva considerada");
                    }    
                }else if (reservaAPagar.getCliente().getTipoUsuario()=='C'){
                    double subtotal=reservaAPagar.getValorPagar();
                    valorPago=subtotal;
                    System.out.println("¿Desea confirmar su pago?");
                    String confirmacion=sc.nextLine().toLowerCase();
                    if(confirmacion.equals("sí")||confirmacion.equals("si")){                    
                        Pago pago=new Pago(fechaActual,reservaAPagar,valorPago,formaPago,numeroCheque,"12/22");
                        ManejoArchivos.EscribirArchivo("pagos.txt",pago.toString());
                        System.out.println("Pago generado");
                        System.out.println("Debe depositar el cheque en las próximas 24 horas, caso contrario, su pago no será validado ni la reserva considerada");
                    }
                }
            }
        }
        
    }
}
