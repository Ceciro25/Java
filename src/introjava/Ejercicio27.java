/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author chech
 */
public class Ejercicio27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in); 
        
        int n; 
        
        do { 
            System.out.println("Ingrese el tamañao de la matriz cuadrada"); 
            
            n = leer.nextInt(); 
            
        } while (n > 10 || n <= 0);         
      
        int [][]matriz = new int [n][n]; 
      
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                do {
                    System.out.print("Posiciones" + "(" + i + "),(" + j + ")"); 
                matriz [i][j] = leer.nextInt(); 
                } while ((matriz [i][j])>= 10 ||(matriz [i][j]) <=0); 
                
            }
        }
        System.out.println("La matriz cargada es: "); 
        
        for (int i= 0; i<n; i++){
            for (int j=0; j<n;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println(""); 
        }
        System.out.println("La suma de cada fila es la sigueinte"); 
        int s; 
        int [][]a = new int[n][n]; 
        
        for (int i =0;i<n;i++){
            s = 0; 
            for (int j=0;j<n;j++){
                s = s+matriz[i][j]; 
            }
            a[0][i] = s; 
        }
        for (int i=0;i<n;i++){
            System.out.println("("+a[0][i]+")"); 
        }
        
        System.out.println("La suma de cada columna es la siguiente"); 
        
         
        for (int j =0;j<n;j++){
            s = 0; 
            for (int i=0;i<n;i++){
                s = s+matriz[i][j]; 
            }
            a[1][j] = s; 
        }
        for (int i=0;i<n;i++){
            System.out.println("("+a[1][i]+")"); 
        }
        System.out.println(""); 
        s=0; 
             for (int i=0;i<n;i++){
                 s= s+matriz[i][i]; 
                 
             }
           int c=0; 
         System.out.println(s);
         for (int i=0;i<=1;i++){
             for (int j=0; j<n;j++){
                 if (s==a[i][j]){
                     c = c+1; 
                 }
             }
         }
         System.out.println("Suma de diagonal principal:" +"("+s+")"); 
         
         if (c==((2*n))){
             System.out.println("Es una Matriz mágica"); 
         }else{
             System.out.println("No es una Matriz Mágica"); 
         }
        
         
    }
    
}
