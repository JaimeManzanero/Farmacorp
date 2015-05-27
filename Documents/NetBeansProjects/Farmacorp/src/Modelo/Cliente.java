

package Modelo;

import java.util.List;

/**
 *
 * Clase Cliente de la aplicacion de FarmaCorp
 * @author Jaime Manzanero
 * @version 1.0 26/05/2015
 */
public class Cliente {
    private String nombre, apellido1, apellido2, dni, telefono, direccion, sip;
    private List <Producto> productos_pendientes;

/**
 * Constructor de la clase cliente
 * @param nombre Nombre del cliente
 * @param dni  DNI del cliente
 */
    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
/**
 * Metodo para obtener el nombre del cliente
 * @return Nombre del cliente
 */
    public String getNombre() {
        return nombre;
    }
    
/**
 * Metodo para cambiar el nombre del cliente
 * @param nombre Nombre del nuevo cliente
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
/**
 * Metodo para obtener el primer apellido
 * @return El primer apellido del cliente
 */
    public String getApellido1() {
        return apellido1;
    }
    
/**
 * Metodo para cambiar el primer apellido del cliente
 * @param apellido1 Nuevo apellido
 */
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }
    
/**
 * Metodo para obtener el segundo apellido
 * @return El segundo apellido del cliente
 */
    public String getApellido2() {
        return apellido2;
    }
    
/**
 * Metodo para cambiar el segundo apellido del cliente
 * @param apellido2 Nuevo segundo apellido
 */
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }
    
/**
 * Metodo para obtener el dni del cliente
 * @return El dni del cliente
 */
    public String getDni() {
        return dni;
    }
    
/**
 * Metodo para cambiar el dni del cliente
 * @param dni Nuevo dni
 */
    public void setDni(String dni) {
        this.dni = dni;
    }
    
/**
 * Metodo para obtener el telefono del cliente
 * @return El telefono del cliente
 */
    public String getTelefono() {
        return telefono;
    }
    
/**
 * Metodo para cambiar el telefono del cliente
 * @param telefono Nuevo telefono
 */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
/**
 * Metodo para obtener la direccion del cliente
 * @return La direccion del cliente
 */
    public String getDireccion() {
        return direccion;
    }
    
/**
 * Metodo para cambiar la direccion del cliente
 * @param direccion Nueva direccion
 */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
/**
 * Metodo para obtener el sip del cliente
 * @return El sip del cliente
 */
    public String getSip() {
        return sip;
    }
    
/**
 * Metodo para cambiar el sip del cliente
 * @param sip Nuevo sip
 */
    public void setSip(String sip) {
        this.sip = sip;
    }
    
/**
 * Metodo para obtener la lista de productos pendientes de entrega al cliente
 * @return La lista de los productos pendientes
 */
    public List<Producto> getProductos_pendientes() {
        return productos_pendientes;
    }
    
/**
 * Metodo para cambiar la lista de productos pendientes de entrega al cliente
 * @param productos_pendientes Nueva lista de productos pendientes
 */
    public void setProductos_pendientes(List<Producto> productos_pendientes) {
        this.productos_pendientes = productos_pendientes;
    }
    
}

