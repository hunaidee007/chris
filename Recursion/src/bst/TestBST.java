package bst;

public class TestBST {

    public static void main(String[] args) {

        System.out.println("hi");

        BinarySearchTree binarySearchTree = new BinarySearchTree();

        binarySearchTree.add(40);
        binarySearchTree.add(20);
        binarySearchTree.add(50);
        binarySearchTree.add(10);
        binarySearchTree.add(-40);
        binarySearchTree.add(5);
        binarySearchTree.add(55);
        binarySearchTree.add(15);
        binarySearchTree.add(-15);



        System.out.println("Done");

        binarySearchTree.display();




    }
}
