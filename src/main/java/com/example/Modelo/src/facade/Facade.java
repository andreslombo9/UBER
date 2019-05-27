
package facade;

import AdapterSoftware.Reserva;
import java.util.ArrayList;

import AdapterSoftware.*;
import Composite.*;
import Decorator.*;
import TFlyWeight.*;
import java.util.Hashtable;
import javax.swing.JOptionPane;
import proxy.IProxy;

public class Facade {

    private static ArrayList<User> usuarios = new ArrayList<User>();
    private static ArrayList<Ruta> rutas = new ArrayList<Ruta>();
    private static ArrayList<Reserva> reservas = new ArrayList<Reserva>();
    private Factory fabricaUsers = new Factory();
    private static ArrayList<Pago_TC> pagostc = new ArrayList<Pago_TC>();
    private static ArrayList<Pago_TD> pagostd = new ArrayList<Pago_TD>();
    public static Hashtable<Long, String> aleatorios = new Hashtable<Long, String>();
    private static Facade mFacade;

    public static ArrayList<User> getUsuarios() {
        return usuarios;
    }

    public Facade() {
    }

    public static Facade getInstance() {
        if (mFacade == null) {
            mFacade = new Facade();
        }
        return mFacade;
    }
    
     //  0       1       2           3       4       5           6       7           8               9            10      11         12    13       14         15
    //Metodo,usuario,contraseña,nombre,documento,|NombreReserva,Ruta,Fecha,|,NuevoNombreReserva,NuevaRutaReserva,|id,numeroTarjeta,Fexp,  numt, contraseña, cantidad
    public String General(String metodo)//primer parametro nombre del metodo, segundo, tipo de parametro,tercero, valor del parametro 
    {
    
        String[] param = metodo.split(",");
        
            if(param[0].equals("VerificarUsuario"))
            {
            
                this.verificarUsuario(param[1], param[2]);
            
                String us = Integer.toString(this.verificarUsuario(param[1], param[2]));
                
                return us;
            
            }
            if (param[0].equals("CrearReserva"))
            {
               this.crearRegistroReserva(param[5], param[6], Integer.parseInt(param[4]), param[7]);
                
               String re = this.crearRegistroReserva(param[5], param[6], Integer.parseInt(param[4]), param[7]);
               return re;
            
            }
            if (param[0].equals("ListarReserva"))
            {
                    
                this.listarReservasPasajero(param[4]);
                    
                String re =  this.listarReservasPasajero(param[4]);
            
             
                return re;
            }
            if (param[0].equals("ModificarReserva"))
            {
                    
                this.modificarReservaPasajero(param[5], param[9],Integer.parseInt(param[9]), param[4]);
                 
                String re = this.modificarReservaPasajero(param[5], param[9],Integer.parseInt(param[9]), param[4]);
                
                return re;
                
            }
            if (param[0].equals("EliminarReserva"))
            {
                    
                    
                this.eliminarReserva(param[5], param[4]);
                 
                return "Reserva Eliminada";
                
            
            
            }
            if (param[0].equals("RegistrarPasajero"))
            {
                    
                this.registrarPasajero(param[1], param[2], param[4]);
                
                String re =  this.registrarPasajero(param[1], param[2], param[4]);
                    
                return re;
                 
            
            
            }
            if (param[0].equals("ModificarPasajero"))
            {
                    
                    
                this.modificarPasajero(param[1], param[2],param[4]);
                
                String re = this.modificarPasajero(param[1], param[2], param[4]);
             
                return re;
             
            
            }
            if (param[0].equals("EliminarUsuario"))
            {
                    
                this.eliminarUsuario(param[4]);
                
                String  re = this.eliminarUsuario(param[4]);
                
                return re;    
                
            }
            if (param[0].equals("RegistrarConductor"))
            {
                    
                this.registrarConductor(param[1], param[2], param[4]);
                    
                String re = this.registrarConductor(param[1], param[2], param[4]);
                 
                return re;
            
            }
            if (param[0].equals("ModificarConductor"))
            {
                    
                this.modificarConductor(param[1], param[2], param[4]);
                
                String re =  this.modificarConductor(param[1], param[2], param[4]);
                
                return re;
            
            
            }
            if (param[0].equals("RegistrarAdmin"))
            {
                    
                this.registrarAdministrador(param[1], param[2], param[4]);
                
                String re = this.registrarAdministrador(param[1], param[2], param[4]);
                
                return re; 
                
            
            
            }
            if (param[0].equals("ModificarAdmin"))
            {
                    
                this.modificarAdministrador(param[1], param[2], param[4]);
                
                String re = this.modificarAdministrador(param[1], param[2],param[4]);
                    
                return re; 
                
            
            
            }
            if (param[0].equals("RegistrarPagoTD"))
            {
                    
                this.registrarPagoTD(Integer.parseInt(param[10]),Integer.parseInt(param[11]),param[12],Integer.parseInt(param[13]),param[14],Float.parseFloat(param[15]));
                
                String re =this.registrarPagoTD(Integer.parseInt(param[10]),Integer.parseInt(param[11]),param[12],Integer.parseInt(param[13]),param[14],Float.parseFloat(param[15]));
            
                return re;
             
            }
            if (param[0].equals("RegistrarPagoTC"))
            {
                    
                this.registrarPagoTC(Integer.parseInt(param[10]),Integer.parseInt(param[11]),param[12],Integer.parseInt(param[13]),param[14],Float.parseFloat(param[15]));
                
                String re =this.registrarPagoTC(Integer.parseInt(param[10]),Integer.parseInt(param[11]),param[12],Integer.parseInt(param[13]),param[14],Float.parseFloat(param[15]));
            
                return re;
             
            }
            if (param[0].equals("ObtenerPago"))
            {
                    
                this.obtenerPagosTD();
                
                String re = this.obtenerPagosTD();
            
                return re;
             
            }
    
        return "No se encontró la operación";
    
    }
    

