package pract4;
import java.time.LocalDate;

/*
e) Clase Prestamo: Representa el préstamo de un libro a un estudiante.
• Atributos:
◦ Fecha de préstamo.
◦ Fecha de devolución.
◦ Referencias al estudiante y libro.
• Métodos:
◦ Constructor que reciba estudiante y libro.
◦ mostrarInfo(): Muestra detalles del préstamo.

c) RELACION DE ASOCIACIÓN. Implementar en:
• Prestamo - Estudiante: Un préstamo asocia un estudiante con un libro.
• Prestamo - Libro: El préstamo referencia tanto al estudiante como al libro.
*/
public class Prestamo {
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;
    private Estudiante estudiante; 
    private Libro libro; 

    public Prestamo(Estudiante estudiante, Libro libro) {
        this.estudiante = estudiante;
        this.libro = libro;
        this.fechaPrestamo = LocalDate.now();
        this.fechaDevolucion = this.fechaPrestamo.plusDays(7); 
    }

    public void mostrarInfo() {
        System.out.println("--- Detalles del Préstamo ---");
        System.out.println("Fecha Préstamo: " + fechaPrestamo);
        System.out.println("Fecha Devolución: " + fechaDevolucion);
        System.out.println("Estudiante: " + estudiante.getNombre());
        System.out.println("Libro: " + libro.getTitulo());
    }
}