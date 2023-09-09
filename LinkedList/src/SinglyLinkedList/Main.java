package SinglyLinkedList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

        LinkedList linkedList = new LinkedList();
        linkedList.insertAtTheEnd(10);
        linkedList.insertAtTheEnd(20);
        linkedList.insertAtTheEnd(30);
        linkedList.insertAtTheEnd(40);
        linkedList.insertAtTheEnd(50);
        linkedList.insertAtTheEnd(60);

        //linkedList.display();
        linkedList.displayInReverse();
        System.out.println("Done!");
    }

}