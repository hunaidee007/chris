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

       //System.out.println("isBalanced:" + isBalanced("{}"));
        System.out.println(isBalanced("(())"));// # True
        System.out.println(isBalanced("{{[]}}"));// # True
        System.out.println(isBalanced("()[]{}"));// # True
        System.out.println(isBalanced("({[})"));// # False


    }


    public static boolean isBalanced(String expression) {

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
