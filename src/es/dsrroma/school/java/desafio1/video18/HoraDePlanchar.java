
package video18;

import java.time.LocalDateTime;

/*
Dada una hora, queremos que el programa nos diga en que tarifa electrica estamos:
- Tarifa Valle (Más barata) --> Por la Noche(de 00:00 a 8:00)
                                Los Fines de Semana

- Tarifa Punta (Más cara)   --> Entre semana de:
                                10:00 a 14:00
                                18:00 a 22:00

- Tarifa Llano (Precio Medio) --> Entre semana de:
                                8:00 a 10:00
                                14:00 a 18:00
                                22:00 a 00:00
                                

Usaremos un enum para los 3 tipos de tarifas.
Con un switch definiremos en qué día de la semana estamos (usando una librería)
Para los días entre semana usaremos un if que en función de la hora será una tarifa

*/
public class HoraDePlanchar {
    
    private static Tarifa tarifaSegunHora(LocalDateTime momento){
        int hora = momento.getHour();
        
        if(hora<8){
            return Tarifa.VALLE;
        }else if((hora<=14 && hora>=10) || (hora<=22 && hora>=18)){
            return Tarifa.PUNTA;
        }else{
            return Tarifa.LLANO;
        }   
    }
    
    public static Tarifa esHoraDePlanchar(LocalDateTime momento){
        switch(momento.getDayOfWeek()){
            case SATURDAY, SUNDAY:
                return Tarifa.VALLE;
            default:
                return tarifaSegunHora(momento);
        }
    }
    
    public static void main(String[] args){
        LocalDateTime ahora = LocalDateTime.now();
        System.out.println("Es hora de planchar?" + esHoraDePlanchar(ahora));
    
        for(int i = 0; i<24; i++){
            System.out.println("Hora: " + i + " -> " + esHoraDePlanchar(LocalDateTime.now().withHour(i)));
        }
        
        for(int i=0;i<7;i++){
            LocalDateTime dia = LocalDateTime.now().minusDays(i);
            System.out.println("Dia: " + dia.getDayOfWeek() + " : " + esHoraDePlanchar(dia));
        }
    }
}
