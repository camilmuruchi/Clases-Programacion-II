package pract2ejer7;

public class Auto {
	private String marca;
    private String color;
    private int gasolina;

    // a) Sobrecargar el constructor 2 veces (3 constructores en total)
    public Auto(String marca, String color, int gasolina) {
        this.marca = marca;
        this.color = color;
        this.gasolina = gasolina;
    }

    public Auto(String marca) {
        this.marca = marca;
        this.color = "Blanco"; // por defecto
        this.gasolina = 5;     // por defecto
    }

    public Auto() {
        this.marca = "Generico";
        this.color = "Negro";
        this.gasolina = 0;
    }

    // Método de apoyo para evidenciar las modificaciones
    public void mostrar() {
        System.out.println("Marca: " + marca + " | Color: " + color + " | Gasolina: " + gasolina + "L");
    }

    // c) Sobrecargar el operador ++ para incrementar la gasolina en 5 litros.
    public void incrementarGasolina() {
        this.gasolina += 5;
    }

    // d) Sobrecargar el operador + para cambiar el color del auto.
    public void cambiarColor(String nuevoColor) {
        this.color = nuevoColor;
    }

    // e) Sobrecargar el operador - para sumar el total de gasolina entre los 2 autos.
    public int sumarGasolina(Auto otroAuto) {
        return this.gasolina + otroAuto.gasolina;
    }
}
