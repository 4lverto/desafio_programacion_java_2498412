
package video08;

import static java.lang.String.format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FormateaFecha {
    
    public static void main(String[] args){
    
        try(Scanner s = new Scanner(System.in)){
            System.out.println("Indica el formato de fecha deseado: ");
            String patron = s.nextLine();
            
            // El usuario muchas veces insertará mal la fecha, luego usaremos
            // un try catch para gestionar esto:
            try{
                SimpleDateFormat sdf = new SimpleDateFormat(patron);
                String ahora = sdf.format(new Date());
                System.out.println("Fecha actual: " + ahora);
            } catch(IllegalArgumentException iae){
                System.err.println(String.format(
                    "El patron indicado %s no es valido", patron));
            }
        }
    }
    
}
