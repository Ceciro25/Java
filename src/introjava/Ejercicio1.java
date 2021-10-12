package introjava;

import java.util.Scanner;

/*Escribir un programa que pida dos números enteros
por teclado y calcule la suma de los dos. 
El programa deberá después mostrar
el resultado de la suma. 
/**
 *
 * @author chech
 */

public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner leer= new Scanner (System.in); 
          int num1;
          int num2;
          int suma;
          System.out.println("Ingrese dos números enteros");
          num1 = leer.nextInt(); 
          num2 = leer.nextInt();
          
          suma = num1 + num2; 
          
          System.out.println("El resultado de la suma de los enteros ingresados es: "+ suma);
          
          
    
                
                
      
        
        
    }
    
}
