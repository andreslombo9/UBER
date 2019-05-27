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
    String documento;
    private Admin admin;

    public Adapter(String Usuario, String Password,String documento) {
        super(Usuario, Password,documento);
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

    @Override
    public String getUsuario() {
        return Usuario;
    }

    @Override
    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    @Override
    public String getPassword() {
        return Password;
    }

    @Override
    public void setPassword(String Password) {
        this.Password = Password;
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
    public void setDocumento(String documento) {
        super.setDocumento(documento); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getDocumento() {
        return super.getDocumento(); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
