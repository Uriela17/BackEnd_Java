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
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Dado un tiempo en minutos, calcular su equivalente en días y horas.
        Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe 
        calcular su equivalente: 1 día, 2 horas.*/
         Scanner leer = new Scanner(System.in);
         System.out.println("Ingrese el tiempo en minutos");
         int minutos = leer.nextInt();
         int cont = 0;
         int horas = minutos/60;
         int dias = horas/24;
         int restoDias = horas % 24;
         int restoHoras = minutos % 60;
         while (minutos > 0){
            if(restoDias == 0){
                System.out.println("Dias: " + dias);
                minutos = minutos - 1440;
                horas = horas - 24;
                cont++;
            }else{
                if(dias > 0 && minutos > 0){
                   horas = horas - 24; 
                }
                System.out.println("Dias : " + dias + " horas : " + horas);
                minutos = minutos - 1440;
                }
            } 
             
         }
       
        
    }
    

