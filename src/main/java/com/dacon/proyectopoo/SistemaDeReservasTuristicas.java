/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dacon.proyectopoo;
import Enum.Estado;
import Enum.Transmision;
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
    private Usuario cliente;
    Scanner sc=new Scanner(System.in);
    public void mostrarBienvenida(){
        String signo="++++++++++++++++++++++++++++++++++++++++";
        System.out.println(signo);
        System.out.println("");
        System.out.println("        BIENVENIDO AL SISTEMA         ");
        System.out.println("");
        System.out.println(signo);
        System.out.println("");
        ArrayList<String[]> datosUsuarios=Funcion.generarArreglo("usuarios.txt");
        ArrayList<Usuario> usuarios=new ArrayList();
        for (String[] ele:datosUsuarios){
            if (ele[5].equals("A")){
                Usuario usuario=new Administrador(ele[0],ele[1],ele[2],ele[3],ele[4],ele[5],ele[6].charAt(0));
                usuarios.add(usuario);
            }else{
                Usuario usuario=new Cliente(ele[0],ele[1],ele[2],ele[3],ele[4],ele[5],ele[6].charAt(0));
                usuarios.add(usuario);
            }
        }
        this.listaUsuario=usuarios;
        Usuario usuarioCorrecto=null;
        do{
            System.out.println("USUARIO: ");
            String usuarioIngresado=sc.nextLine();
            System.out.println("CONTRASEÑA: ");
            String contrasenaIngresada=sc.nextLine();
            for (Usuario u: this.listaUsuario){
                if (u.GetUser().equals(usuarioIngresado)&&u.GetContraseña().equals(contrasenaIngresada)){
                    usuarioCorrecto=u;
                }
            }
            if(usuarioCorrecto==null){
                System.out.println("Usuario y/o contraseña inválido(s), inténtelo otra vez");
                System.out.println(" ");
            }
        }while(usuarioCorrecto==null);
        this.cliente=usuarioCorrecto;
    }
    public void verificarDatosCliente(){
        Scanner sc=new Scanner(System.in);
        if(this.cliente.getClass()==Cliente.class){
            int edad=0;
            String tarjetaDeCredito;
            ArrayList<String[]> datosClientes=Funcion.generarArreglo("clientes.txt");
            for (String[] ele:datosClientes){
                if (ele[0].equals(this.cliente.GetCedula())){
                    if(ele[1].equals("sd")){
                        do{
                            System.out.println("Ingrese su edad");
                            edad=sc.nextInt();
                            sc.nextLine();
                            if(edad<=0){
                            System.out.println("Ingrese una edad válida");
                            }
                        }while(edad<=0);
                        ((Cliente)this.cliente).setEdad(edad);
                    }else{
                        ((Cliente)this.cliente).setEdad(Integer.valueOf(ele[1]));
                    }
                    if(ele[2].equals("sd")){
                            System.out.println("Ingrese su tarjetaDeCredito");
                            tarjetaDeCredito=sc.nextLine();
                            System.out.println("Ingrese una edad válida");
                        ((Cliente)this.cliente).setTarjetaDeCredito(tarjetaDeCredito);
                    }else{
                        ((Cliente)this.cliente).setTarjetaDeCredito(ele[2]);
                    }
                }
            }
        }
    }
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
        //System.out.println(((Cliente)this.cliente).GetEdad());
        //System.out.println(((Cliente)this.cliente).GetTarjetaDeCredito());
    }
    public void iniciar(){
        String entrada = "";
        do{
            mostrarMenuCliente();
            System.out.print("Ingrese opcion:");
            entrada = sc.nextLine();
            switch(entrada){
                case "1":
                    ((Cliente)this.cliente).reservarHospedaje();
                    break;
                case "2":

                    ((Cliente)this.cliente).reservarTransporte();
                    //llamamos a metodo realizartest()
                    break;
                case "3":
                   ((Cliente)this.cliente).reservarEntretenimiento("paquetes.txt");
                    break;
                case "4":
                    //llamamos a metodo realizartest()
                    break;
                case "5":
                    //llamamos a metodo realizartest()
                    break; 
                case "6":
                    //mostramos mensaje de finalizacion
                    System.out.println("Adios");
                    break;
                default:
                    //la opcion ingreada no esta dentro de las opciones del menu
                    System.out.println("Opcion invalida");
                    break;
                        
            }
        }while(!entrada.equals("6"));
    }
    
    public ArrayList<Usuario> getListaUsuario(){
        return this.listaUsuario;
    }
    public void setListaUsuario(ArrayList<Usuario> listaUsuario){
        this.listaUsuario=listaUsuario;
    }
    public static void main(String[] args){
        SistemaDeReservasTuristicas sistema=new SistemaDeReservasTuristicas();
        sistema.mostrarBienvenida();
        System.out.println(" ");
        sistema.verificarDatosCliente();
        System.out.println();
        sistema.iniciar();
    }
    
}
