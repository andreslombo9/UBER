package TFlyWeight;


import TFlyWeight.InterfaceFW;
import TFlyWeight.Pago_TC;
import static java.sql.DriverManager.println;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ANDRES
 */
public class Factory {
    private ArrayList<InterfaceFW> FW = new ArrayList<InterfaceFW>();

    public ArrayList<InterfaceFW> getFW() {
        return FW;
    }

    public void setFW(ArrayList<InterfaceFW> FW) {
        this.FW = FW;
    }
     
     public void Pago(InterfaceFW pago) {
        int agregar = 0;
        for (int a = 0; a < FW.size(); a++) {
            if (FW.get(a).getID() == pago.getID()) {
                agregar = 1;
            }
        }
        if (agregar < 1) {
            FW.add(pago);
        }
        else{
            println("No se ha registrado pago");
        }
    }
     
      public void ActualizarPago(int idn, int numtarjetan, String Fexpn, int Numtn, String Contraseñan, float Cantidadn) {
        FW.get(idn).setNumTarjeta(numtarjetan);
        FW.get(idn).setFexp(Fexpn);
        FW.get(idn).setNumt(Numtn);
        FW.get(idn).setContraseña(Contraseñan);
        FW.get(idn).setCantidad(Cantidadn);
    }
      
      public void EliminarPago(InterfaceFW id){
          FW.remove(id);
      }
      
       public InterfaceFW Obtenerdatos(int id) {
        InterfaceFW datos = null;
        for (int i = 0; i < FW.size(); i++) {
            
            if (id == FW.get(i).getID()) {
                datos = FW.get(i);
                
            }
        }
        return datos;
    }
       public String Leer(int id) {
        String datos = "";
        for (int i = 0; i < FW.size(); i++) {
            if (id == FW.get(i).getID()) {
                datos = FW.get(i).toString() + ",";
            }
        }
        return datos;
    }
     
     public void AgregarTC(int id, int numtarjeta, String Fexp, int Numt, String Contraseña, float Cantidad) {
        int x = 0;
        InterfaceFW Tarjeta = new Pago_TC(id, numtarjeta, Fexp, Contraseña, Cantidad);
        for (int i = 0; i < FW.size(); i++) {
        if (FW.get(i).getID() == id) {
                x = 1;
            }
        }
        if (x < 1) {
            this.FW.add(Tarjeta);
        }
        else{
            println("No se ha registrado tarjeta");
        }
    }
     
     public void AgregarTD(int id, int numtarjeta, String Fexp, int Numt, String Contraseña, float Cantidad) {
        int x = 0;
        InterfaceFW Tarjeta = new Pago_TC(id, numtarjeta, Fexp, Contraseña, Cantidad);
        for (int i = 0; i < FW.size(); i++) {
        if (FW.get(i).getID() == id) {
                x = 1;
            }
        }
        if (x < 1) {
            this.FW.add(Tarjeta);
        }
        else{
            println("No se ha registrado tarjeta");
        }
    }
}
