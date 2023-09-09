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

        while (pointer.data != element) {
            pointer = pointer.next;
        }
        System.out.println("Found : " + pointer.data + " ");
        deleteElement(pointer);
        System.out.println("Deleted..");

    }

    public void deleteElement(Node elementToBeDeleted) {
        elementToBeDeleted.prev.next = elementToBeDeleted.next;
        if (elementToBeDeleted.next !=null) {
            elementToBeDeleted.next.prev = elementToBeDeleted.prev;
        } else {
            // if it is last element to be deleted
            elementToBeDeleted.prev =null;
        }

    }

    public void addNodeAtLocation(int data, int location) {
        Node pointer = head;
        int index = 1;

        // to get to the previous node based on location
        location --;

        // traverse till the previous location
        while (location != index) {
            pointer = pointer.next;
            index++; //index= index+1;
        }
        System.out.println("Found : " + pointer.data + " ");

        Node newNode = new Node(data);


        // Insert the new Node
       newNode.prev = pointer;
       newNode.next = pointer.next;

       pointer.next = newNode;
       newNode.next.prev=newNode;

    }


    public void removeDuplicate() {
        Node pointer = head;

        SinglyLinkedList.Node secondNode = null;
        //loop till last node
        while (pointer != null) {
            int count = 0;
            int elementToBeSearched = pointer.data;

            Node tempPointer = head;
            while (tempPointer != null) {
                if (tempPointer.data == elementToBeSearched) {
                    if (count == 1) {
                        // delete here
                        deleteElement(tempPointer);

                    }
                    count++;
                }
                tempPointer = tempPointer.next;
            }

            pointer = pointer.next;

            System.out.println("Data: " + elementToBeSearched + ", found count : " + count);

        }
    }


}
