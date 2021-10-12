/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author chech
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in); 
      int unidad = 0; 
      int decena = 0; 
      int centena =0; 
      String cadena; 
      String unid; 
      String decen; 
      String cente; 
      boolean seguir = true; 
      
      while (seguir) { 
          if (unidad ==3){ 
              unid = "E"; 
          } else { 
              unid = String.valueOf(unidad); 
              
              }
          if (decena == 3){ 
                  decen = "E"; 
          }else {
              decen = String.valueOf(decena); 
          }
         if (centena == 3){ 
                  cente = "E"; 
          }else {
              cente = String.valueOf(centena); 
          }  
         cadena = cente + " - " + decen + " - " + unid; 
         unidad += 1; 
         
         if (unidad == 10){ 
             unidad = 0; 
             decena += 1; 
                     
            }
         if (decena == 10){ 
             decena = 0; 
             centena += 1; 
            }
         if (centena == 9 && decena == 9 && unidad == 9){
             seguir = false; 
            }
             System.out.println(cadena);
        } 
    }
 } 
         
     
             
        

    

