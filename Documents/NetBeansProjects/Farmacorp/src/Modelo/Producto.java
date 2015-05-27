package modelo;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import excepciones.*;

/**
 * Clase que representa un producto de la farmacia
 *
 * @author PEDRO DEL BARRIO
 * @version 1.0
 * @see excepciones.ErrorDatosNumericos
 */
public class Producto {

    private int codigoProducto, stockMinimo, stockDisponible, unidadesPendientes, unidadesEncargadas;
    private String nombre, nombreFabricante, ubicacion;
    private double precioVenta, precioCoste;
    private Date fechaCaducidad;

    /**
     * Constructor de la clase Producto con tres parametros de entrada.
     *
     * @param codigoProducto numero entero con el codigo a asignar al producto.
     * @param nombre cadena con el nombre a asignar al producto.
     * @param fechaCaducidad objeto de tipo Date con la fecha de caducidad
     * a asignar al producto.
     */
    public Producto(int codigoProducto, String nombre, Date fechaCaducidad) {
        this.codigoProducto = codigoProducto;
        this.nombre = nombre;
        this.fechaCaducidad = fechaCaducidad;
    }

    /**
     * Devuelve un numero entero con el codigo del producto.
     *
     * @return codigo del producto.
     */
    public int getCodigoProducto() {
        return codigoProducto;
    }
    
