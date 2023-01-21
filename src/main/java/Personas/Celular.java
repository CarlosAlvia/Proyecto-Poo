/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

/**
 *
 * @author User
 */
public class Celular {
    private String prefijo;
    private int numeroTelefono;

    public Celular(String prefijo, int numeroTelefono) {
        this.prefijo = prefijo;
        this.numeroTelefono = numeroTelefono;
    }
    public Celular(String prefijo) {
        this.prefijo = prefijo;
    }
    
    public void verificarTelefono(){
        // Verificacón de telefono
    }

    public void setPrefijo(String prefijo) {
        this.prefijo = prefijo;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getPrefijo() {
        return prefijo;
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }
    
    
}


