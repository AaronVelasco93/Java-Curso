/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leyendo;

import java.io.BufferedReader;
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
            
            entrada = new FileReader("C:/Users/Aaron/Desktop/ejemplo.txt");
            
            BufferedReader mibuffer = new BufferedReader(entrada);//alaceana en un memoria intermedia el fichero de texto
            
            String linea="";
            
            while(linea != null){
                
                linea=mibuffer.readLine();
                
                if (linea!= null)
                 System.out.println(linea);
                
            }
            //entrada.close();//un flujo de datos deve ser cerrado siempre
        
        } catch (IOException ex) {
        
            System.out.println("No se a encontrado el archivo");
        }finally{
        
            try {
                entrada.close();
            } catch (IOException ex) {
                Logger.getLogger(Leer_Fichero.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
    }
    
    FileReader entrada;
}
