package pract4;

/*
d) Clase Estudiante: Representa a los usuarios de la biblioteca.
• Atributos:
◦ Código de estudiante.
◦ Nombre.
• Métodos:
◦ Constructor que reciba código y nombre.
◦ mostrarInfo(): Muestra los datos del estudiante.
*/
public class Estudiante {
    private String codigoEstudiante;
    private String nombre;

    public Estudiante(String codigoEstudiante, String nombre) {
        this.codigoEstudiante = codigoEstudiante;
        this.nombre = nombre;
    }

    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + " - Código: " + codigoEstudiante);
    }

    public String getNombre() {
        return nombre;
    }
}