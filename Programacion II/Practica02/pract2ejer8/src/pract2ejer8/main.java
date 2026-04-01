package pract2ejer8;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creamos la playlist con un espacio máximo de 100 Mb
        Playlist miPlaylist = new Playlist("Mis Favoritas", 100.0);
        
        // Rellenamos la matriz inicial según la tabla del ejercicio
        miPlaylist.agregarCancion("Memories", "David Guetta", 14.0);
        miPlaylist.agregarCancion("00:00", "Siddhartha", 20.0);
        miPlaylist.agregarCancion("Baile Inolvidable", "Bad Bunny", 19.0);
        miPlaylist.agregarCancion("Tatto", "Explosion Cumbiera", 13.0);
        
        System.out.println("--- ESTADO INICIAL ---");
        miPlaylist.mostrar();
        miPlaylist.mostrarEspacioDisponible();
        
        System.out.println("\n--- a) BORRAR CANCIÓN (Por nombre) ---");
        miPlaylist.borrar("00:00");
        miPlaylist.mostrar();
        
        System.out.println("\n--- a) BORRAR CANCIÓN (Por artista) ---");
        miPlaylist.borrar("Bad Bunny", true);
        miPlaylist.mostrar();
        
        System.out.println("\n--- a) BORRAR CANCIÓN (Por nombre y peso) ---");
        miPlaylist.borrar("Tatto", 13.0);
        miPlaylist.mostrar();
        
        System.out.println("\n--- b) SIMULANDO OPERADOR + (Añadir canción) ---");
        // Intenta añadir una que ya existe
        miPlaylist.agregarCancion("Memories", "David Guetta", 14.0); 
        // Añade una nueva comprobando que exista espacio
        miPlaylist.agregarCancion("Ojitos Lindos", "Bad Bunny", 15.0); 
        miPlaylist.mostrar();
        
        System.out.println("\n--- c) ESPACIO DISPONIBLE FINAL ---");
        miPlaylist.mostrarEspacioDisponible();
	}

}
