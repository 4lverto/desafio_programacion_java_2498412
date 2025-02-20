package video05;

import java.util.ArrayList;
import java.util.List;

/*
Deberemos comprobar un boleto de lotería simple (5 números)

- Necesitamos el resultado del sorteo (5 números)
- Necesitamos el boleto a comprobar (5 números)

Enfoques para resolverlo:
A) Convertir array de enteros a una lista usando Streams
- Comprobar los valores con un foreach en el que vayamos comprobando
todos los números del boleto. También podríamos hacerlo recorriendo 
todos los números del resultado del sorteo

B) Trabajar con ls lista y anadir bucles foreach y while. Uno para recorrer
el booleto y otro para recorrer el número del resultado del sorteo para ver si
encontramos el número buscado.

*/

public class ComprobarBoleto {
    
    
    public static int validarBoleto(int[] boleto, int[] sorteo){
        int aciertos = 0;
        /* OPCIÓN A Convertimos el array "sorteo" en una lista
        // Convertimos el array "sorteo" en una lista para usar contains()
        }*/
        
        /* OPCIÓN B Sin conversión 
        */
        for(int i=0;i<boleto.length;i++){
            for(int j=0;j<sorteo.length;j++){
                if(boleto[i]==sorteo[j]){
                    aciertos++;
                }
            }
        }
        
        
        return aciertos;
    }
    
    public static void main(String[] args){
        int[] b1 = {7,12,25,36,38};
        int[] sorteo = {16,27,36,38,33};
        
        System.out.println("Total aciertos: " + validarBoleto(b1, sorteo));
    }
    
}
