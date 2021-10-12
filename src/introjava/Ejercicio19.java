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
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in); 
       
        int i; 
        int j; 
        int n; 
       System.out.println("Ingrese el tamañao del cuadrado"); 
       n = Integer.parseInt(leer.nextLine()); 
       
       for (i=1;i<=n;i++){
           System.out.print("*"); 
           for (j=2;j<=n;j++){
               if (i==1 || i ==n){
                   System.out.print("*");
               }else {
                   if (j==n){
                       System.out.print("*");
                   }else{
                       System.out.print(" ");
                   }
               }
           }
           System.out.println("");
       }
        
    }
    
}
