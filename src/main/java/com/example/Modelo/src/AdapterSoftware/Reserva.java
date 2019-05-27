/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdapterSoftware;

/**
 *
 * @author Sergio Vega
 */
public class Reserva {

    private String nombreReserva;
    private int puestoRutaReservada;
    private String nombreRutaReservada;
    private String documentoPasajero;
    
    
    public Reserva(String nombreReserva, int puestoRutaReservada, String nombreRutaReservada, String documentoPasajero) {
        
        this.nombreReserva = nombreReserva;
        this.puestoRutaReservada = puestoRutaReservada;
        this.nombreRutaReservada = nombreRutaReservada;
        this.documentoPasajero = documentoPasajero;
        
    }

    public String getNombreReserva() {
        return nombreReserva;
    }

    public void setNombreReserva(String nombreReserva) {
        this.nombreReserva = nombreReserva;
    }

    public int getPuestoRutaReservada() {
        return puestoRutaReservada;
    }

    public void setPuestoRutaReservada(int puestoRutaReservada) {
        this.puestoRutaReservada = puestoRutaReservada;
    }

    public String getNombreRutaReservada() {
        return nombreRutaReservada;
    }

    public void setNombreRutaReservada(String nombreRutaReservada) {
        this.nombreRutaReservada = nombreRutaReservada;
    }

    public String getDocumentoPasajero() {
        return documentoPasajero;
    }

    public void setDocumentoPasajero(String documentoPasajero) {
        this.documentoPasajero = documentoPasajero;
    }
    
    public int getPuestoAReservar() {
		return puestoRutaReservada;
    }
    public void setPuestoAReservar(int puestoAReservar) {
		this.puestoRutaReservada = puestoAReservar;
    }

    
    
    
}
