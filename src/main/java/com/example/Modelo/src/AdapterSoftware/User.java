/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdapterSoftware;


/**
 *
 * @author camil
 */
public abstract class User {
    private String Usuario;
    private String Password;
    private String Tipo_Usuario;
    private String documento;

  

    public User(String Usuario, String Password,String documento) {
        this.Usuario = Usuario;
        this.Password = Password;
        this.documento = documento;
    }

    public User() {
        super();
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public abstract boolean ingresar(String Usuario, String Pass);

    public abstract void gettipoUsuario();



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

    public String getTipo_Usuario() {
        return Tipo_Usuario;
    }

    public void setTipo_Usuario(String Tipo_Usuario) {
        this.Tipo_Usuario = Tipo_Usuario;
    }
    

   
    
  
    
}
