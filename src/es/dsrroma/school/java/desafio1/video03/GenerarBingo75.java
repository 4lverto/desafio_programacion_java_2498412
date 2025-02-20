package video03;

/*
Generaremos un tablero de GenerarBingo75 relleno de números aleatorios, para que
cada jugador tenga uno distinto.

En el tablero de GenerarBingo75 los números se reparten en 5 grupos (uno por cada
letra de la palabra B-I-N-G-O):
-> B: 01-15 (5 números)
-> I: 16-30 (5 números)
-> N: 31-45 (4 números)
-> G: 46-60 (5 números)
-> O: 61-75 (5 números)
*/
public class GenerarBingo75 {
    
    public static void main(String[] args){
        Tablero t1 = new Tablero();
        System.out.println(t1);
    }
    
}
