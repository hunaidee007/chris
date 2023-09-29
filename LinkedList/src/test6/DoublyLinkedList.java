package test6;

public class DoublyLinkedList {

    Node head;

    int size;

    public void addNode(int data) {
        Node pointer = head;
        Node newNode = new Node();
        newNode.data = data;

        if (head == null) {
            head = newNode;
        } else {
            while (pointer.next != null) {
                pointer = pointer.next;
            }

            pointer.next = newNode;
            newNode.prev = pointer;
        }
        size++;
    }

    public void display() {
        System.out.println("");
        Node pointer = head;
        while (pointer != null) {
            System.out.print(pointer.data + " ");
            pointer = pointer.next;
        }
    }

    public void addNodeAtHead(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;

            head = newNode;
        }
    }

    public void removeNodeFromPosition(int index) {
        System.out.println("");
        Node pointer = head;
        index--;
        while (index != 0) { //2 1
            pointer = pointer.next;
            index--;
        }

        System.out.println("Deleting Element : " + pointer.data);

        pointer.prev.next = pointer.next;
        pointer.next.prev = pointer.prev;

        pointer.prev = null;
        pointer.next = null;

    }


}
