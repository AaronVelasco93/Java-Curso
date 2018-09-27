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
public class Pruebas_rutas {
    
    
    public static void main(String[] args) {
        
        //comprueba si un carpeta existe
        File archivo = new File("src"); //creando un archivo
            
        //ruta absoluta
        System.out.println(archivo.getAbsolutePath());
        
        //testea si existe el archivo
        System.out.println(archivo.exists());
    
    }
    
   
    
}
