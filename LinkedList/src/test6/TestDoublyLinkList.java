package test6;

public class TestDoublyLinkList {
    public static void main(String[] args) {
        System.out.println("hi");

        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.addNode(10);
        doublyLinkedList.addNode(20);
        doublyLinkedList.addNode(30);
        doublyLinkedList.addNode(40);

        doublyLinkedList.display();

        doublyLinkedList.addNodeAtHead(50);
        doublyLinkedList.display();
        doublyLinkedList.addNodeAtHead(60);
        doublyLinkedList.display();

        System.out.println("");

        doublyLinkedList.removeNodeFromPosition(2);
        doublyLinkedList.display();

        doublyLinkedList.removeNodeFromPosition(3);
        doublyLinkedList.display();



    }
}
