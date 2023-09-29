package sort.stack;


public class Stack {

    Node head;


    public int size;

    public int top(){
        return head.data;
    }

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

    public int pop() {
        int data;
        Node pointer = head;

        data = pointer.data;

        head = pointer.next;

        return data;
    }

    public void display() {
        Node pointer = head;

        do {
            System.out.print(pointer.data+" ");
            pointer = pointer.next;
        } while (pointer != null);

        System.out.println("");

    }
}