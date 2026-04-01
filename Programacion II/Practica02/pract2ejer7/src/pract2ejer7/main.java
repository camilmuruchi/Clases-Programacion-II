package pract2ejer7;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// b) Instanciar 2 objetos Auto, usando los diferentes constructores.
        Auto auto1 = new Auto("Toyota", "Rojo", 15);
        Auto auto2 = new Auto("Nissan");

        System.out.println("--- ESTADO INICIAL ---");
        auto1.mostrar();
        auto2.mostrar();

        System.out.println("\n--- APLICANDO INCISO C (Simulando ++) en Auto 1 ---");
        auto1.incrementarGasolina();
        auto1.mostrar(); // Mostramos el cambio

        System.out.println("\n--- APLICANDO INCISO D (Simulando +) en Auto 2 ---");
        auto2.cambiarColor("Azul Marino");
        auto2.mostrar(); // Mostramos el cambio

        System.out.println("\n--- APLICANDO INCISO E (Simulando -) ---");
        int totalGas = auto1.sumarGasolina(auto2);
        System.out.println("El total de gasolina sumando ambos autos es: " + totalGas + " litros");
	}

}
