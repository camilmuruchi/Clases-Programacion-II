package pract2ejer5;

public class Aula {
	private String nombreAula;
    private int piso;
    private String[][] estudiantesYNotas;

    public Aula(String nombreAula, int piso, String[][] estudiantesYNotas) {
        this.nombreAula = nombreAula;
        this.piso = piso;
        this.estudiantesYNotas = estudiantesYNotas;
    }

    // a) i) Mostrar todos los datos del aula.
    public void mostrar() {
        System.out.println("Aula: " + nombreAula + " | Piso: " + piso);
        System.out.println("Lista de estudiantes:");
        for (int i = 0; i < estudiantesYNotas.length; i++) {
            System.out.println("Nombre: " + estudiantesYNotas[i][0] + " | Nota: " + estudiantesYNotas[i][1]);
        }
    }

    // a) ii) Mostrar a los estudiantes con un mensaje de "APROBADO", "REPROBADO".
    public void mostrar(boolean mostrarEstado) {
        System.out.println("Estado de estudiantes (Aula: " + nombreAula + "):");
        for (int i = 0; i < estudiantesYNotas.length; i++) {
            String nombre = estudiantesYNotas[i][0];
            int nota = Integer.parseInt(estudiantesYNotas[i][1]);
            
            // Asumimos que la nota de aprobación es 51 o mayor
            String estado = (nota >= 51) ? "APROBADO" : "REPROBADO"; 
            
            System.out.println("Nombre: " + nombre + " | Estado: " + estado);
        }

    	}
    }
