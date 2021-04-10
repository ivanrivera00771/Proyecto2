
package Datos;


public class Jugador {
    private String nombre;
    private String nickname;
    private int oro;
    private int cantVida;

    
    public Jugador(){
        
        /*
        Genera la cantidad de vida y oro aleatoriamente
        */
     cantVida = MetodosAleatorios.generarEnteroAleatorio(80, 100);
     oro = MetodosAleatorios.generarEnteroAleatorio(80,100);
    
    
}
    public Jugador(String nombre, String nickname, int oro, int cantVida) {
        this.nombre = nombre;
        this.nickname = nickname;
        this.oro = oro;
        this.cantVida = cantVida;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getOro() {
        return oro;
    }

    public void setOro(int oro) {
        this.oro = oro;
    }

    public int getCantVida() {
        return cantVida;
    }

    public void setCantVida(int cantVida) {
        this.cantVida = cantVida;
    }
    
    
    
    
    
    
}
