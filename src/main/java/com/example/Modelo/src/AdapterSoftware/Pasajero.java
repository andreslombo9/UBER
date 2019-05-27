/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdapterSoftware;

import javax.swing.JOptionPane;

/**
 *
 * @author camil
 */
public class Pasajero extends User {
    
    public Pasajero(String Usuario, String Password,String documento ) {
        super(Usuario, Password,documento);
    }

   public Pasajero(){
        super();
    }


    @Override
    public void setTipo_Usuario(String Tipo_Usuario) {
        super.setTipo_Usuario(Tipo_Usuario); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getTipo_Usuario() {
        return super.getTipo_Usuario(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPassword(String Password) {
        super.setPassword(Password); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getPassword() {
        return super.getPassword(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setUsuario(String Usuario) {
        super.setUsuario(Usuario); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getUsuario() {
        return super.getUsuario(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setDocumento(String documento) {
        super.setDocumento(documento); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getDocumento() {
        return super.getDocumento(); //To change body of generated methods, choose Tools | Templates.
    }



   
    
    @Override
    public boolean ingresar(String Usuario, String Pass) {
        boolean x = false;
        if (super.getUsuario().equals(Usuario) && super.getPassword().equals(Pass)) {
            return true;
        }
        
        return x;
    }  



    @Override
    public void gettipoUsuario() {
       System.out.println("Pasajero"); //To change body of generated methods, choose Tools | Templates.
    }


   

}