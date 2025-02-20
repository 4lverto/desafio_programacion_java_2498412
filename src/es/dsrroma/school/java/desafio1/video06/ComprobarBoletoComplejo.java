package video06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import video05.ComprobarBoleto;

public class ComprobarBoletoComplejo {
    
    
    public static void main(String[] args){
        Boleto ganador = new Boleto();
        System.out.println("Sorteo -> " + ganador);
        Map<Boleto,Premio> ganadores = new HashMap<>();
        
        int nadas=0;
        int reintegros=0;
        for(int i=0;i<50;i++){
            Boleto b = new Boleto();
            Premio p = b.validar(ganador);
            
            if(p==Premio.NADA){
                nadas++;
            }else if(p==Premio.REINTEGRO){
                reintegros++;
            }else{
                ganadores.put(b, p);
                //System.out.println(b + " --> Premio : " + p);
            }
        }
        System.out.println("Boletos sin premio: " + nadas + "/50");
        System.out.println("Boletos solo con reintegro: " + reintegros + "/50");
        
        if(ganadores.isEmpty()){
            System.out.println("El sorteo no se ha realizado todavia");
        }
        
        System.out.println("Boletos premiados: ");
        System.out.println(ganadores);
        
    }
}
