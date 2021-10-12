/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author chech
 */
public class Ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
        
        int [][] matriz; 
        Random aleatorio = new Random(); 
        
        System.out.println("Matriz");
        matriz = new int [4][4]; 
        
        for (int i=0; i<4; i++){ 
            for (int j=0; j<4; j++){
                
                matriz [i][j]= aleatorio.nextInt(10); 
                System.out.print(matriz [i][j]+" "); 
            }
            System.out.println(""); 
        }
        System.out.println("La matriz traspuesta queda: /n");
        
        for (int j=0; j<4; j++){ 
            for (int i=0; i<4; i++){
                
                System.out.print(matriz [i][j]+" "); 
            }
            System.out.println("");
        }
        System.out.println(""); 
    }
    
}
