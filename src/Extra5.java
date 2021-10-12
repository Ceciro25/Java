
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
public class Extra5 {

    /**
     * @param args the command line arguments
     */
    /* Una obra social tiene tres clases de socios: 
    *   Socios A: abonan una cuota mayor, pero tiene un 50% de desc. en tratam. 
    *   Socios B: abonan una cuota moderada y un 35% de desc. 
    *   Socios C: no tienen desc. 
    
    Solicite una letra que representa la clase de un socio, y luego un valor
    real que represente el costo del tratamiento (previo al descuento) y 
    determine el importe en efectivo a pagar por dicho socio. 
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in); 
        
               
        System.out.println("Ingrese que tipo de socio es: A, B o C"); 
        String letra = leer.nextLine(); 
        System.out.println("Ingrese el monto del tratamiento para determinar cuanto debe pagar"); 
        
        double tratamiento = leer.nextDouble();
        
        if (letra.equalsIgnoreCase("A")){
            
            double resultado; 
            
            resultado = (tratamiento * 0.50); 
            System.out.println("El monto que debe abonar por su plan es de $ " + resultado);
        }
        if (letra.equalsIgnoreCase("B")){
            double resultado; 
            
            resultado = (tratamiento * 0.35); 
            System.out.println("El monto que debe abonar por su plan es de $ " + resultado);
        }else {
            if (letra.equalsIgnoreCase("C"))
            System.out.println("El monto que debe abonar por su plan es de $ " + tratamiento );
        }
        
                       
           
        
        
    }
    
}
