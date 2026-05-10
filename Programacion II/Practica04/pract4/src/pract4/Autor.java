package pract4;

/*
c) Clase Autor: Representa al escritor de los libros.
• Atributos:
◦ Nombre.
◦ Nacionalidad.
• Métodos:
◦ Constructor que reciba nombre, nacionalidad.
◦ mostrarInfo(): Muestra los datos del autor.
*/
public class Autor {
    private String nombre;
    private String nacionalidad;

    public Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public void mostrarInfo() {
        System.out.println("Autor: " + nombre + " (" + nacionalidad + ")");
    }
}