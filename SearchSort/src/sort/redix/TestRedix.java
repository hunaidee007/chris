package sort.redix;

public class TestRedix {

    public static void main(String[] args) throws Exception {
        System.out.println("hi");

        //int[] inputArray = {240, 72, 214, 253, 33, 73, 7, 14, 34, 2066, 481, 829};
        int[] inputArray = {240, 72, 21454, 253, 33000, 73, 7, 14, 34, 2066, 481, 829};

        print(inputArray);



        int maxDigits = getMaxDigits(inputArray);
        int itterations = 1;
        while (itterations <= maxDigits) {
            Stack stacks[] = new Stack[10];

            for (int index = inputArray.length - 1; index >= 0; index--) {
                int lastDigit = getElementByIndex(inputArray[index], itterations);
                if (stacks[lastDigit] == null) {
                    stacks[lastDigit] = new Stack();
                }
                stacks[lastDigit].push(inputArray[index]);

            }

            // TODO pop elements
            int indexOfArray = 0;
            for (int index = 0; index <= stacks.length - 1; index++) {
                while (stacks[index] != null && !stacks[index].isEmpty()) {
                    int element = stacks[index].pop();
                    inputArray[indexOfArray] = element;
                    indexOfArray++;
                }
            }
            itterations++;
        }
        System.out.println("-- Sorted Array --");
        print(inputArray);
        //System.out.println("hi");
    }

    private static int getMaxDigits(int[] inputArray) {

        int max = inputArray[0];
        for (int index = 1; index <= inputArray.length - 1; index++) {
            if(max<inputArray[index]) {
                max = inputArray[index];
            }
        }
        return String.valueOf(max).length();
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

    public static int getElementByIndex(int number, int index) {
        if (index == 1) {
            return getLastDigit(number);
        } else if (index == 2) {
            return getSecondLastDigit(number);
        } else if (index == 3) {
            return getThirdLastDigit(number);
        } else if (index == 4) {
            return getFourthLastDigit(number);
        }
        return 0;
    }

    public static void print(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
