/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procAlmacenado;
import java.sql.*;
/**
 *
 * @author Aaron
 */
public class ConsultaClientes {
    public static void main(String[] args) {
        try {
            
            Connection  miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba_venta", "root", "");
            
            CallableStatement miSentencia = miConexion.prepareCall("{call MUESTRA_CLIENTES}");
            
            ResultSet rs = miSentencia.executeQuery();
            
            while (rs.next()) {                
                
                System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
                
            }
            rs.close();
        } catch (Exception e) {
        }
        
        
    }
    
}
