package pract2ejer9;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] misPeliculas = {"Deadpool 3", "Intensa Mente 2", "Super Cool", "Gladiador 2", "Son Como Niños"};
        String[] misGeneros = {"Accion", "Animacion", "Comedia", "Accion", "Comedia"};
        double[] misPrecios = {40.0, 35.0, 30.0, 45.0, 30.0};

        // b) Instanciar 1 cine con al menos 5 películas en cartelera, y mostrar sus datos
        Cine miCine = new Cine("Cine Center", "Av. Rafael Pabón", 5, misPeliculas, misGeneros, misPrecios);

        System.out.println("--- ESTADO INICIAL (Inciso b) ---");
        miCine.mostrarDatos();

        System.out.println("\n--- c) i) Mostrar películas del género comedia ---");
        miCine.mostrar("Comedia");

        System.out.println("\n--- c) ii) Mostrar la i-esima película (Ej: película en el índice 2) ---");
        miCine.mostrar(2);

        System.out.println("\n--- d) SIMULANDO OPERADOR ++ (Aumentar precio en 5 Bs) ---");
        miCine.incrementarPrecios();

        System.out.println("\n--- ESTADO DESPUÉS DE LA MODIFICACIÓN ---");
        miCine.mostrarDatos();
	}

}
