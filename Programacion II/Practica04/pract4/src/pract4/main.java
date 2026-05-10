package pract4;
import java.util.Arrays;

/*
c) Ejecución de prueba que demuestre los tres tipos de relaciones.
*/
public class main {

    public static void main(String[] args) {
        System.out.println("--- INICIANDO SISTEMA UMSA ---");

        Autor autor1 = new Autor("Gabriel García Márquez", "Colombiano");
        
        Libro libro1 = new Libro("Cien años de soledad", "978-84-376", 
            Arrays.asList("Muchos años después...", "Frente al pelotón de fusilamiento...", "Macondo era un pueblo..."));
        
        Estudiante estudiante = new Estudiante("INF-001", "Edson Camil");

        Biblioteca bibliotecaUmsa = new Biblioteca("Biblioteca Central UMSA", "Lunes a Viernes", "08:00", "20:00");

        System.out.println("\n--- REGISTRANDO DATOS EN BIBLIOTECA ---");
        bibliotecaUmsa.agregarAutor(autor1);
        bibliotecaUmsa.agregarLibro(libro1);

        System.out.println("\n--- GENERANDO PRÉSTAMO ---");
        bibliotecaUmsa.prestarLibro(estudiante, libro1);

        bibliotecaUmsa.mostrarEstado();

        System.out.println("--- EL ESTUDIANTE LEE EL LIBRO ---");
        libro1.leer();

        System.out.println("\n--- FIN DE JORNADA ---");
        bibliotecaUmsa.cerrarBiblioteca();
        bibliotecaUmsa.mostrarEstado(); 
    }
}