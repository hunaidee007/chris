package bst;

public class TestBST {

    public static void main(String[] args) {

        System.out.println("hi");

        BinarySearchTree binarySearchTree = new BinarySearchTree();

        binarySearchTree.add(50);
        binarySearchTree.add(20);
        binarySearchTree.add(10);
        binarySearchTree.add(100);
        binarySearchTree.add(60);
        binarySearchTree.add(40);
        binarySearchTree.add(30);
        binarySearchTree.add(20);
        binarySearchTree.add(60);
        binarySearchTree.add(55);
        binarySearchTree.add(17);
        binarySearchTree.add(18);
        binarySearchTree.add(52);
        binarySearchTree.add(57);
        binarySearchTree.add(70);
        binarySearchTree.add(20);
        binarySearchTree.add(60);
        binarySearchTree.add(59);
        binarySearchTree.add(19);
        binarySearchTree.add(60);











        System.out.println("Done");

        binarySearchTree.display();
        System.out.println();

        // In Progress (Still not working as expected)
        binarySearchTree.removeDuplicates();

        System.out.println();

        binarySearchTree.display();
        System.out.println();



    }
}
