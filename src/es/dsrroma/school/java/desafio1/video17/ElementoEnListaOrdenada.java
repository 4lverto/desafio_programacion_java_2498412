package video17;

import java.util.Arrays;

/*
Buscaremos un elemento en una lista ordenada usando la búsqueda binaria
*/
public class ElementoEnListaOrdenada {
    
    public static boolean busquedaBinaria(int[] lista,int n){
        return busquedaAuxiliar(lista, n, 0, lista.length-1);
    }
    
    private static boolean busquedaAuxiliar(int[] lista, int n, int inicio, int fin){
        int centro = Math.floorDiv(fin-inicio,2) + inicio;
        int valorCentral = lista[centro];
        
        if(valorCentral==n){
            return true;
        }
        
        if(fin-inicio<=1){
            return false;
        }    
        
        if(valorCentral<n){
            return busquedaAuxiliar(lista,n,centro,fin);
        }else{
            return busquedaAuxiliar(lista,n,inicio,centro);
        }
        
    }
    
    
    public static void main(String[] args){
        int[] lista = {9,3,2,7,8};
        
        Arrays.sort(lista);
        System.out.println("Lista: " + Arrays.toString(lista));
        System.out.println("El numero 7 se encuentra: " + busquedaBinaria(lista,7));
        System.out.println("El numero 1 se encuentra: " + busquedaBinaria(lista,1));
        
    }
}
