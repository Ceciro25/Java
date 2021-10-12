
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
public class Extra3 {

    /**
     * @param args the command line arguments
     */
    
    /* Elaborar un algoritmo en el cuál se ingrese una letra y se detecte
    si se trata de una vocal. Cado contrario mostrar un mensaje. 
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in); 
        
        String vocal; 
        
        System.out.println("Ingrese una letra"); 
       vocal = leer.next(); 
        
        if (vocal.equalsIgnoreCase("a") || vocal.equalsIgnoreCase("e") || vocal.equalsIgnoreCase("i") ||vocal.equalsIgnoreCase("0")|| vocal.equalsIgnoreCase("u")) { 
            
        System.out.println("La letra ingresada es una vocal"  + vocal); 
    } else {
            System.out.println("La letra ingresada no es una vocal"); 
        }
        
    }
    
}
