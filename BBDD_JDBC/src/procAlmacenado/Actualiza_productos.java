/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procAlmacenado;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Aaron
 */
public class Actualiza_productos {
    
    public static void main(String[] args) {
        
        int nPrecion=Integer.parseInt(JOptionPane.showInputDialog("Introduce precio"));
        String nArticulo=JOptionPane.showInputDialog("Introduce nombre articulo");
        
             try {
            
            Connection  miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba_venta", "root", "");
            
            CallableStatement miSentencia = miConexion.prepareCall("{call ACTUALIZA_PROD(?,?)}");
            
            miSentencia.setInt(1, nPrecion);
            miSentencia.setString(2,nArticulo);
            
            miSentencia.execute();
            
                 System.out.println("Actualizacion OK");
            
            
             }catch(Exception e){
             
             
             }
    }
}
