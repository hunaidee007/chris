//FIFO
public class Queue {

    Node head;

    int size;

    public void add(String element) {
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
        System.out.println("");
    }

    public String getElementByPosition(int index) {
        Node pointer = head;
        if (index == 0) {
            return head.data;
        }
        //System.out.println(index);
        int count = 0;


        while (count != index) {
           /* if (pointer.next == null) {
                return pointer.data;
            }*/
            pointer = pointer.next;
            count++;


        }

        // System.out.println("Found data:" + pointer.data);

        return pointer.data;

    }

    public static boolean isPalindrome(Queue queue) {
        int size = queue.size;
        boolean isSame = true;

        for (int i = 0; i < size / 2; i++) {
            //System.out.println("Comapring : " + queue.getElementByPosition(i) + " - " + queue.getElementByPosition((size - 1) - i));
            if (queue.getElementByPosition(i)
                    .equals(queue.getElementByPosition((size - 1) - i))) {
               // System.out.println("same");
            } else {
                return false;
            }

        }

        return isSame;
    }
}