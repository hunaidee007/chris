package DoublyLinkedList;

public class DoublyLinkedList {

    Node head;


    public void add(int var) {

        if (head == null) {
            head = new Node(var);
        } else {
            var last = head;
            while (last.next != null) {
                last = last.next;
            }

            Node nextNode = new Node(var);
            last.next = nextNode;
            nextNode.prev = last;
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
        //Travser till last
        while (last.next != null) {
            last = last.next;
        }
        System.out.println(last.data + " ");
        another = last;

        // Assign Another to Previous till Another is at Head
        do {
            another = another.prev;
            System.out.println(another.data + " ");
        } while (another.prev != null);
    }


}
