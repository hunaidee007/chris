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
            System.out.print(pointer.data + " ");
            pointer = pointer.next;
        }
        System.out.print(pointer.data + " ");
    }

    public void displayInReverse() {
        var last = head;
        var another = head;
        //Travser till last
        while (last.next != null) {
            last = last.next;
        }
        System.out.print(last.data + " ");
        another = last;

        // Assign Another to Previous till Another is at Head
        do {
            another = another.prev;
            System.out.print(another.data + " ");
        } while (another.prev != null);
    }

    public void deleteAnElement(int element) {
        var pointer = head;

        while(pointer.data != element) {
            pointer = pointer.next;
        }
        System.out.println("Found : " + pointer.data + " ");
        pointer.prev.next = pointer.next;
        pointer.next.prev = pointer.prev;
        System.out.println("Deleted..");

    }


}
