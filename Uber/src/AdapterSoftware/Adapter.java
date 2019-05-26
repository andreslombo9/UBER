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
public class Adapter extends User{
    String Usuario;
    String Password;
    private Admin admin;

    public Adapter(String Usuario, String Password) {
        super(Usuario, Password);
        this.admin = new Admin();
    }
    public Adapter(){
        super();
        this.admin = new Admin();
    }

   
    @Override
    public boolean ingresar(String Usuario, String Pass) {

              return admin.IngresarDatos(Usuario, Pass);
    }


    @Override
    public void gettipoUsuario() {
         this.admin.recibirUsuario(); 
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

   
    
}
