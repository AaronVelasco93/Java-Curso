/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acceso_fichero;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aaron
 */
public class Acceso_Fichero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        Leer_Fichero accediendo = new Leer_Fichero();
        
        accediendo.lee();
    }
    
}

class Leer_Fichero{
    
    public void lee(){
        //exepcion para busqueda de un archico de texto
        try {
            
            FileReader entrada = new FileReader("C:/Users/Aaron/Desktop/ejemplo.txt");
            
            int c = entrada.read();
            
            while(c!= -1){
                c = entrada.read();
                
                char letra=(char)c;//cateo
                        System.out.print(letra);
                                
            
            }
            entrada.close();//un flujo de datos deve ser cerrado siempre
        
        } catch (IOException ex) {
        
            System.out.println("No se a encontrado el archivo");
        }
    
    }
    
    
}
