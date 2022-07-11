/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PagoReserva;
import Personas.Cliente;
import Herramientas.Funcion;
import java.time.LocalDate;
/**
 *
 * @author CJAA
 */
public class Reserva {
    private String numeroReserva;
    private String fechaReserva;
    private String desde;
    private String hasta;
    private double valorPagar;
    private String tipoReserva;
    private Cliente cliente;
    private static int cantidadReservas;
    /**
     * Construcot reserva utilizado en la linea que se agregará al archivo
     * @param desde
     * @param hasta
     * @param valorPagar
     * @param cliente
     * @param tipoReserva 
     */
    public Reserva(String desde,String hasta,double valorPagar, Cliente cliente,String tipoReserva){
        this.desde=desde;
        this.hasta=hasta;
        this.valorPagar=valorPagar;
        this.cliente=cliente;
        this.tipoReserva=tipoReserva;
        //Se usa el método para definir el número de reserva aleatorio y único
        this.numeroReserva=Funcion.generarNumerosAleatorios(20000,30000,"reservas.txt");
        //Se consigue la fecha actual con el método now de la Clase LocalDate (aa-mm-dd), se hace un split y se usan 
        //los componentes para usar el formato del programa (dd/mm/aa)
        String[] arrFechaActual= LocalDate.now().toString().split("-");
        String fechaActual=arrFechaActual[2]+"/"+arrFechaActual[1]+"/"+arrFechaActual[0];
        this.fechaReserva=fechaActual;
        cantidadReservas+=1;
    }
    /**
     * Constrictor Reserva, utilizado en cliente
     * @param numeroReserva
     * @param fechaReserva
     * @param tipoReserva
     * @param cliente
     * @param desde
     * @param hasta
     * @param valorPagar 
     */
    public Reserva(String numeroReserva, String fechaReserva, String tipoReserva, Cliente cliente, String desde, String hasta, double valorPagar ) {
        this.numeroReserva = numeroReserva;
        this.fechaReserva = fechaReserva;
        this.desde = desde;
        this.hasta = hasta;
        this.valorPagar = valorPagar;
        this.tipoReserva = tipoReserva;
        this.cliente = cliente;
        cantidadReservas+=1;
    }
    /**
     * Constructor de Reserva, inicializa las variables
     * @param numeroReserva
     * @param fechaReserva
     * @param tipoReserva
     * @param desde
     * @param hasta
     * @param valorPagar 
     */
    public Reserva(String numeroReserva, String fechaReserva, String tipoReserva, String desde, String hasta, double valorPagar ) {
        this.numeroReserva = numeroReserva;
        this.fechaReserva = fechaReserva;
        this.desde = desde;
        this.hasta = hasta;
        this.valorPagar = valorPagar;
        this.tipoReserva = tipoReserva;
        cantidadReservas+=1;
        
    }
    /**
     * Método mostrar cabecera, es estatico 
     * Muestra por pantalla "RESERVACIÓN" 
     * 
     */
    public static void mostrarCabecera(){
        String simbolo="/***************RESERVACIÓN***************/";
        String simbolo1="/*                                       */";
        String simbolo2="/*****************************************/";
        System.out.println(simbolo);
        System.out.println(simbolo1);
        System.out.println(simbolo2);
        System.out.println("");
    }
    public String getTipoReserva() {
        return tipoReserva;
    }
    
    public void setTipoReserva(String tipoReserva) {
        this.tipoReserva = tipoReserva;
    }
    public String getNumeroReserva(){
        return this.numeroReserva;
    }
    
    public String getFechaReserva(){
        return this.fechaReserva;
    }
    
    public String getDesde(){
        return this.desde;
    }
    
    public String getHasta(){
        return this.hasta;
    }
    
    public double getValorPagar(){
        return this.valorPagar;
    }
    
    //public Servicio Getservicio(){
    //    return this.servicio;
    //}
    public Cliente getCliente(){
        return this.cliente;
    }
    
    public void setNumeroReserva(String numeroReserva){
        this.numeroReserva=numeroReserva;
    }
    
    public void setFechaReserva(String fechaReserva){
        this.fechaReserva=fechaReserva;
    }
    public void setDesde(String desde){
        this.desde=desde;
    }
    public void setHasta(String hasta){
        this.hasta=hasta;
    }
    public void setValorPagar(double valorPagar){
        this.valorPagar=valorPagar;
    }
    public void setCliente(Cliente cliente){
        this.cliente=cliente;
    }

    public static int getCantidadReservas() {
        return cantidadReservas;
    }

    public static void setCantidadReservas(int cantidadReservas) {
        Reserva.cantidadReservas = cantidadReservas;
    }
     /**
     *Este método permite la creación de un formato que se presentará pantalla
     * Debe ser declarado
     * Sobreescribiendo el método 
     * @return un String con la línea que se forma con las caracteristicas de 
     * reserva y cliente
     */
    @Override
    public String toString(){
        return this.numeroReserva+","+this.fechaReserva+","+this.tipoReserva+","+this.cliente.getNombres()+" "+this.cliente.getApellidos()+","+this.desde+","+this.hasta+","+this.valorPagar;
    }
}

