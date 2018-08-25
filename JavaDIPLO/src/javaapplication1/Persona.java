/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author FUNAM 6
 */
public class Persona implements Cloneable{
    String nombre;
    int edad;
    float sueldo;

    Persona(String a, int b, int c){
    
        nombre=a;
        edad=b;
        sueldo=c;
    
    }

     Persona() {
         nombre="";
         edad=0;
         sueldo=(float)0.0;
         
    }
     
     @Override
     protected Object clone() throws CloneNotSupportedException{
         return super.clone();
     }
    
    


    
    
   
    
    
    
}
