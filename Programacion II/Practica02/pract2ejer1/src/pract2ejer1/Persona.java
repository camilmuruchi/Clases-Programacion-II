package pract2ejer1;

public class Persona {
	private String nombre;
    private String paterno;
    private String materno;
    private int edad;

    // --- a) Instanciar de diferente forma (Sobrecarga de Constructores) ---
    
    // Constructor 1: Recibe todos los parámetros
    public Persona(String nombre, String paterno, String materno, int edad) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.edad = edad;
    }

    // Constructor 2: Recibe solo nombre y paterno (los demás quedan por defecto)
    public Persona(String nombre, String paterno) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = "";
        this.edad = 0;
    }

    // Getters y Setters necesarios
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public void setMaterno(String materno) { this.materno = materno; }
    public void setEdad(int edad) { this.edad = edad; }

    // --- b) Sobrecarga del método mostrar() ---
    
    // Opción 1: Muestra los datos de la persona por separado
    public void mostrar() {
        System.out.println("Datos de la persona:");
        System.out.println("- Nombre: " + nombre);
        System.out.println("- Apellido Paterno: " + paterno);
        System.out.println("- Apellido Materno: " + materno);
        System.out.println("- Edad: " + edad);
    }

    // Opción 2: Muestra los datos unidos en un solo apartado
    public void mostrar(boolean formatoUnido) {
        if (formatoUnido) {
            System.out.println("Nombre completo: [" + nombre + " " + paterno + " " + materno + "]");
        }
    }

    // --- c) Sobrecarga del método compararApellido() ---
    
    // Opción 1: Verifica si tienen el mismo paterno
    public boolean compararApellido(Persona otraPersona) {
        return this.paterno.equalsIgnoreCase(otraPersona.paterno);
    }

    // Opción 2: Verifica si tienen el mismo materno (Añadimos un boolean a la firma para diferenciarlo)
    public boolean compararApellido(Persona otraPersona, boolean porMaterno) {
        if (porMaterno) {
            return this.materno.equalsIgnoreCase(otraPersona.materno);
        }
        return false;
    }

    // --- d) Sobrecarga del método modificarEdad() ---
    
    // Opción 1: Aumenta la edad
    public void modificarEdad(int aumento) {
        this.edad += aumento;
    }

    // Opción 2: Disminuye la edad (Añadimos un boolean a la firma para diferenciarlo de la suma)
    public void modificarEdad(int disminucion, boolean restar) {
        if (restar) {
            this.edad -= disminucion;
        }
    }
}
