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

    }

    private static int getMaxDigits(int[] inputArray) {

        int max = inputArray[0];
        for (int index = 1; index <= inputArray.length - 1; index++) {
            if (max < inputArray[index]) {
                max = inputArray[index];
            }
        }
        return String.valueOf(max).length();
    }

    public static int getElementByIndex(int number, int index) {
        Double doubleNumber = (number /Math.pow(10, (index - 1))) % 10;
        return doubleNumber.intValue();
    }

    public static void print(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
