/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exepciones;

/**
 *
 * @author FUNAM 6
 */
public class Exepciones {
    
    public static void main(String[] args) {
        
        Cuenta c = new Cuenta();
         try {
            c.ingresar(100);
            c.extraer(120);// si sibre pasa el saldo que se tiene se crear una exepcion
        } catch (Exception e) {
            
             System.out.println("La cuenta no puede quedarce en numero rojos");
        }
        
        
    }
    
    
}

class Cuenta{

    double saldo;
    public Cuenta(){
    
        saldo=0;
    }
    
    public void ingresar(double c){
        saldo+=c;
            
    }
    
    
    public void extraer(double c) throws Exception{
    
        if(saldo<c){
            throw new Exception();
        }else {
            saldo-=c;
            //saldo=saldo-c;
        }
    }
    
    public double getSaldo(){
        return saldo;
    }
    
}