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

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
//    @BeforeAll
//    public static void setUpClass() {
//    }
//    
//    @AfterAll
//    public static void tearDownClass() {
//    }
//    
//    @BeforeEach
//    public void setUp() {
//    }
//    
//    @AfterEach
//    public void tearDown() {
//    }

    /**
     * Test of calcularDiasDeReserva method, of class Funcion.
     */
    @org.junit.jupiter.api.Test
    public void testCalcularDiasDeReserva() {
//        System.out.println("calcularDiasDeReserva");
//        ArrayList expResult = null;
//        ArrayList result = Funcion.calcularDiasDeReserva();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of pedirFechas method, of class Funcion.
     */
    @org.junit.jupiter.api.Test
    public void testPedirFechas() {
        System.out.println("pedirFechas");
        ArrayList<LocalDate> expResult = null;
        ArrayList<LocalDate> result = Funcion.pedirFechas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generarArreglo method, of class Funcion.
     */
    @org.junit.jupiter.api.Test
    public void testGenerarArreglo() {
        System.out.println("generarArreglo");
        String nombreArchivo = "";
        ArrayList expResult = null;
        ArrayList result = Funcion.generarArreglo(nombreArchivo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularDias method, of class Funcion.
     */
    @org.junit.jupiter.api.Test
    public void testCalcularDias() {
//        System.out.println("calcularDias");
//        String fechaInicio = "";
//        String fechaFin = "";
//        long expResult = 0L;
//        long result = Funcion.calcularDias(fechaInicio, fechaFin);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of generarNumerosAleatorios method, of class Funcion.
     */
    @org.junit.jupiter.api.Test
    public void testGenerarNumerosAleatorios() {
        System.out.println("generarNumerosAleatorios");
        int inicio = 0;
        int fin = 0;
        String nombreArchivo = "";
        String expResult = "";
        String result = Funcion.generarNumerosAleatorios(inicio, fin, nombreArchivo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
