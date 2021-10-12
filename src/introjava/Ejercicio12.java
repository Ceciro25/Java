package introjava;

import java.util.Scanner;

/*Definir una variable  tipo Motor y permitir
que el usuario ingrese un valor entre 1 y 4
El programa debe mostrar los siguiente: 

    Si el tipo de motor es 1, mostrar un mensaje
indicando "La bomba es una bomba de agua".
    Si el tipo de motor es 2, mostrar un mensaje 
indicando "La bomba es una bomba de gasolina"
    Si el tipo de motor es 3, mostrar un mensaje
indicando "La bomba es una bomba de hormigón".
    Si el tipo de motor es 4, mostrar un mensaje 
indicando "La bomba es una bomba de pasta alimenticia". 
    Si no se cumple ninguno de los valores anteriores
mostrar un mensaje "No existe un valor válido para tipo
de bomba". 

 */

/**
 *
 * @author chech
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in); 
        System.out.println("Bienvenido al sistema operativo de bombas"); 
        System.out.println("Ingrese un número del 1 al 4 para saber qué tipo de motor es su bomba");
        
        int tipoMotor;
        
        tipoMotor = leer.nextInt(); 
        if (tipoMotor >= 1 && tipoMotor <=4){
      
            switch (tipoMotor) {
        
        case 1:
            System.out.println("La bomba ingresada es una bomba de agua");
            break;
        case 2: 
            System.out.println("La bomba ingresada es una bomba de Gasolina");
            break;
            
        case 3:
            System.out.println("La bomba ingresada es una bomba de hormigón");
            break;
            
        case 4: 
            System.out.println("La bomba ingresada es una bomba de pasta alimenticia");
            break;
            
            }
        
    } else { 
            System.out.println("No existe un valor válido para tipo de bomba");
        }
    }
    
}
