package introjava;


import java.util.Scanner;

/* Escribir un programa que lea un número entero
por teclado y muestre por pantalla el 
doble, el triple y la raíz cuadrada de ese número. 

 */

/**
 *
 * @author chech
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in); 
        
        System.out.println("Ingrese un número entero");
        
        int num1; 
        int resultadotriple; 
        int resultadodoble;
      num1 = leer.nextInt(); 
      
       int raiz = (int) Math.sqrt(num1); 
       resultadotriple = num1 * 3; 
       resultadodoble = num1 * 2; 
       
       System.out.println("El doble del número ingresado es: " + resultadodoble); 
       System.out.println("El triple del número ingresado es: " + resultadotriple); 
       System.out.println("La raiz cuadrada del número ingresado es: " + raiz); 
               
        
    }
    
}
