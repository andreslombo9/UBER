package TFlyWeight;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ANDRES
 */
public interface InterfaceFW {
    public int getID();
    public void setID(int id);
    public int getNumTarjeta();
    public void setNumTarjeta(int numTarjeta);
    public String getFexp();
    public void setFexp(String Fexp);
    public int getNumt();
    public void setNumt(int numt);
    public String getContraseña();
    public void setContraseña(String Contraseña);
    public float getCantidad();
    public void setCantidad(float cantidad);
    @Override
    public String toString();
}
