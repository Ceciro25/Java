
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
public class Extra11 {

    /**
     * @param args the command line arguments
     */
    /* Escribir un programa que lea un número entero y devuelva el número de dígitos
que componen ese número. Por ejemplo, si introducimos el número 12345, el
programa deberá devolver 5. Calcular la cantidad de dígitos matemáticamente
utilizando el operador de división. Nota: recordar que las variables de tipo entero
truncan los números o resultados
*/
    
    public static void main(String[] args) {
    
        Scanner leer = new Scanner (System.in); 
        
        int cont; 
        int num; 
        System.out.println("Ingrese un número entero positivo"); 
        num = leer.nextInt(); 
        cont =0; 
        while (num !=0){
            num = (int) Math.floor(num/10); 
            cont = cont + 1; 
            System.out.println("Con cada división queda" +num); 
        }
        System.out.println("Contiene" + cont + "digitos"); 
        
        
    }
    
}
