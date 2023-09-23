package queue.customqueue;

//FIFO
public class Queue {

    Node head;

    int size;

    public void add(int element) {
        Node node = new Node(element);
        Node pointer = head;
        if (pointer == null) {

            head = node;
        } else {
            head = node;
            node.next = pointer;

        }

        size++;
    }

    public void remove() {
        Node pointer = head;
        if (size == 1) {
            head = null;
        } else {
            while (pointer.next.next != null) {
                pointer = pointer.next;
            }
            pointer.next = null;
        }


    }

    public void display() {
        Node pointer = head;
        while (pointer != null) {
            System.out.print(pointer.data + " ");
            pointer = pointer.next;

        }
    }
}
