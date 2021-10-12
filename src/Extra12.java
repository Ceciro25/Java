
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
public class Extra12 {

    /**
     * @param args the command line arguments
     */
    
    /* Crear un programa que dibuje una escaler de números, donde cada línea
    de números comience en uno y termine en el número de la línea. 
    Solicitar la altura de la escalera al usuario al comenzar. 
    */
    public static void main(String[] args) {
      Scanner leer = new Scanner (System.in); 
      
      int num; 
      
      System.out.println("Ingrese la altura de la escalera"); 
      
      num = leer.nextInt(); 
      
      for (int i=0; i< num; i++){
          for (int j=0; j<=i; j++){
              System.out.print(j + 1 + " "); 
          }
          System.out.println(""); 
      }
          
      
    }
    
}
