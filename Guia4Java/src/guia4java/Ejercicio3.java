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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crea una aplicación que a través de una función nos convierta una 
        cantidad de euros introducida por teclado a otra moneda, estas pueden
        ser a dólares, yenes o libras. La función tendrá como parámetros, la 
        cantidad de euros y la moneda a convertir que será una cadena, este no
        devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
        El cambio de divisas es:
        i.    * 0.86 libras es un 1 €
        ii.   * 1.28611 $ es un 1 €
        iii.  * 129.852 yenes es un 1 € */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una cantidad en euros");
        int euros = leer.nextInt();
        System.out.println("¿A que lo quiere convertir?");
        System.out.println("Dolares");
        System.out.println("Yenes");
        System.out.println("Libras");
        String opcion = leer.next();
        conversion(opcion, euros);
    }
    public static void conversion(String opcion, int euros) {
    
        double convertida = 0; 
        if (opcion.equals("dolares")){
            convertida = euros * 1.28611;
        }
        if (opcion.equals("yenes")){
            convertida = euros * 0.86;
        }
        if (opcion.equals("libras")){
            convertida = euros * 129.852;
        }
        System.out.println(euros + "€" + " = " + convertida + " " + opcion);
}
    
}
