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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Dada una cantidad de grados centígrados se debe mostrar su
equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32
+ (9 * C / 5).*/
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los grados a convertir");
        double grados  = leer.nextDouble();
        double f = 32 + (9 * grados/5);
        System.out.println(grados + " en Fahrenheint: " + f);
    }
    
}
