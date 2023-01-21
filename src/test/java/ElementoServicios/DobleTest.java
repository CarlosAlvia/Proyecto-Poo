/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ElementoServicios;

import Herramientas.Funcion;
import java.util.ArrayList;
import junit.framework.TestCase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author User
 */
public class DobleTest extends TestCase{
    Doble habitacion= new Doble();
    ArrayList<Habitacion> habitaciones=new ArrayList<>();
    public DobleTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        

        
        
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of tipoHabitacion method, of class Doble.
     */
    @Test
    public void testTipoHabitacion() {
        ArrayList<String[]> hotelString = Funcion.generarArreglo("hoteles.txt");
        ArrayList<Hotel> hoteles = new ArrayList<>();
                // for que recorrera el Arraylist de arreglos y el if evaluará si pertenecen a una ciudad para arregarlos al array de hoteles, antes habiendo creado su objeto y se imprime el nombre del hotel que pertenece a la ciudad ingresada por el usuario 
                for (int i = 0; i < hotelString.size(); i++) {
                    if (hotelString.get(i)[0].equals("cuenca")) {
                        Hotel hotelito = new Hotel(hotelString.get(i)[0], hotelString.get(i)[1], hotelString.get(i)[2], Integer.parseInt(hotelString.get(i)[3]), hotelString.get(i)[4], hotelString.get(i)[5].equals("true"), hotelString.get(i)[5].equals("true"), hotelString.get(i)[6].equals("true"));
                        hoteles.add(hotelito);

                    }
                }
                System.out.println(hoteles);
        Hotel hotElegido = hoteles.get(1);
                
                System.out.println(hotElegido);
        ArrayList<String[]> habitacionString=Funcion.generarArreglo("habitaciones.txt");
        habitacion.tipoHabitacion(habitacionString, hotElegido,  habitaciones,  3);
        Assertions.assertTrue(habitaciones.isEmpty());

    }
    
}
