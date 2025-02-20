package video02;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Boleto {
    
    // Atributos
    private int reintegro;
    private int[] numeros;
    
    private static final int MAX_N=49;
    private static final int MIN_N=1;
    private static final int UTIL=6;
    private static final int MIN_REINTEGRO=1;
    private static final int MAX_REINTEGRO=10;
    
    public Boleto(){
        this.numeros=generarBoleto(MIN_N,MAX_N,UTIL);
        this.reintegro=generarNumero(MIN_REINTEGRO,MAX_REINTEGRO);
    }
    
    // Métodos
    
    /**
     * @brief Genera un número aleatorio entre 2 extremos ambos contenidos
     * @param min 
     * @param max
     * @return Número aleatorio entre min y max
     */
    private static int generarNumero(int min,int max){
        return (int)((Math.random()*max-1)+min);
    }
    
    /**
     * @brief Genera un boleto completo formado por 6 números
     * @return Boleto
     */
     private static int[] generarBoleto(int min, int max, int nums){
         
         
        List<Integer> boleto = new ArrayList<>();
        
        while(boleto.size()<nums){
            int n=generarNumero(min,max);
            if(!boleto.contains(n)){
                boleto.add(n);
            }
        }
        Collections.sort(boleto);
        
        // Así convertimos una List a Array
        return boleto.stream().mapToInt(Integer::intValue).toArray();
    }
     
    @Override
    public String toString(){
        String mensaje = "-Numeros: " + Arrays.toString(numeros) + " -Reintegro: " + reintegro;
        return mensaje;
    }
}
