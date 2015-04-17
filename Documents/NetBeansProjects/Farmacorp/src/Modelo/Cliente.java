//Jaime Manzanero Ortiz

package Modelo;

import java.util.List;

/**
 *
 * @author Jaime
 */
public class Cliente {
    private String nombre, apellido1, apellido2, dni, telefono, direccion, sip;
    List <Producto> productos_pendientes;

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getSip() {
        return sip;
    }

    public void setSip(String sip) {
        this.sip = sip;
    }

    public List<Producto> getProductos_pendientes() {
        return productos_pendientes;
    }

    public void setProd_pend_pago(List<Producto> productos_pendientes) {
        this.productos_pendientes = productos_pendientes;
    }
    
}
