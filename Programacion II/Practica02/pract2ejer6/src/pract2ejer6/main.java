package pract2ejer6;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] inventario = {
	            {"Paracetamol", "15"},
	            {"Ibuprofeno", "5"},
	            {"Amoxicilina", "8"},
	            {"Aspirina", "20"}
	        };

	        Farmacia miFarmacia = new Farmacia("Farmacia Central", inventario);

	        System.out.println("--- ESTADO INICIAL ---");
	        miFarmacia.mostrar();

	        System.out.println("\n--- RESULTADO DEL INCISO A ---");
	        miFarmacia.buscar("Ibuprofeno");
	        miFarmacia.buscar("Vitamina C");

	        System.out.println("\n--- APLICANDO INCISO B ---");
	        miFarmacia.incrementar(20);

	        System.out.println("\n--- ESTADO DESPUÉS DE LA MODIFICACIÓN ---");
	        miFarmacia.mostrar();
	}

}
