/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

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
       /*Escribir un programa que pida dos números enteros por teclado y 
        calcule la suma de los dos. El programa deberá después mostrar el
        resultado de la suma */
       Scanner leer = new Scanner(System.in);
       int num1, num2, resultado;
       
        System.out.println("Ingrese un numero");
        num1 = leer.nextInt();
        System.out.println("Ingrese otro numero");
        num2 = leer.nextInt();
        resultado = num1 + num2;
        System.out.println("El resultado es "+ resultado);
    }
 
}
