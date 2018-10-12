/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbdd_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Aaron
 */
public class modifica_BBDD {
    
    public static void main(String[] args) {
        try{
            //1 crear una conexion
            Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba_venta", "root", "");
            
            //2 crear objeto statement
            Statement miStatement = miConexion.createStatement();
            
           String instruccionSql;
           // instruccionSql = "INSERT INTO productos (CODIGOARTICULO,NOMBREARTICULO,PRECIO) VALUES('AR77','PANTALON',25.35)";
            
            //instruccionSql = "update productos set precio=precio*2 where codigoarticulo='AR77'";
            
            instruccionSql = "delete from productos where codigoarticulo='AR77'";
            miStatement.executeUpdate(instruccionSql);
            
             System.out.println("Datos modificados correctamente");
           
            
        }catch(SQLException e){
            System.out.println("No conecta");
            e.printStackTrace();
        }
    }
    
}
