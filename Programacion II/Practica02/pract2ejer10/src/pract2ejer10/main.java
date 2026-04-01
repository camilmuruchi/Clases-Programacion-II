package pract2ejer10;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Modelando la información instanciando dos cabinas del teleférico
        Cabina cabina1 = new Cabina("L-ROJ-001", 1, 10, "Roja", true);
        Cabina cabina2 = new Cabina("L-AMA-045", 45, 10, "Amarilla", false);

        System.out.println("--- ESTADO INICIAL ---");
        cabina1.mostrar();
        cabina2.mostrar();

        System.out.println("\n--- MODIFICANDO ESTADO (Poniendo en servicio la cabina 2) ---");
        // Cambiamos el estado de la cabina 2 a "true" (En servicio)
        cabina2.cambiarEstado(true);

        System.out.println("\n--- ESTADO DESPUÉS DE LA MODIFICACIÓN ---");
        cabina2.mostrar();
	}

}