    public int verificarUsuario(String correo, String pass) {
        int tipoPasajero = 0;
        for (User us : usuarios) {
            if (us.getUsuario().equals(correo) && us.getPassword().equals(pass)) {

                return obtenerTipo(us);
            }
        }
        return tipoPasajero;
    }

    private int obtenerTipo(User us) {
        int tipoUsu = 0;
        if (us instanceof Pasajero) {
            tipoUsu = 1;
        } else if (us instanceof Conductor) {
            tipoUsu = 2;
        }
        return tipoUsu;
    }

    public User obtenerUsuario(Long aleatorio) {
        String correo = aleatorios.get(aleatorio);
        for (User us : usuarios) {
            if (us.getUsuario().equals(correo)) {
                return us;
            }
        }
        return null;
    }

    public String obtenerUsuarios() {
        String info = "";
        for (User us : usuarios) {
            info += us.toString() + "\n";
        }
        return info;
    }

    public void crearRegistroRuta(String nombreRuta, ArrayList<Componente> calles, String documentoConductor) {
        Ruta ruta = new Ruta(nombreRuta, documentoConductor);
        ruta.setComponentes(calles);
        rutas.add(ruta);
    }

    public String listarRutasConductor(String documento) {
        String infoRutas = "No se encontraron las rutas para el documento " + documento;
        String info = "";
        for (int i = 0; i < rutas.size(); i++) {
            if (rutas.get(i).getDocumentoConductor().equals(documento)) {
                info += (i++) + rutas.get(i).obtenerDatos() + "\n\n";
            }
        }
        return (info.isEmpty() ? infoRutas : info);
    }

    public void actualizarRuta(String nombreRutaModificar, String nombreRutaNuevo, ArrayList<Componente> callesModificadas, String documentoConductor) {
        int position = 0;
        for (Ruta ru : rutas) {
            if (ru.getNombre().equals(nombreRutaModificar)) {
                Ruta rutaNueva = new Ruta(nombreRutaNuevo, documentoConductor);
                rutaNueva.setComponentes(callesModificadas);
                rutas.set(position, rutaNueva);
            }
            position++;
        }
    }

    public void eliminarRuta(String nombreRuta, String documentoConductor) {
        System.out.println("antes" + rutas.size());
        for (Ruta rut : rutas) {
            if (rut.getNombre().equals(nombreRuta) && rut.getDocumentoConductor().equals(documentoConductor)) {
                System.out.println(rut);
                rutas.remove(rut);
            }
        }
        System.out.println("Despues" + rutas.size());

    }

    public String crearRegistroReserva(String nombreReserva, String nombreRutaReservada, int puestoRutaReservada, String documentoPasajero) {
        Reserva reserv = new Reserva(nombreReserva, puestoRutaReservada, nombreRutaReservada, documentoPasajero);
        reservas.add(reserv);
        System.out.println("Reserva añadida" + reserv.toString());
        return reserv.toString();
    }

    public String listarReservasPasajero(String documentoPasajero) {
        String lista = "";
        for (Reserva re : reservas) {
            if (re.getDocumentoPasajero().equals(documentoPasajero)) {
                lista += "Nombre reserva: " + re.getNombreReserva()
                        + "Nombre ruta reservada: " + re.getNombreRutaReservada()
                        + " \tPuesto reservado: " + re.getPuestoAReservar();
            }
        }
        return lista;
    }

