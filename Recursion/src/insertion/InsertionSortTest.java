package insertion;

public class InsertionSortTest {
    public static void main(String[] args) {
        System.out.println("hi");

        int arr[] = {45, 5, 2, 10, 1, 4, -4, -6, 42};
        display(arr);

        // Main Loop
        for (int i = 0; i < arr.length; i++) {
            int valueToBeCompared = arr[i];
            if (i != 0) {
                int index = i - 1;
                do {
                    if (valueToBeCompared < arr[index]) {
                        int temp = arr[index];
                        arr[index] = valueToBeCompared;
                        arr[index + 1] = temp;
                    }
                    index--;
                }
                while (index >= 0);

            }

        }
        display(arr);


    }

    public static void display(int arr[]) {
        System.out.println("");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
