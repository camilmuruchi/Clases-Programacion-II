package pract2ejer2;
import java.util.Scanner;
public class Producto {
	private String nombre;
    private double precio;

    // a) Diferentes formas de instanciar (Sobrecarga de constructores)
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public Producto(String nombre) {
        this.nombre = nombre;
        this.precio = 0.0;
    }

    public Producto() {
        this.nombre = "Sin definir";
        this.precio = 0.0;
    }

    // b) Sobrecarga del método calcularTotal()
    public double calcularTotal() {
        return this.precio; // Precio fijo normal
    }

    public double calcularTotal(double descuento) {
        return this.precio - descuento; // Precio aplicando descuento enviado como parámetro
    }

    // c) Sobrecarga del método mostrar()
    public void mostrar() {
        System.out.println("Producto: " + nombre + " | Precio Normal: " + calcularTotal());
    }

    public void mostrar(double descuento) {
        System.out.println("Producto: " + nombre + " | Total con descuento: " + calcularTotal(descuento));
    }

    // d) Sobrecarga del método modificarPrecio()
    public void modificarPrecio() {
        this.precio += 100.0; // Fijo: siempre aumenta 100
    }

    public void modificarPrecio(double nuevoPrecio) {
        this.precio = nuevoPrecio; // Enviado como parámetro
    }
}
