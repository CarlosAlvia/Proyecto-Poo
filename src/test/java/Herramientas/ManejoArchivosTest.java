/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Herramientas;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ManejoArchivosTest {

    @BeforeAll
    public void setUp() {
        //Crear archivo de prueba
        File file = new File("test.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testLeeFichero() {
        try ( PrintWriter writer = new PrintWriter(new FileWriter("test.txt"))) {
            writer.println("test 1");
            writer.println("test 2");
            writer.println("test 3");
        } catch (IOException e) {
            e.printStackTrace();
        }
        ArrayList<String> resultado = ManejoArchivos.LeeFichero("test.txt");
        ArrayList<String> esperado = new ArrayList<>();
        esperado.add("test 1");
        esperado.add("test 2");
        esperado.add("test 3");
        assertEquals(esperado, resultado);
    }

    @Test
    public void testEscribirArchivo() {
        ManejoArchivos.EscribirArchivo("test.txt", "test 4");
        ArrayList<String> resultado = ManejoArchivos.LeeFichero("test.txt");
        ArrayList<String> esperado = new ArrayList<>();
        esperado.add("");
        esperado.add("test 4");
        assertEquals(esperado, resultado);
    }
}
