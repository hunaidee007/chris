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
        if (pointer.data <= parent.data) {
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
        System.out.println(pointer + " - " + pointer.data + " ");
        if (pointer.right != null) {
            // Go Right
            displayNode(pointer.right);
        }

    }

    public void traverseThroughTheTree(Node pointer) {
        // Print pointer
        System.out.println("Finding duplicate for " + pointer + " - " + +pointer.data);
        Node duplicateNode = findDuplicate(pointer, head);
        //System.out.println("duplicate found @ " + duplicateNode + " - " + duplicateNode.data);
        if (duplicateNode != pointer) {
            System.out.println("Duplicate Found @ " + duplicateNode + " - " + duplicateNode.data);

            Node parentFound = findParentOfDuplicate(duplicateNode, head);
            System.out.println("Parent Found @ " + parentFound + " - " + parentFound.data);
        }

        if (pointer.left != null) {
            // Go Left
            traverseThroughTheTree(pointer.left);
        }


        if (pointer.right != null) {
            // Go Right
            traverseThroughTheTree(pointer.right);
        }

    }

    private Node findParentOfDuplicate(Node duplicateNode, Node pointer) {
        if (pointer.left != duplicateNode && pointer.data <= duplicateNode.data) {
            // Go Left
            pointer = findDuplicate(duplicateNode, pointer.left);
        }
        // Print pointer
        if (pointer.data == duplicateNode.data && pointer == duplicateNode) {
            return pointer;
        }
        if (pointer.right != duplicateNode && pointer.data > duplicateNode.data) {
            // Go Right
            pointer = findDuplicate(duplicateNode, pointer.right);
        }

        return pointer;
    }

    public Node findDuplicate(Node duplicateOf, Node pointer) {
        if (duplicateOf.data < pointer.data && pointer.left != null) {
            // Go Left
            pointer = findDuplicate(duplicateOf, pointer.left);
        }
        // Print pointer
        if (pointer.data == duplicateOf.data && pointer != duplicateOf) {
            return pointer;
        }
        if (duplicateOf.data > pointer.data && pointer.right != null) {
            // Go Right
            pointer = findDuplicate(duplicateOf, pointer.right);
        }

        return pointer;
    }


    public void removeDuplicates() {

        traverseThroughTheTree(head);
        System.out.println("Done");

    }
}
