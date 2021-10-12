/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import static java.lang.Math.pow;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author chech
 */
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in); 
        int [][]matriz; 
        int [][]matrizT;
        int n; 
        int c = 0;
               
        System.out.println("Ingrese el tamaño de la matriz");
        n = leer.nextInt(); 
         
        matriz = new int [n][n]; 
        matrizT = new int [n][n]; 
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.println("Ingrese la posición: " +c);
                
                matriz[i][j] = leer.nextInt(); 
                c +=1; 
                
            }
        }
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                matrizT [i][j]= matriz [j][i]; 
            }
        }
        
        c =0; 
        for (int i =0; i<n; i++){
            for (int j=0; j<n; j++){
                if (matriz [i][j] == -matrizT[i][j]){
                    c += 1; 
                } 
            }
        }
        System.out.println("La matriz queda:"); 
        
        for (int i =0; i<n; i++){
            for (int j=0; j<n; j++){
          System.out.print(matriz[i][j] + " "); 
    
        }
            System.out.println(""); 
     }
           System.out.println("La matriz traspuesta queda: /n"); 
        for (int i =0; i<n; i++){
            for (int j=0; j<n; j++){
          System.out.print(matrizT[i][j] + " "); 
          }
            System.out.println(""); 
     }
          
        if (c == pow(n,2)){
            System.out.println("Son matrices antisimétricas"); 
        }else {
            System.out.println("No son matrices antisimétricas"); 
        }
    }
}
