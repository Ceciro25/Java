/*Dada una cantidad de grados centígrados
se debe mostrar su equivalente en grados
Fahrenheit. 
La fórmula correspondiente es. 
F = 32 + (9 * C/5)
 * 
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author chech
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        float grados; 
        int num1; 
        System.out.println("Ingrese la cantidad de grados centígrados"); 
        
        num1 = leer.nextInt(); 
        grados = 32 + (9*num1/5);
        
        System.out.println("El equivalente a grados Fahrenheit es: " + grados);
        
    }
    
}
