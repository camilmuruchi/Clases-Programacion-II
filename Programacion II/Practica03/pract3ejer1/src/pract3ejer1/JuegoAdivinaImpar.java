package pract3ejer1;

// a) Se deriva de la clase JuegoAdivinaNumero
public class JuegoAdivinaImpar extends JuegoAdivinaNumero {

    public JuegoAdivinaImpar(int vidas) {
        super(vidas);
    }

    // b) Redefina el método validaNumero devolviendo true si el número es impar y si está entre el 0 y 10. Si el número es par, muestra un mensaje de error por pantalla y devuelve false.
    @Override
    public boolean validaNumero(int numero) {
        if (numero >= 0 && numero <= 10) {
            if (numero % 2 != 0) {
                return true;
            } else {
                System.out.println("Error: El número debe ser impar.");
                return false;
            }
        }
        return false;
    }
}