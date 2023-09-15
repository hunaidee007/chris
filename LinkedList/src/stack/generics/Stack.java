package stack.generics;


public class Stack<T> {

    Node<T> head;

    int size;

    public void add(T data) {


        Node tempNode = new Node();
        tempNode.data = data;
        if (head == null) {
            head = tempNode;
        } else {
            tempNode.next = head;
            head = tempNode;
        }

        size++;
    }

    public void display() {
        Node pointer = head;

        do {
            System.out.println(pointer.data);
            pointer = pointer.next;
        } while (pointer != null);

    }

}
