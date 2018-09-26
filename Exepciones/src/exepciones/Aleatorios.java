/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exepciones;

import javax.swing.JOptionPane;

/**
 *
 * @author Aaron
 */
public class Aleatorios {
    
    
    public static void main(String[] args) {
        
        int elementos = Integer.parseInt(JOptionPane.showInputDialog("Introduce elementos de la matriz"));
        
        int num_aleat[]= new int [elementos];
        
        for (int i=0; i< num_aleat.length;i++ ){
            
            num_aleat[i]=(int) Math.random() * 100;//numero random de 0 a 100
        
        }
        for (int elem:num_aleat){
            System.out.println(elem);
        }
        
        
    }
    
}
