package test6;

public class TestDoublyLinkList {
    public static void main(String[] args) {
        System.out.println("hi");

        /*DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<Integer>();
        doublyLinkedList.addNode(10);
        doublyLinkedList.addNode(20);
        doublyLinkedList.addNode(30);
        doublyLinkedList.addNode(40);*/

        DoublyLinkedList<String> doublyLinkedList = new DoublyLinkedList<String>();
        doublyLinkedList.addNode("A");
        doublyLinkedList.addNode("B");
        doublyLinkedList.addNode("C");
        doublyLinkedList.addNode("D");
        doublyLinkedList.addNode("E");
        doublyLinkedList.display();

        doublyLinkedList.addNodeAtHead("Y");
        doublyLinkedList.display();
        doublyLinkedList.addNodeAtHead("Z");
        doublyLinkedList.display();

        System.out.println("");

        doublyLinkedList.removeNodeFromPosition(2);
        doublyLinkedList.display();

        doublyLinkedList.removeNodeFromPosition(3);
        doublyLinkedList.display();



    }
}
