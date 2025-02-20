package video12;

/*
Para sumar matrices necesitaremos 2 matrices del mismo tamaño. Por ej: 2x3
*/

public class SumarMatrices {
    
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
    
    public static int[][] sumarMatrices(int[][] a, int[][] b){
        
        if(a.length!=b.length || (a[0].length!=b[0].length)){
            throw new IllegalArgumentException(
            "Las dos matrices a sumar deben tener las mismas dimensiones");
        }
        
        int[][] suma = new int[a.length][a[0].length];
        
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                suma[i][j]=a[i][j] + b[i][j];
            }
        }
        
        return suma;
    }
    
    
    public static void main(String[] args){
        int[][] a={{1,2,3},{4,5,6}};
        int[][] b={{10,20,30},{40,50,60}};
        
        System.out.println("Primera matriz:");
        pintarMatriz(a);
        
        System.out.println("Segunda matriz");
        pintarMatriz(b);
        
        System.out.println("Matrices sumadas");
        int[][] suma=sumarMatrices(a,b);
        pintarMatriz(suma);
       
        
    }
}
