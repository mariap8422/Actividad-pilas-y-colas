public class Queue {
    private Node front;
    private Node back;

    public Queue() {
        this.front = null;
        this.back = null;
    }

    // Enqueue: añade al final
    public void enqueue(int value) {
        if (value < 1 || value > 5) {
            System.out.println("Solo se permiten valores entre 1 y 5.");
            return;
        }
        Node newNode = new Node(value);
        if (back == null) {
            front = newNode;
            back = newNode;
        } else {
            back.next = newNode;
            back = newNode;
        }
    }

    // Dequeue: elimina y devuelve el frente
    public Integer dequeue() {
        if (front == null) {
            return null;
        }
        int value = front.data;
        front = front.next;
        if (front == null) {
            back = null;
        }
        return value;
    }

    // Print: muestra la cola desde el frente hasta el final
    public void printQueue() {
        if (front == null) {
            System.out.println("Cola vacía");
            return;
        }
        System.out.print("Cola (frente -> final): ");
        Node current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}