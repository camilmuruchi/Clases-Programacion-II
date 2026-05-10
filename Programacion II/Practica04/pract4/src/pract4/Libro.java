package pract4;
import java.util.ArrayList;
import java.util.List;

/*
b) Clase Libro: Representa un libro físico.
• Atributos:
◦ Título.
◦ ISBN
◦ Páginas (como clases internas)
• Métodos:
◦ Constructor que reciba título, ISBN y contenido de páginas
◦ leer(): Muestra todas las páginas del libro.

a) RELACION DE COMPOSICIÓN. Implementar en:
• Libro - Pagina: Cada libro debe contener páginas que NO pueden existir independientemente del libro.
*/
public class Libro {
    private String titulo;
    private String isbn;
    private List<Pagina> paginas;

    public Libro(String titulo, String isbn, List<String> contenidosPaginas) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.paginas = new ArrayList<>();
        
        for (int i = 0; i < contenidosPaginas.size(); i++) {
            this.paginas.add(new Pagina(i + 1, contenidosPaginas.get(i)));
        }
    }

    public void leer() {
        System.out.println("Leyendo el libro: " + titulo);
        for (Pagina p : paginas) {
            p.mostrarPagina();
        }
    }

    public String getTitulo() {
        return titulo;
    }

    /*
    g) Clase Página: Representa una página física del libro.
    • Atributos:
    ◦ Número de página.
    ◦ Contenido de la página.
    • Métodos:
    ◦ Constructor que reciba número de la página, contenido de la página.
    ◦ mostrarHorario(): Muestra el horario de atención.
    */
    private class Pagina {
        private int numeroPagina;
        private String contenido;

        public Pagina(int numeroPagina, String contenido) {
            this.numeroPagina = numeroPagina;
            this.contenido = contenido;
        }

        public void mostrarPagina() {
            System.out.println("--- Pág " + numeroPagina + " ---");
            System.out.println(contenido);
        }
    }
}