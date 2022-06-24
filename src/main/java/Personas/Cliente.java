/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

/**
 *
 * @author User
 */
public class Cliente extends Usuario{
    private int edad;
    private int tarjetaDeCredito;
    private char tipoCliente;
    
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
    
}
