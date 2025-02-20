package video01;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Deberemos generar un boleto compuesto por:
- 5 números con valores entre 1 y 50
- Los números no podrán repetirse
*/

public class GeneradorBoletos2{
    private static final int MAX=50;
    private static final int MIN=1;
    private static final int UTIL=5;
   
    public static int generarNumero(){
        int n = (int) ((Math.random() * MAX-1)+MIN);
        System.out.println("El siguiente numerito es..." + n);
        return n;
    }
    
    public static List<Integer> generarBoleto(){
        System.out.println("Voy a prepararte tu boleto...");
        
        List<Integer> numeros=new ArrayList<>();
        
        while(numeros.size()<UTIL){
            int n=generarNumero();
            if(!numeros.contains(n)){
                numeros.add(n);
            }
        }

        return numeros;
    }

    
    public static void main(String[] args) {
        List<Integer> boleto = generarBoleto();
        System.out.println(boleto);
    }
}