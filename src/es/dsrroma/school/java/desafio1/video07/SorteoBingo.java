
package video07;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
Mientras queden bolitas en el bombo, el sorteo consistirá en extraer una
aleatoriamente pausandos unos segundos entre bola y bola.

El sorteo termina cuando alguien cante bingo
*/

public class SorteoBingo {
    private static final int MIN = 1;
    private static final int MAX = 75;
    private static final int CADENCIA = 3000;
    private static final Random R = new Random();
    
    private List<Integer> bolitas = new ArrayList<>();
    
    public SorteoBingo(){
        for(int i=MIN;i<=MAX;i++){
            bolitas.add(i);
        }
    }
    
    public void sortear(){
        try{
            while(!bolitas.isEmpty()){
                int bola = extraeBola();
                System.out.println("Numero " + bola);
                Thread.sleep(CADENCIA);
            }
        }catch(InterruptedException e){
            System.out.println("\n¡BINGO!");
        }

    }
    
    private int extraeBola(){
        int bolita = R.nextInt(bolitas.size());
        return bolita;
    }
    
    
    public static void main(String[] args){
        SorteoBingo sorteo = new SorteoBingo();
        sorteo.sortear();
    }
}
