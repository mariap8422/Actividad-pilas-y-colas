public class Stack {
    private Node top;

    public Stack() {
        this.top = null;
    }

    public void push(int value) {
        if (value < 1 || value > 5) {
            System.out.println("Solo se permiten valores entre 1 y 5.");
            return;
        }
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    
    public Integer pop() {
        if (top == null) {
            return null;
        }
        int value = top.data;
        top = top.next;
        return value;
    }

    // Print: muestra la pila desde ariiba hacia abajo
    public void printStack() {
        if (top == null) {
            System.out.println("Pila vacía");
            return;
        }
        System.out.print("Pila (tope -> fondo): ");
        Node current = top;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}