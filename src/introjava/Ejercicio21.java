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
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    /* Crear una aplicación que a través de una función nos
    convierta una cantidad de euros introducida por teclado
    a otra moneda, estas pueden ser a dólares, yenes o libras. 
    La función tendrá como parámetros, la cantidad de euros y la 
    moneda a convertir que será una cadena, este no devolverá 
    ningún valor y mostrará un mensaje indicando el cambio(void). 
    
    El cambio de divisas es. 
    * 0.86 libras es un 1 e
    * 1.28611$ es un 1e
    * 129.852 yenes es un 1e
    */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner  (System.in); 
        
        int euros; 
        String moneda; 
        double convertido = 0; 
        
        System.out.println("Ingrese la cantidad de Euros a convertir"); 
        euros = leer.nextInt(); 
        
        System.out.println("Ingrese la moneda a la que quiere convertir"); 
        System.out.println("Dólares, Yenes o Libras"); 
        moneda = leer.next(); 
        
        if (moneda.equalsIgnoreCase("dolares")) {
            
            convertido = (euros * 1.28611); 
           
        }
        if (moneda.equalsIgnoreCase("yenes")) {
            
            convertido = (euros * 129.852); 
        }
        if (moneda.equalsIgnoreCase("libras")) {
            
            convertido = (euros * 0.86); 
         } else { 
            System.out.println("El cambio de divisa es " + euros + "Euros a " +  convertido +  moneda); 
        }       
    }
}
