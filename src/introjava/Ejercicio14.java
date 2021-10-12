/*
Escriba un programa en el cual se ingrese un valor
límite positivo, y a continuación dolicite números
al usuario hasta que la suma de los valores introducidos
supere el límite inicial. 

 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author chech
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner (System.in); 
     
     System.out.println("Ingrese un valor límite"); 
     
     int numlim; 
     int num;
     int suma; 
     suma = 0; 
     numlim = leer.nextInt(); 
     System.out.println("Ingrese un número"); 
            num = leer.nextInt(); 
       
        if (num > numlim) {
            
            while(num > numlim) {
               System.out.println("Por favor ingrese un número menor al límite" + numlim);
              num = leer.nextInt(); 
            }
        } else {
        
                   
           while(suma < numlim) {
               System.out.println("Ingrese otro número");
              num = leer.nextInt(); 
              suma += num; 
              
            
            
            }
        }
        System.out.println("La suma de los numeros da " + suma); 
}    }    
        
    

     
                
     
    
    

