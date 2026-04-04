package pract3ejer1;

public class Juego {

    protected int numeroDeVidas;
    protected int record = 0;
    private int vidasIniciales;

    public Juego(int vidas) {
        this.numeroDeVidas = vidas;
        this.vidasIniciales = vidas;
    }

    public void reiniciaPartida() {
        this.numeroDeVidas = vidasIniciales;
    }

    public void actualizaRecord() {
        if (numeroDeVidas > record) {
            record = numeroDeVidas;
            System.out.println("¡¡NUEVO RÉCORD!! Vidas restantes: " + record);
        } else {
            System.out.println("Récord actual mantenido en: " + record + " vidas.");
        }
    }

    public boolean quitaVida() {
        this.numeroDeVidas--;
        return this.numeroDeVidas > 0;
    }
}