package sort.merge;

public class TestMergeSort {
    public static void main(String[] args) {
        System.out.println("hi");

        int arr[] = {10, 6, 8, 5, 7, 3, 4};
        split(arr);
        print(arr);


    }

    public static void print(int arr[]){
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void split(int arr[]) {


        if (arr.length <= 1) {
            return;
        }


        int arrMidCount = arr.length / 2;

        int leftArray[] = new int[arrMidCount];
        int rightArray[] = new int[arr.length - arrMidCount];

        for (int count = 0; count < arr.length; count++) {

            if (count < arrMidCount) {
                leftArray[count] = arr[count];
            } else {
                rightArray[count - (int) Math.ceil(arrMidCount)] = arr[count];
            }
        }


        split(leftArray);
        split(rightArray);

        System.out.println("----------");
        System.out.print("Main :");
        print(arr);
        System.out.print("Left:");
        print(leftArray);
        System.out.print("Right:");
        print(rightArray);

        System.out.println("----------");
        merge(arr, leftArray, rightArray);
    }

    private static void merge(int[] arr, int[] leftArray, int[] rightArray) {
        int indexOfMainArray = 0;
        int indexOfLeft = 0;
        int indexOfRight = 0;
        while (indexOfLeft < leftArray.length && indexOfRight < rightArray.length) {
            if (leftArray[indexOfLeft] <= rightArray[indexOfRight]) {
                arr[indexOfMainArray] = leftArray[indexOfLeft];
                indexOfLeft++;
                indexOfMainArray++;
            } else {
                arr[indexOfMainArray] = rightArray[indexOfRight];
                indexOfRight++;
                indexOfMainArray++;
            }
        }

        while (indexOfLeft < leftArray.length) {
            arr[indexOfMainArray] = leftArray[indexOfLeft];
            indexOfLeft++;
            indexOfMainArray++;
        }

        while (indexOfRight < rightArray.length) {
            arr[indexOfMainArray] = rightArray[indexOfRight];
            indexOfRight++;
            indexOfMainArray++;
        }


    }
}
