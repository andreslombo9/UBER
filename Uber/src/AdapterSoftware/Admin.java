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
public class Admin extends User {
    
    public Admin(String Usuario, String Password) {
        super(Usuario, Password);
    }
   
    public Admin(){
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
    
    public void recibirUsuario (){
       
         
    }

    @Override
    public void gettipoUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    boolean IngresarDatos(String Usuario, String Pass) {
        return true;
       
}
}
