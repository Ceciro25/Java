
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
public class Extra6 {

    /**
     * @param args the command line arguments
     */
    
    /* Leer la altura de N personas y determinar el promedio de estaturas
    que se encuentran por debajo de 1.60 mts y el promedio de estaturas 
    en general. 
    */
    
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
       
       System.out.println("Ingrese la cantidad de personas de la muestra"); 
       
       int muestra = leer.nextInt(); 
       double suma = 0; 
       double suma2 = 0; 
       int cont = 0; 
       for (int i=0; i<muestra; i++) { 
           System.out.println("Ingrese la estatura en metros");
           
              double altura = leer.nextDouble(); 
                                      
                suma = suma + altura ; 
                if (altura < 1.60){
                    
                    suma2 = suma2 + altura; 
                    cont ++; 
                }
           
       } 
       
            
       System.out.println(" La altura promedio de menos de 1,60mts es " + suma2/cont + "mts"); 
       System.out.println(" La altura promedio es de " + suma/muestra + "mts"); 
       
       
       
       
       
    }
    
}
