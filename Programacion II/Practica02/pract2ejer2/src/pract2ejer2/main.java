package pract2ejer2;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // a) Instanciar 3 productos de maneras diferentes (el tercero por teclado)
        Producto p1 = new Producto("Laptop", 5000.0);
        Producto p2 = new Producto("Mouse"); 
        
        System.out.println("--- a) Ingreso de Producto 3 por teclado ---");
        System.out.print("Ingrese nombre del producto: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese precio del producto: ");
        double precio = scanner.nextDouble();
        Producto p3 = new Producto(nombre, precio);

        System.out.println("\n--- b y c) Mostrar normales y con calcularTotal() ---");
        // c) Muestra datos normales
        p1.mostrar(); 
        
        // c) Muestra datos usando el método calcularTotal() del inciso b con descuento de 500
        p1.mostrar(500.0); 

        System.out.println("\n--- d) modificarPrecio() ---");
        // Modificación con valor fijo interno
        p1.modificarPrecio(); 
        System.out.println("Precio tras modificación fija:");
        p1.mostrar();

        // Modificación enviada como parámetro (por teclado)
        System.out.print("\nIngrese el nuevo precio exacto para la Laptop: ");
        double nuevoPrecio = scanner.nextDouble();
        
        p1.modificarPrecio(nuevoPrecio); 
        System.out.println("Precio tras modificación por parámetro:");
        p1.mostrar();

        scanner.close();
	}

}
