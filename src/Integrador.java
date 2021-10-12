
public class Integrador {


    public static void main(String[] args) {
            System.out.println(inversa("Hola"));
    }
    public static String inversa(String palabra){
        String resultado = ""; 
        String invertida= ""; 
        resultado = palabra.toLowerCase();
        for (int i = 0; i < resultado.length(); i++) {
            invertida = resultado.charAt(i)+invertida; 
            
        
        }
            return invertida;
        
        
    }
        
    
}
