/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leyendo_escribiendo_bytes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Aaron
 */
public class Lectura_Escritura {
    
    public static void main(String[] args) {
        int contador=0;
        
        int datos_entrada[] = new int[300];
        
        try {
            
            FileInputStream archivo_lectura = new FileInputStream("C:/Users/Aaron/Desktop/leyendo/im.png");
            
            boolean final_ar = false;
            
            while(!final_ar){
                
                int byte_entrada=archivo_lectura.read();//leyendo bytes
                
                
                if(byte_entrada != -1)
                    datos_entrada[contador]=byte_entrada;    
                
                else    
                    final_ar=true;
                    
                    System.out.println(datos_entrada[contador]);
                    
                    contador++;
                
                
            }
            archivo_lectura.close();//se cierra el flujo de datos
            
            crea_fichero(datos_entrada);
        } catch (IOException e) {
            
            System.out.println("error");
        }
        System.out.println(contador);
        
    }
    
    static void crea_fichero (int datos_nuevo_fichero[]){
        
        try {
            
            FileOutputStream fichero_nuevo = new FileOutputStream("C:/Users/Aaron/Desktop/leyendo/imagen_copia.png");
            
            for (int i=0 ; i<datos_nuevo_fichero.length;i++){
            
                fichero_nuevo.write(datos_nuevo_fichero[i]);
            }
            
            fichero_nuevo.close();
            
            
        } catch (IOException e) {
        
        }
    }
    
}
