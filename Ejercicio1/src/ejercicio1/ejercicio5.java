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
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escribir un programa que lea un número entero por teclado y muestre
        por pantalla el doble, el triple y la raíz cuadrada de ese número.
        Nota: investigar la función Math.sqrt().*/
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número");
        double n  = leer.nextDouble();
        double doble = n*2;
        double triple = n*3;
        double raiz = Math.sqrt(n);
        System.out.println("El doble de " + n + " es: " + doble);
        System.out.println("El triple de " + n + " es: " + triple);
        System.out.println("La raiz de " + n + " es: " + raiz);
    }
    
}
