import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MainClass {

    public static void main(String[] args) {

        Jugador Ospina = new Jugador("Ospina", 1, Jugador.Posicion.DEFENSA);
        Jugador Cuadrado = new Jugador("Cuadrado", 18, Jugador.Posicion.VOLANTE);
        Jugador Zuniga = new Jugador("Zuniga", 12, Jugador.Posicion.DELANTERO);
        Jugador Perea = new Jugador("Perea", 7, Jugador.Posicion.DEFENSA);
        Jugador Yepes = new Jugador("Yepes", 2, Jugador.Posicion.DELANTERO);
        Jugador Armero = new Jugador("Armero", 11, Jugador.Posicion.ARQUERO);

        ArrayList<Jugador> arrJugadores = new ArrayList<Jugador>();
        arrJugadores.add(Ospina);
        arrJugadores.add(Cuadrado);
        arrJugadores.add(Zuniga);
        arrJugadores.add(Perea);
        arrJugadores.add(Yepes);
        arrJugadores.add(Armero);

        arrJugadores = Jugador.ordenarJugadores(arrJugadores);
        for (Jugador jg: arrJugadores  ) {
            System.out.println("Nombre: "+jg.getNombres()+", Numero = "+jg.getNumero());
        }

    }

}
