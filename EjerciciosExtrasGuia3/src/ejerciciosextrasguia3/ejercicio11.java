/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosextrasguia3;

import java.util.Scanner;

/**
 *
 * @author Uriel
 */
public class ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese un numero");
        Scanner leer = new Scanner(System.in);
        int n = leer.nextInt();
        int cont=0;
        while(n > 0){
        n = n/10;
        cont++;
    }           
        System.out.println("Cantidad de numeros :" + cont);   
}
}
