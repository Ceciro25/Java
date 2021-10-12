/*
 * Realizar un programa que pida dos números enteros 
positivos por teclado y muestre por pantalla el siguiente 
menu: 



MENU
    1. SUMAR
    2. RESTAR
    3. MULTIPLICAR
    4. DIVIDIR
    5. SALIR
Elija una opción. 

Con la opción 5 se debe mostrar el siguiente mensaje
¿ Está seguro que desea salir del programa (S/N)? 
si el usuario selecciona "S" se sale del programa, caso contrario
vuelve a mostrar el menú. 


 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author chech
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in); 
        
        int opc; 
        int num1; 
        int num2; 
        String cadena; 
        System.out.println("Ingrese dos números enteros positivos"); 
        
         num1 = leer.nextInt(); 
         num2 = leer.nextInt(); 
         
                     
        System.out.print("      MENU    ");
        System.out.println(" Elegir una opción  ");
        System.out.println(" 1. SUMAR  ");
        System.out.println(" 2. RESTAR  ");
        System.out.println(" 3. MULTIPLICAR ");
        System.out.println(" 4. DIVIDIR  ");
        System.out.println(" 5. SALIR  ");
        
        opc = leer.nextInt(); 
       int suma; 
       int multip; 
       double divi; 
       int resta; 
     do {
         if (opc == 5) { 
             System.out.println("¿Está seguro que desea salir del programa? (S/N)"); 
                     cadena = leer.nextLine(); 
              if (cadena.equals("S")){ 
                            System.out.println("Programa Finalizado");
                            break;
                     }
              if (cadena.equals("N")) { 
                         System.out.print("      MENU    ");
                         System.out.println(" Elegir una opción  ");
                         System.out.println(" 1. SUMAR  ");
                         System.out.println(" 2. RESTAR  ");
                         System.out.println(" 3. MULTIPLICAR ");
                         System.out.println(" 4. DIVIDIR  ");
                         System.out.println(" 5. SALIR  ");
                          opc = leer.nextInt(); 
                     }
                 } else {
         
         if (opc == 1){
         
             
                     System.out.println("Opción SUMAR"); 
                   
                        suma = num1 + num2; 
                        System.out.println("El resultado es " + suma);
                        break; 
                 }       
          if (opc == 2){
                     System.out.println("Opción RESTA");
                     resta = num1 - num2; 
                     System.out.println("El resultado es " + resta);
                        break; 
                     }   
          if (opc ==3){
                     System.out.println("Opción MULTIPLICAR");
                     multip = num1 * num2; 
                     System.out.println("El resultado es " + multip);
                        break; 
                      } else {
              
             if(opc == 4){
                     System.out.println("Opción DIVIDIR");
                     divi = num1 / num2; 
                     System.out.println("El resultado es " + divi);
                        break; 
         
                    }
        }
         }
    } while (opc >=1 || opc <= 5); 
 }
    
    
     
}       
                        
                        
        



         
     
                 
                     
                     
             
     
    
             
        
    
    

     
