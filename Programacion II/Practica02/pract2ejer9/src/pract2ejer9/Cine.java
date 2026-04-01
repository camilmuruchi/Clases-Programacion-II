package pract2ejer9;

public class Cine {
	private String nombre;
    private String direccion;
    private int cantidadPeliculas;
    private String[] peliculas;
    private String[] generos;
    private double[] precios;

    public Cine(String nombre, String direccion, int cantidadPeliculas, String[] peliculas, String[] generos, double[] precios) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cantidadPeliculas = cantidadPeliculas;
        this.peliculas = peliculas;
        this.generos = generos;
        this.precios = precios;
    }

    public void mostrarDatos() {
        System.out.println("Cine: " + nombre + " | Dirección: " + direccion);
        for (int i = 0; i < cantidadPeliculas; i++) {
            System.out.println((i) + ". " + peliculas[i] + " (" + generos[i] + ") - Precio: " + precios[i] + " Bs.");
        }
    }

    // c) i) Sobrecargar un método para mostrar todas las películas del género comedia
    public void mostrar(String generoBuscado) {
        for (int i = 0; i < cantidadPeliculas; i++) {
            if (generos[i].equalsIgnoreCase(generoBuscado)) {
                System.out.println("- " + peliculas[i] + " (" + generos[i] + ")");
            }
        }
    }

    // c) ii) Sobrecargar un método para mostrar la i-esima película
    public void mostrar(int i) {
        if (i >= 0 && i < cantidadPeliculas) {
            System.out.println("Película en la posición " + i + ": " + peliculas[i] + " (" + generos[i] + ") - " + precios[i] + " Bs.");
        } else {
            System.out.println("Índice fuera de rango.");
        }
    }

    // d) Sobrecargar el operador "++" (Simulado) para incrementar el precio de la butaca en 5 bolivianos
    public void incrementarPrecios() {
        for (int i = 0; i < cantidadPeliculas; i++) {
            this.precios[i] += 5.0;
        }
    }
}
