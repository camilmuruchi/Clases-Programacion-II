package pract2ejer1;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// a) Instanciar 2 personas de diferente forma
        Persona p1 = new Persona("Carlos", "Gomez", "Perez", 20);
        Persona p2 = new Persona("Ana", "Gomez");
        p2.setMaterno("Perez");
        p2.setEdad(25);

        // b) Probar método mostrar()
        p1.mostrar(); 
        p1.mostrar(true); 

        // c) Probar método compararApellido()
        System.out.println("¿Mismo paterno?: " + p1.compararApellido(p2));
        System.out.println("¿Mismo materno?: " + p1.compararApellido(p2, true));

        // d) Probar método modificarEdad()
        p1.modificarEdad(5);       // Aumenta 5
        p2.modificarEdad(2, true); // Disminuye 2
        
        
        p1.mostrar(); 
        p2.mostrar();

	}

}
