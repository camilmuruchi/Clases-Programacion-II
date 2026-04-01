package pract2ejer4;
import java.util.Scanner;
public class Videojuego {
	private String nombre;
    private String plataforma;
    private int cantidadJugadores;

    // b) Sobrecargar el constructor 2 veces (Aquí tenemos 3 constructores en total)
    
    // Constructor 1: Todos los datos
    public Videojuego(String nombre, String plataforma, int cantidadJugadores) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantidadJugadores = cantidadJugadores;
    }

    // Constructor 2: Solo nombre y plataforma (asume 0 jugadores iniciales)
    public Videojuego(String nombre, String plataforma) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantidadJugadores = 0;
    }

    // Constructor 3: Solo nombre
    public Videojuego(String nombre) {
        this.nombre = nombre;
        this.plataforma = "Sin definir";
        this.cantidadJugadores = 0;
    }

    // c) Sobrecarga del método agregarJugadores()
    
    // Opción 1: Agrega solo un jugador (simula un ++)
    public void agregarJugadores() {
        this.cantidadJugadores++;
    }

    // Opción 2: Agrega una cantidad específica enviada como parámetro
    public void agregarJugadores(int cantidad) {
        this.cantidadJugadores += cantidad;
    }

    // Método de apoyo para imprimir el estado actual del objeto
    public void mostrar() {
        System.out.println("Videojuego: " + nombre + " | Plataforma: " + plataforma + " | Jugadores actuales: " + cantidadJugadores);
    }
}
