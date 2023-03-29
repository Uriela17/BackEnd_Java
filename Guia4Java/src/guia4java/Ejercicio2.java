/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4java;

import java.util.Scanner;

/**
 *
 * @author Uriel
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         String rta;
         do{
             System.out.println("Desea Ingresar a una persona?");
             rta = leer.next();
             if(rta.equals("si")){
                 System.out.println("Ingrese nombre y edad");
                 String nombre = leer.next();
                 int edad = leer.nextInt();
                 informacion(nombre,edad);
             }
         }while(rta.equals("si"));
    }
    public static void informacion(String nombre, int edad){
        System.out.println("Nombre: " + nombre + " edad: " + edad);
        if (edad > 17){
            System.out.println("Mayor");
        }else{
            System.out.println("Menor");
        }
    }
}
