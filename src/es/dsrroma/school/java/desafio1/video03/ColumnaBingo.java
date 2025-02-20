package video03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ColumnaBingo {
    
    private LetraBingo letra;
    private int[] nums;
    
    public ColumnaBingo(LetraBingo l){
        this.letra=l;
        this.nums = generarColumna(letra);
    }
    
    public LetraBingo getLetra(){
        return this.letra;
    }
    
    public int[] getNumsColumna(){
        return this.nums;
    }
    
    private static int generarNumeroAleatorio(LetraBingo l){
        return (int)((Math.random()*l.getMax())+l.getMin());
    }
    
    private int[] generarColumna(LetraBingo l){
        
        List<Integer> numeros = new ArrayList<>();
        
        for(int i=0;i<l.getLon();i++){
            int n=generarNumeroAleatorio(l);
            while(numeros.contains(n)){
                n=generarNumeroAleatorio(l);
            }
            numeros.add(n);
        }
        Collections.sort(numeros);
        
        return numeros.stream().mapToInt(Integer::intValue).toArray();
    }
    
    @Override
    public String toString(){
        
        return this.letra.getLetra() + ": " + Arrays.toString(this.nums);
    }
}
