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
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    /* El programa debe leer una cadena con un máximo de 5 caracteres
    el primer caracter debe ser X y el último una O. 
    La secuencia &&&&& marca el final de los envíos (FDE) y 
    toda secuencia distinta a FDE, es incorrecta. 
    al finalizar se imprime la cantidad de lecturas correctas
    e incorrectas. 
    
    Funcion Substring(), Length(), equals(). 
    */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in); 
        
        String cadena; 
        int contcorrect = 0;
        int contincorrect = 0;
        
        System.out.println("Ingrese una cadena de 5 caracteres"); 
        System.out.println("Para cerrar los enviós debe ingresar &&&&&"); 
        cadena = leer.nextLine(); 
        
        while (!cadena.equals("&&&&&")){
                
            
            if (cadena.length()!=5){ 
                contincorrect += 1; 
            }else {
            if (cadena.substring(0,1).equals("X") && cadena.substring(cadena.length()- 1, cadena.length()).equals("O")){
                contcorrect += 1; 
            } else { 
                contincorrect += 1; 
            }
            }
            System.out.println("Ingrese nuevamente la cadena");
            cadena = leer.nextLine(); 
            
        if (cadena.equals("&&&&&")){
                System.out.println("La cantidad de cadenas correctas fueron " +contcorrect);
                System.out.println("La cantidad de cadenas incorrectas fueron " +contincorrect);    
        }
    }    
        
        
        
    }
    
}
