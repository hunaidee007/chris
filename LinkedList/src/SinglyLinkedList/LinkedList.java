package SinglyLinkedList;

public class LinkedList {

    Node head;

    int size;

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

        size++;
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

    public void deleteThisNode(Node nodeToBeDeleted) {

        Node previousNode = head;
        while (previousNode.next != nodeToBeDeleted) {
            previousNode = previousNode.next;
        }

        previousNode.next = nodeToBeDeleted.next;
        nodeToBeDeleted.next = null;
        nodeToBeDeleted = null;


    }


    public void removeDuplicate() {
        Node pointer = head;

        Node secondNode = null;
        //loop till last node
        while (pointer != null) {
            int count = 0;
            int elementToBeSearched = pointer.data;

            Node tempPointer = head;
            while (tempPointer != null) {
                if (tempPointer.data == elementToBeSearched) {
                    if (count == 1) {
                        // delete here
                        deleteThisNode(tempPointer);

                    }
                    count++;
                }
                tempPointer = tempPointer.next;
            }

            pointer = pointer.next;

            System.out.println("Data: " + elementToBeSearched + ", found count : " + count);

        }


    }

    public boolean isPalyndrome() {

        Node leftPointer = head;

        Node rightPointer = head;


        for (int count = 0; count < size / 2; count++) {

            for (int rightCounter = 1 ; rightCounter != (size-count) ; rightCounter ++ ) {
                rightPointer = rightPointer.next;
            }
            System.out.println(leftPointer.data + " - " + rightPointer.data);
            if(leftPointer.data != rightPointer.data) {
                return false;
            }
            leftPointer = leftPointer.next;
            rightPointer = head;
        }


        return true;
    }
}
