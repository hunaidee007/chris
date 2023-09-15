package stack;

public class Stack {

    Node head;

    int size;

    public void add(int data) {


        Node tempNode = new Node();
        tempNode.data = data;
        if (head == null) {
            head = tempNode;
        } else {
            tempNode.next = head;
            head = tempNode;
        }
    }

    public void display() {
        Node pointer = head;

        do {
            System.out.println(pointer.data);
            pointer = pointer.next;
        } while (pointer != null);

    }

}
