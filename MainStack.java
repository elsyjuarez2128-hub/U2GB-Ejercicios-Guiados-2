/**
 * @autor Elsy Joselyn Godinez Juarez
 */
public class MainStack {
    public static void main(String[] args) {
        IStack<Integer> pila = new StackArray<>(5);

        System.out.println("Insertando elementos en la pila:");
        pila.push(10);
        pila.push(20);
        pila.push(30);
        System.out.println("Tamaño actual: " + pila.size());

        System.out.println("\nElemento en la cima (peek): " + pila.peek());

        System.out.println("\nEliminando elementos:");
        System.out.println("Pop: " + pila.pop());
        System.out.println("Pop: " + pila.pop());

        System.out.println("\nElemento en la cima ahora: " + pila.peek());
        System.out.println("Tamaño final: " + pila.size());
    }
}
