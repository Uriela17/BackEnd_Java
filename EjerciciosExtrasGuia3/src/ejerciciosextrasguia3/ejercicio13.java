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
public class ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* Crear un programa que dibuje una escalera de números, donde cada línea
        de números comience en uno y termine en el número de la línea. Solicitar 
        la altura de la escalera al usuario al comenzar. Ejemplo: si se ingresa 
        el número 3:*/
        System.out.println("Ingrese la altura de la escalera");
        Scanner leer = new Scanner(System.in);
        int altura = leer.nextInt();
        for (int j=1;j<altura+1;j++){
            for (int i=1;i<j+1;i++){
            System.out.print(i);
                
        }
        System.out.println("");
    }
    
}
    }
