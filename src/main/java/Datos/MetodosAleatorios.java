package Datos;

public class MetodosAleatorios {

    /**
     * Genera un numero aleatorio entre 2 numeros Entre el minimo y el maximo
     *
     * @param minimo
     * @param maximo
     */
    public static int generarEnteroAleatorio(int minimo, int maximo) {

        int num = (int) Math.floor(Math.random() * (minimo - (maximo + 1)) + (maximo + 1));
        return num;

    }

    public static double generarDoubleAleatorio(int maximo, int minimo) {

        double num = Math.floor(Math.random() * (minimo - (maximo + 1)) + (maximo + 1));
        return num;

    }

}