    /**
     * Asigna al atributo codigoProducto del producto el numero
     * entero pasado como parametro de entrada.
     *
     * @param codigoProducto el codigo numerico a asignar al producto.
     */
    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }
    
    /**
     * Devuelve un numero entero con el stock minimo asignado
     * al producto.
     *
     * @return stock minimo del producto.
     */
    public int getStockMinimo() {
        return stockMinimo;
    }
    
    /**
     * Asigna al atributo stockMinimo del producto el numero entero
     * pasado como parametro de entrada.
     *
     * @param stockMinimo el stock minimo a asignar al producto.
     *
     * @exception ErrorDatosNumericos si el stock minimo pasado
     * como parametro es negativo.
     * @see excepciones.ErrorDatosNumericos
     */
    public void setStockMinimo(int stockMinimo) {
        if (stockMinimo < 0) {
            throw new ErrorDatosNumericos("ERROR. EL STOCK MINIMO NO PUEDE SER NEGATIVO");
        }
        this.stockMinimo = stockMinimo;
    }
    
    /**
     * Devuelve un numero entero con el stock disponible
     * del producto.
     *
     * @return stock minimo del producto.
     */
    public int getStockDisponible() {
        return stockDisponible;
    }
    
    /**
     * Asigna al atributo stockDisponible del producto el numero entero
     * pasado como parametro de entrada.
     *
     * @param stockDisponible el stock disponible a asignar al producto.
     *
     * @exception ErrorDatosNumericos si el stock disponible pasado
     * como parametro es negativo.
     * @see excepciones.ErrorDatosNumericos
     */
    public void setStockDisponible(int stockDisponible) {
        if (stockDisponible < 0) {
            throw new ErrorDatosNumericos("ERROR. EL STOCK DISPONIBLE NO PUEDE SER NEGATIVO");
        }
        this.stockDisponible = stockDisponible;
    }
    
    /**
     * Devuelve una cadena con el nombre del producto.
     *
     * @return nombre del producto.
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Asigna al atributo nombre del producto la cadena
     * pasada como parametro de entrada.
     *
     * @param nombre el nombre del producto.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Devuelve una cadena con el nombre del fabricante
     * del producto.
     *
     * @return nombreFabricante del producto.
     */
    public String getNombreFabricante() {
        return nombreFabricante;
    }
    
    /**
     * Asigna al atributo nombreFabricante del producto la cadena
     * pasada como parametro de entrada.
     *
     * @param nombreFabricante el nombre del fabricante del
     * producto.
     */
    public void setNombreFabricante(String nombreFabricante) {
        this.nombreFabricante = nombreFabricante;
    }
    
    /**
     * Devuelve una cadena que representa la ubicacion del
     * producto en la farmacia, segun la codificadion empleada
     * para ello.
     *
     * @return codigo de la ubicacion del producto en la farmacia.
     */
    public String getUbicacion() {
        return ubicacion;
    }
    
    /**
     * Asigna al atributo ubicacion del producto la cadena
     * pasada como parametro de entrada.
     *
     * @param ubicacion el codigo que representa la ubicacion
     * del producto en la farmacia.
     */
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    /**
     * Devuelve un numero real con el precio de venta
     * del producto.
     *
     * @return precio de venta del producto.
     */
    public double getPrecioVenta() {
        return precioVenta;
    }
    
    /**
     * Asigna al atributo precioVenta del producto el numero real pasado
     * como parametro de entrada.
     *
     * @param precioVenta el precio de venta a asignar al producto.
     *
     * @exception ErrorDatosNumericos si el precio de venta pasado
     * como parametro es negativo.
     * @see excepciones.ErrorDatosNumericos
     */
    public void setPrecioVenta(double precioVenta) {
        if (precioVenta < 0) {
            throw new ErrorDatosNumericos("ERROR. EL PRECIO DE VENTA NO PUEDE SER NEGATIVO");
        }
        this.precioVenta = precioVenta;
    }
    
    /**
     * Devuelve un numero real con el precio de coste
     * del producto.
     *
     * @return precio de coste del producto.
     */
    public double getPrecioCoste() {
        return precioCoste;
    }
    
    /**
     * Asigna al atributo precioCoste del producto el numero real pasado
     * como parametro de entrada.
     *
     * @param precioCoste el precio de coste a asignar al producto.
     *
     * @exception ErrorDatosNumericos si el precio de coste pasado
     * como parametro es negativo.
     * @see excepciones.ErrorDatosNumericos
     */
    public void setPrecioCoste(double precioCoste) {
        if (precioCoste < 0) {
            throw new ErrorDatosNumericos("ERROR. EL PRECIO DE COSTE NO PUEDE SER NEGATIVO");
        }
        this.precioCoste = precioCoste;
    }
    
    /**
     * Devuelve la fecha de caducidad del producto.
     *
     * @return objeto de tipo Date con la fecha
     * de caducidad del producto.
     */
    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }
    
    /**
     * Asigna al atributo fechaCaducidad del producto el objeto
     * de tipo Date pasado como parametro de entrada.
     *
     * @param fechaCaducidad la fecha de caducidad a asignar al
     * producto.
     */
    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
    
    /**
     * Devuelve un numero entero con el numero de unidades
     * pendientes de recepcion de este producto.
     *
     * @return numero de unidades pendientes de recepcion
     * del producto.
     */
    public int getUnidadesPendientes() {
        return unidadesPendientes;
    }
    
    /**
     * Asigna al atributo unidadesPendientes del producto el entero pasado 
     * como parametro de entrada.
     *
     * @param unidadesPendientes el numero de unidadesPendientes de recepción
     * del producto.
     *
     * @exception ErrorDatosNumericos si el numero de unidades pendientes pasado
     * como parametro es negativo.
     * @see excepciones.ErrorDatosNumericos
     */
    public void setUnidadesPendientes(int unidadesPendientes) {
        if (unidadesPendientes < 0) {
            throw new ErrorDatosNumericos("ERROR. EL NUMERO DE UNIDADES PENDIENTES NO PUEDE SER NEGATIVO");
        }
        this.unidadesPendientes = unidadesPendientes;
    }
    
    /**
     * Devuelve un numero entero con el numero de unidades
     * encargadas de este producto.
     *
     * @return numero de unidades encargadas del producto.
     */
    public int getUnidadesEncargadas() {
        return unidadesEncargadas;
    }
    
    /**
     * Asigna al atributo unidadesEncargadas del producto el entero pasado 
     * como parametro de entrada.
     *
     * @param unidadesEncargadas el numero de unidadesEncargadas del producto.
     *
     * @exception ErrorDatosNumericos si el numero de unidades encargadas pasado
     * como parametro es negativo.
     * @see excepciones.ErrorDatosNumericos
     */
    public void setUnidadesEncargadas(int unidadesEncargadas) {
        if (unidadesPendientes < 0) {
            throw new ErrorDatosNumericos("ERROR. EL NUMERO DE UNIDADES ENCARGADAS NO PUEDE SER NEGATIVO");
        }
        this.unidadesEncargadas = unidadesEncargadas;
    }
    
    /**
     * Devuelve una cadena con informacion sobre los datos de un
     * producto.
     *
     * @return datos del producto con formato.
     */
    @Override
    public String toString() {
        Locale fEspanyol = new Locale("es", "ES", "Traditional_WIN");
        DateFormat formatoFecha = DateFormat.getDateInstance(DateFormat.SHORT, fEspanyol);
        String fechaCadFormateada = formatoFecha.format(fechaCaducidad);

        return "CODIGO: " + codigoProducto + "\nNOMBRE: " + nombre + "\t\tFABRICANTE: " + nombreFabricante
                + "\nFECHA CADUCIDAD: " + fechaCadFormateada + "\nSTOCK MINIMO: " + stockMinimo
                + "\t\tSTOCK DISPONIBLE: " + stockDisponible + "\nPRECIO COSTE: " + precioCoste
                + "\t\tPRECIO VENTA: " + precioVenta + "\nUBICACION: " + ubicacion
                + "\nUNIDADES PENDIENTES: " + unidadesPendientes + "\t\tUNIDADES ENCARGADAS: " + unidadesEncargadas;
    }

}
