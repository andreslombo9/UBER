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
public class Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        String u = JOptionPane.showInputDialog(null, "Ingrese usuario");
        String p = JOptionPane.showInputDialog(null, "Ingrese password");
        User prueba = new Conductor(u,p);
        prueba.ingresar(u , p);
        prueba.gettipoUsuario();
        
        prueba = new Pasajero(u,p);
        prueba.ingresar(u, p);
        prueba.gettipoUsuario();
        
        prueba = new Adapter(u,p);
        prueba.ingresar(u, p);
        prueba.gettipoUsuario();
        
        
        
          
    }
    
}
