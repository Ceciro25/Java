
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
public class Extra13 {

    /**
     * @param args the command line arguments
     */
    /* Se dispone de un conjunto de N familias, cada una de las cuales tiene 
    una M cantidad de hijos. Escriba un programa que pida la cantidad de 
    familias y para cada familia la cantidad de hijos para averiguar la media
    de edad de los hijos de todas las familias. 
    */
    
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in); 
       int cont =0; 
       int suma=0; 
       double media; 
       System.out.println("Ingrese la cantidad de familias de la muestra");
       int familia = leer.nextInt(); 
       
       for (int i=0; i<familia; i++){
           System.out.println("Familia" +i);
           System.out.println("Ingrese la cantidad de hijos");
            int hijo = leer.nextInt(); 
            for (int j=0; j<hijo; j++){
                System.out.println("Ingrese las edades de cada hijo");
                int edad = leer.nextInt(); 
                cont = cont +1; 
                suma = suma + edad; 
            }
       }
       System.out.println("El promedio de edades de los hijos de todas las familias es de: " + suma/cont);
       
       
       
    }
    
}
