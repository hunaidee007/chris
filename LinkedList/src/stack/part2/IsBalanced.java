package stack.part2;
 class Node {
    String data;
    Node next;
}
class Stack {

    Node head;

    int size;

    public void push(String data) {


        Node tempNode = new Node();
        tempNode.data = data;
        if (head == null) {
            head = tempNode;
        } else {
            tempNode.next = head;
            head = tempNode;
        }

        size++;
    }

    public void peek() {
        Node pointer = head;
        if (size > 0) {
            do {
                System.out.println(pointer.data);
                pointer = pointer.next;
            } while (pointer != null);
        }


    }

    public boolean isEmpty() {
        return size > 0 ? false : true;
    }

    public String pop() throws Exception {

        if(isEmpty()) {
            throw new Exception("Stack is empty");
        }
        String dataToBePoped = head.data;
        Node pointer = head;

        head = pointer.next;
        pointer.next = null;
        pointer = null;

        return dataToBePoped;

    }
}

public class IsBalanced {
    public static void main(String[] args) throws Exception {
        System.out.println("hi");

       /* Stack stack = new Stack();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");

        stack.peek();

        System.out.println(stack.isEmpty());

        stack.pop();
        stack.pop();

        stack.peek();*/

       //System.out.println("isBalanced:" + isBalanced("{}"));
        System.out.println(isBalanced("(())"));// # True
        System.out.println(isBalanced("{{[]}}"));// # True
        System.out.println(isBalanced("()[]{}"));// # True
        System.out.println(isBalanced("({[})"));// # False


    }


    public static boolean isBalanced(String expression) throws Exception {

        Stack stack = new Stack();


        // { ( [] ) }
        char[] chars = expression.toCharArray();

        for (int count = 0; count < chars.length; count++) {

            String charToBeCompared = String.valueOf(chars[count]);
            // If it is an open bracket add it to top of stack
            if (charToBeCompared.equals("{")
                    || charToBeCompared.equals("[")
                    || charToBeCompared.equals("(")) {

                stack.push(charToBeCompared);
            // if it is a closing bracket compare it with top of stack
            } else if (charToBeCompared.equals("}")
                    || charToBeCompared.equals("]")
                    || charToBeCompared.equals(")")) {

                String topElement = stack.pop();
                if (topElement.equals("[") && charToBeCompared.equals("]")
                        || topElement.equals("{") && charToBeCompared.equals("}")
                        || topElement.equals("(") && charToBeCompared.equals(")")) {
                    // do nothing
                } else {
                    return false;
                }
            }
        }


        return true;
    }


}
