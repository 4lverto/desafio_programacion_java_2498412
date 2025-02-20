package video06;

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
     
    private int aciertos(Boleto resultado){
        int aciertos=0;
        
        for(int i=0;i<this.numeros.length;i++){
            for(int j=0;j<resultado.numeros.length;j++){
                if(this.numeros[i]==resultado.numeros[j]){
                    aciertos++;
                }
            }
        }
        
        return aciertos;
    }
    
    private boolean reintegro(Boleto resultado){
        boolean tiene=this.reintegro==resultado.reintegro;
        return tiene;
    }
     
    // Devolverá el premio correspondiente al comparar el Boleto pasado como 
    // parámetro (resultado) con este en cuestión (this)
    public Premio validar(Boleto resultado){
        int aciertos=aciertos(resultado);
        boolean reintegro=reintegro(resultado);
        Premio premio;
        
        switch(aciertos){
            case UTIL:
                if(reintegro){
                    premio=Premio.PLENO;
                }else{
                    premio=Premio.SEIS_SIN;
                }
                break;
            case UTIL-1:
                if(reintegro){
                    premio=Premio.CINCO_CON;
                }else{
                    premio=Premio.CINCO_SIN;
                }
                break;
            case UTIL-2:
                if(reintegro){
                    premio=Premio.CUATRO_CON;
                }else{
                    premio=Premio.CUATRO_SIN;
                }
                break;
            case UTIL-3:
                if(reintegro){
                    premio=Premio.TRES_CON;
                }else{
                    premio=Premio.TRES_SIN;
                }
                break;
            default:
                if(reintegro){
                    premio=Premio.REINTEGRO;
                }else{
                    premio=Premio.NADA;
                }
                break;
        }
        
        return premio;
    }
     
    @Override
    public String toString(){
        String mensaje = "-Numeros: " + Arrays.toString(numeros) + " -Reintegro: " + reintegro;
        return mensaje;
    }
}
