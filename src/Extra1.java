
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
public class Extra1 {

    /**
     * @param args the command line arguments
     */
    /* Dado un tiempo en minutos, calcular su equivalente en días y horas. 
    Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular 
    su equivalente; 1 día, 2 horas. 
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in); 
        
        int min; 
        int hora; 
        int dia;
        System.out.println("Ingrese los minutos"); 
        min = leer.nextInt(); 
        
             
            dia = min / 1440; 
            hora = (min - 1440)/60; 
         System.out.println("El equivalente en días y horas es: " + dia + "días y" + hora + "horas"); 
       }
    
}   
    

