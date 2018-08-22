/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author Aaron
 */
public class Uso_Coche {
    
    
    public static void main(String[] args) {
        
     
        Coche miCoche = new Coche();
          
        miCoche.establece_color("verde");//Pasar valor por argumento
       
        System.out.println(miCoche.dime_datos_generales());
        
        System.out.println(miCoche.dime_color());
        
        miCoche.configura_asientos("no");
        System.out.println(miCoche.dime_asientos());
       
        
    }
    
}
