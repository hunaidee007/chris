package stack.generics;


public class TestStack {
    public static void main(String[] args) {
        System.out.println("hi");


        Stack<Integer> stack = new Stack<Integer>();
        stack.add(234);
        stack.add(444);
        stack.add(222);
        stack.add(555);

        System.out.println("Did we find it? : " + searchStack(stack,111));

       // topToBottom(stack);

     /*   Stack<Double> doubleStack = new Stack<Double>();
        doubleStack.add(234.5);
        doubleStack.add(444.5);
        doubleStack.add(222.5);
        doubleStack.add(555.5);

        bottomToTop(doubleStack);*/

      /*  Stack<String> stringStack = new Stack<String>();
        stringStack.add("DDD");
        stringStack.add("CCC");
        stringStack.add("BBB");
        stringStack.add("AAA");

        topToBottom(stringStack);
        System.out.println("Flipping the stack");
        Stack flippedStack = flipStack(stringStack);

        topToBottom(flippedStack);*/


    }

    public static void topToBottom(Stack stack) {
        Node pointer = stack.head;

        do {
            System.out.println(pointer.data);
            pointer = pointer.next;
        } while (pointer != null);
    }

    public static void bottomToTop(Stack stack) {
        Node pointer = stack.head;


        for (int count = stack.size; count != 0; count--) {

            //Get me to the Node to be printed
            for (int loopCount = 1; loopCount <=count-1; loopCount++) {
                pointer = pointer.next;
            }
            System.out.println(pointer.data);
            pointer = stack.head;
        }
    }

    public static Stack flipStack(Stack stack) {
        Node pointer = stack.head;

        Stack newStack = new Stack();

        do {
            newStack.add(pointer.data);
            pointer = pointer.next;
        } while (pointer != null);
        stack = newStack;
        return  stack;
    }

    public static boolean searchStack(Stack<Integer> stack, int target) {
        Node<Integer> pointer = stack.head;

        // loop till the last element
        while(pointer !=null) {
            if(pointer.data.intValue() == target) {
                return true;
            }

            pointer = pointer.next;
        }
        return false;
    }


}
