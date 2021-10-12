
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
public class Extra7 {

    /**
     * @param args the command line arguments
     */
    
    /* Realice un programa que calcule y visualice el valor máximo, 
    el valor mínimo y el promedio de n números (n>0). El valor de n se 
    solicitará al principio del programa y los números serán introducidos por 
    el usuario. Realice dos versiones del programa una usando el bucle "while"
    y otra con el bucle "do-while". 
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in); 
        int max = 0; 
        int min = 0; 
        int prom =0; 
        int suma=0;
        int cont =0; 
        int i = 1; 
        int valor =0; 
        System.out.println("Ingrese la cantidad de números a ingresar"); 
        
            int num=leer.nextInt(); 
        
          while ( i <= num || valor == 0 ){
              
                System.out.print("Ingrese los número para realizar la operación" + i+ ":"); 
        
                   valor = leer.nextInt(); 
                
                if (i == 1 & valor != 0){
                    max = valor; 
                    
                }else { 
                   if (valor > max & valor !=0){
                        max = valor; 
                    }                      
                            
                     }
                if (i == 1 & valor != 0){
                    min = valor; 
                    
                }else { 
                   if (valor < min & valor !=0){
                        min = valor; 
                     }
                }        
                            
                if (valor > 0){
                    i++; 
                    cont++;
                    suma = suma + valor; 
                } 
            }
                 
                prom = suma + cont; 
                System.out.println("El promedio es:  "+prom);
		System.out.println(" él número máximo ingresado es:  "+max);
		System.out.println(" El número mínimo ingresado es:  "+min); 
                              
            }
       }        
   



    

