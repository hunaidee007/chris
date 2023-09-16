package stack.part2;


public class TestStack {
    public static void main(String[] args) {
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

        isBalanced("({)}");


    }


    public static boolean isBalanced(String expression) {
        Stack stack = new Stack();

        String curlyBrackets[] = {"{", "}"};
        String roundBrackets[] = {"(", ")"};
       // String squareBrackets[] = {"[", "]"};


        for (int count = 0; count < expression.length(); count++) {
            char charAtIndex = expression.charAt(count);
            stack.push(String.valueOf(charAtIndex));

        }
       //stack.peek();

        Node pointer = stack.head;
        while (pointer != null) {

            String bracket = pointer.data;
            // corresponding bracket
            // Find type of bracket

            String typeOfBracket = "";
            String openingOrClosing = "";

            if (curlyBrackets[0].equals(bracket)) {
                typeOfBracket = "curly";
                openingOrClosing = "opening";
            } else  if (curlyBrackets[1].equals(bracket)) {
                typeOfBracket = "curly";
                openingOrClosing = "closing";
            } else if (roundBrackets[0].equals(bracket)) {
                typeOfBracket = "round";
                openingOrClosing = "opening";
            } else  if (roundBrackets[1].equals(bracket)) {
                typeOfBracket = "round";
                openingOrClosing = "closing";
            }

            System.out.println(pointer.data + " - " + typeOfBracket + " - " + openingOrClosing);

            pointer = pointer.next;
        }

        return true;

    }
}
