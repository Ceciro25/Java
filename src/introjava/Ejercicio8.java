/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author chech
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Scanner leer = new Scanner (System.in);
      
        int num; 
        int par; 
        int impar; 
        
        System.out.println("Escribia un número para determinar si es par o impar"); 
        
        num=leer.nextInt(); 
        
        if (num%2==0) {
            
            System.out.println("El número ingresado es par" + num); 
                               
    }else {
            System.out.println("El número ingresado es impar" + num);
        }
    }
    
}
