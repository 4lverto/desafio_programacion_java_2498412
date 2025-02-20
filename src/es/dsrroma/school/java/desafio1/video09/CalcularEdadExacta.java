package video09;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class CalcularEdadExacta {

    private static final String PATRON = "dd/MM/yyyy";
    
    public static void main(String[] args){
        
        try(Scanner s = new Scanner(System.in)){
            System.out.println("Indica tu fecha de nacimiento siguiendo"
                    + "este patrón: " + PATRON);
        
            String fechaLeida = s.nextLine();
            
            try{
                
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern(PATRON);
                LocalDate fecha = LocalDate.parse(fechaLeida,dtf);
                LocalDate ahora = LocalDate.now();
                
                Period edad = Period.between(fecha,ahora);
                
                System.out.println("Tienes: " + edad.getYears() + " años, "
                        + edad.getMonths() + " meses, y " + edad.getDays()
                        + "dias.");
                
                if(edad.getMonths()==0){
                    if(edad.getDays() == 0){
                        System.out.println("FELICIDADES, TU CUMPLE ES HOY!!!");
                    }else{
                        System.out.println("FELICIDADES ATRASADAS!! JEJE");
                    }
                }else if(edad.getMonths()==11){
                    System.out.println("YA QUEDA POQUITO PARA TU CUMPLE...");
                }
                
            }catch(DateTimeParseException e){
                System.err.println(String.format("La fecha indicada ('%s')"
                        + "no sigue el patrón esperado: ('%s')",fechaLeida,PATRON));
            }
            
        }

        
    }
}
