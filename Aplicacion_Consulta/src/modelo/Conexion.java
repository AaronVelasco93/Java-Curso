/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Aaron
 */
public class Conexion {
    Connection miConexion = null;
    
    public Conexion(){
    
    }
    
    public Connection dameConexion (){
        
        try {
            //1 crear una conexion -> asignan parametros
            miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba_venta", "root", "");
            
        }catch(Exception e){
        
        }
        return miConexion;
        
}
    
}
