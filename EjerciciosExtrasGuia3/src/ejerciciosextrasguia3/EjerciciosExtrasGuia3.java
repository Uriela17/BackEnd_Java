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
public class EjerciciosExtrasGuia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese el tipo de socio");
       String tipo = leer.next();
       System.out.println("Ingrese el costro del tratamiento");
       double valorTratamiento = leer.nextDouble();
       double valorConDescuento = 0;
       if(tipo.equals("A")){
           valorConDescuento = valorTratamiento/2;
       }
       if(tipo.equals("B")){
           valorConDescuento = (valorTratamiento*35)/100;
       }
       if(tipo.equals("C")) {
            valorConDescuento = valorTratamiento;
       }
        System.out.println("El valor a pagar es: " + valorConDescuento);
    }
    
}
