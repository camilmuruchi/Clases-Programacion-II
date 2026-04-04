package pract3ejer1;

public class Aplicacion {

    public static void main(String[] args) {
        
        // a) 
        JuegoAdivinaNumero juegoNormal = new JuegoAdivinaNumero(3);
        JuegoAdivinaPar juegoPar = new JuegoAdivinaPar(3);
        JuegoAdivinaImpar juegoImpar = new JuegoAdivinaImpar(3);
        
        // b) 
        System.out.println("\n=======================================================");
        System.out.println("  INICIANDO MODO 1: JUEGO NORMAL (CUALQUIER NÚMERO)    ");
        System.out.println("=======================================================");
        juegoNormal.juega();
        
        System.out.println("\n=======================================================");
        System.out.println("        INICIANDO MODO 2: ADIVINAR NÚMEROS PARES       ");
        System.out.println("=======================================================");
        juegoPar.juega();
        
        System.out.println("\n=======================================================");
        System.out.println("        INICIANDO MODO 3: ADIVINAR NÚMEROS IMPARES     ");
        System.out.println("=======================================================");
        juegoImpar.juega();
        
        System.out.println("\n=======================================================");
        System.out.println("        ¡TODOS LOS MODOS DE JUEGO HAN TERMINADO!       ");
        System.out.println("=======================================================");
    }
}