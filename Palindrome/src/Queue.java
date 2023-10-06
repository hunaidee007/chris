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
        System.out.println(index);

        index--;
        while (index != 0) {
            //if (pointer.next != null) {
                pointer = pointer.next;
                index--;
           // }

        }

        System.out.println("Found data:" + pointer.data);

        return pointer.data;

    }

    public static void isPalindrome(Queue queue) {
        int size = queue.size;

        for (int i = 0; i < size / 2; i++) {
            System.out.println("Comapring : " +
                    queue.getElementByPosition(i)
                    + " - " + queue.getElementByPosition(size - i));
            if (queue.getElementByPosition(i)
                    .equals(queue.getElementByPosition(size - i))) {
                System.out.println("same");
            } else {
                System.out.println("not same");
            }

        }
    }
}