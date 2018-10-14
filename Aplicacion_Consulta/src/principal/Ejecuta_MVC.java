/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import javax.swing.JFrame;
import vista.Marco_Aplicacion2;//se importa en paquete para el uso de otra clase

/**
 *
 * @author Aaron
 */
public class Ejecuta_MVC {
    
    public static void main(String[] args) {
        Marco_Aplicacion2 mimarco = new Marco_Aplicacion2();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//cuado se cierra se termina el proceso
        mimarco.setVisible(true);//inicia la aplicacion
        
        
    }
    
}
