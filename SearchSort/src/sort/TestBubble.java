package sort;

import sort.stack.Stack;

public class TestBubble {

    public static void main(String[] args) {
        System.out.println("hi");

        Stack stack = new Stack();
        stack.add(900);
        stack.add(800);
        stack.add(700);
        stack.add(600);
        stack.add(500);
        stack.add(400);
        stack.add(300);


        int arr[] = new int[7];

        arr[0] = 900;
        arr[1] = 800;
        arr[2] = 700;
        arr[3] = 600;
        arr[4] = 500;
        arr[5] = 400;
        arr[6] = 300;

        int count=0;

        printArray(arr);
        System.out.println("");
        for (int j = 0; j <= arr.length - 2; j++) {
            for (int i = 0; i < arr.length-1; i++) {
                count++;
                int firstNumber = arr[i];
                int secondNumber = arr[i + 1];

                if (firstNumber > secondNumber) {
                    arr[i + 1] = firstNumber;
                    arr[i] = secondNumber;
                }
            }

            printArray(arr);
            System.out.println("");
        }

        System.out.println("Number of iterations : " + count);
        //O((n-1)sqaure)



    }

    public static void printArray(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
