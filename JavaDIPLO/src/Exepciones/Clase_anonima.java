/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exepciones;

import java.util.ArrayList;

/**
 *
 * @author FUNAM 6
 */
public class Clase_anonima {
    
    private static final String[] colores={"verde","amarillo","azul","negro","gris"};
    
    
    public static void main(String[] args) {
        
        ArrayList <String> lista = new ArrayList <String>();
        
        
        for(String color:colores){
        
            lista.add(color);
        }
        //System.out.println(lista.isEmpty());
        
        
    }
    
}
