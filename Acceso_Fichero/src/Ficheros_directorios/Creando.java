/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ficheros_directorios;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aaron
 */
public class Creando {
    
    public static void main(String[] args) {
        File ruta = new File("C:/Users/Aaron/Desktop/leyendo/prueba2.txt");
        
        String archivo_destino=ruta.getAbsolutePath();
        try {
            //ruta.mkdir();
            ruta.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(Creando.class.getName()).log(Level.SEVERE, null, ex);
        }
        Escribiendo accede_es= new Escribiendo();
        
        accede_es.escribir(archivo_destino);    
    }
    
}

class Escribiendo{
    
    public void escribir(String ruta_archivo){
    
        String frase="esto es un ejemplo. Espero que salga";
        
        try{
            
            FileWriter escritura = new FileWriter(ruta_archivo);
            
            for (int i = 0; i < frase.length(); i++) {
                escritura.write(frase.charAt(i));
                
            }
            escritura.close();
            
        }catch(IOException e){}
        
        
    }

}
