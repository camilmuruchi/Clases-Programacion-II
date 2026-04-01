package pract2ejer3;

public class Celular {
	private String nroTel;
    private String dueno;
    private int espacio;
    private int ram;
    private int nroApp;

    public Celular(String nroTel, String dueno, int espacio, int ram, int nroApp) {
        this.nroTel = nroTel;
        this.dueno = dueno;
        this.espacio = espacio;
        this.ram = ram;
        this.nroApp = nroApp;
    }

    // b) Simulación de la sobrecarga del operador ++
    public void incrementarApps() {
        this.nroApp += 10;
    }

    // c) Simulación de la sobrecarga del operador --
    public void disminuirEspacio() {
        this.espacio -= 5;
    }

    // Método de apoyo para el inciso d
    public void mostrarDatos() {
        System.out.println("Teléfono: " + nroTel);
        System.out.println("Dueño: " + dueno);
        System.out.println("Espacio disponible: " + espacio + " GB");
        System.out.println("Memoria RAM: " + ram + " GB");
        System.out.println("Número de Apps: " + nroApp);
    }
}
