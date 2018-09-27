/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ficheros_directorios;

import java.io.File;

/**
 *
 * @author Aaron
 */
public class Acceso_ficheros {
    
    
    public static void main(String[] args) {
        
        //ruta
        File ruta = new File("C:/Users/Aaron/Desktop/leyendo");
        
        System.out.println(ruta.getAbsoluteFile());
        

        //listar el contenido de lo que esta dentro de la carpeta leyendo
               
        String[] nombres_archivos = ruta.list();
        
        for (int i=0;i<nombres_archivos.length;i++){
        
                System.out.println(nombres_archivos[i]);
                
                File f = new File(ruta.getAbsoluteFile(), nombres_archivos[i]);
                
                if (f.isDirectory()){
                    String [] archivos_subcarpeta=f.list();
                    
                    for(int j=0; j<archivos_subcarpeta.length;j++){
                        
                        System.out.println(archivos_subcarpeta[j]);
                    }
                    
                }
                
        }
    }
    
}
