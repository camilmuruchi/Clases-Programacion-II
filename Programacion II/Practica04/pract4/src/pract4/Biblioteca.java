package pract4;
import java.util.ArrayList;
import java.util.List;

/*
a) Clase Biblioteca: Representa la biblioteca universitaria.
• Atributos:
◦ Nombre de la biblioteca
◦ Lista de libros disponibles
◦ Lista de autores registrados
◦ Lista de préstamos activos
◦ Horario de atención (como clase interna)
• Métodos:
◦ Constructor que reciba el nombre.
◦ agregarLibro(Libro libro): Agrega un libro existente.
◦ agregarAutor(Autor autor): Registra un autor existente.
◦ prestarLibro(Estudiante estudiante, Libro libro): Crea un préstamo.
◦ mostrarEstado(): Muestra el estado completo de la biblioteca.
◦ cerrarBiblioteca(): Cierra la biblioteca (mensaje) y dejan de existir los préstamos.

b) RELACION DE AGREGACIÓN. Implementar en:
• Biblioteca - Libro: La biblioteca contiene libros, pero los libros pueden existir fuera de ella.
• Biblioteca - Autor: La biblioteca registra autores, pero los autores existen independientemente.
*/
public class Biblioteca {
    private String nombre;
    private List<Libro> librosDisponibles; 
    private List<Autor> autoresRegistrados; 
    private List<Prestamo> prestamosActivos; 
    private Horario horario; 

    public Biblioteca(String nombre, String diasApertura, String horaApertura, String horaCierre) {
        this.nombre = nombre;
        this.librosDisponibles = new ArrayList<>();
        this.autoresRegistrados = new ArrayList<>();
        this.prestamosActivos = new ArrayList<>();
        this.horario = new Horario(diasApertura, horaApertura, horaCierre);
    }

    public void agregarLibro(Libro libro) {
        librosDisponibles.add(libro);
        System.out.println("Libro agregado al catálogo: " + libro.getTitulo());
    }

    public void agregarAutor(Autor autor) {
        autoresRegistrados.add(autor);
        System.out.print("Autor registrado: ");
        autor.mostrarInfo();
    }

    public void prestarLibro(Estudiante estudiante, Libro libro) {
        if (librosDisponibles.contains(libro)) {
            Prestamo nuevoPrestamo = new Prestamo(estudiante, libro);
            prestamosActivos.add(nuevoPrestamo);
            System.out.println("Préstamo registrado con éxito.");
        } else {
            System.out.println("Error: El libro no pertenece a esta biblioteca.");
        }
    }

    public void mostrarEstado() {
        System.out.println("\n========= ESTADO DE BIBLIOTECA: " + nombre + " =========");
        horario.mostrarHorario();
        System.out.println("Total Libros: " + librosDisponibles.size());
        System.out.println("Total Autores: " + autoresRegistrados.size());
        System.out.println("Total Préstamos Activos: " + prestamosActivos.size());
        for (Prestamo p : prestamosActivos) {
            p.mostrarInfo();
        }
        System.out.println("========================================================\n");
    }

    public void cerrarBiblioteca() {
        System.out.println("CERRANDO BIBLIOTECA " + nombre + "...");
        prestamosActivos.clear(); 
        System.out.println("Biblioteca cerrada. Todos los préstamos han sido finalizados/destruidos.");
    }

    /*
    f ) Clase Horario: Representa el horario de atención para el lector.
    • Atributos:
    ◦ Días de apertura.
    ◦ Hora de apertura.
    ◦ Hora de cierre.
    • Métodos:
    ◦ Constructor que reciba días de apertura, hora de apertura, hora de cierre.
    ◦ mostrarHorario(): Muestra el horario de atención.

    a) RELACION DE COMPOSICIÓN. Implementar en:
    • Biblioteca - Horario: La biblioteca debe tener un horario que NO existe sin la biblioteca.
    */
    private class Horario {
        private String diasApertura;
        private String horaApertura;
        private String horaCierre;

        public Horario(String diasApertura, String horaApertura, String horaCierre) {
            this.diasApertura = diasApertura;
            this.horaApertura = horaApertura;
            this.horaCierre = horaCierre;
        }

        public void mostrarHorario() {
            System.out.println("Horario: " + diasApertura + " (" + horaApertura + " - " + horaCierre + ")");
        }
    }
}