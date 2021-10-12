/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author chech
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    /* Recorrer un vector de N enteros contabilizando cuántos números
    son de 1 dígito, cuántos de 2 dígitos, etc. (hasta 5 dígitos)
    */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in); 
        
        int n, uno, dos, tres, cuatro, cinco;
        
        uno = 0; 
        dos=0;
        tres=0; 
        cuatro=0;
        cinco=0;
        int c = 0; 
        int vector []; 
        Random aleatorio = new Random(); 
        int digitos; 
        System.out.println("Ingrese el tamaño del vector"); 
        n = leer.nextInt(); 
        
        vector = new int[n]; 
        
        for (int i = 0; i<n; i++){
            vector [i]= aleatorio.nextInt(10000); 
        }
        for (int i =0; i<n; i++){ 
            digitos = 1 ; 
            int num = vector[i]; 
            if (num/10 < 1){
                digitos = 1; 
                uno +=1; 
                break; 
            }
            while (num / 10>=1){
                digitos += 1; 
                num = num /10; 
            }
            if (digitos ==2){ 
                dos +=1; 
            }
            if (digitos ==3){ 
                tres += 1; 
            }
            if (digitos ==4){ 
                cuatro +=1; 
            }
            if (digitos ==5){ 
                cinco +=1; 
            }
        }
        System.out.println("Números con un dígito " + uno);
        System.out.println("Números con dos dígito " + dos);
        System.out.println("Números con tres dígito " + tres);
        System.out.println("Números con cuatro dígito " + cuatro);
        System.out.println("Números con cinco dígito " + cinco);
    }
    
}
