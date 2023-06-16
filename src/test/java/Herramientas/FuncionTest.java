/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Herramientas;

import java.time.LocalDate;
import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jexa1
 */
public class FuncionTest {
    
    public FuncionTest() {
    }
    /**
     * Test of generarArreglo method, of class Funcion.
     */
    @org.junit.jupiter.api.Test
    public void testGenerarArreglo() {
        System.out.println("generarArreglo");
        String nombreArchivo = "reservas.txt";
        ArrayList result = Funcion.generarArreglo(nombreArchivo);
        assertTrue(!result.isEmpty());
    }

    /**
     * Test of calcularDias method, of class Funcion.
     */
    @org.junit.jupiter.api.Test
    public void testCalcularDias() {
        System.out.println("calcularDias");
        String fechaInicio = "21/01/2023";
        String fechaFin = "25/01/2023";
        long expResult = 4;
        long result = Funcion.calcularDias(fechaInicio, fechaFin);
        assertEquals(expResult, result);
    }

    /**
     * Test of generarNumerosAleatorios method, of class Funcion.
     */
    @org.junit.jupiter.api.Test
    public void testGenerarNumerosAleatorios() {
        System.out.println("generarNumerosAleatorios");
        int inicio = 2000;
        int fin = 2200;
        String nombreArchivo = "reservas.txt";
        String result = Funcion.generarNumerosAleatorios(inicio, fin, nombreArchivo);
        assertTrue(Integer.valueOf(result)<2201&&Integer.valueOf(result)>=2000);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
