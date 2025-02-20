package video03;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Tablero {
    // Habrá una columna por cada letra
    private List<ColumnaBingo> columnas = new ArrayList<>();
    
    public Tablero(){
        // Por cada una de las 5 letras generamos una columna
        for(LetraBingo letra : LetraBingo.values()){
            columnas.add(new ColumnaBingo(letra));
        }
    }
    
    @Override
    public String toString(){
        
        String mensaje="Numeros:\n";
        
        for(ColumnaBingo columna : this.columnas){
            mensaje+=columna.toString() + "\n";
        }
        
        return mensaje;
    }
}
