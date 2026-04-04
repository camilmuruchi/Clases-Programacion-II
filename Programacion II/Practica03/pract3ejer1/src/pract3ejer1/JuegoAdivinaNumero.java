package pract3ejer1;

import java.util.Scanner;
import java.util.Random;

public class JuegoAdivinaNumero extends Juego {

    private int numeroAAdivinar;

    public JuegoAdivinaNumero(int vidas) {
        super(vidas);
    }

    // a) 
    public boolean validaNumero(int numero) {
        return numero >= 0 && numero <= 10;
    }

    public void juega() {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        boolean jugarDeNuevo = true;

        while (jugarDeNuevo) {
            
            reiniciaPartida();
            this.numeroAAdivinar = rd.nextInt(11);
            
            // Texto corregido para que sirva en todos los modos
            System.out.println("\n--- NUEVA PARTIDA ---");
            System.out.println("Récord a batir: " + record + " vidas.");
            
            boolean terminarPartida = false;

            while (!terminarPartida) {
                System.out.print("Adivina un número entre 0 y 10: ");
                int intento = sc.nextInt();

                // b) 
                if (validaNumero(intento)) {
                    if (intento == numeroAAdivinar) {
                        System.out.println("\n¡¡Acertaste!!");
                        actualizaRecord();
                        terminarPartida = true; 
                        
                    } else {
                        boolean quedanVidas = quitaVida();
                        
                        if (quedanVidas) {
                            if (intento < numeroAAdivinar) {
                                System.out.println("=> Fallaste. El número oculto es MAYOR.");
                            } else {
                                System.out.println("=> Fallaste. El número oculto es MENOR.");
                            }
                            System.out.println("¡Te quedan " + numeroDeVidas + " vidas! Inténtalo de nuevo.\n");
                        } else {
                            System.out.println("\nGame Over... Te has quedado sin vidas.");
                            System.out.println("El número era: " + numeroAAdivinar);
                            terminarPartida = true; 
                        }
                    }
                } else {
                    System.out.println("Número fuera de rango o regla inválida para este modo. Intenta de nuevo.");
                }
            }

            System.out.print("\n¿Quieres volver a jugar ESTE MODO? (1 para SÍ, 0 para NO): ");
            int respuesta = sc.nextInt();
            
            if (respuesta == 0) {
                jugarDeNuevo = false;
                System.out.println("Saliendo de este modo. Tu récord fue de " + record + " vidas.\n");
            }
        }
    }
}