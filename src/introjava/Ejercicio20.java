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
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        Scanner leer = new Scanner (System.in); 
            int j; 
            int i; 
            int n  ; 
        
            String cadena; 
           
          for (i=0;i<4;i++){
              System.out.println("Ingrese un número del 1 al 20");
                n = leer.nextInt(); 
                          
             cadena = "";
          for (j=0;j<n;j++){ 
                 
            cadena += "*";
                 
           
          }      
                System.out.print( n + " " + cadena);
                    System.out.println(" ");
        }            
                    
          
                 
        
    }
 }       
        
    

