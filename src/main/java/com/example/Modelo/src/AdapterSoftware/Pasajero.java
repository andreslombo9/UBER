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



    public Pasajero(String Usuario, String Password) {
        super(Usuario, Password);
    }

   public Pasajero(){
        super();
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