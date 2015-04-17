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
public class VentaRecetaSeguroPrivado extends Venta {
    private int codigo_Mutua;
    public VentaRecetaSeguroPrivado(String codigo_Empleado) {
        super(codigo_Empleado);
    }

    public int getCodigo_Mutua() {
        return codigo_Mutua;
    }

    public void setCodigo_Mutua(int codigo_Mutua) {
        this.codigo_Mutua = codigo_Mutua;
    }
    
    @Override
    public String imprimirVenta(){
        
        return super.imprimirVenta()+"\n"+               
               "El estilo es:"+this.codigo_Mutua+"\n";
                      
    }
    
}
