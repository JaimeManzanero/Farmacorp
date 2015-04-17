/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author German
 */
 

    public class Venta {
    
    public enum TipoPago {
    tarjeta,efectivo;
    }
    
    private int codigo_Venta,aporatacion_Paciente;
    private double precio_Total;
    private String codigo_Empleado;
    private Date fecha_Venta;
    private TipoPago forma_Pago;
    private static int id_Venta;

    public Venta(String codigo_Empleado) {
        id_Venta++;
        this.codigo_Empleado=codigo_Empleado;
        this.codigo_Venta = id_Venta;
        this.fecha_Venta = new Date();
    }

    public int getCodigo_Venta() {
        return codigo_Venta;
    }

    public void setCodigo_Venta(int codigo_Venta) {
        this.codigo_Venta = codigo_Venta;
    }

    public double getPrecio_Total() {
        return precio_Total;
    }

    public void setPrecio_Total(int precio_Total) {
        this.precio_Total = precio_Total;
    }

    public int getAporatacion_Paciente() {
        return aporatacion_Paciente;
    }

    public void setAporatacion_Paciente(int aporatacion_Paciente) {
        this.aporatacion_Paciente = aporatacion_Paciente;
    }

    public String getCodigo_Empleado() {
        return codigo_Empleado;
    }

    public void setCodigo_Empleado(String codigo_Empleado) {
        this.codigo_Empleado = codigo_Empleado;
    }

    public Date getFecha_Venta() {
        return fecha_Venta;
    }

    public void setFecha_Venta(Date fecha_Venta) {
        this.fecha_Venta = fecha_Venta;
    }

    public TipoPago getForma_Pago() {
        return forma_Pago;
    }

    public void setForma_Pago(TipoPago forma_Pago) {
        this.forma_Pago = forma_Pago;
    }
    
    public  String imprimirVenta(){
        return "El Codigo Venta es "+this.codigo_Venta+ "\n"+
               "La Fecha es"+this.fecha_Venta+"\n"+
               "El precio es"+this.precio_Total+"\n"+
               "La forma de pago es "+this.forma_Pago+"\n"+
               "La aportacion del paciente fue "+this.aporatacion_Paciente+"\n";
    }
    
    
    
    
    
    
    
    
    
    
}
