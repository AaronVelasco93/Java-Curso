/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo2;
import java.sql.*;

/**
 *
 * @author FUNAM 6
 */
public class TestMysql {

    public static void main(String[] args) {
        
        
        String host;
        String dbName;
        try {
            host="jdbc:mysql://3308/";//ip
            dbName="ventas";//nombre de la base de datos
            
            Connection db = DriverManager.getConnection(host+dbName,"root","");//Host+base de datos + usuario y contraseña 
            Statement st = db.createStatement();
            
            ResultSet rs = st.executeQuery("Select* from clientes");
            
            
            if (rs.wasNull()){
                System.out.println("Nada");
            }else{
                while(rs.next()){
                    System.out.println("nombre:"+rs.getString(1));
                }
            }
            
            rs.close();
            st.close();
            db.close();
                    
            
        } catch (SQLException e) {
            System.out.println("Problema sin conexion\n"+e);
        
        }
        
    }

    
}
