package sort.quick;

public class TestQuickSort {
    public static void print(int arr[]) {
        System.out.println();
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //int arr[] = {34, 12, 4, 56, 78, 45, 23, 89, 9, 1, 67};
        int arr[] = {100, 200, 70, 10, 5, 90, 80, 60, 50, 40, 20};


        extracted(arr, 0, arr.length - 1);

        print(arr);
    }

    private static void extracted(int[] arr, int start, int end) {
        System.out.println("Start : "+start + ", End : "+ end);

        //Rule 1. Compare first and last
        if (arr[start] > arr[end]) {
            System.out.println("Swapping : " +arr[start] +" - " + arr[end]);
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

        }

        //Rule 2.
        int pivot = arr[start];

        System.out.println("pivot : " + pivot);

        int partitionPosition = sortAndPartition(arr, pivot, start, start + 1, end);


        if ((end - start) <= 1) {
            return;
        }
        print(arr);
        System.out.println("Starting Left side");
        extracted(arr, start, partitionPosition - 1);
        System.out.println("Ending Left side");
        print(arr);
        System.out.println("Starting Right side");

        extracted(arr, partitionPosition + 1, end);
        System.out.println("Ending Right side");
        print(arr);


    }

    private static int sortAndPartition(int[] arr, int pivot, int pivotPosition, int j, int k) {

        //Rule 6.
        if (j >= k) {
            if (arr[k] > pivot) {
                return 1;
            } else {
                int temp = arr[k];
                arr[k] = pivot;
                arr[pivotPosition] = temp;
                return k;
            }
        }

        //Find number larger than Pivot
        int leftIndex = j;
        int leftNumber = -1;
        for (int i = j; i <= k; i++) {
            if (arr[i] > pivot) {
                leftIndex = i;
                leftNumber = arr[i];
                break;
            }
        }

        int rightIndex = k;
        int rightNumber = -1;
        for (int l = k; l >= j; l--) {
            if (arr[l] < pivot) {
                rightIndex = l;
                rightNumber = arr[l];
                break;
            }
        }

        // Swap the 2 numbers
        if (leftNumber != -1 && rightNumber != -1) {
            arr[leftIndex] = rightNumber;
            arr[rightIndex] = leftNumber;
        }



        int pivotPositionSum = sortAndPartition(arr, pivot, pivotPosition, leftIndex + 1, rightIndex - 1);
        return pivotPositionSum;

    }
}
