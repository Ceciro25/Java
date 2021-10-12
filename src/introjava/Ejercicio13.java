/*
 Escriba un programa que valide si una nota está entre
0 y 10, sino está entre 0 y 10 la nota se pedirá
de nuevo hasta que la nota sea correcta. 
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author chech
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner leer = new Scanner (System.in); 
        int num; 
        do {
            System.out.println("Ingrese nota"); 
            System.out.println("La misma debe estar entre los valores 0 y 10 ");
        
            num=leer.nextInt(); 
        
        }     while (num <= 0 || num >= 10); 
        
         System.out.println("La nota ingresada es " + num);
            
         
    }    
   }        
       
