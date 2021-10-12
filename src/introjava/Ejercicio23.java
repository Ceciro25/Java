/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author chech
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    /* Realizar un algoritmo que rellene un vector de tamaño N con valores
    aleatorios y le pida al usuario un número a buscar en el vector. 
    El programa mostrará donde se encuentra el 
    número y si se encuentra repetido. 
    */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in); 
      int numero; 
       
        int vector[] ; 
        Random aleatorio = new Random(); 
        int N; 
        
        int contador = 0; 
        
        
        
        System.out.println("Algoritmo para vector"); 
        System.out.println("Ingrese el tamaño del vector"); 
        N = leer.nextInt(); 
        vector = new int[N]; 
        System.out.println(" Se está llenando el vector");
        System.out.println(" Ingrese el número a buscar");
      numero = leer.nextInt();  
        for (int i=0; i< N; i++){
           vector [i]= aleatorio.nextInt(N); 
            
           if (vector[i] == numero ){ 
               
              
                contador = contador +1; 
           }
            
        }
            
        String[] posiciones = new String[contador]; 
        contador = 0; 
        for (int i= 0; i < N; i++ ){ 
            if (vector[i] == numero){ 
                posiciones[contador] = Integer.toString(i); 
                contador +=1; 
            }
        }
        System.out.println("Se repita " + contador + "veces"); 
        System.out.println(Arrays.toString(posiciones)); 
        
        
    }
    
}
