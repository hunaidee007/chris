package bst;

public class BinarySearchTree {

    Node head;

    public void add(int data) {

        Node pointer = new Node(data);

        if (head == null) {
            head = pointer;
        } else {
            insertData(pointer, head);
        }
    }

    public void insertData(Node pointer, Node parent) {
        if (pointer.data < parent.data) {
            if (parent.left == null) {
                // insert the node
                parent.left = pointer;
            } else {
                insertData(pointer, parent.left);
            }
        } else if (pointer.data > parent.data) {
            if (parent.right == null) {
                // insert the node
                parent.right = pointer;
            } else {
                insertData(pointer, parent.right);
            }
        }
    }

    public void display() {
        if (head == null) {
            // dont print anything
        } else {
            Node pointer = head;
            displayNode(pointer);
        }


    }

    public void displayNode(Node pointer) {
        if (pointer.left != null) {
            // Go Left
            displayNode(pointer.left);
        }
        // Print pointer
        System.out.print(pointer.data + " ");
        if (pointer.right != null) {
            // Go Right
            displayNode(pointer.right);
        }

    }
}
