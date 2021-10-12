
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
public class Extra2 {

    /**
     * @param args the command line arguments
     */
    /* Declarar cuatro variables de tipo entero A,B,C y D y asignarle un valor 
    diferente a cada una. A continuación, realizar las instrucciones necesarias
    para que: 
    B tome el valor de C,
    C tome el valor de A
    A tome el valor de de D
    D tome el valor de B
    
    Mostrar los valores iniciales y los valores finales de cada una 
    variables. Utilizar solo una variable auxiliar. 
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in); 
        int A; 
        int B; 
        int C; 
        int D;
        int aux; 
        
        System.out.println("Ingrese el valor de A");
        A= leer.nextInt(); 
        
        System.out.println("Ingrese el valor de B");
        B= leer.nextInt(); 
        System.out.println("Ingrese el valor de C");
        C= leer.nextInt(); 
        System.out.println("Ingrese el valor de D");
        D= leer.nextInt(); 
        
        aux= B; B=C; C=A; A=D; D=aux; 
        
        System.out.println("Valor reasigando A: " + A);
        System.out.println("Valor reasigando B: " + B);
        System.out.println("Valor reasigando C: " + C);
        System.out.println("Valor reasigando D: " + D);
            
        
    }
 }
    

