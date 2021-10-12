/*/* Implementar un programa que dado dos 
números enteros determine cuál
es el mayor y lo muestre por pantalla.
 
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author chech
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in); 
        
     int num1; 
     int num2; 
     int maximo; 
     
     System.out.println("Ingrese dos números enteros"); 
     
     num1 = leer.nextInt(); 
     num2 = leer.nextInt(); 
     
     if (num1 > num2) {
         maximo = num1; 
         
         System.out.println("El máximo es: " + maximo);
         
     } 
         if (num1 < num2){
             maximo = num2; 
             
             System.out.println("El máximo es: " + maximo); 
         }    
     if (num1 == num2) { 
         
         System.out.println("Ambos numeros ingresados son iguales" + num1+ "," + num2);
     }
     
     
    }
    
}
