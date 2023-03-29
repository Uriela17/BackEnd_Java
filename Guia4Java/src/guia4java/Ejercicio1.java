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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crea una aplicación que le pida dos números al usuario y este pueda
        elegir entre sumar, restar, multiplicar y dividir. La aplicación debe 
        tener una función para cada operación matemática y deben devolver sus 
        resultados para imprimirlos en el main.*/
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros");
        int n1 = leer.nextInt();
        int n2 = leer.nextInt();
        
        System.out.println("¿Que desea hacer?");
        System.out.println("1- Sumar");
        System.out.println("2- Restar");
        System.out.println("3- Multiplicar");
        System.out.println("4- Dividir");
        int opcion = leer.nextInt();
        switch(opcion){
          case 1:
              System.out.println(suma(n1,n2));
          break;
          case 2:
              System.out.println(resta(n1,n2));
          break;
          case 3:
              System.out.println(multiplicacion(n1,n2));
          break;
          case 4:
              System.out.println(div(n1,n2));
          break;
    }
        
    }
    public static int suma(int n1, int n2) {
        return n1 + n2;
    }
    
    public static int resta(int n1, int n2) {
        return n1 - n2;
    }
    
    public static int multiplicacion(int n1, int n2) {
        return n1 * n2;
    }
    
    public static double div(int n1, int n2) {
        return n1 / n2;
    }
}
