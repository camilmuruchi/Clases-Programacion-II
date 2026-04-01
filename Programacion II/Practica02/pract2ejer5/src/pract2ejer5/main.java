package pract2ejer5;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] matrizEstudiantes = {
	            {"Luis", "67"},
	            {"Aracely", "89"}
	        };
	        
	        Aula miAula = new Aula("Laboratorio A", 2, matrizEstudiantes);

	        // a) i) Mostrar todos los datos del aula.
	        miAula.mostrar();

	        System.out.println("\n------------------------------------------------\n");

	        // a) ii) Mostrar a los estudiantes con un mensaje de "APROBADO", "REPROBADO".
	        miAula.mostrar(true);
	}

}
