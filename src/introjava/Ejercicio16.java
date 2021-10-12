/*
 Escriba un programa que lea 20 números. Si el número
leído es igual a cero se debe salir del bucle y mostrar
el resultado de la suma de los números leídos, pero 
si el número es negativo no debe sumarse. 

 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author chech
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in); 
        
        int num; 
        int suma; 
        int cont; 
        cont = 0; 
        suma = 0;
                
        System.out.println("Ingrese 20 números enteros"); 
       
        while (cont < 20){
            cont +=1;
            System.out.println("Ingrese un número"); 
            num = leer.nextInt(); 
            
            if (num == 0){ 
                  System.out.println("Programa Finalizado");
                  break; 
            }else { 
                if (num > 0){ 
                    suma += num;
                }
            }
        }
        System.out.println("La suma de los números ingresados es " + suma);
       
    }
    
}
