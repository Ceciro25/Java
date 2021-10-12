/* Crear un programa que pida una frase y si
esa frase es igual a "Eureka"
el programa pondrá un mensaje de 
Correcto, sino mostrará un mensaje de 
Incorrecto. 

Ver funcion equals(). 
 
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author chech
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in); 
                
        System.out.println("Ingrese la contraseña en minúscula"); 
        String frase = leer.nextLine(); 
        
        if (frase.equals("eureka")) {
            System.out.println("La contraseña es CORRECTA");
        }else {
            System.out.println("La contraseña es INCORRECTA");
        }
        
        
    }
    
}
