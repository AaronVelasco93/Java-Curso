/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exepciones;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Aaron
 */
public class Areas_Peso {

    public static void main(String[] args) {
    
        
     //   int figura;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Elije una opciones: \n1: Cuadrado \n2: Rectangulo \n3: Tringulo \n4: Circulo");
        
        try{
            
        figura= entrada.nextInt();
        //entrada.close();
        
        }catch(Exception e){
        
            System.out.println("Ha ocurrido un error");
        }finally{
            entrada.close();
        
        }
        switch (figura){
        
            case 1:
                
                int lado= Integer.parseInt(JOptionPane.showInputDialog("Introduce un lado"));
                    System.out.println(Math.pow(2, lado));
                break;
                
            case 2:
                
                int base= Integer.parseInt(JOptionPane.showInputDialog("Intruce la base"));
                int altura= Integer.parseInt(JOptionPane.showInputDialog("Intruce la base"));
                
                System.out.println("El area del rectangulo es: "+base*altura);
                break;
            
            case 3:
                 base= Integer.parseInt(JOptionPane.showInputDialog("Intruce la base"));
                 altura= Integer.parseInt(JOptionPane.showInputDialog("Intruce la base"));
                    
                 System.out.println("El area del rectangulo es: "+(base*altura)/2);
                break;
                
            case 4:
               
                int radio= Integer.parseInt(JOptionPane.showInputDialog("introduce Radio"));
                
                System.out.println("El area del cirsulo es");
                System.out.println(Math.PI*(Math.pow(radio, 2)));
                break;
            default:
                   System.out.println("La opciones no es correcta");
        }
        
//---------------------------------------------------------------------------------------------------   
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm"));
        System.out.println("Si eres hombre tu peso idea es: "+(altura-110)+"Kg");
        System.out.println("Si eres mujer tu peso idea es: "+(altura-120)+"Kg");
    
    }
    
static int figura;
        
    
    
}
