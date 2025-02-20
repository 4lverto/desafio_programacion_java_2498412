
package video11;

import java.awt.Color;

/*
Crearemos una matriz del tamaño que nos indiquen los dos primeros argumentos
que nos proporcione el usuario. Rellenaremos cada casilla con una fórmula
cualquiera: El cuadrado de la primera coordenada + el valor de la segunda.

Casilla (2,1)==[2^2+1] = [5]
Casilla (1,2)==[1^2+2] = [3]
*/

public class RellenarMatriz {
    
    public static void pintarMatriz(int[][] matriz){
            System.out.println("A continuacion muestro la matriz: ");
            int x=matriz.length;
            
            for(int i=0;i<x;i++){
                for(int j=0;j<matriz[i].length;j++){
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println("");
            }     
    }
    
    public static void main(String[] args){
        
        if(args.length!=2){
            System.err.println("Error: Debes ingresar 2 numeros");
            System.exit(1);
        }
        
        try{
            int x = Integer.valueOf(args[0]);
            int y = Integer.valueOf(args[1]);
            
            System.out.println("Numero de filas: " + x);
            System.out.println("Numero de columnas: " + y);
            
            int[][] matriz = new int[x][y];
            
            for(int i=0;i<x;i++){
                for(int j=0;j<y;j++){
                    matriz[i][j]=(i*i)+j;
                }
            }
            
            pintarMatriz(matriz);
                   
        }catch(NumberFormatException e){
            System.err.println("Error: Ambos argumentos deben ser numeros enteros");
            System.exit(1);
        }
               
    }
}
