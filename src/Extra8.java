
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chech
 */
public class Extra8 {

    /**
     * @param args the command line arguments
     */
    
    /* Escriba un programa que lea números enteros. Si el número es múltiplo
    de cinco debe deterner la lectura y mostrar la cantidad de números leídos, 
    la cantidad de números pares y la cantidad de números impares. Los números 
    negativos no deben sumarse. 
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in); 
        int par =0; 
        int impar=0; 
        int c=0;
        int num; 
        do {
            System.out.println("Ingrese números enteros positivos");
            num = leer.nextInt(); 
            
            if ( num % 5== 0){ 
                break; 
            }
            if (num > 0){ 
                c +=1; 
             if (num %2==0){
                    par +=1; 
                }else {
                        impar +=1; 
               }
            }
        
         } while(num > 0 && num %5!=0); 
        System.out.println("La cantidad de números total  es de " + c);
        System.out.println("La cantidad de numeros pares es de " + par);
        System.out.println("La cantidad de numeros impares es de " + impar);
        
     }
    
        
        
        
        
        
    
    
}
