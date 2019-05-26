package TFlyWeight;

import TFlyWeight.InterfaceFW;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ANDRES
 */
public class Pago_TD implements InterfaceFW{
     private int id;
    private int numtarjeta;
    private String Fexp;
    private int Numt;
    private String Contraseña;
    private float Cantidad;

    public Pago_TD(int id, int numtarjeta, String Fexp, int Numt, String Contraseña, float Cantidad) {
        this.id = id;
        this.numtarjeta = numtarjeta;
        this.Fexp = Fexp;
        this.Numt = Numt;
        this.Contraseña = Contraseña;
        this.Cantidad = Cantidad;
    }

    @Override
    public int getID() {
        return this.id;
    }

    @Override
    public void setID(int id) {
         this.id = id;
    }

    @Override
    public int getNumTarjeta() {
        return this.numtarjeta;
    }

    @Override
    public void setNumTarjeta(int numTarjeta) {
        this.numtarjeta = numtarjeta;
    }

    @Override
    public String getFexp() {
        return this.Fexp;
    }
    
    @Override
    public void setFexp(String Fexp) {
         this.Fexp = Fexp;
    }
    

    @Override
    public int getNumt() {
        return this.Numt;
    }

    @Override
    public void setNumt(int numt) {
        this.Numt = numt;
    }

    @Override
    public String getContraseña() {
       return this.Contraseña;
    }

    @Override
    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    @Override
    public float getCantidad() {
        return this.Cantidad;
    }

    @Override
    public void setCantidad(float cantidad) {
        this.Cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Tarjeta de crécito=" + "ID:" + id + ", Número de tarjeta" + numtarjeta + ", Fecha de expiración:" + 
                Fexp + ", Número de expiración:" + Numt + ", Contraseña:" + Contraseña + ", Cantidad:" + Cantidad +'.';
    }
}
