
package video15;

import java.util.Arrays;
import java.util.OptionalDouble;

/*
Calcular el valor medio de los valores de una lista
*/
public class CalcularMedia {
    
    public static int media(int[] lista){
        int media=0;
        if(lista.length>0){
            for(int i=0;i<lista.length;i++){
                media+=lista[i];
            }
            
            media=media/lista.length;
        }else{
            System.out.println("Error, la lista debe contener elementos.");
            System.exit(1);
        }
        
        return media;
    }
    
    public static double mediaDecimales(int[] lista){
        double media=0;
        if(lista.length>0){
            for(int i=0;i<lista.length;i++){
                media+=lista[i];
            }
            
            media=media/lista.length;
        }else{
            System.out.println("Error, la lista debe contener elementos.");
            System.exit(1);
        }
        
        return media;
    }
    
    public static double mediaStreams(int[] lista){
        OptionalDouble media = Arrays.stream(lista).average();
        if(media.isPresent()){
            return media.getAsDouble();
        }
        throw new IllegalStateException("Error no esperado, no hay media");
    }
    
    
    public static void main(String[] args){
        int[] lista = {1,4,3,6,4,7,9};
        
        System.out.println("La lista es: " + Arrays.toString(lista));
        System.out.println("La media de estos valores es: " + media(lista));
        System.out.println("La media con decimales es: " + mediaDecimales(lista));
        System.out.println("La media con decimales es: " + mediaStreams(lista));
        
    }
}
