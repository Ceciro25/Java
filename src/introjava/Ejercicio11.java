/*
Escriba un programa que pida una frase o palabra y valide
si la primera letra de esa frase es una "A". 
Si la primera letra es una "A", se deberá de 
imprimir un mensaje por pantalla que diga CORRECTO,
en caso contrario, se deberá imprimir INCORRECTO. 
 */

//ver Funcion Substring y equals()
package introjava;

import java.util.Scanner;

/**
 *
 * @author chech
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in); 
        
        System.out.println("Ingrese una frase que empiece con la letra A"); 
        
        String frase = leer.nextLine(); 
        String primeraletra = frase.substring(0, 1); 
        
        if (primeraletra.toUpperCase().equals("A")){
            System.out.println("CORRECTO");
        }else {
            System.out.println("INCORRECTO");
        }
                
    }
    
}
