package video04;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

    /*
    Simularemos un sorteo de la lotería de Navidad, necesitando:
    
    -> enum Premio con la información de los posibles premios
        - La mayoría de premios son la Pedrea
        - Ocho quintos puestos
        - Dos cuartos puestos
         - Un tercer puesto
         - Un segundo puesto
         - El gordo

    -> clase Sorteo
        - Lista de enteros
        - Lista de premios
        - Mapa de números ganadores y su premio
        - Método para realizar el sorteo
        - 2 métodos para los resultados (números y premios)
        
    Como sabemos, existen 2 bombos:
    - El primero, es enorme, y contiene una bolita por cada número
    - El segundo, más pequeño, contiene una bolita por cada premio
    
    */

public class SorteoNavidad {
    
    private static final int MIN_NUM=0;
    private static final int MAX_NUM=99999;
    private static final Random R = new Random();
    private static final int DIG = (int) Math.floor(Math.log10(MAX_NUM)+1);
    
    List<Integer> bomboNumeros = new ArrayList<>();
    List<Premio> bomboPremios = new ArrayList<>();
    Map<Integer,Premio> tablaGanadores = new HashMap<>();
    
    public SorteoNavidad(){ 
        // Metemos en cada una de las listas todos los valores
        for(int i=MIN_NUM;i<MAX_NUM;i++){
            bomboNumeros.add(i);
        }
        
        for(Premio premio : Premio.values()){
            for(int i=0;i<premio.getNumPremios();i++){
                bomboPremios.add(premio);
            }
        }
    }
    
    public void Sorteo(){
        while(!this.bomboPremios.isEmpty()){
            // Sacamos una bola de los premios
            int premioRandom = R.nextInt(bomboPremios.size());
            Premio premio = bomboPremios.remove(premioRandom);
            
            // Sacamos un número de los premios
            int numeroRandom = R.nextInt(bomboNumeros.size());
            int num = bomboNumeros.remove(numeroRandom);
            
            // Metemos en la tabla de ganadores con su premio este par de valores
            tablaGanadores.put(num, premio);
        }
    }
    
    public void mostrarTablaPremios(){
        System.out.println("Tabla ordenada por numero: ");
        
        if(this.tablaGanadores.isEmpty()){
            System.out.println("El sorteo no se ha realizado todavia");
        }
        
        tablaGanadores.keySet().stream().sorted().forEach(
                k -> System.out.println(formateaLinea(k,tablaGanadores.get(k)))
        );
    }
    
    public void mostrarTablaPorPremio(){
        System.out.println("Tabla ordenada por premios: ");
        
        if(this.tablaGanadores.isEmpty()){
            System.out.println("El sorteo no se ha realizado todavia");
        }
        
        tablaGanadores.entrySet().stream().sorted(
            new Comparator<Map.Entry<Integer,Premio>>() {
                @Override
                public int compare(Map.Entry<Integer, Premio> o1,
                    Map.Entry<Integer, Premio> o2) {
                        return o1.getValue().compareTo(o2.getValue());
                }
            }
        ).forEach(
            e -> System.out.println(formateaLinea(e))
        );
        
    }
    
    private String formateaLinea(Integer num, Premio premio){
        return String.format("%0" + DIG + "d", num) + ": "
                + premio.getPremioPorEuro() + " euros";
    }
    
    private String formateaLinea(Map.Entry<Integer, Premio> entry){
        return formateaLinea(entry.getKey(), entry.getValue());
    }
    
    public static void main(String[] args){
        SorteoNavidad s1 = new SorteoNavidad();
        s1.Sorteo();
        s1.mostrarTablaPremios();
        System.out.println("================");
        s1.mostrarTablaPorPremio();
    }
    
}
