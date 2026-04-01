package pract2ejer3;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Instanciamos el celular
        Celular miCelular = new Celular("71234567", "Edson", 128, 8, 15);

        // d) Mostrar los datos antes de los operadores
        System.out.println("--- ANTES de aplicar las operaciones ---");
        miCelular.mostrarDatos();

        // b) Simulación del operador ++ (Aumenta 10 a nroApp)
        miCelular.incrementarApps();

        // c) Simulación del operador -- (Disminuye 5 a espacio)
        miCelular.disminuirEspacio();

        // d) Mostrar los datos después de los operadores
        System.out.println("\n--- DESPUÉS de aplicar las operaciones ---");
        miCelular.mostrarDatos();
	}

}
