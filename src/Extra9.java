
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
public class Extra9 {

    /**
     * @param args the command line arguments
     */
    
     /* Dado dos números enteros mayores que uno, realizar un algoritmo que 
    calcule el cociente y el residuo usando solo restas. 
    */
    public static void main(String[] args) {
        Scanner leer =new Scanner (System.in); 
        int num1, num2; 
        int cont=0; 
        System.out.println("Ingrese dos números enteros");
        num1 = leer.nextInt(); 
        num2 = leer.nextInt(); 
        
        while (num1 >= num2){
            num1 = num1 - num2; 
            cont = cont +1; 
        }
        System.out.println("El cociente es: " + cont);
        System.out.println("El resto es: " + num1);
        
        
    }
    
}
