package pract3ejer1;

// a) Se deriva de la clase JuegoAdivinaNumero
public class JuegoAdivinaPar extends JuegoAdivinaNumero {

    public JuegoAdivinaPar(int vidas) {
        super(vidas);
    }

    // b) Redefina el método validaNumero devolviendo true si el número es par y si está entre el 0 y 10. Si el número es impar, muestra un mensaje de error por pantalla y devuelve false.
    @Override
    public boolean validaNumero(int numero) {
        if (numero >= 0 && numero <= 10) {
            if (numero % 2 == 0) {
                return true;
            } else {
                System.out.println("Error: El número debe ser par.");
                return false;
            }
        }
        return false;
    }
}