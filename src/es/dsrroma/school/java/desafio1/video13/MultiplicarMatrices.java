package video13;

/*
Para multiplicar matrices, cada casilla se rellena con la suma de los productos
de esa fila en la primera matriz con los valores de esa columna en la segunda
matriz.

Para que dos matrices se puedan multiplicar, el número de columnas de la primera
deberá coincidir con el número de filas de la segunda.

Si A es de tamaño (m x n) y B es de tamaño (n x p), la matriz resultante
tendrá tamaño (m x p)
*/

public class MultiplicarMatrices {
    
    public static void pintarMatriz(int[][] matriz){
        //System.out.println("A continuacion muestro la matriz: ");
        int x=matriz.length;

        for(int i=0;i<x;i++){
            for(int j=0;j<matriz[i].length;j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }     
    }
    
    public static int[][] multiplicarMatrices(int[][] a, int[][] b){
        if(a[0].length!=b.length){
            throw new IllegalArgumentException(
            "Las columnas de la primera matriz y las filas de la "
                    + "seguna matriz deben coincidir");
        }
        
        int[][] solucion = new int[a.length][b[0].length];
        
        int filasA = a.length;
        int colsA = a[0].length;
        int filasB = b.length;
        int colsB = b[0].length;
        
        for(int i=0;i<filasA;i++){
            for(int j=0;j<colsB;j++){
                int producto=0;
                for(int k=0;k<colsA;k++){
                    producto+=a[i][k]*b[k][j];
                }
                solucion[i][j]=producto;
            }
        }
        
        return solucion;
    }
    
    public static void main(String[] args){
        int[][] a = {{1,2,3},{4,5,6}}; // 2 x 3
        int[][] b = {{7,8},{9,10},{11,12}}; // 3 x 2
        
        System.out.println("Primera matriz: ");
        pintarMatriz(a);
        
        System.out.println("Segunda matriz: ");
        pintarMatriz(b);
        
        System.out.println("Multiplicamos las dos matrices: ");
        int[][] multiplicacion = multiplicarMatrices(a,b);
        pintarMatriz(multiplicacion);
        
    }
}
