package video01;
import java.util.Arrays;

/*
Deberemos generar un boleto compuesto por:
- 5 números con valores entre 1 y 50
*/

public class GeneradorBoletos1 {
    private static final int MAX=50;
    private static final int MIN=1;
    private static final int UTIL=5;
   
    public static int generarNumero(){
        int n = (int) ((Math.random() * MAX-1)+MIN);
        System.out.println("El siguiente numerito es..." + n);
        return n;
    }
    
    public static int[] generarBoleto(){
        System.out.println("Voy a prepararte tu boleto...");
        
        int[] numeros = new int[UTIL];
        for(int i=0;i<UTIL;i++){
            numeros[i]=generarNumero();
        }

        return numeros;
    }

    /*
    public static void main(String[] args) {
        int[] boleto = generarBoleto();
        System.out.println(Arrays.toString(boleto));
    }*/
}