package video10;

import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CuentaLetras {
    
    
    public static void main(String [] args){
        
        try(Scanner s = new Scanner(System.in)){
            System.out.println("Introduce una palabra o frase: ");
            
            String palabra=s.nextLine();
            
            System.out.println("La palabra introducida es: " + palabra
                + " y tiene " + palabra.length() + " letras.");
            
            Map<Character,Integer> cuentaLetras = new TreeMap<>();
            for(char letra : palabra.toCharArray()){
                if(letra!=' '){
                    Integer cont = cuentaLetras.get(letra);
                    if(cont==null){
                        cuentaLetras.put(letra, 1);
                    }else{
                        cuentaLetras.put(letra,++cont);
                    }
                }
            }
            
            
            
            System.out.println("Hay " + cuentaLetras.size() + " letras distitnas");
            System.out.println(cuentaLetras);
            
            
        }catch(InputMismatchException e){
            System.err.println("Entrada no válida");
        }
        
    }
}
