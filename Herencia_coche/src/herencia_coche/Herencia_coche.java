/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_coche;

import javax.swing.JOptionPane;

/**
 *
 * @author Aaron
 */
public class Herencia_coche {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Coche micoche1 = new Coche();
        micoche1.establece_color("Azul");

        Furgoneta mifurgoneta1 = new Furgoneta(520, 9);

        mifurgoneta1.establece_color("Azul Marino");
        mifurgoneta1.configura_asientos("Si");
        mifurgoneta1.configura_climatizador("Si");
        
        
        System.out.println("Mi Coche1: "+micoche1.dime_datos_generales()+" -> "+micoche1.dime_color());
       
        
        System.out.println("Mi furgoneta1:"+mifurgoneta1.dime_datos_generales()+" -> Datos Extras ->"+mifurgoneta1.getCapasidad_cargaFu());
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*
        Coche micoche=new Coche();
        
        micoche.establece_color(JOptionPane.showInputDialog("Introduce color: "));
        System.out.println("Dime datos generales"+micoche.dime_datos_generales());
        
        System.out.println(micoche.dime_datos_color("Azul"));
        
        System.out.println(micoche.dime_color());
        
        micoche.configura_asientos(JOptionPane.showInputDialog("Tiene asientos de cuero"));
        
        System.out.println("Dime que asientos tiene: "+micoche.dime_asientos());
        
        
        micoche.configura_climatizador(JOptionPane.showInputDialog("¿Tiene climatizador?"));
        
        System.out.println("Dime climatizador"+micoche.dime_climatizador());
        
        
        System.out.println("Peso del coche"+micoche.dime_peso_coche());
        
        
         */
    }

}
