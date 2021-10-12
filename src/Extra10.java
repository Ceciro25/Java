
import java.util.Random;
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
public class Extra10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in); 
           
        Random aleatorio = new Random(); 
                
        int num = (int) (Math.random()*10); 
        int num2 = (int) (Math.random()*10); 
        int resultado; 
        int resul; 
        
        System.out.println("Los valores a multiplicar son: " + num + "y" + num2 );
        
        resul = num * num2; 
        do { 
            
            System.out.println("Ingrese el resultado de dicha multiplicación");
            
            resultado = leer.nextInt(); 
            if (resultado == resul ){ 
                System.out.println("CORRECTO"); 
                break; 
            }else{
                System.out.println("Resultado INCORRECTO"); 
            }                
            } while(resultado != resul); 
            
            
            
        }
        
    }
    

