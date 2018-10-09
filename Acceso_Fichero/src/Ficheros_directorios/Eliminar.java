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
public class Eliminar {

    public static void main(String[] args) {
        
        File ruta = new File("C:/Users/Aaron/Desktop/leyendo/prueba2.txt");
        //eliminar archivo
        ruta.delete();
    }
    
}
