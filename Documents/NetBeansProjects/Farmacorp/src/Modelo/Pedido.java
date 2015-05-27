

package Modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 
 * Clase Pedido de la aplicacion de FarmaCorp
 * @author Jaime
 * @version 1.0 26/05/2015
 */
public class Pedido {
    private int codigo_pedido;
    private Date fecha_emision, fecha_recepcion;
    private Empleado codigo_empleado;
    private int codigo_proveedor;
    List <Producto> productos;
    enum estado{
        PENDIENTE,
        CANCELADO,
        ENTREGADO
    }
    private int contador = 1;
    /**
     * Constructor de la clase pedido
     * El Codigo del pedido es unico,
     * y se genera con un contador que aumenta en 1 con cada pedido
     */
    public Pedido(){
        this.codigo_pedido = contador;
        contador++;
        productos = new ArrayList();
        this.fecha_emision = new Date();
    }
    
/**
 * Metodo para obtener el codigo del pedido
 * @return El codigo del pedido
 */
    public int getCodigo_pedido() {
        return codigo_pedido;
    }
    
/**
 * Metodo para obtener de la fecha de emision
 * @return La fecha de emision del pedido
 */
    public Date getFecha_emision() {
        return fecha_emision;
    }
    
/**
 * Metodo para cambiar la fecha de emision del pedido
 * @param fecha_emision La nueva fecha de emision del pedido
 */
    public void setFecha_emision(Date fecha_emision) {
        this.fecha_emision = fecha_emision;
    }

/**
 * Metodo para obtener la fecha de recepcion del pedido
 * @return La fecha de recepcion del pedido
 */
    public Date getFecha_recepcion() {
        return fecha_recepcion;
    }
    
/**
 * Metodo para cambiar la fecha de recepcion del pedido
 * @param fecha_recepcion La nueva fecha de recepcion del pedido
 */
    public void setFecha_recepcion(Date fecha_recepcion) {
        this.fecha_recepcion = fecha_recepcion;
    }
    
/**
 * Metodo para obtener el codigo del empleado que ha realizado el pedido
 * @return El codigo del empleado
 */
    public Empleado getCodigo_empleado() {
        return codigo_empleado;
    }
    
/**
 * Metodo para cambiar el codigo del empleado que ha realizado del pedido
 * @param codigo_empleado El nuevo codigo del empleado
 */
    public void setCodigo_empleado(Empleado codigo_empleado) {
        this.codigo_empleado = codigo_empleado;
    }
    
/**
 * Metodo para obtener el codigo del proveedor al que se le ha realizado el pedido
 * @return El codigo del proveedor
 */
    public int getCodigo_proveedor() {
        return codigo_proveedor;
    }
    
/**
 * Metodo para cambiar el codigo del proveedor al que se le ha realizado el pedido
 * @param codigo_proveedor Codigo del nuevo proveedor
 */
    public void setCodigo_proveedor(int codigo_proveedor) {
        this.codigo_proveedor = codigo_proveedor;
    }
    
/**
 * Metodo para obtener la lista de los productos del pedido
 * @return La lista de los producto del pedido
 */
    public List<Producto> getProductos() {
        return productos;
    }
    
/**
 * Metodo para cambiar la lista de los productos del pedido
 * @param productos Nueva lista de los productos del pedido
 */
    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
    
    
}
