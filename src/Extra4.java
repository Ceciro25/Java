
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chech
 */
public class Extra4 {

    /**
     * @param args the command line arguments
     */
    /* Elaborar un algoritmo en el cual se ingrese un número entre
    1 y 10 y se muestre su equivalente en romano. 
    
    */
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in); 
       
       int num; 
       
       do { 
       System.out.println("Ingrese un número entre 1 y 10"); 
       num = leer.nextInt(); 
       
       
     } while (num < 1 || num > 10); 
       
       switch (num) {
        
           case 1: 
               System.out.println("El equivalente en número romano es: I");
               break; 
           case 2: 
               System.out.println("El equivalente en número romano es: II");
               break; 
           case 3: 
               System.out.println("El equivalente en número romano es: III");
               break; 
           case 4: 
               System.out.println("El equivalente en número romano es: IV ");
               break; 
           case 5: 
               System.out.println("El equivalente en número romano es: V");
               break; 
           case 6: 
               System.out.println("El equivalente en número romano es: VI ");
               break; 
           case 7: 
               System.out.println("El equivalente en número romano es: VII ");
               break; 
           case 8: 
               System.out.println("El equivalente en número romano es: VIII ");
               break; 
           case 9: 
               System.out.println("El equivalente en número romano es: IX ");
               break; 
           case 10: 
               System.out.println("El equivalente en número romano es: X ");
               break; 
    }
       
    
    
    }
    
}
