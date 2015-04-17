/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author German
 */
public class VentaRecetaElectronica extends Venta{
    
    private String num_SIP,codigo_Receta,nombre_Paciente;

    public VentaRecetaElectronica(String codigo_Empleado) {
        super(codigo_Empleado);
    }

    public String getNum_SIP() {
        return num_SIP;
    }

    public void setNum_SIP(String num_SIP) {
        this.num_SIP = num_SIP;
    }

    public String getCodigo_Receta() {
        return codigo_Receta;
    }

    public void setCodigo_Receta(String codigo_Receta) {
        this.codigo_Receta = codigo_Receta;
    }

    public String getNombre_Paciente() {
        return nombre_Paciente;
    }

    public void setNombre_Paciente(String nombre_Paciente) {
        this.nombre_Paciente = nombre_Paciente;
    }
    
     @Override
    public String imprimirVenta(){
        
        return super.imprimirVenta()+"\n"+
               "El año de fabricacion es"+this.codigo_Receta+"\n"+
               "El tipo de madera es"+this.nombre_Paciente+"\n"+
               "El estilo es:"+this.num_SIP+"\n";
                
    }
    
    
}
