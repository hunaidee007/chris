package sort.redix;

public class Stack {

    Node head;

    int size;

    public void push(int data) {


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

    public void peek() {
        Node pointer = head;
        if (size > 0) {
            do {
                System.out.println(pointer.data);
                pointer = pointer.next;
            } while (pointer != null);
        }


    }

    public boolean isEmpty() {
        return size > 0 ? false : true;
    }

    public int pop() throws Exception {

        if(isEmpty()) {
            throw new Exception("Stack is empty");
        }
        int dataToBePoped = head.data;
        Node pointer = head;

        head = pointer.next;
        pointer.next = null;
        pointer = null;

        size--;

        return dataToBePoped;

    }
}
