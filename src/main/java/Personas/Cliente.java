/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;
import java.util.Scanner;
import java.util.ArrayList;
import com.dacon.proyectopoo.Vehiculo;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import com.dacon.proyectopoo.Reserva;
import Herramientas.ManejoArchivos;
import com.dacon.proyectopoo.Transporte;
import com.dacon.proyectopoo.Paquete;
/**
 *
 * @author User
 */
public class Cliente extends Usuario{
    private int edad;
    private int tarjetaDeCredito;
    private char tipoCliente;
    
//    protected String cedula;
//    protected String nombres;
//    protected String apellidos;
//    protected String user;
//    protected String contraseña;
//    protected int celular;
    public Cliente(String cedula, String nombres, String apellidos, String user, String contraseña, int celular,char tipoCliente){
        super(cedula,nombres,apellidos,user,contraseña,celular);
        this.tipoCliente=tipoCliente;
    }
    public Cliente(String cedula, String nombres, String apellidos, String user, String contraseña, int celular){
        super(cedula,nombres,apellidos,user,contraseña,celular);
        
    }
    public int GetEdad(){
        return this.edad;
    }
    public int GetTarjetaDeCredito(){
        return this.tarjetaDeCredito;
    }
    public char GetTipoCliente(){
        return this.tipoCliente;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public void setTarjetaDeCredito(int tarjetaDeCredito){
        this.tarjetaDeCredito=tarjetaDeCredito;
    }
    public void setTipoCliente(char tipoCliente){
        this.tipoCliente=tipoCliente;
    }
    public void reservarTransporte(String nombreArchivo,ArrayList<Vehiculo> vehiculos){
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
        System.out.println("Ingrese la fecha desde la reserva del vehículo: ");
        String fechaInicio=sc.nextLine();
        System.out.println("Ingrese la fecha hasta la reserva del vehículo: ");
        String fechaFin=sc.nextLine();
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
        long diasReserva=ChronoUnit.DAYS.between(fechaIni,fechaFinal);
        //fin de calcular cuántos días se reserva
        System.out.println("Elija la capacidad del vehículo");
        //El documento decía preguntar tamaño y en este caso se asemeja el atributo capacidad
        int capacidadElegida=sc.nextInt();
        sc.nextLine();
        System.out.println("Estos son los vehículos disponibles:");
        int contador=0;
        ArrayList<Vehiculo> opciones=new ArrayList<Vehiculo>();
        for (Vehiculo vehiculo:vehiculos){
            if(vehiculo.getCapacidad()==capacidadElegida){
                contador+=1;
                System.out.println(contador+". "+vehiculo);
                opciones.add(vehiculo);
            }
        }
        if (opciones.size()>0){
            System.out.println("Elija una opción");
            int op=sc.nextInt();
            while (op<1||op>opciones.size()){
                System.out.println("Elija una opción válida");
                op=sc.nextInt();
            }
            System.out.println("Usted ha elegido un "+opciones.get(op).getMarca()+" "+opciones.get(op).getModelo()+" por "+diasReserva+" días");
            double valorPagar=diasReserva*opciones.get(op).getCostoPorDia();
            System.out.println("El costo a pagar es de "+valorPagar+" dólares");
            System.out.println("¿Desea reservar?");
            String deseaReserva=sc.nextLine().toLowerCase();
            
            if (deseaReserva.equals("si")||deseaReserva.equals("sí")){
                Reserva reservaTransporte=new Reserva(fechaInicio,fechaFin,valorPagar,this,"transporte");
                ManejoArchivos.EscribirArchivo("reservas.txt", "");
                ManejoArchivos.EscribirArchivo("reservas.txt", reservaTransporte.toString());
                String lineaTransporte;
                lineaTransporte=reservaTransporte.getNumeroReserva()+","+opciones.get(op).getId()+","+valorPagar;
                ManejoArchivos.EscribirArchivo("reservasTransporte.txt", "");
                ManejoArchivos.EscribirArchivo("reservasTransporte.txt", lineaTransporte);
                //Falta iniciar el código de reserva en el constructor de Reserva y ver si reserva debe tener un
                //objeto servicio o si servicio debe tener un objeto reserva
                Transporte transporte=new Transporte(ciudad,valorPagar,5.0,4,opciones.get(op));
                transporte.mostrarReserva();
                //Falta crear el constructor de servicio y el transporte
                //public Transporte(String ciudad, double valor, Reserva reserva, double puntuacion, int identificador,Vehiculo vehiculo)
                
            }
        }else{
            System.out.println("No hay vehículos disponibles");
        }
        
    }
    public void reservarEntretenimiento(String nombreArchivo,Cliente cliente){
        
        String simbolo="/***************RESERVACIÓN***************/";
        String simbolo1="/*                                       */";
        String simbolo2="/*****************************************/";
        System.out.println(simbolo);
        System.out.println(simbolo1);
        System.out.println(simbolo2);
        System.out.println("");

         Scanner sc=new Scanner(System.in);
        ArrayList<String[]> paqueteString=new ArrayList();
        paqueteString=Prueba.llenarArreglo("paquetes.txt");
//        System.out.println(paqueteString);
//    System.out.println(paqueteString.get(0)[3]);
        System.out.println("Ingrese la ciudad de reserva: ");
        String ciudad=sc.nextLine();
        int a=1;
        ArrayList<Paquete> paquetes=new ArrayList<Paquete>();
        for(int i=0;i<paqueteString.size();i++){
            if(paqueteString.get(i)[0].equals(ciudad)){
                System.out.println(a+". "+ paqueteString.get(i)[1]);
           Paquete paquete=new Paquete(ciudad,paqueteString.get(i)[1],paqueteString.get(i)[2],Double.parseDouble(paqueteString.get(i)[3]),paqueteString.get(i)[4],paqueteString.get(i)[5]);    
            a++;
            paquetes.add(paquete);
            }
        }
        String reservo="";
        while(reservo!="Si"){
        System.out.println("Eleija una opción para conocer más: ");
        int seleccion =sc.nextInt();
        Paquete packelegido=new Paquete();
        int cantPersonas=0;
        for (Paquete pac:paquetes){
            if(pac==paquetes.get(seleccion-1)){
            System.out.println(pac.getInformacion()); 
            System.out.println("Costo por persona: "+ pac.getCostoP()); 
            System.out.println("Salidas: "+ pac.getDiasSalida()); 
            System.out.println("Fecha para realizar ruta: "+ pac.getFechaDisponible());
            System.out.println("Numero de personas: ");
            cantPersonas=sc.nextInt();
            packelegido= pac;
        
            }
             
        }
        String diaInicio=packelegido.getFechaDisponible().split("-")[0];
        String diaFin=packelegido.getFechaDisponible().split("-")[1];
        System.out.println("¿Desea reservar?: ");
        reservo=sc.nextLine();
        double valorPagar=cantPersonas*packelegido.getCostoP();
        if (reservo.equals("si")||reservo.equals("sí")){
                Reserva reservaEntretenimiento=new Reserva(diaInicio,diaFin,valorPagar,cliente,"Entretenimeinto");
                ManejoArchivos.EscribirArchivo("reservas.txt", reservaEntretenimiento.toString());
                
                   
         }
        }
    }
}
