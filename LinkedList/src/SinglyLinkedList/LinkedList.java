package SinglyLinkedList;

public class LinkedList {

    Node head;

    public void insertAtTheEnd(int var) {

        if (head == null) {
            head = new Node(var);
        } else {
            var last = head;
            while (last.next != null) {
                last = last.next;
            }

            Node nextNode = new Node(var);
            last.next = nextNode;
        }
    }

    public void display() {
        var pointer = head;
        while (pointer.next != null) {
            System.out.println(pointer.data + " ");
            pointer = pointer.next;
        }
        System.out.println(pointer.data + " ");
    }

    public void displayInReverse() {
        var last = head;
        var another = head;
        // Go to the last Node
        while (last.next != null) {
            last = last.next;
        }

        System.out.println(last.data + " ");
        // Repeat Loop till last is not equal to head
        do {
            // Traverse till another.next is not = last
            while (another.next != last) {
                another = another.next;
            }

            System.out.println(another.data + " ");
            last = another;
            another = head;
        } while (last != head);


    }
}
