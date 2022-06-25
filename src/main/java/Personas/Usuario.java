/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

/**
 *
 * @author User
 */
import java.util.Scanner;
public abstract class Usuario {
    protected String cedula;
    protected String nombres;
    protected String apellidos;
    protected String user;
    protected String contraseña;
    protected int celular;
    
    public String GetCedula(){
        return this.cedula;
    }
    public String GetNombres(){
        return this.nombres;
    }
    public String GetApellidos(){
        return this.apellidos;
    }
    public String GetContraseña(){
        return this.contraseña;
    }
    public String GetUser(){
        return this.user;
    }
    public int GetCelular(){
        return this.celular;
    }
    public void setCedula(String cedula){
        this.cedula=cedula;
    }
    public void setNombres(String nombres){
        this.nombres=nombres;
    }
    public void setApellidos(String apellidos){
        this.apellidos=apellidos;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    public void setUser(String user){
        this.user=user;
    }
    public void setCelular(int celular){
        this.celular=celular;
    }
    
}
