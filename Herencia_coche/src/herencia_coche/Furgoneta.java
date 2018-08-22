/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_coche;

/**
 *
 * @author Aaron
 */
//furgoneta hereda de la clase coche
public class Furgoneta extends Coche{
    
    private int capasidad_carga;
    private int asientos_extra;

    public Furgoneta(int capasidad_carga, int asientos_extra) {
        
        super();//llama a el contructor de la clase pladre
        
        this.capasidad_carga = capasidad_carga;
        this.asientos_extra = asientos_extra;
        
    }

    public String getCapasidad_cargaFu() {
        return "la capasisdad de carga es: "+capasidad_carga+"  Y los asientos que tiene son: "+asientos_extra;
    }

    public void setCapasidad_carga(int capasidad_carga) {
        this.capasidad_carga = capasidad_carga;
    }

    public int getAsientos_extra() {
        return asientos_extra;
    }

    public void setAsientos_extra(int asientos_extra) {
        this.asientos_extra = asientos_extra;
    }

   
    
    
    
    
}
