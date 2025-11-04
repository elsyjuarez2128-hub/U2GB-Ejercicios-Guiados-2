/**
 * Implementación de la pila usando un arreglo genérico.
 * @autor Elsy Joselyn Godinez Juarez
 */
public class StackArray<T> implements IStack<T> {
    private T[] elements;
    private int top;
    private int capacity;

    @SuppressWarnings("unchecked")
    public StackArray(int capacity) {
        this.capacity = capacity;
        this.elements = (T[]) new Object[capacity];
        this.top = -1;
    }

    @Override
    public void push(T element) {
        if (top == capacity - 1) {
            throw new IllegalStateException("La pila está llena");
        }
        elements[++top] = element;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return elements[top--];
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return elements[top];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public int size() {
        return top + 1;
    }
}
