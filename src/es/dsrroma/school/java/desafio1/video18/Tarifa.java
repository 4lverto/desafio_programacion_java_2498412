package video18;
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
*/
public enum Tarifa {
    VALLE,PUNTA,LLANO;
    
    Tarifa(){
        
    }
}
