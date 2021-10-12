/*/* Realizar un programa que solo permita introducir
solo frase o palabras de 8 caracteres de largo
Si el usuario ingresa una frase o palabra de 8 de largo
se deberá de imprimir un mensaje por pantalla que diga 
CORRECTO, en caso contrario, se deberá imprimi
INCORRECTO. 

ver función Lenght()
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author chech
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in); 
                       
        System.out.println("Ingrese una frase de no más de 8 caracteres");
        
        String frase = leer.nextLine(); 
        
        
        if (frase.length()==8) {
            System.out.println("La frase ingresada es CORRECTA");
        }else {
            System.out.println("La frase ingresada es INCORRECTA");
        }
        
    }
    
}
