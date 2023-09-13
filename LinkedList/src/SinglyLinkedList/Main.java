package SinglyLinkedList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

        LinkedList linkedList = new LinkedList();
        linkedList.insertAtTheEnd(111);
        linkedList.insertAtTheEnd(222);
        linkedList.insertAtTheEnd(333);
        linkedList.insertAtTheEnd(4444);

        linkedList.insertAtTheEnd(4444);
        linkedList.insertAtTheEnd(333);
        linkedList.insertAtTheEnd(222);
        linkedList.insertAtTheEnd(111);



        linkedList.display();
        System.out.println(linkedList.size);

        System.out.println("---");
        System.out.println("isPalydrome : " + linkedList.isPalyndrome());
        //linkedList.displayInReverse();
      //  System.out.println("Done!");

      //  linkedList.removeDuplicate();

//System.out.println("Display!");

//linkedList.display();
    }

}