    public String listarReservasPas(String documentoPasajero) {
        String lista = "No se encontraron reservas para el pasajero " + documentoPasajero;
        String infoRes = "";
        for (int i = 0; i < reservas.size(); i++) {
            if (reservas.get(i).getDocumentoPasajero().equals(documentoPasajero)) {
                infoRes += (i++) + reservas.get(i).toString() + "\n";
            }
        }
        return (infoRes.isEmpty() ? lista : infoRes);
    }

    public String modificarReservaPasajero(String nombreReservaModificar, String nombreRutaReservadaModificado,
            int puestoRutaReservadaModificado, String documentoPasajero) {

        
        for (Reserva res : reservas) {

            if (res.getNombreReserva().equals(nombreReservaModificar) && res.getDocumentoPasajero().equals(documentoPasajero)) {
                System.out.println("Antes de modificar " + res.toString());
                res.setNombreRutaReservada((nombreRutaReservadaModificado.isEmpty() ? res.getNombreRutaReservada() : nombreRutaReservadaModificado));
                res.setPuestoAReservar(puestoRutaReservadaModificado);

                System.out.println("nueva" + res.toString());
            }
            
             return "nueva" + res.toString();
        }
        
        return "";

    }

    public void eliminarReserva(String nombreReservaEliminar, String documentoPasajero) {
        for (Reserva re : reservas) {
            if (re.getDocumentoPasajero().equals(documentoPasajero) && re.getNombreReserva() == nombreReservaEliminar) {
                reservas.remove(re);
                break;
            }
        }
    }

    public String registrarPasajero( String correo, String contrasena,String documento) {
        Pasajero pasa = new Pasajero( correo, contrasena,documento);
        usuarios.add(pasa);
        return pasa.toString();
    }

    public String modificarPasajero(String documento, String correo, String contrasena) {
        int position = 0;
        for (User us : usuarios) {
            if (us.getDocumento().equals(documento)) {
                usuarios.set(position, new Pasajero(correo, contrasena,documento));
            }
            position++;
            return us.toString();
        }
        return "";
    }

    public String eliminarUsuario(String documento) {
        for (User us : usuarios) {
            if (us.getDocumento().equals(documento)) {
                System.out.println("Antes " + usuarios.size());
                usuarios.remove(us);
                System.out.println("Despues " + usuarios.size());
                break;
            }
            return "Usuario Eliminado";
        }
        return "";
    }

    public String registrarConductor ( String correo, String contrasena,String documento) {
        Conductor cond = new Conductor( correo, contrasena,documento);
        usuarios.add(cond);
        return cond.toString();
    }

    public String modificarConductor( String documento, String correo, String contrasena) {
        int position = 0;
        for (User us : usuarios) {
            if (us.getDocumento().equals(documento)) {
                usuarios.set(position, new Conductor( correo, contrasena,documento));
            }
            position++;
            
            return us.toString();
        }
        return "";
    }

    public String registrarAdministrador(String correo, String contrasena,String documento) {
        Adapter admin = new Adapter(correo, contrasena, documento);
        usuarios.add(admin);
        return admin.toString();
    }

    public String modificarAdministrador( String correo, String contrasena,String documento) {
        int position = 0;
        for (User us : usuarios) {
            if (us.getDocumento().equals(documento)) {
                usuarios.set(position, new Adapter(correo, contrasena,documento));
            }
            position++;
            return us.toString();
        }
        return "";
    }

    public String registrarPagoTC(int id,int numTarjeta,String Fexp,int numt,String contraseña,float cantidad) {
        Pago_TC component = new Pago_TC(id,numTarjeta,Fexp,numt,contraseña,cantidad);
        
        pagostc.add(component);
        return component.toString();
    }

    public String registrarPagoTD(int id,int numTarjeta,String Fexp,int numt,String contraseña,float cantidad) {
        Pago_TD component = new Pago_TD(id,numTarjeta,Fexp,numt,contraseña,cantidad);
        
        pagostd.add(component);
        return component.toString();
    }

    public String obtenerPagosTC() {
        String valoresPagos = "";
        for (Pago_TC pago : pagostc) {
            valoresPagos += pago.toString() + "\n";
        }
        return valoresPagos;
    }

    public String obtenerPagosTD() {
        String valoresPagos = "";
        for (Pago_TD pago : pagostd) {
            valoresPagos += pago.toString() + "\n";
        }
        return valoresPagos;
    }

}
