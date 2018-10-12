/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbdd_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aaron
 */
public class ConsultaPreparada {
    
    public static void main(String[] args)  {
        
        try {
            //1 crear una conexion
            Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba_venta", "root", "");
            
            //2. preparar las consulta
            
            PreparedStatement miSentencia = miConexion.prepareStatement("SELECT NOMBREARTICULO, SECCION, PAISDEORIGEN FROM PRODUCTOS"
                    + "WHERE SECCION=? AND PAISDEORIGEN=?");
            
            //3. ESTABLECER LOS PARAMETROS DE CONSULTA
            
            miSentencia.setString(1, "deportes");
            miSentencia.setString(2, "USA");
            
            try ( //4. EJECUTAR Y RECORRER LA CONSULTA
                    ResultSet rst = miSentencia.executeQuery()) {
                while (rst.next()) {
                    
                    System.out.println(rst.getString(1)+" "+rst.getString(2)+" "+rst.getString(3));
                    
                }
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaPreparada.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
