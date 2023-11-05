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
        int arr[] = {3, 9, 6, 2, 5, 8, 1, 7, 4};
        //int arr[] = {100, 200, 70, 10, 5, 90, 80, 60, 50, 40, 20};


        extracted(arr, 0, arr.length - 1);

        print(arr);
    }

    private static void extracted(int[] arr, int start, int end) {
        System.out.println("Start : " + start + ", End : " + end);

        //Rule 1. Compare first and last
        if (arr[start] > arr[end]) {
            System.out.println("Swapping : " + arr[start] + " - " + arr[end]);
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

        }

        //Rule 2.
        int pivot = arr[start];

        System.out.println("pivot : " + pivot);

        int lowPointer = start + 1;
        int highPointer = end;


        while (lowPointer <= highPointer) {
            // Step 4: Scan list from left to right for x(j) >= left value. //low pointer
            while (lowPointer <= end && arr[lowPointer] < pivot) {
                lowPointer++;
            }
            // Step 5: Scan list from right to left for x(k) <= left value. //high pointer
            while (highPointer >= start && arr[highPointer] > pivot) {
                highPointer--;
            }
            if (lowPointer < highPointer) {
                // Step 6: If (j < k) Then Swap (x(j), x(k)) and continue scanning
                int temp = arr[lowPointer];
                arr[lowPointer] = arr[highPointer];
                arr[highPointer] = temp;
                lowPointer++;
                highPointer--;
            }
        }

        // Step 7: If (j >= k) // pointer crossed each other
        if (highPointer < lowPointer) {
            System.out.println("Pointers crossed each other : " + highPointer + " " + lowPointer);
            if (arr[highPointer] >= pivot) {
                // No Swap and left is the split element.
                return;
            } else {


                int temp = arr[start];
                arr[start] = arr[highPointer];
                arr[highPointer] = temp;
            }
            if (highPointer == start + 1) {
                //extracted(arr, highPointer + 1, end);
                System.out.println("higherpointer = start+1");
            }


        }


        System.out.println("Start Left : ");
        extracted(arr, start, highPointer - 1);

        System.out.println("End Left");
        print(arr);


        System.out.println("Start Right");
        extracted(arr, highPointer + 1, end);
        print(arr);

        System.out.println("End Right");

    }


}
