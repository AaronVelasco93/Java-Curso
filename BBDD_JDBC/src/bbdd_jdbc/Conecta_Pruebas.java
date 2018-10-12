/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbdd_jdbc;
import java.sql.*;

/**
 *
 * @author Aaron
 */
public class Conecta_Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        try{
            //1 crear una conexion
            Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba_venta", "root", "");
            
            //2 crear objeto statement
            Statement miStatement = miConexion.createStatement();
            
            //3. ejecutar la instrucion slq
            ResultSet miResulset = miStatement.executeQuery("SELECT * FROM productos");
            
            //4 recorrer el resulset
            while (miResulset.next()) {                
                System.out.println(miResulset.getString("NOMBREARTICULO")+" "+miResulset.getString("CODIGOARTICULO")+" "+miResulset.getString("PRECIO"));
            }
        }catch(Exception e){
            System.out.println("No conecta");
            e.printStackTrace();
        }
        
        
    }
    
}
