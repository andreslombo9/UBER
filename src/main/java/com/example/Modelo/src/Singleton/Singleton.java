/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

import AdapterSoftware.User;
import java.util.ArrayList;

/**
 *
 * @author Sergio Vega
 */
public class Singleton {
    
    private static ArrayList<User> usuarios;
    private static Singleton single;

    public Singleton() {
        usuarios = new ArrayList();
    }
    
    public static Singleton getSingle() {
        if (single == null) {
            single = new Singleton();
        }
        return single;
    }

    public  ArrayList<User> getUsuarios() {
        return usuarios;
    }

    public static void setUsuarios(ArrayList<User> usuarios) {
        Singleton.usuarios = usuarios;
    }

    public void Add(User user) {
        usuarios.add(user);
    }

    public User getById(String id) {
        User user = null;

        for (User usuario : usuarios) {
            if (usuario.getDocumento() == id ){
                user = usuario;

            }

        }
        return user;
    }

    
}
