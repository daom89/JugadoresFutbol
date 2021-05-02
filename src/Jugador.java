import java.util.ArrayList;
import java.util.Collections;

public class Jugador {

    enum Posicion { DELANTERO, DEFENSA, VOLANTE, ARQUERO }
    private String Nombres;
    private int Numero;
    private Posicion posicion;

    public Jugador() {
    }

    public Jugador(String nombres, int numero, Posicion posicion) {
        Nombres = nombres;
        Numero = numero;
        this.posicion = posicion;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String nombres) {
        Nombres = nombres;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int numero) {
        Numero = numero;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "Nombres='" + Nombres + '\'' +
                ", Numero=" + Numero +
                ", posicion=" + posicion +
                '}';
    }

    static public ArrayList<Jugador> ordenarJugadores (ArrayList<Jugador> arrayDesordenado){
        ArrayList<Integer> numJugadores = new ArrayList<Integer>();
        for (Jugador tmpJugador: arrayDesordenado) { //Recorremos el array desordenado
            numJugadores.add(tmpJugador.getNumero()); //Sacamos el numero del jugador y lo agregamos al ArrayLis numJugadores
        }
        Collections.sort(numJugadores); //Ordenamos el numJugadores que tiene solamente los numeros de los jugadores
        ArrayList<Jugador> arrJugadoresOrdenados = new ArrayList<Jugador>(); // ArrayList para almacenar Jugadores Ordenados
        for (int numJugador: numJugadores) { //Recorrerer numJugadores que tiene los numeros ordenados
            for (Jugador tmpJugador: arrayDesordenado) { //Recorro el ArrayDesordenado para buscar el numero del jugador
                if(tmpJugador.getNumero() == numJugador){ //Si el numero del jugador ordenado coincide con el arraylistDesordenador
                    arrJugadoresOrdenados.add(tmpJugador); //Agrega el Objeto del Jugador al arrayordenado
                }
            }
        }
        return arrJugadoresOrdenados;
    }

}
