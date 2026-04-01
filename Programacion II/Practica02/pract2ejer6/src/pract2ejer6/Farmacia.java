package pract2ejer6;

public class Farmacia {
	private String nombre;
    private String[][] inventario;

    public Farmacia(String nombre, String[][] inventario) {
        this.nombre = nombre;
        this.inventario = inventario;
    }

    public void mostrar() {
        System.out.println("Farmacia: " + nombre);
        for (int i = 0; i < inventario.length; i++) {
            System.out.println("Medicamento: " + inventario[i][0] + " | Cantidad: " + inventario[i][1]);
        }
    }

    // a) Sobrecargar un operador para buscar un medicamento con el nombre X
    public void buscar(String x) {
        boolean encontrado = false;
        for (int i = 0; i < inventario.length; i++) {
            if (inventario[i][0].equalsIgnoreCase(x)) {
                System.out.println("Búsqueda: " + x + " SÍ está en inventario con " + inventario[i][1] + " unidades.");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Búsqueda: " + x + " NO fue encontrado.");
        }
    }

    // b) Sobrecargar un operador para incrementar en Y unidades aquellos medicamentos menores a 10 unidades
    public void incrementar(int y) {
        System.out.println("Se incrementarán " + y + " unidades a los medicamentos con stock menor a 10.");
        for (int i = 0; i < inventario.length; i++) {
            int cantidadActual = Integer.parseInt(inventario[i][1]);
            if (cantidadActual < 10) {
                cantidadActual += y;
                inventario[i][1] = String.valueOf(cantidadActual);
            }
        }
    }
}
