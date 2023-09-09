package DoublyLinkedList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hi");

        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        doublyLinkedList.add(100);
        doublyLinkedList.add(200);
        doublyLinkedList.add(300);

        doublyLinkedList.add(400);
        doublyLinkedList.add(500);
        doublyLinkedList.add(600);
        doublyLinkedList.add(400);

        doublyLinkedList.display();
        System.out.println("---");


/*  doublyLinkedList.displayInReverse();

        doublyLinkedList.deleteAnElement(500);

        doublyLinkedList.display();*/
        doublyLinkedList.addNodeAtLocation(800,3);

        doublyLinkedList.display();
        System.out.println("---");



    }
}
