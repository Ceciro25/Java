
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
public class Extra14 {

    /**
     * @param args the command line arguments
     */
    /* Crea una aplicación que le pida dos números al usuario y este pueda 
    elegir entre sumar, restar, multiplicar y dividir. La aplicación
    debe tener una función para cada operación matemática y deben devolver
    sus resultados para imprimirlos en el main. 
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in); 
        
        int num1,num2; 
        
        System.out.println("Ingrese dos números enteros positivos"); 
        num1 = leer.nextInt(); 
        num2 = leer.nextInt(); 
        
        System.out.println(" <<<< MENU MATEMÁTICO >>>>>>>"); 
        System.out.println("1. SUMAR"); 
        System.out.println("2. RESTAR"); 
        System.out.println("3. MULTIPLICAR"); 
        System.out.println("4. DIVIDIR");
        
    }
    
}
