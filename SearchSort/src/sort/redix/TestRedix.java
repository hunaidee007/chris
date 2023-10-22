package sort.redix;

public class TestRedix {

    public static void main(String[] args) {
        System.out.println("hi");

        int[] inputArray = {240, 72, 214, 253, 33, 73, 7, 14, 34, 2066, 481, 829};

        int maxDigits = 4;
        int itterations = 1;
        while (itterations<=4){
            Stack stacks[] = new Stack[10];

            for (int index = inputArray.length - 1; index >= 0; index--) {
                int lastDigit = getLastDigit(inputArray[index]);
                if (stacks[lastDigit] == null) {
                    stacks[lastDigit] = new Stack();
                }
                stacks[lastDigit].push(inputArray[index]);

            }

            // TODO pop elements


            itterations++;
        }


        System.out.println("hi");
      /*  System.out.println(getLastDigit(42)); // 2
        System.out.println(getLastDigit(789)); // 9
        System.out.println(getLastDigit(5)); // 5
*/

      /*  System.out.println(getSecondLastDigit(42)); // 4
        System.out.println(getSecondLastDigit(789)); // 8
        System.out.println(getSecondLastDigit(5)); // 0
        System.out.println(getSecondLastDigit(1234)); // 6*/

      /*  System.out.println(getThirdLastDigit(42)); // 0
        System.out.println(getThirdLastDigit(789)); // 7
        System.out.println(getThirdLastDigit(5)); // 0
        System.out.println(getThirdLastDigit(1234)); // 2*/

        System.out.println(getFourthLastDigit(42)); // 0
        System.out.println(getFourthLastDigit(789)); // 0
        System.out.println(getFourthLastDigit(5)); // 0
        System.out.println(getFourthLastDigit(1234)); // 1
    }

    public static int getLastDigit(int number) {
        return number % 10;
    }


    public static int getSecondLastDigit(int number) {
        if (number < 99) { // 2 digit
            return number / 10;
        } else { // 4 digit
            return (number / 10) % 10;
        }

    }

    public static int getThirdLastDigit(int number) {
        if (number < 99) { // 2 digit
            return number / 100;
        } else { // 4 digit
            return (number / 100) % 10;
        }
    }

    public static int getFourthLastDigit(int number) {
        if (number < 99) { // 2 digit
            return number / 1000;
        } else { // 4 digit
            return (number / 1000) % 10;
        }
    }
}
