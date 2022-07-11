/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;
//sd
/**
 *
 * @author User
 */
import java.util.Scanner;

/**
 * Esta clase contiene variables y constructores que apoyan la creación de métodos
 */
public abstract class Usuario {
    protected String cedula;
    protected String nombres;
    protected String apellidos;
    protected String user;
    protected String contraseña;
    protected String celular;
    protected char tipoUsuario;
    
    public Usuario(String cedula, String nombres, String apellidos, String user, String contraseña, String celular, char tipoUsuario){
        this.cedula=cedula;
        this.nombres=nombres;
        this.apellidos=apellidos;
        this.user=user;
        this.contraseña=contraseña;
        this.celular=celular;
        this.tipoUsuario=tipoUsuario;
    }
    public Usuario(String cedula, String nombres, String apellidos, String user, String contraseña, String celular){
        this.cedula=cedula;
        this.nombres=nombres;
        this.apellidos=apellidos;
        this.user=user;
        this.contraseña=contraseña;
        this.celular=celular;
    }
    public String getCedula(){
        return this.cedula;
    }
    public String getNombres(){
        return this.nombres;
    }
    public String getApellidos(){
        return this.apellidos;
    }
    public String getContraseña(){
        return this.contraseña;
    }
    public String getUser(){
        return this.user;
    }
    public String getCelular(){
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
    public void setCelular(String celular){
        this.celular=celular;
    }

    public char getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(char tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    
    public abstract void consultarReservas();
    
}
