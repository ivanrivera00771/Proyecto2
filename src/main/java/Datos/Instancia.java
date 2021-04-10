
package Datos;

public class Instancia {

    private static Jugador jugador = null;

    public static Jugador getJugador() {
        if (jugador == null) {
            jugador = new Jugador();
        }
        return jugador;
    }
}
