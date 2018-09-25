/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exepciones;

import java.io.EOFException;
import javax.swing.JOptionPane;

/**
 *
 * @author Aaron
 */
public class Comprueba_mail {

    public static void main(String[] args) {

        String el_email = JOptionPane.showInputDialog("Introduce email");
        
        try{
        examina_mail(el_email);
        
           
        }catch(Exception e){
            
            System.out.println("La direcion no es correcta");
            e.printStackTrace();
        
        
        }
    }

    static void examina_mail(String mail) throws Longitud_mail_erronea{

        int arroba = 0;

        boolean punto = true;

        if (mail.length() <= 3) {

            //throw  new EOFException();//una exepcion por default
            
            throw new Longitud_mail_erronea("un mensaje");
        } else {

            for (int i = 0; i < mail.length(); i++) {

                if (mail.charAt(i) == '@') {

                    arroba++;

                }
                if (mail.charAt(i) == '.') {

                    punto = true;
                }
            }
            if (arroba == 1 && punto == true) {
                System.out.println("Es correcto");
            } else {
                System.out.println("no es correcto");

            }

        }

    }

}

class Longitud_mail_erronea extends Exception {
    
    public Longitud_mail_erronea(){ }
    
    public Longitud_mail_erronea(String msj_error){
        
        super(msj_error);
    }
}
