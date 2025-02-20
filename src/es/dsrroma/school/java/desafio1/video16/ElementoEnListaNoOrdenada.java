package video16;

import java.util.Arrays;

/*
Vamos a buscara un úmero en una lista no ordenada
*/
public class ElementoEnListaNoOrdenada {
    
    public static boolean buscarWhile(int[] lista, int n){
        
        boolean presente=false;
        int i=0;
        
        if(lista.length>0){
            while(!presente && i<lista.length){
                if(lista[i]!=n){
                    i++;
                }else{
                    presente=true;
                }
            }            
        }else{
            System.out.println("La lista no tiene elementos");
        }
        
        return presente;
    }
    
    
    public static boolean buscarFor(int[] lista, int n){
        
        boolean presente=false;

        
        if(lista.length>0){
            for(int i : lista){
                if(i==n){
                    presente=true;
                }
            }
        }else{
            System.out.println("La lista no tiene elementos");
        }
        
        return presente;
    }
    
    public static void main(String[] args){
        
        int[] lista = {9,3,2,7,8};
        
        System.out.println("Lista: " + Arrays.toString(lista));
        
        System.out.println("Buscamos el numero 7: " + buscarWhile(lista,7));
        System.out.println("Buscamos el numero 1: " + buscarWhile(lista,1));
        System.out.println("Buscamos el numero 7: " + buscarFor(lista,7));
        System.out.println("Buscamos el numero 1: " + buscarFor(lista,1));
    }
}
