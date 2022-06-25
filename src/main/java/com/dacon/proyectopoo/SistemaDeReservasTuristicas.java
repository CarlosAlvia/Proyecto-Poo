/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dacon.proyectopoo;
import java.util.ArrayList;
import Personas.Usuario;
import java.util.Scanner;
/**
 *
 * @author CJAA
 */
public class SistemaDeReservasTuristicas {
    private ArrayList<Usuario> listaUsuario;
    Scanner sc=new Scanner(System.in);
    public void ingresar(){
        String signo="++++++++++++++++++++++++++++++++++++++++";
        System.out.println(signo);
        System.out.println("");
        System.out.println("        BIENVENIDO AL SISTEMA         ");
        System.out.println("");
        System.out.println(signo);
        System.out.println("");
        System.out.println("USUARIO: ");
        String usuarioIngresado=sc.nextLine();
        System.out.println("CONTRASEÑA: ");
        String contrasenaIngresada=sc.nextLine();
    }
    public void menu(){
        String abajo="++++++++++++++++++++++++++++++++++++++++";
        String arriba="+++++++++++++++++menu+++++++++++++++++";
        String medio="+                                     +";
        System.out.println(arriba);
        System.out.println(medio);
        System.out.println(abajo);
        System.out.println("1. Reservar hospedaje");
        System.out.println("2. Reservar Transporte");
        System.out.println("3. Reservar entretenimiento");
        System.out.println("4. Pagar reserva");
        System.out.println("5. Consultar reserva");
        System.out.println("6. Salir");
        System.out.println("\n");
        System.out.println("Elija una opción: ");
        String op=sc.nextLine();
  
    }
    
    public ArrayList<Usuario> getListaUsuario(){
        return this.listaUsuario;
    }
    public void setListaUsuario(ArrayList<Usuario> listaUsuario){
        this.listaUsuario=listaUsuario;
    }
    
}
