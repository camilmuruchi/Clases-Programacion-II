package pract2ejer4;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // a) Instanciar al menos 2 videojuegos
        // Usando los constructores sobrecargados del inciso b
        Videojuego v1 = new Videojuego("Super Smash Bros", "Nintendo Switch");
        Videojuego v2 = new Videojuego("Minecraft", "PC", 10);

        System.out.println("--- ESTADO INICIAL ---");
        v1.mostrar();
        v2.mostrar();

        // c) Probar método agregarJugadores() (Agrega solo 1)
        System.out.println("\n--- MODIFICACIÓN 1: Agregando 1 jugador a v1 ---");
        v1.agregarJugadores();
        
        
        v1.mostrar(); 

        // c) Probar método agregarJugadores() por teclado
        System.out.println("\n--- MODIFICACIÓN 2: Agregando jugadores por teclado a v2 ---");
        System.out.print("¿Cuántos jugadores deseas agregar a Minecraft?: ");
        int nuevosJugadores = scanner.nextInt();
        
        v2.agregarJugadores(nuevosJugadores);
        
    
        v2.mostrar(); 

        scanner.close();
	}

}
