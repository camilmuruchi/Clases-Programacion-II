package pract2ejer8;

public class Playlist {
	private String nombre;
    private int nroCanciones;
    private double espacio; // Capacidad total en Mb
    private String[][] canciones; // Matriz: [nombre, artista, peso]
    
    public Playlist(String nombre, double espacio) {
        this.nombre = nombre;
        this.espacio = espacio;
        this.nroCanciones = 0;
        this.canciones = new String[10][3]; // Límite de 10 canciones en la matriz
    }
    
    // Método de apoyo para mostrar los datos de la playlist
    public void mostrar() {
        System.out.println("Playlist: " + nombre + " | Canciones actuales: " + nroCanciones);
        for (int i = 0; i < nroCanciones; i++) {
            System.out.println("- " + canciones[i][0] + " | Artista: " + canciones[i][1] + " | Peso: " + canciones[i][2] + " Mb");
        }
    }
    
    // a) Sobrecargar un método para borrar una canción (Por nombre)
    public void borrar(String nombreCancion) {
        for (int i = 0; i < nroCanciones; i++) {
            if (canciones[i][0].equalsIgnoreCase(nombreCancion)) {
                eliminarDeMatriz(i);
                break;
            }
        }
    }
    
    // a) Sobrecargar un método para borrar una canción (Por artista - usa boolean para diferenciar firma)
    public void borrar(String artista, boolean porArtista) {
        if (porArtista) {
            for (int i = 0; i < nroCanciones; i++) {
                if (canciones[i][1].equalsIgnoreCase(artista)) {
                    eliminarDeMatriz(i);
                    i--; // Ajustamos el índice porque los elementos recorren su posición
                }
            }
        }
    }
    
    // a) Sobrecargar un método para borrar una canción (Por nombre y peso)
    public void borrar(String nombreCancion, double peso) {
        for (int i = 0; i < nroCanciones; i++) {
            if (canciones[i][0].equalsIgnoreCase(nombreCancion) && Double.parseDouble(canciones[i][2]) == peso) {
                eliminarDeMatriz(i);
                break;
            }
        }
    }
    
    // Método auxiliar para reordenar la matriz al borrar un elemento
    private void eliminarDeMatriz(int indice) {
        for (int i = indice; i < nroCanciones - 1; i++) {
            canciones[i][0] = canciones[i+1][0];
            canciones[i][1] = canciones[i+1][1];
            canciones[i][2] = canciones[i+1][2];
        }
        nroCanciones--;
    }
    
    // b) Sobrecargar el operador "+" (Simulado con método) para añadir si no existe y si hay espacio
    public void agregarCancion(String nombreCancion, String artista, double peso) {
        for (int i = 0; i < nroCanciones; i++) {
            if (canciones[i][0].equalsIgnoreCase(nombreCancion)) {
                System.out.println("-> [Rechazada] La canción '" + nombreCancion + "' ya existe en la playlist.");
                return;
            }
        }
        
        double espacioOcupado = 0;
        for (int i = 0; i < nroCanciones; i++) {
            espacioOcupado += Double.parseDouble(canciones[i][2]);
        }
        
        if (espacioOcupado + peso <= espacio && nroCanciones < canciones.length) {
            canciones[nroCanciones][0] = nombreCancion;
            canciones[nroCanciones][1] = artista;
            canciones[nroCanciones][2] = String.valueOf(peso);
            nroCanciones++;
            System.out.println("-> [Éxito] Canción añadida: " + nombreCancion);
        } else {
            System.out.println("-> [Rechazada] No hay espacio suficiente para: " + nombreCancion);
        }
    }
    
    // c) Mostrar la capacidad de espacio disponible
    public void mostrarEspacioDisponible() {
        double espacioOcupado = 0;
        for (int i = 0; i < nroCanciones; i++) {
            espacioOcupado += Double.parseDouble(canciones[i][2]);
        }
        double disponible = espacio - espacioOcupado;
        System.out.println("Espacio total: " + espacio + " Mb | Espacio disponible: " + disponible + " Mb");
    }
}
