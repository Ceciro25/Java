/*
 Realizar un algoritmo que rellene un vector con 
los 100 primeros números enteros y los 
muestre por pantalla en orden descendiente. 
 */
package introjava;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author chech
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner leer = new Scanner (System.in); 
        Random aleatorio = new Random();
        
        int vector[]; 
        
        vector = new int[100];
        
        for (int i = 0; i<vector.length; i++){
            
            vector [i]= aleatorio.nextInt(100);
        }
        System.out.print(Arrays.toString(vector)); 
        
    }
    
}
