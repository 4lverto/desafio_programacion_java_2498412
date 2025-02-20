package video14;

public class CalcularMinimo {
    /*
    Localizar el valor más bajo en una lista de números
    */
    
    public static int minimo(int[] lista){
        int minimo=lista[0];
        
        if(lista.length>0){
            for(int i=0;i<lista.length;i++){
                if(lista[i]<minimo){
                    minimo=lista[i];
                }
            }
        }else{
            System.out.println("La lista tiene que contener al menos un elemento");
            System.exit(1);
        }
        
        return minimo;
    }
    
    
    public static void main(String[] args){
        int[] lista = {3,3,2,7,8};
        System.out.println("El numero minimo: ");
        int min = minimo(lista);
        
        System.out.println("->" + min);
    }
}
