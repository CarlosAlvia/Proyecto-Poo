/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dacon.proyectopoo;
import java.util.ArrayList;
import Personas.Usuario;
import java.util.Scanner;
import Herramientas.Funcion;
import Personas.Cliente;
import Personas.Administrador;
/**
 *
 * @author CJAA
 */
public class SistemaDeReservasTuristicas {
    private ArrayList<Usuario> listaUsuario;
    private Usuario usuarioConectado;
    Scanner sc=new Scanner(System.in);
    /**
     * Este método le muestra la bienvenida al sistema al usuario
     * Muestra por pantalla la bienvenida con un formato
     */
    public void mostrarBienvenida(){
        String signo="++++++++++++++++++++++++++++++++++++++++";
        System.out.println(signo);
        System.out.println("");
        System.out.println("        BIENVENIDO AL SISTEMA         ");
        System.out.println("");
        System.out.println(signo);
        System.out.println("");
    }
    /**
     * Este método permite al cliente ingresar al sistema con su usuario y contraseña
     * Si son validos, este método llevara al usuario a su respectivo menú     
     */
    public void ingresar(){
        //Se lee el archivo de usuarios para conseguir los datos
        ArrayList<String[]> datosUsuarios=Funcion.generarArreglo("usuarios.txt");
        //Se crea una lista de usarios y se crean los respectivos usuarios, sean clientes o administradores
        //Para ello se verifica que si el tipo de usuario es "A" significa que es administrador, caso contrario es cliente
        //Se agregan los usuarios a la lista
        ArrayList<Usuario> usuarios=new ArrayList();
        for (String[] ele:datosUsuarios){
            if (ele[6].equals("A")){
                Usuario usuario=new Administrador(ele[0],ele[1],ele[2],ele[3],ele[4],ele[5],ele[6].charAt(0));
                usuarios.add(usuario);
            }else{
                Usuario usuario=new Cliente(ele[0],ele[1],ele[2],ele[3],ele[4],ele[5],ele[6].charAt(0));
                usuarios.add(usuario);
            }
        }
        //Se asigna la lista al sistema
        this.listaUsuario=usuarios;
        Usuario usuarioCorrecto=null;
        do{
            //Se solicita el usuario y contraseña
            System.out.println("USUARIO: ");
            String usuarioIngresado=sc.nextLine();
            System.out.println("CONTRASEÑA: ");
            String contrasenaIngresada=sc.nextLine();
            //Se recorre la lista de usuarios para verificar si existe alguno que coincida con los datos ingresados
            //si es el caso, se asigna ese usuario
            for (Usuario u: this.listaUsuario){
                if (u.getUser().equals(usuarioIngresado)&&u.getContraseña().equals(contrasenaIngresada)){
                    usuarioCorrecto=u;
                }
            }
            //Si al terminarse la ejecución del lazo no se asignó un usuario, se solicitan otros datos
            if(usuarioCorrecto==null){
                System.out.println("Usuario y/o contraseña inválido(s), inténtelo otra vez");
                System.out.println(" ");
            }
        }while(usuarioCorrecto==null);
        this.usuarioConectado=usuarioCorrecto;
    }
    /**
     * Este método verifica si el usuario y contraseña son correctos
     * caso contario le pedirá que los digte denuevo   
     */
    public void verificarDatosCliente(){
        Scanner sc=new Scanner(System.in);
        //Se verifica que el usuario se de clase Cliente
        if(this.usuarioConectado.getClass()==Cliente.class){
            int edad=0;
            String tarjetaDeCredito;
            //Se leen los datos del archivo clientes
            ArrayList<String[]> datosClientes=Funcion.generarArreglo("clientes.txt");
            //Se recorre la información de clientes
            for (String[] ele:datosClientes){
                //Se busca la información que le corresponde al usuario ingresado en el sistema
                //por su cédula
                if (ele[0].equals(this.usuarioConectado.getCedula())){
                    //Se verifica que tenga dato de edad
                    if(ele[1].equals("sd")){
                        do{
                            //En caso de no tenerlo, se solicita la edad
                            System.out.println("Ingrese su edad");
                            edad=sc.nextInt();
                            sc.nextLine();
                            //Si la edad es inválida se muestra un mensaje y se vuelve a 
                            //ejecutar la solicitud de una edad válida
                            if(edad<=0){
                                System.out.println("Ingrese una edad válida");
                            }else{
                                ((Cliente)this.usuarioConectado).setEdad(edad);
                            }
                        }while(edad<=0);
                    //Si la edad sí estaba en los datos, se la define con el método setEdad
                    }else{
                        ((Cliente)this.usuarioConectado).setEdad(Integer.valueOf(ele[1]));
                    }
                    //Se verifica que tenga el dato tarjetaDeCredito 
                    //En el documento de clientes se usa sd que significa: sin datos
                    if(ele[2].equals("sd")){
                            //Se solicita la tarjeta de crédito
                            System.out.println("Ingrese su tarjetaDeCredito");
                            tarjetaDeCredito=sc.nextLine();
                        ((Cliente)this.usuarioConectado).setTarjetaDeCredito(tarjetaDeCredito);
                    }else{
                        //Si el dato estaba en el documento, se lo define con el método SetTarjetaDeCredito
                        ((Cliente)this.usuarioConectado).setTarjetaDeCredito(ele[2]);
                    }
                }
            }
        }
    }
    /**
     * Este método muestra al usuario de tipo administrado su 
     * correspondiente menú
     */
    public void mostarMenuAdmin(){
        String simbolo="/************MENU ADMINISTRADOR************/";
        String simbolo1="/*                                       */";
        String simbolo2="/*****************************************/";
        System.out.println(simbolo);
        System.out.println(simbolo1);
        System.out.println(simbolo2);
        System.out.println("");
        System.out.println("1. Consultar Reservas");
        System.out.println("2. Salir");
        System.out.println("\n");
    }
    /**
     * Este método muestra al usuario de tipo cliente su 
     * correspondiente menú
     */
    public void mostrarMenuCliente(){
        String abajo="++++++++++++++++++++++++++++++++++++++++";
        String arriba="+++++++++++++++++menu+++++++++++++++++";
        String medio="+                                     +";
        System.out.println(arriba);
        System.out.println(medio);
        System.out.println(abajo);
        System.out.println("1. Reservar Hospedaje");
        System.out.println("2. Reservar Transporte");
        System.out.println("3. Reservar Entretenimiento");
        System.out.println("4. Pagar Reserva");
        System.out.println("5. Consultar Reserva");
        System.out.println("6. Salir");
        System.out.println("\n");
    }
    /**
     * Este método se caracteriza por poseer más métodos que son realizados 
     * en base a la decisión del usuario de tipo cliente
     * En el caso 6 este método hará al cliente salir del sistema
     */
    public void iniciar(){
        String entrada = "";
        do{
            //Se muestra el menú al cliente
            mostrarMenuCliente();
            //Se le solicita una opción
            System.out.print("Ingrese opcion:");
            entrada = sc.nextLine();
            switch(entrada){
                //Se verifica si la opción es válida y qué acción debe cumplirse
                case "1":
                    ((Cliente)this.usuarioConectado).reservarHospedaje();
                    break;
                case "2":

                    ((Cliente)this.usuarioConectado).reservarTransporte();
                    //llamamos a metodo realizartest()
                    break;
                case "3":
                   ((Cliente)this.usuarioConectado).reservarEntretenimiento();
                    break;
                case "4":
                    ((Cliente)this.usuarioConectado).pagarReserva();
                    break;
                case "5":
                    this.usuarioConectado.consultarReservas();
                    break; 
                case "6":
                    //se muestra el mensaje de despedida
                    System.out.println("Adiós");
                    break;
                default:
                    //la opcion ingresada no está dentro de las opciones del menu
                    System.out.println("Opcion invalida");
                    break;
                        
            }
        //Se verifica si el usuario seleccionó la opción de salida, caso contrario,se
        //muestra el menú otra vez
        }while(!entrada.equals("6"));
    }
    /**
     * Este método se caracteriza por poseer más métodos que son realizados 
     * en base a la decisión del usuario de tipo administrador
     * En el caso 2 este método hará al administrador salir del sistema
     */
    public void iniciarAdmin(){
        String entrada = "";
        do{
            //Se muestra el menú
            mostarMenuAdmin();
            //Se solicita una opción
            System.out.print("Ingrese opcion:");
            entrada = sc.nextLine();
            //Se verifica su validez y qué debe ejecutarse
            switch(entrada){
                case "1":
                    Administrador admin=(Administrador)this.usuarioConectado;
                    admin.consultarReservas();
                    break;
                case "2":
                        System.out.println("Adios");
                    break;
                default:
                    //la opción ingreada no esta dentro de las opciones del menu
                    System.out.println("Opcion invalida");
                    break;
                        
            }
        //Se verifica si el usuario seleccionó la opción de salida, caso contrario, se muestra el menú
        //otra vez
        }while(!entrada.equals("2"));
    }
    
    public ArrayList<Usuario> getListaUsuario(){
        return this.listaUsuario;
    }
    public void setListaUsuario(ArrayList<Usuario> listaUsuario){
        this.listaUsuario=listaUsuario;
    }
    /**
     * Es el método principal del progrma, se realizán todos los
     * métodos en base a la selección del usuario sea de tipo
     * administrador o cliente
     */
    
    public static void main(String[] args){
        //Se instancia el sistema y se ejecutan los métodos respectivos
        SistemaDeReservasTuristicas sistema=new SistemaDeReservasTuristicas();
        sistema.mostrarBienvenida();
        sistema.ingresar();
        System.out.println(" ");
        //Se verifica si el uuario es administrador o cliente para saber qué 
        //inicio se debe usar
        if (String.valueOf(sistema.usuarioConectado.getTipoUsuario()).equals("A")){
            sistema.iniciarAdmin();
            }
        else{
            //Antes de mostrarle el menú al cliente, se verifica si tiene datos por llenar
            sistema.verificarDatosCliente();
            sistema.iniciar();
        }
    }
    
}
