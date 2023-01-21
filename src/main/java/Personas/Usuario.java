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

    /**
     *
     */
    protected String cedula;

    /**
     *
     */
    protected String nombres;

    /**
     *
     */
    protected String apellidos;

    /**
     *
     */
    protected String user;

    /**
     *
     */
    protected String contraseña;

    /**
     *
     */
    protected Celular celular;

    /**
     *
     */
    protected char tipoUsuario;
    
    /**
     *
     * @param cedula
     * @param nombres
     * @param apellidos
     * @param user
     * @param contraseña
     * @param celular
     * @param tipoUsuario
     */
    public Usuario(String cedula, String nombres, String apellidos, String user, String contraseña, Celular celular, char tipoUsuario){
        this.cedula=cedula;
        this.nombres=nombres;
        this.apellidos=apellidos;
        this.user=user;
        this.contraseña=contraseña;
        this.celular=celular;
        this.tipoUsuario=tipoUsuario;
    }

    /**
     *
     * @param cedula
     * @param nombres
     * @param apellidos
     * @param user
     * @param contraseña
     * @param celular
     */
    public Usuario(String cedula, String nombres, String apellidos, String user, String contraseña, Celular celular){
        this.cedula=cedula;
        this.nombres=nombres;
        this.apellidos=apellidos;
        this.user=user;
        this.contraseña=contraseña;
        this.celular=celular;
    }

    /**
     *
     * @return
     */
    public String getCedula(){
        return this.cedula;
    }

    /**
     *
     * @return
     */
    public String getNombres(){
        return this.nombres;
    }

    /**
     *
     * @return
     */
    public String getApellidos(){
        return this.apellidos;
    }

    /**
     *
     * @return
     */
    public String getContraseña(){
        return this.contraseña;
    }

    /**
     *
     * @return
     */
    public String getUser(){
        return this.user;
    }

    /**
     *
     * @return
     */
    public Celular getCelular(){
        return this.celular;
    }

    /**
     *
     * @param cedula
     */
    public void setCedula(String cedula){
        this.cedula=cedula;
    }

    /**
     *
     * @param nombres
     */
    public void setNombres(String nombres){
        this.nombres=nombres;
    }

    /**
     *
     * @param apellidos
     */
    public void setApellidos(String apellidos){
        this.apellidos=apellidos;
    }

    /**
     *
     * @param contraseña
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    /**
     *
     * @param user
     */
    public void setUser(String user){
        this.user=user;
    }

    /**
     *
     * @param celular
     */
    public void setCelular(Celular celular){
        this.celular=celular;
    }

    /**
     *
     * @return
     */
    public char getTipoUsuario() {
        return tipoUsuario;
    }

    /**
     *
     * @param tipoUsuario
     */
    public void setTipoUsuario(char tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    
    /**
     *
     */
    public abstract void consultarReservas();
    
}
