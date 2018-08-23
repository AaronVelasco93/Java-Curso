/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Aaron
 */
public class Uso_Empleado {
    
    public static void main(String[] args) {
        
    }
    
}

class Empleado{
    
    public Empleado( String nom, double sue,int agno, int mes, int dia ){
         nombre=nom;
         
         sueldo=sue;
         
         GregorianCalendar calendario = new  GregorianCalendar(agno, mes-1, dia);// metodo no un variable
         
         altaContrato=calendario.getTime();
         
        
    
    }
    
    public String dameNombre(){//getter
    
        return nombre;
    }
    
    public double dameSueldo(){//getter
    
        return sueldo;
    }
    
    public Date dameFechaContrato(){//getter
    
        return altaContrato;
    }
    
    public void subeSueldo(double porcentaje){
        
        double aumento = sueldo*porcentaje/100;
            
        sueldo+=aumento;
    }
    
    
    private String nombre;
    private double sueldo;
    private Date altaContrato;
    
}