package sort;

import sort.stack.Stack;

public class BubbleSortWithStack {
    public static void bubbleSort(int[] arr) {
        Stack stack = new Stack();
        int n = arr.length;
        boolean swapped;

        do {
            swapped = false;

            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    // Swap arr[i] and arr[i + 1]
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
                stack.push(arr[i]);
            }
            stack.push(arr[n - 1]);

            // Pop elements back to the array
            for (int i = n - 1; i >= 0; i--) {
                arr[i] = stack.pop();
            }
        } while (swapped);
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(arr);

        System.out.println("Sorted array:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
