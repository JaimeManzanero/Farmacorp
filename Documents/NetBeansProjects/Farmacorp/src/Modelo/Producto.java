package modelo;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import excepciones.*;

/**
 *
 * @author PEDRO DEL BARRIO
 */
public class Producto {

    private int codigoProducto, stockMinimo, stockDisponible, unidadesPendientes, unidadesEncargadas;
    private String nombre, nombreFabricante, ubicacion;
    private double precioVenta, precioCoste;
    private Date fechaCaducidad;

    public Producto(int codigoProducto, String nombre, Date fechaCaducidad) {
        this.codigoProducto = codigoProducto;
        this.nombre = nombre;
        this.fechaCaducidad = fechaCaducidad;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public int getStockMinimo() {
        return stockMinimo;
    }

    public void setStockMinimo(int stockMinimo) {
        if (stockMinimo < 0) {
            throw new ErrorDatosNumericos("ERROR. EL STOCK MINIMO NO PUEDE SER NEGATIVO");
        }
        this.stockMinimo = stockMinimo;
    }

    public int getStockDisponible() {
        return stockDisponible;
    }

    public void setStockDisponible(int stockDisponible) {
        if (stockDisponible < 0) {
            throw new ErrorDatosNumericos("ERROR. EL STOCK DISPONIBLE NO PUEDE SER NEGATIVO");
        }
        this.stockDisponible = stockDisponible;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreFabricante() {
        return nombreFabricante;
    }

    public void setNombreFabricante(String nombreFabricante) {
        this.nombreFabricante = nombreFabricante;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        if (precioVenta < 0) {
            throw new ErrorDatosNumericos("ERROR. EL PRECIO DE VENTA NO PUEDE SER NEGATIVO");
        }
        this.precioVenta = precioVenta;
    }

    public double getPrecioCoste() {
        return precioCoste;
    }

    public void setPrecioCoste(double precioCoste) {
        if (precioCoste < 0) {
            throw new ErrorDatosNumericos("ERROR. EL PRECIO DE COSTE NO PUEDE SER NEGATIVO");
        }
        this.precioCoste = precioCoste;
    }

    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public int getUnidadesPendientes() {
        return unidadesPendientes;
    }

    public void setUnidadesPendientes(int unidadesPendientes) {
        if (unidadesPendientes < 0) {
            throw new ErrorDatosNumericos("ERROR. EL NUMERO DE UNIDADES PENDIENTES NO PUEDE SER NEGATIVO");
        }
        this.unidadesPendientes = unidadesPendientes;
    }

    public int getUnidadesEncargadas() {
        return unidadesEncargadas;
    }

    public void setUnidadesEncargadas(int unidadesEncargadas) {
        if (unidadesPendientes < 0) {
            throw new ErrorDatosNumericos("ERROR. EL NUMERO DE UNIDADES ENCARGADAS NO PUEDE SER NEGATIVO");
        }
        this.unidadesEncargadas = unidadesEncargadas;
    }

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
