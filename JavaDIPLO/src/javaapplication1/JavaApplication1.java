/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author FUNAM 6
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Persona oficina[] = new Persona[5];
        Persona temp = new Persona();

        oficina[0] = new Persona("Aaron", 40, 20000);
        oficina[1] = new Persona("Analia", 23, 12000);
        oficina[2] = new Persona("Jon", 13, 16000);
        oficina[3] = new Persona("Felipe", 56, 85000);
        //temp = oficina[3];

        try {
            temp=(Persona)oficina[3].clone();
        } catch (Exception e) {
            System.out.println("No se puede clonar");
        }
    


        System.out.println("Los datos de la persona 1 es: ");

        System.out.println(temp.edad + temp.sueldo + temp.nombre);

        oficina[3].sueldo = 19000;
        System.out.println("Los Datos de temp son: ");
        System.out.println("Nombre: "+temp.nombre+" Edad: " + temp.edad+" Sueldo: " + temp.sueldo);

    }

}
