package assignment2;

import java.util.Scanner;

class Node<T> {
    T data;
    Node next;

    public Node(T data) {
        this.data = data;
    }
}

class Stack<T> {
    Node<T> top;

    int size;

    public void push(T element) {

        Node newNode = new Node(element);
        size++;
        if (top == null) {
            top = newNode;
        } else {
            Node tempTop = top;
            top = newNode;
            newNode.next = tempTop;
        }
    }

    public T peek() {
        return top.data;
    }

    public void pop() {
        if (top != null) {
            top = top.next;
        }

    }

    public void display() {

        Node pointer = top;
        while (pointer != null) {
            System.out.print(pointer.data + " ");
            pointer = pointer.next;
        }
    }

    public void displayInReverse() {
        Node pointer = top;

        for (int counter = size; counter >= 1; counter--) {
            int loop = 0;
            while (loop != counter - 1) {
                pointer = pointer.next;
                loop++;
            }

            System.out.print(pointer.data + " ");
            pointer = top;
        }

    }
}

public class testStack {

    public static void main(String[] args) {
        System.out.println("hi");

      /*  Stack<String> stack = new Stack<>();
        stack.push("a");
        stack.push("b");
        stack.push("c");

        stack.display();
        System.out.println(stack.size);
        stack.displayInReverse();*/
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter All Elements : ");

        String elements = myObj.nextLine();  // Read user input
        String[] elementArray = elements.split(" ");

        Stack<Integer> integerStack = new Stack<>();
        for (String element : elementArray) {
            integerStack.push(Integer.parseInt(element));
        }

        //integerStack.display();
        topToBottom(integerStack);
        System.out.println("");
        bottomToTop(integerStack);
        System.out.println("");

        myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter elements to be reversed: ");

        elements = myObj.nextLine();  // Read user input
        elementArray = elements.split(" ");

        Stack<String> stringStack = new Stack<>();
        for (String element : elementArray) {
            stringStack.push(element);
        }
        Stack<String> reverseStack = flipStack(stringStack);
        topToBottom(reverseStack);


    }

    public static void topToBottom(Stack stack) {
        Node pointer = stack.top;
        while (pointer != null) {
            System.out.print(pointer.data + " ");
            pointer = pointer.next;
        }
    }

    public static void bottomToTop(Stack stack) {
        Node pointer = stack.top;

        for (int counter = stack.size; counter >= 1; counter--) {
            int loop = 0;
            while (loop != counter - 1) {
                pointer = pointer.next;
                loop++;
            }

            System.out.print(pointer.data + " ");
            pointer = stack.top;
        }
    }

    public static Stack flipStack(Stack stackToBeReversed){

            Stack reverStack = new Stack();
            for(int counter = stackToBeReversed.size; counter >=1; counter--) {

                reverStack.push(stackToBeReversed.peek());
                stackToBeReversed.pop();
            }

            return  reverStack;
    }
}
