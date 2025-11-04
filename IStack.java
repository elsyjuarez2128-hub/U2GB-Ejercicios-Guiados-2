/**
 * Interfaz que define las operaciones básicas de una pila.
 * @param Elsy Joselyn Godinez Juarez
 */
public interface IStack<T> {
    void push(T element);   // Agrega un elemento a la pila
    T pop();                // Elimina y devuelve el elemento en la cima
    T peek();               // Devuelve el elemento en la cima sin eliminarlo
    boolean isEmpty();      // Verifica si la pila está vacía
    int size();             // Devuelve el número de elementos en la pila
}
