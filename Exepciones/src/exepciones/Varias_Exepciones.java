/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exepciones;

import javax.swing.JOptionPane;

/**
 *exepcion no controladas mala practica de programacion
 * @author Aaron
 */
public class Varias_Exepciones {
    public static void main(String[] args) {
        
        try{
        
        division();
        }catch(ArithmeticException e){
            System.out.println("Estas dividiendo por 0");
        
        }catch(NumberFormatException e){
        
            System.out.println("no se introdujo un numero entero");
           // System.out.println(e.getMessage());
            System.out.println("se genero un error de este tipo:"+e.getClass().getName());
        }
        
    }
    
    
    static void division(){//metodo estatico
        
        //casteo
        int num1= Integer.parseInt(JOptionPane.showInputDialog("Introduce dividendo"));
        
        int num2= Integer.parseInt(JOptionPane.showInputDialog("Introduce divisor"));
        
        System.out.println("El resultado es: "+num1/num2);
        
    
    }
}
