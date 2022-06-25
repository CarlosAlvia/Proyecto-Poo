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
    
    public static void main(String[] args){
        String signo="++++++++++++++++++++++++++++++++++++++++";
        System.out.println(signo);
        System.out.println("");
        System.out.println("        BIENVENIDO AL SISTEMA         ");
        System.out.println("");
        System.out.println(signo);
        System.out.println("");
        System.out.println("USUARIO: ");
        Scanner sc=new Scanner(System.in);
        String usuarioIngresado=sc.nextLine();
        System.out.println("CONTRASEÑA: ");
        String contrasenaIngresada=sc.nextLine();
    }
    
    
    public ArrayList<Usuario> getListaUsuario(){
        return this.listaUsuario;
    }
    public void setListaUsuario(ArrayList<Usuario> listaUsuario){
        this.listaUsuario=listaUsuario;
    }
    
}
