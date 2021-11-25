
import java.util.Scanner;


public class Actividad_Obligatoria {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String nombre, apellido, hobbie, idePreferido, sistOperativo; 
        int edad;
        
        System.out.println("Ingrese los siguientes datos solicitados");
        System.out.println("Nombre y Apellido");
        nombre = leer.nextLine(); 
        apellido = leer.nextLine();
        System.out.println("Hobbie preferido");
        hobbie = leer.nextLine(); 
        System.out.println("IDE preferido");
        idePreferido = leer.nextLine(); 
        System.out.println("Sistema Operativo más usado");
        sistOperativo= leer.nextLine(); 
        System.out.println("Edad");
        edad = leer.nextInt();
        
        System.out.println("Los datos ingresados son: ");
        System.out.println("Nombre y Apellido: " +nombre+" "+ apellido);
        System.out.println("Edad: " +edad+ "años");
        System.out.println("Hobbie: " +hobbie);
        System.out.println("IDE preferido: " +idePreferido);
        System.out.println("Sistema Operativo utilizado: " +sistOperativo);
        System.out.println("");
        
        
    }
    
}
