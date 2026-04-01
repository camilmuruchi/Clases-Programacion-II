package pract2ejer10;

public class Cabina {
	private String codigoIdentificacion;
    private int numeroCabina;
    private int capacidadPasajeros;
    private String linea;
    private boolean enServicio; // true = en servicio, false = fuera de servicio

    public Cabina(String codigoIdentificacion, int numeroCabina, int capacidadPasajeros, String linea, boolean enServicio) {
        this.codigoIdentificacion = codigoIdentificacion;
        this.numeroCabina = numeroCabina;
        this.capacidadPasajeros = capacidadPasajeros;
        this.linea = linea;
        this.enServicio = enServicio;
    }

    // Método para mostrar los datos de la cabina
    public void mostrar() {
        String estadoTexto = enServicio ? "En servicio" : "Fuera de servicio";
        System.out.println("Línea: " + linea + " | Cabina #" + numeroCabina + " | Código: " + codigoIdentificacion + " | Capacidad: " + capacidadPasajeros + " | Estado: " + estadoTexto);
    }

    // Método extra para poder modificar el estado de la cabina
    public void cambiarEstado(boolean nuevoEstado) {
        this.enServicio = nuevoEstado;
    }
}
