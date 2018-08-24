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
        
        
       /** Empleado empleado1 = new Empleado("Aaron", 85000, 2018, 05, 12);
       Empleado empleado2 = new Empleado("Ana", 56000, 2017, 06, 02);
       Empleado empleado3 = new Empleado("Jona", 58000, 2013, 12, 25);
       
       empleado1.subeSueldo(5);
       empleado2.subeSueldo(5);
       empleado3.subeSueldo(5);
       
       System.out.println("Nombre: "+empleado1.dameNombre()+" Sueldo: "+empleado1.dameSueldo()
        +" Fecha de alta: "+empleado1.dameFechaContrato());
        
       System.out.println("Nombre: "+empleado2.dameNombre()+" Sueldo: "+empleado2.dameSueldo()
        +" Fecha de alta: "+empleado2.dameFechaContrato());
       
       System.out.println("Nombre: "+empleado3.dameNombre()+" Sueldo: "+empleado3.dameSueldo()
        +" Fecha de alta: "+empleado3.dameFechaContrato()); */
       
       Empleado [] misEmpleados= new Empleado[3];
       
       misEmpleados[0] = new Empleado("Aaron", 85000, 2018, 05, 12);
       misEmpleados[1] = new Empleado("Ana", 56000, 2017, 06, 02);
       misEmpleados[2] = new  Empleado("Jona", 58000, 2013, 12, 25);
       
       
      
       
       /* for (int i=0 ; i<3;i++){//se usa una aareglo para recorrer la informacion
       
           misEmpleados[i].subeSueldo(i);
       }*/
        for (Empleado e: misEmpleados){//for mejorado
       
            e.subeSueldo(5);
       }
       
       /*for(int i=0 ; i<3; i++ ){
    
            System.out.println("Dame Nombre: "+misEmpleados[i].dameNombre()+" Sueldo: "+misEmpleados[i].dameSueldo()
                    +" Dame Alta Contrato: "+misEmpleados[i].dameFechaContrato());
        }*/
       
        for (Empleado e : misEmpleados) {//for mejorado
              System.out.println("Dame Nombre: "+ e.dameNombre()+" Sueldo: "+ e.dameSueldo()
                    +" Dame Alta Contrato: "+ e .dameFechaContrato());  
            
        }
       
       
    }
    
}

class Empleado{
    
    public Empleado( String nom, double sue,int agno, int mes, int dia ){//Contructor para dar estadio inicial a los objetos
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