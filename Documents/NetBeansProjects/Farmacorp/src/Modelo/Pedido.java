//Jaime Manzanero Ortiz

package Modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Jaime
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
    
    public Pedido(){
        this.codigo_pedido = contador;
        contador++;
        productos = new ArrayList();
        this.fecha_emision = new Date();
    }

    public int getCodigo_pedido() {
        return codigo_pedido;
    }

    public Date getFecha_emision() {
        return fecha_emision;
    }

    public void setFecha_emision(Date fecha_emision) {
        this.fecha_emision = fecha_emision;
    }

    public Date getFecha_recepcion() {
        return fecha_recepcion;
    }

    public void setFecha_recepcion(Date fecha_recepcion) {
        this.fecha_recepcion = fecha_recepcion;
    }

    public Empleado getCodigo_empleado() {
        return codigo_empleado;
    }

    public void setCodigo_empleado(Empleado codigo_empleado) {
        this.codigo_empleado = codigo_empleado;
    }

    public int getCodigo_proveedor() {
        return codigo_proveedor;
    }

    public void setCodigo_proveedor(int codigo_proveedor) {
        this.codigo_proveedor = codigo_proveedor;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
    
    
}
