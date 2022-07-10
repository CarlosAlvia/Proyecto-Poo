/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;
import Enum.Estado;
import Enum.Transmision;
import Enum.TipoHabitacion;
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
import Herramientas.Funcion;
import com.dacon.proyectopoo.Entretenimiento;
import com.dacon.proyectopoo.Hospedaje;
import com.dacon.proyectopoo.Hotel;
import com.dacon.proyectopoo.Habitacion;
import com.dacon.proyectopoo.Departamento;
import com.dacon.proyectopoo.Pago;
import com.dacon.proyectopoo.Servicio;
/**
 *
 * @author User
 */
public class Cliente extends Usuario{
    private int edad;
    private String tarjetaDeCredito;
    

    public Cliente(String cedula, String nombres, String apellidos, String user, String contraseña, String celular,char tipoCliente){
        super(cedula,nombres,apellidos,user,contraseña,celular,tipoCliente);
        
    }
    public Cliente(String cedula, String nombres, String apellidos, String user, String contraseña, String celular){
        super(cedula,nombres,apellidos,user,contraseña,celular);
        
    }
    public int GetEdad(){
        return this.edad;
    }
    public String GetTarjetaDeCredito(){
        return this.tarjetaDeCredito;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public void setTarjetaDeCredito(String tarjetaDeCredito){
        this.tarjetaDeCredito=tarjetaDeCredito;
    }
 public void reservarHospedaje(){
     Reserva.mostrarCabecera();
     Scanner sc=new Scanner(System.in);
     // Ingreso de los datos de la fecha de entrada y de salida del cliente
     System.out.println("Ingrese la fecha entrada: ");
     String fechaEntrada=sc.nextLine();
     System.out.println("Ingrese la fecha salidad: ");
     String fechaSalida=sc.nextLine();
     // Llamada al método de calcular día que devuelve la cantidad de días que existen entre la fecha de entrada y de salida
     long dias=Funcion.calcularDias(fechaEntrada,fechaSalida);
     // Presentación por consulo de las opciones que tiene el método de reservarHospedaje
     System.out.println("¿Qué tipo de hospedaje busca?");
     System.out.println("1. Hotel");
     System.out.println("2. Departamento");
     System.out.println("Ingrese una opción: ");
     String opsi=sc.nextLine();
     // Implementación de un switch para que dependiendo si el usuario ingresa la opción 1 o 2 muestre el codigo para reservar hotel(1) y departamento(2)
     switch(opsi){
                case "1":
     System.out.println("Ingrese el nombre de la ciudad donde se alojará: ");
     String ciudad=sc.nextLine();
     // Creacion de un ArrayList que contiene arreglos de String para almacenar los datos que se generan al momento de leer el código
     ArrayList<String[]> hotelString=new ArrayList();
     // llenar el arrayList con la función generar arreglo definida en la clase "Funcion"
     hotelString=Funcion.generarArreglo("hoteles.txt");
     int indice=1;
     //creación de una lista de hoteles donde se almacenarán los objetos obteles creados a continuación
     ArrayList<Hotel> hoteles=new ArrayList<Hotel>();
     // for que recorrera el Arraylist de arreglos y el if evaluará si pertenecen a una ciudad para arregarlos al array de hoteles, antes habiendo creado su objeto y se imprime el nombre del hotel que pertenece a la ciudad ingresada por el usuario 
        for(int i=0;i<hotelString.size();i++){
            if(hotelString.get(i)[0].equals(ciudad)){
                System.out.println(indice+". "+ hotelString.get(i)[2]);
                Hotel hotelito=new Hotel(hotelString.get(i)[0],hotelString.get(i)[1],hotelString.get(i)[2],Integer.parseInt (hotelString.get(i)[3]), hotelString.get(i)[4], hotelString.get(i)[5].equals("true"), hotelString.get(i)[5].equals("true"),hotelString.get(i)[6].equals("true"));
            indice++;
            hoteles.add(hotelito);
 
            }
        }
        
     System.out.println("Elija una opción: ");
     int opcion=sc.nextInt();
     sc.nextLine();
     // creacion del objeto hotel que representara cuyo hotel selccionará el usuario
     Hotel hotElegido=new Hotel();
     for (Hotel hote: hoteles){
            if(hote==hoteles.get(opcion-1)){
                // Presentación de los datos del hotel escogido por el usuario previamente
                System.out.println("Datos de "+hote.getNombre());
                System.out.println("/*********************************/");
                System.out.println("Dirección: "+hote.getDireccion()); 
                System.out.println("Costo por noche: 120 ");
                String estrellitas="";
                for(int b=0;b<hote.getNumeroEstrellas();b++){
                    estrellitas=estrellitas+"*";
                }
                System.out.println("Estrellas: "+estrellitas); 
                // Imprimirá "Si" o "No" dependiendo del valor de verdad, es decir si incluye tal servicio
                String desa="";
                if(hote.getDesayuno()){
                    desa="Sí";
                }
                else{
                    desa="No";
                }
                System.out.println("Incluye desayuno: "+desa); 
                String parq="";
                if(hote.getDesayuno()){
                    parq="Sí";
                }
                else{
                    parq="No";
                }
                System.out.println("Incluye parqueo: "+parq);
                String can="";
                if(hote.getDesayuno()){
                    can="Sí";
                }
                else{
                    can="No";
                }
                System.out.println("Permite cancelación gratis: "+can);
                System.out.println("/*********************************/");
                // Se le asigna el objeto hotel al creado previamente
                hotElegido= hote;

            }
             
        }
     // ahora se prosedera a realizar un proceso con las habitaciones primero se crea arraylist de arrys para almacenar los datos genetados por la función que le el archivo.
     ArrayList<String[]> habitacionString=new ArrayList();
     habitacionString=Funcion.generarArreglo("habitaciones.txt");
     ArrayList<Habitacion> habitaciones=new ArrayList<Habitacion>();
     
     //se procede a mostar los tipos de habitaciones y el tipo
       System.out.println("Elija el tipo de habitación que prefiere");
       
       
       System.out.println("1. INDIVIDUAL - 1 persona - 99.00");
       System.out.println("2. DOBLE - 2 personas - 140.00");
       System.out.println("3. FAMILIAR - 4 persona - 350.00");
       // se crear un objeto que representará el tipo de la habitación escogida por el usuario
       Habitacion habiElegida=new Habitacion();
       System.out.println("Elija una opción: ");
       int op=sc.nextInt();
       sc.nextLine();
       // En base a la previa selección el presente swicth tiene el objetivo de asignar una de todas las habitaciones al usuario alteroriamente, basandose en que sus caracterisiticas sean smiliares, y a su vez que esten disponibles
       switch(op){
                case 1:
                   
                
         for(int i=0;i<habitacionString.size();i++){
            if(habitacionString.get(i)[0].equals(hotElegido.getCodigoHotel())&&habitacionString.get(i)[5].equals("DISPONIBLE")&&habitacionString.get(i)[1].equals("INDIVIDUAL")){
                Habitacion habi=new Habitacion(habitacionString.get(i)[0],TipoHabitacion.valueOf(habitacionString.get(i)[1]),Double.valueOf(habitacionString.get(i)[2]),Integer.parseInt (habitacionString.get(i)[3]), Integer.parseInt (habitacionString.get(i)[4]), Estado.valueOf(habitacionString.get(i)[5]));
                habitaciones.add(habi);
                int numero = (int) (Math.random() *habitaciones.size()+ 1);
                System.out.println("Usted ha elegido una habitación "+habitaciones.get(numero-1).getTipoHabitacion()+" para un total de "+dias+ " noche(s).");
                System.out.println("El costo del paquete a pagar es de: "+habitaciones.get(numero-1).getPrecio()*dias);
                habiElegida=habitaciones.get(numero-1);
            }
         }      
                    break;
                case 2:
            for(int i=0;i<habitacionString.size();i++){
                if(habitacionString.get(i)[0].equals(hotElegido.getCodigoHotel())&&habitacionString.get(i)[5].equals("DISPONIBLE")&&habitacionString.get(i)[1].equals("DOBLE")){
                    Habitacion habi=new Habitacion(habitacionString.get(i)[0],TipoHabitacion.valueOf(habitacionString.get(i)[1]),Double.valueOf(habitacionString.get(i)[2]),Integer.parseInt (habitacionString.get(i)[3]), Integer.parseInt (habitacionString.get(i)[4]), Estado.valueOf(habitacionString.get(i)[5]));
                    habitaciones.add(habi);
                    int numero = (int) (Math.random() *habitaciones.size()+ 1);      
                    System.out.println("Usted ha elegido una habitación "+habitaciones.get(numero-1).getTipoHabitacion()+" para un total de "+dias+ " noche(s).");
                    System.out.println("El costo del paquete a pagar es de: "+habitaciones.get(numero-1).getPrecio()*dias);
                    habiElegida=habitaciones.get(numero-1);
                }
              } 
                    break;
                case 3:
            for(int i=0;i<habitacionString.size();i++){
                if(habitacionString.get(i)[0].equals(hotElegido.getCodigoHotel())&&habitacionString.get(i)[5].equals("DISPONIBLE")&&habitacionString.get(i)[1].equals("FAMILIAR")){
                    Habitacion habi=new Habitacion(habitacionString.get(i)[0],TipoHabitacion.valueOf(habitacionString.get(i)[1]),Double.valueOf(habitacionString.get(i)[2]),Integer.parseInt (habitacionString.get(i)[3]), Integer.parseInt (habitacionString.get(i)[4]), Estado.valueOf(habitacionString.get(i)[5]));
                    habitaciones.add(habi);
                    int numero = (int) (Math.random() *habitaciones.size()+ 1);
                    System.out.println("Usted ha elegido una habitación "+habitaciones.get(numero-1).getTipoHabitacion()+" para un total de "+dias+ " noche(s).");
                    System.out.println("El costo del paquete a pagar es de: "+habitaciones.get(numero-1).getPrecio()*dias);
                    habiElegida=habitaciones.get(numero-1);
                     }
                 }    
                    break;
                default:
                    //la opcion ingreada no esta dentro de las opciones del menu
                    System.out.println("Opcion invalida");
                    break;         
            }
           // Se le pregunta al usuario si la habitacion mostrada por pantalla y con la cantidad de noches y el precio es la que desea.
       System.out.println("¿Desea reservar?: ");
        String reservo=sc.nextLine();
        hotElegido.setCiudadH(ciudad);
        // En caso de ser la respuesta afirmativa se pocederá a crear un objeto de tipo hotel, para asginar todas las características escogidas por el usuario
        // A su vez se creará un objeto de tipo reserva y se le aaasginara al objeto de hotel creador previamente
        if (reservo.equals("si")||reservo.equals("sí")){
                Hospedaje pedaje=new Hospedaje(fechaEntrada, fechaSalida,hotElegido,habiElegida.getPrecio()*dias); 
                Reserva reservaHospedaje=new Reserva(fechaEntrada,fechaSalida,habiElegida.getPrecio(),this,"HOSPEDAJE");
                pedaje.setReserva(reservaHospedaje);
                //Se escribe la linea que se desea añadir al archivo de reservas y se la agrega 
                String lineaHotel=reservaHospedaje.getNumeroReserva()+","+reservaHospedaje.getFechaReserva()+","+"hospedaje"+","+this.getNombres()+" "+this.getApellidos()+","+fechaEntrada+","+fechaSalida+","+habiElegida.getPrecio()*dias;
                ManejoArchivos.EscribirArchivo("reservas.txt", lineaHotel);
                 //Se escribe la linea que se desea añadir al archivo de reservasHospedaje y se la agrega 
                String lineaReserva=reservaHospedaje.getNumeroReserva()+","+hotElegido.getCiudadH()+","+hotElegido.getCodigoHotel()+","+habiElegida.getTipoHabitacion()+","+habiElegida.getNumerodeHabitacion()+","+habiElegida.getPrecio()*dias;
                ManejoArchivos.EscribirArchivo("reservasHospedaje.txt", lineaReserva);
                //Se llama al método definido en Hospedaje para mostar la reserva por pantalla
                pedaje.mostrarReserva();
        }
        break;
                case "2":
              System.out.println("Ingrese el nombre de la ciudad donde se alojará: ");
              String ciudadDepa=sc.nextLine(); 
                 ArrayList<String[]> depaString=new ArrayList();
                depaString=Funcion.generarArreglo("departamento.txt");
                 int indiceDepa=1;
                ArrayList<Departamento> departamentos=new ArrayList<Departamento>();
     
        for(int i=0;i<depaString.size();i++){
            if(depaString.get(i)[0].equals(ciudadDepa)){
                System.out.println(indiceDepa+". "+ depaString.get(i)[1]);
               // (String ciudadDepa, String nombreDepa, double costoDepa, Estado estadoDepa, int numeroHabitaciones, boolean wifi, boolean piscina
                Departamento departamentito=new Departamento(depaString.get(i)[0],depaString.get(i)[1],Double.valueOf(depaString.get(i)[2]),Integer.valueOf(depaString.get(i)[3]), Estado.valueOf(depaString.get(i)[4]), depaString.get(i)[5].equals("true"),depaString.get(i)[6].equals("true"));
                indiceDepa++;
               departamentos.add(departamentito);
            }
        }
//        System.out.println(departamentos);
        Departamento depaElegido=new Departamento();
        System.out.println("Elija una opción: ");
        int opcionDepa=sc.nextInt();
        sc.nextLine();
        
        for (Departamento depa:departamentos){
            if(depa==departamentos.get(opcionDepa-1)){
                depaElegido=depa;
                System.out.println("Datos de "+depa.getNombreDepa());
                System.out.println("/*********************************/");
                System.out.println("Costo: "+depa.getCostoDepa()); 
                System.out.println("Número de habitaciones: "+depa.getNumeroHabitaciones());
                if(depa.getWifi()){
                   System.out.println("Wifi: Sí"); 
                   }
                else{
                    System.out.println("Wifi: No");   
                    }
                if(depa.getPiscina()){
                   System.out.println("Piscina: Sí"); 
                   }
                else{
                    System.out.println("Piscina: No");   
                    }  
            }
            }
            System.out.println("¿Desea reservar?");
            String reservoDepa=sc.nextLine();
            depaElegido.setCiudadDepa(ciudadDepa);
            depaElegido.setCostoDepa(depaElegido.getCostoDepa()*dias);
//        
        if (reservoDepa.equals("si")||reservoDepa.equals("sí")){
                Hospedaje dapaje=new Hospedaje(fechaEntrada, fechaSalida,depaElegido,depaElegido.getCostoDepa()); 
                Reserva reservaHospedajeDepa=new Reserva(fechaEntrada,fechaSalida,depaElegido.getCostoDepa(),this,"HOSPEDAJE");
                dapaje.setReserva(reservaHospedajeDepa);
                //ojo tipo sevicio
                String lineaDepa=reservaHospedajeDepa.getNumeroReserva()+","+reservaHospedajeDepa.getFechaReserva()+","+"hospedaje"+","+this.getNombres()+" "+this.getApellidos()+","+fechaEntrada+","+fechaSalida+","+depaElegido.getNumeroHabitaciones()+","+depaElegido.getCostoDepa();
                ManejoArchivos.EscribirArchivo("reservas.txt", lineaDepa);
                String lineaReservaDepa=reservaHospedajeDepa.getNumeroReserva()+","+depaElegido.getCiudadDepa()+","+depaElegido.getNombreDepa()+","+"ED"+","+depaElegido.getNumeroHabitaciones()+","+depaElegido.getCostoDepa();
                ManejoArchivos.EscribirArchivo("reservasHospedaje.txt", lineaReservaDepa);
                dapaje.mostrarReservaDe();
            }
        
                  
        break;
                default:
                    //la opcion ingreada no esta dentro de las opciones del menu
                    System.out.println("Opcion invalida");
             
                    break;
                        
            }
//         }
    }
    
    
    
    
    public void reservarTransporte(){
        // Se crea y llena una lista de vehículos mediante los datos de los vehículos leyendo su archivo correspondiente
        // y creando los objetos
        ArrayList<String[]> datosVehiculos=new ArrayList();
        ArrayList<Vehiculo> vehiculos=new ArrayList();
        datosVehiculos=Funcion.generarArreglo("vehiculos.txt");
        for (String[] ele:datosVehiculos){
            Vehiculo vehiculo=new Vehiculo(ele[0],ele[1],ele[2],ele[3],ele[4],Integer.valueOf(ele[5]),Estado.valueOf(ele[6]),Double.valueOf(ele[7]),Transmision.valueOf(ele[8]));
            vehiculos.add(vehiculo);
        }
        // Se crea un scanner, se muestra la cabecera de reserva y se piden los datos necesarios
        Scanner sc=new Scanner(System.in);
        Reserva.mostrarCabecera();
        System.out.println("Ingrese la ciudad de reserva: ");
        String ciudad=sc.nextLine();
        //La función calcularDias pide las fechas de inicio y fin de la reserva 
        // y devuelve una lista que en el indíce 0 tiene la cantidad de días que se calcularon,
        // la fecha de inicio de la reserva en el índice 1 y la fecha de fin de la reserva en el índice 2
        ArrayList datos=Funcion.calcularDias();
        long diasReserva=(Long)datos.get(0);
        String fechaInicio=(String)datos.get(1);
        String fechaFin=(String)datos.get(2);
        System.out.println("Elija la capacidad del vehículo");
        int capacidadElegida=sc.nextInt();
        sc.nextLine();
        // Se muestran los vehículos disponibles, para esto se crear una lista que
        // se llena con los vehículos que estén disponibles y cumplan con la capacidad solicitada
        // además, se muestran en pantalla sus elemento con ayuda del for 
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
        // Se verifica que la lista de opciones no esté vacía para solicitar una opción que sea válida
        // Si la lista de opciones está vacía el código pasa a ejecutar el bloque del else que dice:
        // "No hay vehículos disponibles"
        if (!opciones.isEmpty()){
            System.out.println("Elija una opción");
            int op=sc.nextInt();
            while (op<1||op>opciones.size()){
                System.out.println("Elija una opción válida");
                op=sc.nextInt();
            }
            sc.nextLine();
            // Se llama al vehículo seleccionado con el .get(op-1) porque la opción que señala el cliente
            // es paralela al índice que tiene el vehículo en la lista solo que aumentado en 1
            System.out.println("Usted ha elegido un "+opciones.get(op-1).getMarca()+" "+opciones.get(op-1).getModelo()+" por "+diasReserva+" días");
            //Se calcula el valor a pagar multiplicando los días de reserva por el costo del día
            double valorPagar=diasReserva*opciones.get(op-1).getCostoPorDia();
            System.out.println("El costo a pagar es de "+valorPagar+" dólares");
            // Se le pregunta al cliente si desea reservar y se aplica el toLowerCase 
            // a la respuesta para que se evalúen menos condiciones en el if
            System.out.println("¿Desea reservar?");
            String deseaReserva=sc.nextLine().toLowerCase();
            if (deseaReserva.equals("si")||deseaReserva.equals("sí")){
                //Se crea el objeto transporte y el objeto reserva
                Transporte transporte=new Transporte(ciudad,valorPagar,opciones.get(op-1));
                Reserva reservaTransporte=new Reserva(fechaInicio,fechaFin,valorPagar,this,"transporte");
                //Se le asigna la reserva al transporte con el método set
                transporte.setReserva(reservaTransporte);
                //Se escribe el archivo reservas y rservasTransporte, el toString() de reservas y de Transporte devuelven la línea
                //que sigue el formato de la cabecera del archivo correspondiente
                ManejoArchivos.EscribirArchivo("reservas.txt", reservaTransporte.toString());
                ManejoArchivos.EscribirArchivo("reservasTransporte.txt", transporte.toString());
                transporte.mostrarReserva();
            }
        }else{
            System.out.println("No hay vehículos disponibles");
        }
    }
    public void reservarEntretenimiento(){
        
         Reserva.mostrarCabecera();
         Scanner sc=new Scanner(System.in);
        ArrayList<String[]> paqueteString=new ArrayList();
        paqueteString=Funcion.generarArreglo("paquetes.txt");
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
        if(!(reservo.equals("Si"))){
        System.out.println("Elija una opción para conocer más: ");
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
                sc.nextLine();
                packelegido= pac;
                
        
            }
             
        }
 
        packelegido.setNumeroPersonas(cantPersonas);
        packelegido.setCiudadPa(ciudad);
//        System.out.println(packelegido.getCostoP());
//        System.out.println(packelegido.getNumeroPersonas());
        String diaInicio=packelegido.getFechaDisponible().split("-")[0];
        String diaFin=packelegido.getFechaDisponible().split("-")[1];
        System.out.println("¿Desea reservar?: ");
        reservo=sc.nextLine();
        double valorPagar=packelegido.getNumeroPersonas()*packelegido.getCostoP();
        packelegido.setCostoP(valorPagar);
        if (reservo.equals("si")||reservo.equals("sí")){
            
                Entretenimiento elegido=new Entretenimiento(packelegido, ciudad, valorPagar, 2.5, 46564); 
                Reserva reservaEntretenimiento=new Reserva(diaInicio,diaFin,valorPagar,this,"ENTRENEMIENTO");
                //ojo tipo sevicio
                elegido.setReserva(reservaEntretenimiento);
                ManejoArchivos.EscribirArchivo("reservas.txt", reservaEntretenimiento.toString());
                
                String linea=reservaEntretenimiento.getNumeroReserva()+","+packelegido.getCiudadPa()+","+packelegido.getNombrePaquete()+","+packelegido.getNumeroPersonas()+","+packelegido.getCostoP();
                ManejoArchivos.EscribirArchivo("reservasEntretenimiento.txt", linea);
                elegido.mostrarReserva();
                   
         }
        }
    }
    public void mostarReserva(){
        
    }
    public void pagarReserva(){
        String[] arrFechaActual= LocalDate.now().toString().split("-");
        String fechaActual=arrFechaActual[2]+"/"+arrFechaActual[1]+"/"+arrFechaActual[0];
        Reserva reservaAPagar = null;
        Scanner sc=new Scanner(System.in);
        String tarjetaCredito="";
        String caducidadTarjeta="";
        String numeroCheque="";
        boolean probarOtraVez=true;
        do{
            System.out.println("Ingrese el código de la reserva");
            String codigoReserva=sc.nextLine();
            ArrayList<String[]> datosReservas=Funcion.generarArreglo("reservas.txt");
            for (String[] datos:datosReservas){
                String[] nombreApellido=datos[3].split(" ");
                if(datos[0].equals(codigoReserva)&&nombreApellido[0].equals(this.nombres)&&nombreApellido[1].equals(this.apellidos)){
                  //String numeroReserva, String fechaReserva, String tipoReserva, Cliente cliente, String desde, String hasta, double valorPagar
                    Reserva reserva=new Reserva(datos[0],datos[1],datos[2],this,datos[4],datos[5],Double.valueOf(datos[6]));
                    reservaAPagar=reserva;
                }
            }
            if(reservaAPagar==null){
                System.out.println("Número de reserva inválido");
                System.out.println("¿Desea probar con otro número de reserva?");
                String respuesta=sc.nextLine();
                if(!(respuesta.toLowerCase().equals("si")||respuesta.toLowerCase().equals("sí"))){
                    probarOtraVez=false;
                }
            }
        }while(reservaAPagar==null&&probarOtraVez);
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
            boolean repetirTarjeta;
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
                repetirTarjeta=(anoTarjeta<anoActual)||(anoTarjeta==anoActual&&mesTarjeta<mesActual);
                if(repetirTarjeta){
                    System.out.println("Tarjeta inválida");
                }else{
                    tarjetaCredito=tarjeta;
                    caducidadTarjeta=caducidad;
                }
                }while(repetirTarjeta);
                this.pagar(tarjetaCredito,caducidadTarjeta,reservaAPagar,fechaActual);
            }else if(formaPago.toLowerCase().equals("cheque")){
                System.out.println("Ingrese el número de cheque");
                String cheque=sc.nextLine();
                numeroCheque=cheque;
                this.pagar(numeroCheque,reservaAPagar,fechaActual);
            }
        }
        
    }
    public void pagar(String tarjetaDeCredito,String mesAnoCaducidad,Reserva reservaAPagar,String fechaActual){
        double valorPago;
        final double FACTORDESCUENTO=0.15;
        final double RECARGOTARJETA=0.10;
        Scanner sc=new Scanner(System.in);
                if (this.getTipoUsuario()=='V'){
                    double subtotal=reservaAPagar.getValorPagar();
                    valorPago=subtotal-(subtotal*FACTORDESCUENTO)+(subtotal*RECARGOTARJETA);
                    System.out.println("Su valor a pagar final es: "+valorPago);
                    System.out.println("¿Desea confirmar su pago?");
                    String confirmacion=sc.nextLine().toLowerCase();
                    if(confirmacion.equals("sí")||confirmacion.equals("si")){                    
                        Pago pago=new Pago(fechaActual,reservaAPagar,valorPago,"Tarjeta",tarjetaDeCredito,mesAnoCaducidad);
                        ManejoArchivos.EscribirArchivo("pagos.txt",pago.toString());
                        System.out.println("Pago generado");
                    }    
                }else if (this.getTipoUsuario()=='C'){
                    double subtotal=reservaAPagar.getValorPagar();
                    valorPago=subtotal+(subtotal*RECARGOTARJETA);
                    System.out.println("Su valor a pagar final es: "+valorPago);
                    System.out.println("¿Desea confirmar su pago?");
                    String confirmacion=sc.nextLine().toLowerCase();
                    if(confirmacion.equals("sí")||confirmacion.equals("si")){                    
                        Pago pago=new Pago(fechaActual,reservaAPagar,valorPago,"Tarjeta",tarjetaDeCredito,mesAnoCaducidad);
                        ManejoArchivos.EscribirArchivo("pagos.txt",pago.toString());
                        System.out.println("Pago generado");
                    }
                }
    }
    public void pagar(String cheque,Reserva reservaAPagar,String fechaActual){
        double valorPago;
        final double FACTORDESCUENTO=0.15;
        Scanner sc=new Scanner(System.in);
                if (this.getTipoUsuario()=='V'){
                    double subtotal=reservaAPagar.getValorPagar();
                    valorPago=subtotal-(subtotal*FACTORDESCUENTO);
                    System.out.println("Su valor a pagar final es: "+valorPago);
                    System.out.println("¿Desea confirmar su pago?");
                    String confirmacion=sc.nextLine().toLowerCase();
                    if(confirmacion.equals("sí")||confirmacion.equals("si")){                    
                        Pago pago=new Pago(fechaActual,reservaAPagar,valorPago,"Cheque",cheque,"12/22");
                        ManejoArchivos.EscribirArchivo("pagos.txt",pago.toString());
                        System.out.println("Pago generado");
                        System.out.println("Debe depositar el cheque en las próximas 24 horas, caso contrario, su pago no será validado ni la reserva considerada");
                    }    
                }else if (this.getTipoUsuario()=='C'){
                    double subtotal=reservaAPagar.getValorPagar();
                    valorPago=subtotal;
                    System.out.println("Su valor a pagar final es: "+valorPago);
                    System.out.println("¿Desea confirmar su pago?");
                    String confirmacion=sc.nextLine().toLowerCase();
                    if(confirmacion.equals("sí")||confirmacion.equals("si")){                    
                        Pago pago=new Pago(fechaActual,reservaAPagar,valorPago,"Cheque",cheque,"12/22");
                        ManejoArchivos.EscribirArchivo("pagos.txt",pago.toString());
                        System.out.println("Pago generado");
                        System.out.println("Debe depositar el cheque en las próximas 24 horas, caso contrario, su pago no será validado ni la reserva considerada");
                    }
                }
    }
    @Override
    public void consultarReservas(){
    //Se imprime la cabecera
    String simbolo="/***********SERVICIOS RESERVADOS**********/";
    String simbolo1="/*                                       */";
    String simbolo2="/*****************************************/";
    System.out.println(simbolo);
    System.out.println(simbolo1);
    System.out.println(simbolo2);
    System.out.println("\n"); 
    //Creación de la lista de servicios y lectura de los archivos de reservas
    ArrayList<Servicio> servicios=new ArrayList<>();
    ArrayList<String[]> reservasHospedaje=Funcion.generarArreglo("reservasHospedaje.txt");
    ArrayList<String[]> reservasTransporte=Funcion.generarArreglo("reservasTransporte.txt");
    ArrayList<String[]> reservasEntretenimiento=Funcion.generarArreglo("reservasEntretenimiento.txt");
    ArrayList<String[]> datosReservas=Funcion.generarArreglo("reservas.txt");
    //Se crea la lista con todas las reservas que le corresponden al cliente que ejecuta el método
    ArrayList<Reserva> reservasCliente=new ArrayList<>();
        if (!(datosReservas.isEmpty())){
            for (String[] datos:datosReservas){
                //verificación de la correspondencia y llenado de la lista
               String[] nombreApellido=datos[3].split(" ");
               if(nombreApellido[0].equals(this.nombres)&&nombreApellido[1].equals(this.apellidos)){
                   Reserva reservaCliente=new Reserva(datos[0],datos[1],datos[2],this,datos[4],datos[5],Double.valueOf(datos[6]));
                   reservasCliente.add(reservaCliente);
               }
            }
        }
        //Se verifica que haya información de hospedaje por trabajar
        if (!(reservasHospedaje.isEmpty())){
            for (String[] datosHospedaje:reservasHospedaje){
                for (Reserva reserva:reservasCliente){
                    //Se verifica que la línea del archivo reservasHospedaje corresponda a la reserva 
                    if(datosHospedaje[0].equals(reserva.getNumeroReserva())){
                        //Se ve que el hospedaje no sea un hotel("ED" significa: es departamento)
                        if(!datosHospedaje[3].equals("ED")){
                            //Se crea una lista con la información de los hoteles
                            ArrayList<String[]> datosHoteles;
                            datosHoteles=Funcion.generarArreglo("hoteles.txt");
                            for (String[] hotel:datosHoteles){
                                //Se ve
                                if(datosHospedaje[2].equals(hotel[1])){
                                    ArrayList<String[]> datosHabitaciones;
                                    datosHabitaciones=Funcion.generarArreglo("habitaciones.txt");
                                    for (String[] room:datosHabitaciones){
                                        if(hotel[1].equals(room[0])&&datosHospedaje[4].equals(room[4])){
                                            Habitacion habitacionReservada=new Habitacion(room[0],TipoHabitacion.valueOf(room[1]),Double.valueOf(room[2]),Integer.valueOf(room[3]),Integer.valueOf(room[4]),Estado.valueOf(room[5]));
                                            Hotel hotelReserva=new Hotel(hotel[0],hotel[1],hotel[2],Integer.valueOf(hotel[3]),hotel[4],Boolean.valueOf(hotel[5]),Boolean.valueOf(hotel[6]),Boolean.valueOf(hotel[7]));
                                            hotelReserva.setHabitacion(habitacionReservada);
                                            Hospedaje hospedajeReservado=new Hospedaje(datosHospedaje[1],Double.valueOf(datosHospedaje[4]),hotelReserva);
                                            hospedajeReservado.setReserva(reserva);
                                            servicios.add(hospedajeReservado);
                                        }
                                    }
                                }
                            }
                        }else{
                            ArrayList<String[]> datosDepartamentos;
                            datosDepartamentos=Funcion.generarArreglo("departamento.txt");
                            for (String[] departamento:datosDepartamentos){
                                if(datosHospedaje[2].equals(departamento[1])){
                                    Departamento departamentoReservado=new Departamento(departamento[0],departamento[1],Double.valueOf(departamento[2]),Integer.valueOf(departamento[3]),Estado.valueOf(departamento[4]),Boolean.valueOf(departamento[5]),Boolean.valueOf(departamento[6]));
                                    Hospedaje hospedajeReservado=new Hospedaje(datosHospedaje[1],Double.valueOf(datosHospedaje[4]),departamentoReservado);
                                    hospedajeReservado.setReserva(reserva);
                                    servicios.add(hospedajeReservado);
                                }
                            }
                        }
                    }
                }
            }
        
        }
        if (!(reservasTransporte.isEmpty())){
            for (String[] datosTransporte:reservasTransporte){
                for (Reserva reserva:reservasCliente){
                    if(datosTransporte[0].equals(reserva.getNumeroReserva())){
                        ArrayList<String[]> datosVehiculos;
                        datosVehiculos=Funcion.generarArreglo("vehiculos.txt");
                        for (String[] ele:datosVehiculos){
                            if(ele[0].equals(datosTransporte[2])){
                                Vehiculo vehiculoReservado=new Vehiculo(ele[0],ele[1],ele[2],ele[3],ele[4],Integer.valueOf(ele[5]),Estado.valueOf(ele[6]),Double.valueOf(ele[7]),Transmision.valueOf(ele[8]));
                                Transporte transporte=new Transporte(datosTransporte[1],Double.valueOf(datosTransporte[2]),vehiculoReservado);
                                transporte.setReserva(reserva);
                                servicios.add(transporte);
                            }
                        }
                    }
                }
            }
        }
        if (!(reservasEntretenimiento.isEmpty())){
            for (String[] datosEntretenimiento:reservasEntretenimiento){
                for (Reserva reserva:reservasCliente){
                    if(datosEntretenimiento[0].equals(reserva.getNumeroReserva())){
                        ArrayList<String[]> datosPaquetes;
                        datosPaquetes=Funcion.generarArreglo("paquetes.txt");
                        for (String[] ele:datosPaquetes){
                            if(ele[1].equals(datosEntretenimiento[2])){
                                Paquete paqueteReservado=new Paquete(ele[0],ele[1],ele[2],Double.valueOf(ele[3]),ele[4],ele[5]);
                                Entretenimiento entretenimiento=new Entretenimiento(paqueteReservado,datosEntretenimiento[1],Double.valueOf(datosEntretenimiento[3]));
                                entretenimiento.setReserva(reserva);
                                servicios.add(entretenimiento);
                            }
                        }
                    }
                }
            }
        }
        for (Servicio servicio:servicios){
            if(servicio.getClass()!=null&&servicio.getClass()==Transporte.class){
                Transporte transporte=(Transporte)servicio;
                System.out.println("Servicio: " +transporte.getReserva().getTipoReserva());
                System.out.println("Vehículo: " +transporte.getVehiculo().toString());
                System.out.println("Fecha reserva: " +transporte.getReserva().getFechaReserva());
                System.out.println("Desde: " +transporte.getReserva().getDesde());
                System.out.println("Hasta: " +transporte.getReserva().getHasta());
                System.out.println("Pago: " +transporte.getReserva().getValorPagar());
                System.out.println("\n");
            }else if(servicio.getClass()!=null&&servicio.getClass()==Entretenimiento.class){
                Entretenimiento entretenimiento=(Entretenimiento)servicio;
                System.out.println("Servicio: " +entretenimiento.getReserva().getTipoReserva());
                System.out.println("Paquete: " +entretenimiento.getPaquete().getNombrePaquete());
                System.out.println("Fecha reserva: " +entretenimiento.getReserva().getFechaReserva());
                System.out.println("Desde: " +entretenimiento.getReserva().getDesde());
                System.out.println("Hasta: " +entretenimiento.getReserva().getHasta());
                //System.out.println("Cantidad de personas: " +entretenimiento.getCantidadPersonas());
                System.out.println("Pago: " +entretenimiento.getReserva().getValorPagar());
            }else if(servicio.getClass()!=null&&servicio.getClass()==Hospedaje.class){
                Hospedaje hospedaje=(Hospedaje) servicio;
                if(hospedaje.getHotel()!=null){
                    System.out.println("Servicio: " +hospedaje.getReserva().getTipoReserva());
                    System.out.println("Hotel: " +hospedaje.getHotel().getNombre());
                    System.out.println("Fecha reserva: " +hospedaje.getReserva().getFechaReserva());
                    System.out.println("Desde: " +hospedaje.getReserva().getDesde());
                    System.out.println("Hasta: " +hospedaje.getReserva().getHasta());
                    System.out.println("Habitacion: " +hospedaje.getHotel().getHabitacion().getNumerodeHabitacion());
                    System.out.println("Pago: " +hospedaje.getReserva().getValorPagar());
                    System.out.println("\n");
                }else if(hospedaje.getDepartamento()!=null){
                    System.out.println("Servicio: " +hospedaje.getReserva().getTipoReserva());
                    System.out.println("Departamento: " +hospedaje.getDepartamento().getNombreDepa());
                    System.out.println("Fecha reserva: " +hospedaje.getReserva().getFechaReserva());
                    System.out.println("Desde: " +hospedaje.getReserva().getDesde());
                    System.out.println("Hasta: " +hospedaje.getReserva().getHasta());
                    System.out.println("Número de habitaciones: " +hospedaje.getDepartamento().getNumeroHabitaciones());
                    System.out.println("Pago: " +hospedaje.getReserva().getValorPagar());
                    System.out.println("\n");
                }
            }
        }
    }
        
 }  

