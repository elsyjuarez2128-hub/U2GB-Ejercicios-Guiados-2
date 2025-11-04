import java.util.LinkedList;
import java.util.Queue;

/**
 * Ejemplo de lista que maneja una fila de objetos Joker.
 *@autor Elsy Joselyn Godinez Juarez
*/
public class FilaJoker implements IFila<Joker> {
    private Queue<Joker> fila;

    public FilaJoker() {
        fila = new LinkedList<>();
    }

    @Override
    public void encolar(Joker elemento) {
        fila.offer(elemento);
    }

    @Override
    public Joker desencolar() {
        if (estaVacia()) {
            throw new IllegalStateException("La fila está vacía.");
        }
        return fila.poll();
    }

    @Override
    public Joker frente() {
        if (estaVacia()) {
            throw new IllegalStateException("La fila está vacía.");
        }
        return fila.peek();
    }

    @Override
    public boolean estaVacia() {
        return fila.isEmpty();
    }

    @Override
    public int tamanio() {
        return fila.size();
    }

    @Override
    public String toString() {
        return "Fila de Jokers: " + fila.toString();
    }
}
